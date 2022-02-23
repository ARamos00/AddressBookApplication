package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AddressBookApplication {
    public static void main(String[] args) {
        /**
         * Creates instance of menu
         */
      Menu myMenu = new Menu();
      myMenu.displayMenu();


      String choice = "";
      while(!choice.equals("f")){
          switch (choice) {
              case "a" -> System.out.println("Choice A!!");
              case "b" -> System.out.println("Choice B!!");
              case "c" -> System.out.println("Choice C!!");
              case "d" -> System.out.println("Choice D!!");
              case "e" -> System.out.println("Choice E!!");
              case "f" -> System.out.println("Choice F!!");
          }


      }
//        AddressBook ab = new AddressBook();
//        init(ab);
    }


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
