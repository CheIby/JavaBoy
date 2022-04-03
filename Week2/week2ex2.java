package Week2;

import java.util.Random;
import java.util.Scanner;

public class week2ex2 {
    public static void main(String[] args) {
        String[] hands = { "scissor", "rock", "paper" };
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int randCom = random.nextInt(2);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int mine = input.nextInt();
        input.close();
        if (randCom == mine)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " too. It is a draw");
        else if (randCom == 0 && mine == 1)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Won");
        else if (randCom == 0 && mine == 3)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Lose");
        else if (randCom == 1 && mine == 0)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Lose");
        else if (randCom == 1 && mine == 2)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Won");
        else if (randCom == 2 && mine == 0)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Won");
        else if (randCom == 2 && mine == 1)
            System.out.println("The randCom is " + hands[randCom] + ". mine are " + hands[mine] + " mine Lose");
        else
            System.out.println("Please enter number between 0 - 2 next time!");
    }
}