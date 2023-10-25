public class Client {
    public final int idClient;
    public final String nickname;
    private Order[] orderLog;
    public Client(int idClient, String nickname) {
        this.idClient = idClient;
        this.nickname = nickname;
    }
    public String payTheBill(Order o){return null;}
}
