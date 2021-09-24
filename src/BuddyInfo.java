public class BuddyInfo {
    private String name;
    private String address;
    private int phoneNumber;

    public BuddyInfo(String name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("John Doe", "123 Hello Street", 613123456);
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo buddyInfo = new BuddyInfo();
        System.out.println("Hello " + buddyInfo.getName());
    }
}