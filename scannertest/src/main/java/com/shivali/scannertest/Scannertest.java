
/**
 *@author The following has evaluated to null or missing:
==> Shivali  [in template "Templates/Classes/Class.java" at line 3, column 13]

----
Tip: If the failing expression is known to legally refer to something that's sometimes null or missing, either specify a default value like myOptionalVar!myDefault, or use <#if myOptionalVar??>when-present<#else>when-missing</#if>. (These only cover the last step of the expression; to cover the whole expression, use parenthesis: (myOptionalVar.foo)!myDefault, (myOptionalVar.foo)??
----

----
FTL stack trace ("~" means nesting-related):
	- Failed at: ${Shivali}  [in template "Templates/Classes/Class.java" at line 3, column 11]
----
 * email : shiv.kar@yahoo.com
 * date : 08.09.2021
 * purpose : My first Hello World program in an IDE
 */

package com.shivali.scannertest;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Scannertest 
{public static void main(String[] args){
        
String name;
int age;
int numComputers;
String hometown;

Scanner sk = new Scanner(System.in);

System.out.println("Please enter your name: ");
name= sk.nextLine();

System.out.println("Please enter your age: ");
age = sk.nextInt();
System.out.println("Enter number of computers: ");
numComputers = sk.nextInt();
sk.nextLine();
System.out.println("Enter your hometown: ");
hometown = sk.nextLine();

System.out.println("You said: ");
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Num computers: " + numComputers);
System.out.println("Hometown: " + hometown);
}}


