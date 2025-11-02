package pay;

import com.korit.study.ch19.Car;

public class OrderMain {
    public static void main(String[] args) {
        Order order = new Order(15000);
        order.setPayStrategy(new CardPay());
        order.checkout();
        order.setPayStrategy(new KaKaoPay());
        order.checkout();
        order.setPayStrategy(new PointPay());
        order.checkout();
    }
}
