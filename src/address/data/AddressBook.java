package address.data;

import address.data.AddressEntry;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;
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

    /**
     * loadEntriesFromFile method takes in a file name and adds the entries within the file to the AddressEntryList
     * @param fileName
     */
    public void loadEntriesFromFile(String fileName){
        try{
                    File tempFile = new File(fileName);
                    Scanner tempReader = new Scanner(tempFile);
                    while (tempReader.hasNextLine()){
                        String firstName = tempReader.nextLine();
                        String lastName = tempReader.nextLine();
                        String street = tempReader.nextLine();
                        String city = tempReader.nextLine();
                        String state = tempReader.nextLine();
                        String zip = tempReader.nextLine();
                        String email = tempReader.nextLine();
                        String phone = tempReader.nextLine();
                        AddressEntry temp1 = new AddressEntry(firstName,lastName,street,city,state,Integer.parseInt(zip),phone,email);
                        add(temp1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }


    /**
     * additionManualInput method prompts the user to input each category of the entry and once completed adds it to the AddressEntryList
     */
    public void additionManualInput(){
        Scanner additionInput = new Scanner(System.in);
        System.out.println("Please enter the First Name");
        String firstName = additionInput.nextLine();
        System.out.println("Please enter the Last Name");
        String lastName = additionInput.nextLine();
        System.out.println("Please enter the Street Name");
        String streetName = additionInput.nextLine();
        System.out.println("Please enter the City Name");
        String cityName = additionInput.nextLine();
        System.out.println("Please enter the State");
        String stateName = additionInput.nextLine();
        System.out.println("Please enter the Zip Code");
        int zipCode = Integer.parseInt(additionInput.nextLine());
        System.out.println("Please enter the Email");
        String email = additionInput.nextLine();
        System.out.println("Please enter the Telephone Number");
        String telephoneNumber = additionInput.nextLine();
        AddressEntry temp2 = new AddressEntry(firstName,lastName,streetName,cityName,stateName,zipCode,telephoneNumber,email);
        add(temp2);
    }

    /**
     * removalAddressEntry method prompts the user for a key. Once given the method will locate the AddressEntry and prompt the user to input y/n to remove or not. If y AddressEntry is
     * removed. If n the method returns you to the menu.
     * @param key
     */
    public void removalAddressEntry(String key){
        if(addressEntryList.containsKey(key)){
            Scanner userInput = new Scanner(System.in);
            System.out.println("This entry was found.");
            System.out.println(addressEntryList.get(key));
            System.out.println("Do you wish to remove this entry? y/n");
            String userChoice = userInput.nextLine();
            if(Objects.equals(userChoice, "y")){
                addressEntryList.remove(key);
                if(addressEntryList.containsKey(key)){
                    System.out.println("Unsuccessful!");
                }else{
                    System.out.println("Successful!");
                }
            }else{
                System.out.println("Returning to menu...");
            }

        }
        else{
            System.out.println("Key not found!");
        }

    }

    /**
     * findAddressEntry method prompts the user for a key. Once given the method will either return the found entry or tell the user the entry does not exist returning them to the menu.
     * @param key
     */
    public void findAddressEntry(String key){
        if(addressEntryList.containsKey(key)){
            System.out.println("This entry was found:");
            System.out.println(addressEntryList.get(key));
        }
        else{
            System.out.println("No entry was found!");
        }

    }




}
