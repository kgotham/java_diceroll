//Ksusha Gotham Project 0
//    ● The roll( ) method must assign a value of diceVal in the range 1 through 7. The value of diceVal cannot be assigned the integer 0.  
//    ● The main( ) method in DiceRollem.java must create 5 instances of a Dice object, 
//    and contain a single for loop.  
//    ● You must make your program output look exactly like the examples above.
 


public class DiceRollem {
    public static void main(String[] args) {
        Dice[] mDice = new Dice[5]; //create 5 instances of dice
        for (int i = 0; i < mDice.length; i++) mDice[i] = new Dice();

        int counter = 0;
        //create a SINGLE loop that runs 1000 times and rolls random numbers
        for(int roll=1; roll<=1000; roll++){
            for (int i = 0; i < mDice.length; i++) mDice[i].roll();
            
            //print test because I am better at understanding things visually than just text
            //System.out.println(mDice[0].getDice()+" "+mDice[1].getDice()+" "+mDice[2].getDice()+" "+mDice[3].getDice()+" "+mDice[4].getDice());
               if(mDice[0].getDice()==mDice[1].getDice() &&
                    mDice[0].getDice()==mDice[2].getDice() &&
                    mDice[0].getDice()==mDice[3].getDice() &&
                    mDice[0].getDice()==mDice[4].getDice())
            {
                counter += 1; 
                System.out.println("Roll number " + roll +" all dice show "+ mDice[0].getDice());

            }
        }

        System.out.println("A total of "+ counter+" tosses were the same.");

    }
}