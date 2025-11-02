package pay;

public class CardPay implements PayStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("카드결제" + amount + "원");
    }
}
