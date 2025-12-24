class kvb {
    String branch;
    String ifsc;
    String location;

    public kvb(String branch, String ifsc, String location) {
        this.branch = branch;
        this.ifsc = ifsc;
        this.location = location;
    }

    public void displayDetails() {
        System.out.println("Branch: " + branch);
        System.out.println("IFSC: " + ifsc);
        System.out.println("Location: " + location);
    }
}

public class bank {
    public static void main(String[] args) {
        kvb branch1 = new kvb("Main Branch", "KVB0001234", "Bangalore");
        kvb branch2 = new kvb("City Branch", "KVB0005678", "Mumbai");

        branch1.displayDetails();
        branch2.displayDetails();
    }

}
