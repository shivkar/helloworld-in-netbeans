
/**
 
----
 * email : shiv.kar@yahoo.com
 * date : 20.09.2021
 * purpose : My project in IDE
 */

package com.shivali.windowmaster;

import java.util.Scanner;


public class Windowmaster {public static void main(String[] args){
        
 float height;
 float width;
  // string variables to hold the user's height and width input 
 
 String StringHeight;
 String StringWidth;
 float areaOfwindow;
 float perimeterOfwindow;
 float cost;
 //declare and initialize scanner 
 
Scanner sk = new Scanner(System.in);
 //get input from user 
 
System.out.println("Enter height of window : " );
StringHeight = sk.nextLine();
System.out.println("Enter width of window : " );
StringWidth = sk.nextLine();

//convert String values of height and width to float values 
height = Float.parseFloat(StringHeight);
width = Float.parseFloat(StringWidth);

// calculate Area and permiter of window 

areaOfwindow = height * width ;
perimeterOfwindow = 2 * (height + width);
// calculate the cost -use hard coded value

cost = (( 3.50f * areaOfwindow) + ( 2.25f * perimeterOfwindow));
// display results 


System.out.println("window height =  " + StringHeight );
System.out.println("window width =  " + StringWidth);
System.out.println("window area =  " + areaOfwindow);
System.out.println("window perimeter =  " + perimeterOfwindow);
System.out.println("Total cost of window is: "+ cost);}}


