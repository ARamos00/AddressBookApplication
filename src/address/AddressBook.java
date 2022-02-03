package address;

import address.data.AddressEntry;

import java.util.TreeMap;

public class AddressBook {

    TreeMap<String, AddressEntry> addressEntryList = new TreeMap<>();



    void list(){
        addressEntryList.entrySet().forEach(
                entry ->{
                    System.out.println(entry.getValue().toString());
                }
        );

    }

    void add(AddressEntry addressEntry){
        addressEntryList.put(addressEntry.getFirstName() + addressEntry.getLastName(), addressEntry);
    }



}
