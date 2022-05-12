//Ksusha Gotham Project 0 

public class Dice {
    private int diceVal;
    public void roll() {
        diceVal = (int) (Math.random()*7) + 1; //set value of the dice
    }
    public int getDice() {
        return diceVal;
    }
}