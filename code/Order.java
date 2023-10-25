public class Order {
    private int orderNumber;
    public String dataTime;
    public double amount;
    public boolean paymentStatus;

    public Service[] lines;

    public void changePush(Service s){};
    public void changeDel(Service s){};
}
