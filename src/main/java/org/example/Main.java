package org.example;


import java.util.Scanner;


public class Main {


    /*public static void Add(double n1, double n2)
     {
         double add;
         add=n1+n2;
         System.out.println("Addition of two numbers:" +add);

     }

     public static void Sub(double n1, double n2) {
         double sub;
         System.out.println("Subtraction of two numbers:");
         sub = n1 - n2;
         System.out.println("Subtraction of two numbers:" +sub);
     }

     public static void  Mul(double n1, double n2) {
         double mul;
         System.out.println("MULTIPLICATION");
         mul = n1 * n2;
         System.out.println("Multiplication of two numbers:" +mul);

     }

     public static void Div(double n1, double n2) {
         double div=0;
         try {
             div = n1 / n2;
             //System.out.println("Division of two numbers:" + div);
         }
         catch (ArithmeticException ae)
         {
             System.out.println("ArithmeticException--"+ae.getMessage());
         }
         System.out.println("Division of two numbers:"+div);
     }*/
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
       /* public static void EndCal(boolean b)
        {
            while(b);
        }*/
        public static void defaultBlock()
        {

            System.out.println("You have choose wrong option...");
        }



    public static void main(String[] args) {


       /* double n1, n2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi welcome  simple calculator....!!");
        boolean y = true;
        do {
            System.out.println("You now will get options please select one to proceed further..");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1-ADDITION");
            System.out.println("2-SUBTRACTION");
            System.out.println("3-MULTIPLICATION");
            System.out.println("4-DIVISION");
            System.out.println("5-exit");
            System.out.println("-----------------------------------------------------------------------");
            int num = scanner.nextInt();

            switch (num) {
                case 1:
                {
                    System.out.println("---ADDITION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    Add(n1,n2);
                    break;
                }
                case 2:
                {
                        System.out.println("---SUBTRACTION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    Sub(n1, n2);
                        break;
                }
                case 3:
                {
                    System.out.println("---MULTIPLICATION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    Mul(n1, n2);
                    break;
                }
                case 4:
                {
                   System.out.println("---DIVISION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    Div(n1,n2);
                    break;
                }
                case 5:
                {
                    y=false;
                    break;
                }
                default:
                    System.out.println("you have choose the wrong option");


            }
        }
        while (y);
    }*/
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

