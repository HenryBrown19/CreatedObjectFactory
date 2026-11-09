public class Taco {

    //todo and the instance variables you made to the top of the class
    // todo: make a constructor that gives the instance variables default values
    // no parameters
    // todo: make a printInfo method
    // todo: in the printInfo, print the instance variables in a readable way
    // instance variables
    public int numberofTaco;
    public boolean hasMeat;
    public String toppingType;
    public boolean isLarge;

    // todo: a constructor that gives the instance variables default values
    public Taco (int pNumberofTacos, boolean pHasMeat, String pToppingType) {
        numberofTaco = pNumberofTacos;
        hasMeat = pHasMeat;
        toppingType = pToppingType;
        Large();

    }
    // Panshul Purusharthy, help me with this
    // random method determines whether the order is large
    public void Large(){
        isLarge = false;
        int randomNumber = (int)(Math.random() * 5);
        if (randomNumber == 3 ) {
          isLarge = true;
        }
    }

//   Method: print all the information about the Taco
    public void printInfo() {
        System.out.println(" this is a " + toppingType);
        System.out.println(" the number of Taco is" + hasMeat);
        System. out.println("Number of Taco: " + numberofTaco);// readable
        System. out.println("The fact that the order is large is " + isLarge + ".");

    }

}