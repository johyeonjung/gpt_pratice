package pay;

public class PointPay implements PayStrategy{

    @Override
    public void pay(int amount) {
        System.out.println("포인트 결제" + amount + "원");
    }

}
