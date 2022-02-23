package address;

public class Menu {

    /**
     * prompt_FirstName generates the prompt asking for the users input for First Name
     * @return
     */
    String prompt_FirstName() {
        return "First Name:";
    }

    /**
     * prompt_LastName generates the prompt asking for the users input for Last Name
     * @return
     */
    String prompt_LastName() {
        return "Last Name:";
    }

    /**
     * prompt_Street generates the prompt asking for the users input for Street
     * @return
     */
    String prompt_Street() {
        return "Street:";
    }

    /**
     * prompt_City generates the prompt asking for the users input for City
     * @return
     */
    String prompt_City() {
        return "City:";
    }

    /**
     * prompt_State generates the prompt asking for the users input for State
     * @return
     */
    String prompt_State() {
        return "State:";
    }

    /**
     * prompt_Zip() generates the prompt asking for the users input for Zip
     * @return
     */
    String prompt_Zip() {
        return "Zip:";
    }

    /**
     * prompt_Telephone generates the prompt asking for the users input for Telephone
     * @return
     */
    String prompt_Telephone() {
        return "Telephone:";
    }

    /**
     * prompt_Email generates the prompt asking for the users input for Email
     * @return
     */
    String prompt_Email() {
        return "Email:";
    }

    /**
     * The prompt for option A in menu
     * @return a) Loading of entries from a file.
     */
    String promptForOptionA(){ return "a) Loading of entries from a file.";}
    /**
     * The prompt for option B in menu
     * @return b) Addition
     */
    String promptForOptionB(){ return "b) Addition";}
    /**
     * The prompt for option C in menu
     * @return c) Removal"
     */
    String promptForOptionC(){ return "c) Removal";}
    /**
     * The prompt for option D in menu
     * @return d) Find
     */
    String promptForOptionD(){ return "d) Find";}
    /**
     * The prompt for option E in menu
     * @return e) Listing
     */
    String promptForOptionE(){ return "e) Listing";}
    /**
     * The prompt for option F in menu
     * @return f) Quit
     */
    String promptForOptionF(){ return "f) Quit ";}


    /**
     * Displays the menu for Loading entries from a file, Addition, Removal, Find, Listing, Quiting.
     */
    void displayMenu(){
        System.out.println(promptForOptionA());
        System.out.println(promptForOptionB());
        System.out.println(promptForOptionC());
        System.out.println(promptForOptionD());
        System.out.println(promptForOptionE());
        System.out.println(promptForOptionF());
    }
}
