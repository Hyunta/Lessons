package jpabook.jpashop.service;

import jpabook.jpashop.domain.Address;
import jpabook.jpashop.domain.Item.Book;
import jpabook.jpashop.domain.Item.Item;
import jpabook.jpashop.domain.Member;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.OrderStatus;
import jpabook.jpashop.exception.NotEnoughStockException;
import jpabook.jpashop.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class OrderServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @Test
    void 상품주문() {
        //given
        Member member = createMember();
        Book book = createBook("시골 JPA", 10000, 100);

        int orderCount = 2;

        //when
        Long orderId = orderService.order(member.getId(), book.getId(), orderCount);

        //then
        Order result = orderRepository.findOne(orderId);
        assertEquals(OrderStatus.ORDER, result.getStatus(), "상품 주문시 상태는 ORDER");
        assertEquals(1, result.getOrderItems().size(), "주문한 상품 종류 수가 1이다.");
        assertEquals(10000 * orderCount, result.getTotalPrice(), "주문 가격은 가격 * 수량 이다.");
        assertEquals(98, book.getStockQuantity(), "주문 수량만큼 재고가 줄어야 한다.");
    }



    @Test
    void 주문취소() {
        //given
        Member member = createMember();
        Book book = createBook("시골 JPA", 10000, 100);
        int orderCount = 2;
        Long orderId = orderService.order(member.getId(), book.getId(), orderCount);

        //when
        orderService.cancelOrder(orderId);

        //then
        Order result = orderRepository.findOne(orderId);
        assertEquals(OrderStatus.CANCEL, result.getStatus(), "주문 취소시 상태는 CANCEL");
        assertEquals(100, book.getStockQuantity(), "재고는 다시 100개가 되어야 한다.");
    }

    @Test
    void 상품주문_재고수량초과() {
        //given
        Member member = createMember();
        Item item = createBook("시골 JPA", 10000, 100);
        int orderCount = 101;

        //when
        assertThrows(NotEnoughStockException.class, () -> orderService.order(member.getId(), item.getId(), orderCount));
    }

    private Book createBook(String name, int price, int quantity) {
        Book book = new Book();
        book.setName(name);
        book.setPrice(price);
        book.setStockQuantity(quantity);
        em.persist(book);
        return book;
    }

    private Member createMember() {
        Member member = new Member();
        member.setName("회원A");
        member.setAddress(new Address("서울", "광교호수공원로", "12345-23"));
        em.persist(member);
        return member;
    }
}