import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyCollection;

    public void addBuddy(BuddyInfo buddyInfo) {
        buddyCollection.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddyCollection.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
    }
}
