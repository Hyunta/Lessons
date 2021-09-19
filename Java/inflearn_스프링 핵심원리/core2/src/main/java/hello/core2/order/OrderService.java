package hello.core2.order;

public interface OrderService {
    Order CreateOrder(Long memberId, String itemName, int itemPrice);

}
