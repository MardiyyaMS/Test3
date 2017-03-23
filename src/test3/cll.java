/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mardiyya S
 */
public class cll {
    static String Questions[] = {"how old is nigeria","what is the capital of france","what is the capital of adamawa","who is the president of nigeria", "Who invented the world's very first car", "in which year was the first worl's car invented","which year was google founded", "which year was nafdac established", "What is the meaning of Ndlea?", "What was the bloodiest year of world war 1"};
    static String answers [] = {"57", "paris", "yola", "General Muhammad Buhari", "Karl Benz", "in 1886", "1998", "January 1993", "National Drug Law Enforcement Agency (NDLEA)", "1916"};   
    static Random myRandom = new Random();
    static Scanner myInput = new Scanner (System.in);
    static int userchoice;    
    private static String answer;
     public static void main(String[]args) {
    	
    	System.out.println("select a number between 0 - 9");
    	userchoice = myInput .nextInt(10);
        if (userchoice > 0)
         {
            System.out.println(Questions[userchoice]);
            answer = myInput.next();
         }
        if (answer.equals(answers[userchoice]))
        {
            System.out.print("1 mark");
        }
        else{
            System.out.println("Incorrect");
        }
     }
    } 
     
