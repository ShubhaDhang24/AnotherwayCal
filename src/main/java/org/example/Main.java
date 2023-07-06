package org.example;


import java.util.Scanner;


public class Main {
    public static void Addition() {

        Scanner scanner= new Scanner(System.in);
        System.out.println("First num :");
        double n1=scanner.nextDouble();
        System.out.println("second number:");
        double n2=scanner.nextDouble();
        double add = n1 + n2;
        System.out.println("add" + add);
    }
    public static void Subtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First num :");
        double n1 = scanner.nextDouble();
        System.out.println("second number:");
        double n2 = scanner.nextDouble();
        double sub = n1 - n2;
        System.out.println(" Sub  :  " + sub);
    }
    public static void Multiplication()
    {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("First num :");
        double n1=scanner.nextDouble();
        System.out.println("second number:");
        double n2=scanner.nextDouble();
        double multi=n1*n2;
        System.out.println("Multiplication  : "+multi);
    }
    public static void Division()
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("First num :");
        double n1=scanner.nextDouble();
        System.out.println("second number:");
        double n2=scanner.nextDouble();

        try {
                double div= n1/n2;
            System.out.println("Division  : "+div);
        }
        catch (ArithmeticException ae)
        {
            System.out.println(ae.getMessage());
        }
    }

        public static void defaultBlock()
        {

            System.out.println("You have choose wrong option...");
        }



    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        boolean s= true;

       do
           {
               System.out.println("Addition 1");
               System.out.println("sub 2");
               System.out.println("Multi 3");
               System.out.println("div 4");
               System.out.println("exit 5");
               int num=sc.nextInt();

               if(num==1)
               {
                   Addition();
               }
               else if (num==2) { Subtraction();}
               else if (num==3) { Multiplication();}
               else if (num==4) {  Division();}
               else if (num==5) {  s= false; break;}

                else {
                   defaultBlock();
               }

               } while (s);
           }



    }

