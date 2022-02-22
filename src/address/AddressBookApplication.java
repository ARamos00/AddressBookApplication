package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AddressBookApplication {

    public static void main(String[] args) {
//        /**
//         * Creates instance of menu
//         */
//        Menu myMenu = new Menu();
//
//        System.out.println(myMenu.prompt_FirstName());
//        System.out.println(myMenu.prompt_LastName());
//        System.out.println(myMenu.prompt_Street());
//        System.out.println(myMenu.prompt_City());
//        System.out.println(myMenu.prompt_State());
//        System.out.println(myMenu.prompt_Zip());
//        System.out.println(myMenu.prompt_Telephone());
//        System.out.println(myMenu.prompt_Email());
        AddressBook ab = new AddressBook();
        init(ab);
//        initAddressBookExercise(ab);

    }
//    static void initAddressBookExercise(AddressBook ab){
//        AddressEntry temp1 = new AddressEntry("Edgar","Munoz","Harder Rd.","Hayward","California",94509,"555-555-5555","EdgarMunoz@Gmail.com");
//        AddressEntry temp2 = new AddressEntry("Jesus", "Ramos", "Kirkland Rd","Antioch","California", 94509,"555-555-5555","JesusRamos@Gmail.com");
//        ab.add(temp1);
//        ab.add(temp2);
//
//    }

    static void init(AddressBook ab){
        try{
            File tempFile = new File("temp.txt");
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
                ab.add(temp1);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        ab.list();
    }
}
