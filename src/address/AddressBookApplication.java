package address;

import address.data.AddressEntry;

public class AddressBookApplication {

    public static void main(String[] args) {
        /**
         * Creates instance of menu
         */
        Menu myMenu = new Menu();

        System.out.println(myMenu.prompt_FirstName());
        System.out.println(myMenu.prompt_LastName());
        System.out.println(myMenu.prompt_Street());
        System.out.println(myMenu.prompt_City());
        System.out.println(myMenu.prompt_State());
        System.out.println(myMenu.prompt_Zip());
        System.out.println(myMenu.prompt_Telephone());
        System.out.println(myMenu.prompt_Email());

        AddressBook ab = new AddressBook();

        initAddressBookExercise(ab);

    }
    static void initAddressBookExercise(AddressBook ab){
        AddressEntry temp1 = new AddressEntry("Edgar","Munoz","Harder Rd.","Hayward","California",94509,"555-555-5555","EdgarMunoz@Gmail.com");
        AddressEntry temp2 = new AddressEntry("Jesus", "Ramos", "Kirkland Rd","Antioch","California", 94509,"555-555-5555","JesusRamos@Gmail.com");
        ab.add(temp1);
        ab.add(temp2);

        ab.list();

    }


}
