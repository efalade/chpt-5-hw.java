import java.util.Scanner;

public class UserAddress {
    private String name;
    private String streetAddress;
    private String city;
    private String state;

    public void nameAddress() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter street address: ");
        this.streetAddress = scanner.nextLine();
    }

    public void cityState() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter city: ");
        this.city = scanner.nextLine();
        System.out.print("Enter state: ");
        this.state = scanner.nextLine();
    }

    public void printAddress() {
        System.out.println("Name: " + name);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
    }

    public static void main(String[] args) {
        UserAddress user = new UserAddress();
        user.nameAddress();
        user.cityState();
        user.printAddress();
    }
}
