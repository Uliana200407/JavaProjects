package org.example;
import org.example.mathActions.Addition;
import org.example.mathActions.Division;
import org.example.mathActions.Multiplication;
import org.example.mathActions.Subtraction;

import java.util.Scanner;

public class Action
{
    public static void main( String[] args )
    {
        Scanner sc  = new Scanner (System.in);
        int choice;

        do {
            System.out.println ("Enter first number :");
            float num1 = sc.nextFloat ();
            System.out.println ("Enter second number :");
            float num2 = sc.nextFloat ();

            System.out.println ("\n\t------SELECT_YOUR_CHOICE------\n");
            System.out.println ("\t1) ADDITION\n\t2) SUBTRACTION\n\t3) MULTIPLICATION");
            System.out.println ("\t4) DIVISION\n\t5) EXIT");
            System.out.println ("\n\t-------------------------------\n");
            System.out.println ("Enter your choice :");
            choice = sc.nextInt ();
            switch (choice) {
                case 1:
                    System.out.println ( num1 +" + "+ num2+ " = " + Addition.getAddition ( num1, num2 ) );
                    break;
                case 2:
                    System.out.println (  num1 +" - "+ num2+" = " + Subtraction.getSubtraction ( num1, num2 ) );
                    break;
                case 3:
                    System.out.println (  num1 +" * "+ num2+" = " + Multiplication.getMultiplication ( num1, num2 ) );
                    break;
                case 4:
                    System.out.println ( num1 +" / "+ num2+ " = " + Division.getDivision ( num1, num2 ) );
                    break;
                case 5:
                    System.exit (0 );
                    break;
                default:
                    System.out.println ( "Invalid numbers" );
                    break;
                }
            }while ( choice!=5);

   }
}

