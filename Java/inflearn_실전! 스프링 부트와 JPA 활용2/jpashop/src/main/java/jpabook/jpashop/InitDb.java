package jpabook.jpashop;

import jpabook.jpashop.domain.*;
import jpabook.jpashop.domain.Item.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

/**
 * 총 주문 2개
 * * userA
 * * JPA1 BOOK
 * * JPA2 BOOK
 * * userB
 * *SPRING1 BOOK
 * *SPRING2 BOOK
 */

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
        initService.dbInit2();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            Member member = createMember("userA", "서울", "양재", "1234");
            em.persist(member);

            Book book1 = createBook("JPA1 BOOK", 10000, 100);
            em.persist(book1);

            Book book2 = createBook("JPA2 BOOK", 20000, 150);
            em.persist(book2);

            OrderItem orderItem1 = OrderItem.createOrderItem(book1, book1.getPrice(), 10);
            OrderItem orderItem2 = OrderItem.createOrderItem(book2, book2.getPrice(), 20);

            Order order = createDelivery(member, orderItem1, orderItem2);
            em.persist(order);
        }

        private Order createDelivery(Member member, OrderItem orderItem1, OrderItem orderItem2) {
            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            return Order.createOrder(member, delivery, orderItem1, orderItem2);
        }

        private Book createBook(String name, int price, int stockQuantity) {
            Book book1 = new Book();
            book1.setName(name);
            book1.setPrice(price);
            book1.setStockQuantity(stockQuantity);
            return book1;
        }

        private Member createMember(String name, String city, String street, String zipcode) {
            Member member = new Member();
            member.setName(name);
            member.setAddress(new Address(city, street, zipcode));
            return member;
        }

        public void dbInit2() {
            Member member = createMember("userB", "수원", "광교", "4321");
            em.persist(member);

            Book book1 = createBook("SPRING1 BOOK", 20000, 300);
            em.persist(book1);

            Book book2 = createBook("SPRING2 BOOK", 40000, 350);
            em.persist(book2);

            OrderItem orderItem1 = OrderItem.createOrderItem(book1, book1.getPrice(), 50);
            OrderItem orderItem2 = OrderItem.createOrderItem(book2, book2.getPrice(), 40);

            Order order = createDelivery(member, orderItem1, orderItem2);
            em.persist(order);
        }

    }


}

