package pay;

public class Order {
    int totalPrice;
    PayStrategy payStrategy;

    public Order(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    void checkout() {
        payStrategy.pay(totalPrice);
    }
}
