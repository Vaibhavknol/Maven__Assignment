package com.knoldus;
import java.util.Scanner;
public class StringCalling
{
    public static void main( String[] args )
    {
        StringManipulation object = new StringManipulation();
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter a string you want to perform operations on: ");
        String stringToOperate = getInput.nextLine();
        String reverseString = object.Reversestring((stringToOperate));
        int lengthOfString = object.getStringLength(stringToOperate);
        System.out.println("The reversed string is: "+reverseString);
        System.out.println("The length of string is: "+lengthOfString);
    }
}
