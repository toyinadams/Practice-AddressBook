import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddyCollection;

    public AddressBook() {
        buddyCollection = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddyInfo) {
        buddyCollection.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo) {
        buddyCollection.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", 613123456);
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
