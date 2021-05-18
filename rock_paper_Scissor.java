package myprac;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_Scissor {
    public static void main(String[] args) {

        Random rn = new Random();
        int compInp = rn.nextInt(3)+1;
        //System.out.println(answer);

        System.out.println("Select: \n1 for Rock\n2 for Scissor\n3 for Paper\nPress:\t");
        Scanner Input = new Scanner(System.in);
        int userInp = Input.nextInt();

        if(userInp== 1 && compInp == 2){
            System.out.println("Congratulations! You win :)");
        }
        else if(userInp == 1 && compInp == 3){
            System.out.println("Oops! You lose :(");
        }
        else if(userInp== 2 && compInp == 3){
            System.out.println("Congratulations! You win :)");
        }
        else if(userInp == 2 && compInp == 1){
            System.out.println("Oops! You lose :(");
        }
        else if(userInp== 3 && compInp == 1){
            System.out.println("Congratulations! You win :)");
        }
        else if(userInp == 3 && compInp == 2){
            System.out.println("Oops! You lose :(");
        }
        else{
            System.out.println("Its a draw -_-");
        }

        //int[] myList = {1, 2, 3};
        String[] strList = {"Rock", "Scissor", "Paper"};
        System.out.println("\nUser selected:\t" + strList[userInp-1]);
        System.out.println("Comp selected:\t" + strList[compInp-1]);

    }
}
