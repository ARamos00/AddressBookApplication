package address.data;

import address.data.AddressEntry;

import java.util.TreeMap;

public class AddressBook {
    /**
     * collection variable to store set of AddressEntry objects that currently in AddressBook
     */
    TreeMap<String, AddressEntry> addressEntryList = new TreeMap<>();


    /**
     * Iterates through the AddressEntryList and prints out each entry
     */
    public void list(){
        addressEntryList.entrySet().forEach(
                entry ->{
                    System.out.println(entry.getValue().toString());
                }
        );

    }

    /**
     *Adds an AddressEntry object to the AddressEntryList and gives that AddressEntry a Key.
     * @param addressEntry
     */
    public void add(AddressEntry addressEntry){
        addressEntryList.put(addressEntry.getFirstName() + addressEntry.getLastName(), addressEntry);
    }



}
