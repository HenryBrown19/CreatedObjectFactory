public class Factory {
    // Name of the Owner
    public String owner ="Brown";

    // Store three different Tacos
    public Taco tacoOrderOne1;
    public Taco tacoOrderOne2;
    public Taco tacoOrderOne3;

    // Stores information about the factory
    public int randomNumber;
    public int yearFounded;
    public boolean isOpen;
    // Method: Starts the program
    public static void main(String[] args) {
        Factory a = new Factory();
    }


  // Factory constructor
    //special method: constructor
    // name has to be the same name as the class
    // you do not say void
    public Factory() {
        yearFounded=1788;
        isOpen = true;
        randomNumber = (int)(Math.random() * 100);
        // print the factory welcome message
        // print the year the factory was founded
        System. out.println(" welcome to Brown Taco factory");
        System. out.println(" The factory was founded in " + yearFounded);
        System. out.println("it is" + isOpen + " that the factory is open");

         /// First TACO: create a taco using random number and true
        tacoOrderOne1 = new Taco(randomNumber, true, "fufu");
        tacoOrderOne1.printInfo();

        /// Second TACO: call all three; create a taco using 9 with fufu
        tacoOrderOne2 = new Taco(9, false, "chicken and steak");
        tacoOrderOne2.printInfo();
        

        /// Third Taco: call all three; create a taco using 7 with Nutella
        tacoOrderOne3 = new Taco(7, true, "nutella");
       tacoOrderOne3.printInfo();










    }

}