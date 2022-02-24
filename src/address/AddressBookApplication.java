package address;

import address.data.AddressBook;
import address.data.AddressEntry;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
      Menu myMenu = new Menu();
      Scanner input = new Scanner(System.in);
      String choice = "";
      while(true){
          //creates menu
          myMenu.displayMenu();
          choice = input.nextLine();
          switch (choice) {
              case "a":
                  System.out.println("Enter the file name (FileName.txt)");
                  Scanner fileNameInput = new Scanner(System.in);
                  String fileName = "";
                  fileName = fileNameInput.nextLine();
                  ab.loadEntriesFromFile(fileName);
                  break;
              case "b":
                  ab.additionManualInput();
                  break;
              case "c":
                  System.out.println("Please enter the First and Last Name (FirstNameLastName) of contact to remove:");
                  Scanner removeKeyInput = new Scanner(System.in);
                  String removeKey = "";
                  removeKey = removeKeyInput.nextLine();
                  ab.removalAddressEntry(removeKey);

                  break;
              case "d":
                  System.out.println("Enter the First and Last Name (FirstNameLastName) of contact to find:");
                  Scanner findKeyInput = new Scanner(System.in);
                  String findKey = "";
                  findKey = findKeyInput.nextLine();
                  ab.findAddressEntry(findKey);
                  break;
              case "e":
                  ab.list();
                  break;
              case "f":
                  System.out.println("Exiting menu...");
                  System.exit(0);
                  break;
              default:
                  System.out.println(choice + " is not a valid input. Choose another option");
          }
      }

    }
}
