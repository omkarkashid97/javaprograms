package com.bridgelabz.functional;
import java.util.Scanner;

    public class LeapYear 

    {

        public static void main(String args[])

        {

            Scanner scanner=new Scanner(System.in);

            System.out.print("Enter any year:");

            int year = scanner.nextInt();

            boolean flag = false;
         if(year>=1582)
         {
            if(year % 400 == 0)

            {

                flag = true;

            }

            else if (year % 100 == 0)

            {

                flag = false;

            }

            else if(year % 4 == 0)

            {

                flag = true;

            }

            else

            {

                flag = false;

            }
         }
         else 
         {
        	 flag= false;
         }

            if(flag)

            {

                System.out.println("Year "+year+" is a Leap Year");

            }

            else

            {

                System.out.println("Year "+year+" is not a Leap Year");

            }
            scanner.close();

        }

    }