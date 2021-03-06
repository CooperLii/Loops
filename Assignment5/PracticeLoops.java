/**
 * Name: MingFang Li (lim)
 * Course: CSCI 241 - Computer Science I
 * Section: 001
 * Assignment: 5
 *
 * Project/Class Description:
 *   This program is to practice loops in java 
 *   and will run 3 types of Java loops in 5 different sections.
 *   Three types of Java loops used are for loops, while loops and do-while loops.
 *
 * Known bugs: none
 */


// needed for Scanner class
import java.util.Scanner;

// class PracticeLoops
public class PracticeLoops
{
    public static void main(String[]args)
    {
        // create a Scanner for the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // introduce section A to users
        System.out.println("          ------ Section A ------");
        System.out.println("(while) loop prints values 1 through 5, then 5 down to 1");
        System.out.println("Each set of numbers appears on its own line,tab distance apart"); 
        System.out.print("==============================================================");
        System.out.println("==========");
        
        // declare and initialize the variable x and give condition and update
        // print values 1 through 5
        // by using while loop
        int x = 1;
        while(x < 6)
        {
            System.out.printf("%d\t",x);
            x++;
        }
        System.out.println();
        
        // declare and initialize the variable y and give condition and update
        // print values 5 down to 1
        // by using while loop
        int y = 5;
        while(y > 0)
        {
            System.out.printf("%d\t",y);
            y--;
        }
        
        // the end of a section
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println("_________");
        System.out.println();
        
        // introduce section B to users
        System.out.println("          ------ Section B ------");
        System.out.println("(do-while) User enters an odd number between 1 and 5, inclusive.");
        System.out.println("(while) Loop runs and places that many v^v symbol patterns");
        System.out.println("        between \"Monday\" and \"Friday\"");
        System.out.print("(for) Loop runs to find the product of all values ");
        System.out.println("between 1 and that number.");
        System.out.print("==============================================================");
        System.out.println("==========");

        // declare and initialize the variable num and give condition and update
        // ask user to enter an odd number between 1 and 5 inclusive otherwise print 
        // an error message
        // by using do-while loop
        int num = 354235;
        do{
            System.out.print("Enter a number to use for Part B loops: ");
            num = keyboard.nextInt();
            if (num % 2 == 0 || num < 1 || num > 5)
            {
            System.out.println("Error:  number must be odd and between 1 and 5, inclusive.");
            }
        }
        while(num % 2 == 0 || num < 1 || num > 5);

        // declare the variable newNum set strings into pattern and monday
        // run and place that many v^v symbol patterns between Monday and Friday
        // by using while loop
        int newNum = num;
        String pattern = "v^v";
        String monday = "Monday";
        while(num >= 1)
        {
            num--;
            monday = monday + pattern;

        }
        System.out.println(monday + "Friday");
        System.out.println();
        
        // declare and initialize the variable decNum and product and give 
        // condition and update
        // to find the product of all values
        // by using for loop
        double decNum = 0;
        double product = 1;
        for(int counter = 0; counter < newNum; counter++)
        {
            System.out.print("Enter a decimal number: ");   
            decNum = keyboard.nextDouble();
            product *= decNum;
        }
        System.out.printf("%s%.3f\n","Product of 3 values = ",product);
        
        // the end of a section
        System.out.print("______________________________________________________________");
        System.out.println("__________");
        System.out.println();        
        
        // introduce section C to users
        System.out.println("          ------ Section C ------");
        System.out.print("(do-while) User enters number: must be multiple of 4, ");
        System.out.println("between 8 and 24, inclusive.");
        System.out.println("(for) Loop prints values n->0, separated by tabs, by 4's.");
        System.out.print("=============================================================");
        System.out.println("===========");

        // ask users to enter a number which is multiple of 4 otherwise print error message
        // by using do-while loop
        do{
            System.out.print("Enter a multiple of 4: ");
            num = keyboard.nextInt();
            if (num % 4 != 0 || num > 24 || num < 8)
            {
             System.out.println("Error: Enter a multiple of 4 between 8 and 24, inclusive.");
            }
        }
        while(num % 4 != 0 || num > 80 || num < 8);
        
        // take the printed number and subtract 4 until it is 0
        // by using for loop
        for(int num2=num; num2 >= 0; num2=num2-4)
        {
            System.out.printf("%d\t",num2);        
        }
        
        // the end of a section
        System.out.println();
        System.out.print("_______________________________________________________________");
        System.out.println("_________");
        System.out.println();        

        // introduce section D to users
        System.out.println("          ------ Section D ------");
        System.out.print("(for) Loop shows range of values representing temperatures ");
        System.out.println("from -27 to 36 celsius.");
        System.out.println("Using increments of 9, calculates equivalent fahrenheit value.");
        System.out.print("===============================================================");
        System.out.println("===============");
        System.out.println("      Celsius         Fahrenheit");        
        System.out.println("--------------------------------");
        
        // declare fah and declare and initialize the variable cel 
        // and give condition and update
        // show range of values representing temperatures 
        // calculate equivalent fahrenheit value
        // by using for loop
        double fah;
        for(int cel = -27;cel <= 36;cel += 9)
        {
            fah = cel * 1.8 + 32;
            System.out.printf("       %5d\t    %6.1f\n",cel,fah);
        }

        // the end of a section
        System.out.print("_____________________________________________________________");
        System.out.println("___________");
        System.out.println(); 

        // introduce section E to users
        System.out.println("          ------ Section E ------");
        System.out.println("3 different totals will be calculated.");
        System.out.println("(for) Loop: User enters 10 total integers.");
        System.out.print("Positive integers will be added to sum#1,");
        System.out.println(" negative integers added to sum #2.");
        System.out.print("If zero (0) is entered, program will increment the ");
        System.out.println("count of zeroes.");
        System.out.print("=============================================================");
        System.out.println("===========");
        
        // declare and initialize the variable firstSum secondSum and zeroCounter and 
        // declare and initialize the variable counter and give condition and update
        // ask user to enter 10 total integers
        // positive integers will be added to sum#1 and negative integers will be
        // added to sum #2
        // if zero is entered program will increment the count of zeroes
        // at the end 3 different totals will be calculated
        // by using for loop 
        int firstSum = 0;
        int secondSum = 0;
        int zeroCounter = 0;
        for(int counter=0; counter<10; counter++)
        {
            System.out.print("Enter an integer to add: ");
            num = keyboard.nextInt();
            if(num<0){
                secondSum += num;
                System.out.println("Integer added to second sum");}
            else if(num>0){
                firstSum += num;
                System.out.println("Integer added to first sum");}
            else{
                zeroCounter++;
                System.out.println("Error: zero not added to either sum");}
        }
        System.out.println();         
        System.out.printf("%s%d\t    %s%d\n","First sum: ",firstSum,"Second sum: ",secondSum);
        System.out.print("Number of zeroes entered: " + zeroCounter);
    }
}