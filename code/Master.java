public class Master extends Content{
    public final int idMaster;
    public final String fullName;
    public int rating;

    public Master(int idMaster, String fullName) {
        this.idMaster = idMaster;
        this.fullName = fullName;
    }

    public Feedback getFeedback(Client c){return null;};
    public Feedback[] records;
    public Service[] services;
    @Override
    public void display() {

    }
}
