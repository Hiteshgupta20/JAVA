package oops;
import java.util.Random;
import java.util.*;
class game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }

   game(){
        Random rand=new Random();
        this.number=rand.nextInt(100);
    }

    void takeInputUser(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input");
        inputNumber=sc.nextInt();
        sc.close();
    }

    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right %d\n You guessed it in %d attempts", number,noOfGuesses);
            return true;
        }

        else if(inputNumber<number)
           System.out.println("Too less");

        else if(inputNumber>number)
            System.out.println("Too Greater");
        
        return false;
    }
}
public class guess_game {
   
public static void main(String[] args) {
   game game1=new game();
   boolean b=false;
   while(!b){
   game1.takeInputUser();
   b=game1.isCorrectNumber();
   }
}


}

