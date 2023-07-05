package org.example;


import java.util.Scanner;

public class Main {
    double add;
    void Add(double n1, double n2)
    {
        add=n1+n2;
        System.out.println("Addition of two numbers:" +add);

    }
    double sub;
    public void Sub(double n1, double n2) {
        System.out.println("Subtraction of two numbers:");
        sub = n1 - n2;
        System.out.println("Subtraction of two numbers:" +sub);
    }
    double mul;
    public void  Mul(double n1, double n2) {
        System.out.println("MULTIPLICATION");
        mul = n1 * n2;
        System.out.println("Multiplication of two numbers:" +mul);

    }
    double div;
    public void Div(double n1, double n2) {
        try {
            div = n1 / n2;
            //System.out.println("Division of two numbers:" + div);
        }
        catch (ArithmeticException ae)
        {
            System.out.println("ArithmeticException--"+ae.getMessage());
        }
        System.out.println("Division of two numbers:"+div);
    }


    public static void main(String[] args) {


        double n1, n2;

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
            Main ad=new Main();
            switch (num) {
                case 1:
                {
                    System.out.println("---ADDITION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    ad.Add(n1,n2);
                    break;
                }
                case 2:
                {
                        System.out.println("---SUBTRACTION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                        ad.Sub(n1, n2);
                        break;
                }
                case 3:
                {
                    System.out.println("---MULTIPLICATION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    ad.Mul(n1, n2);
                    break;
                }
                case 4:
                {
                   System.out.println("---DIVISION---");
                    System.out.println("enter first number:");
                    n1 = scanner.nextInt();
                    System.out.println("enter second number:");
                    n2 = scanner.nextInt();
                    ad.Div(n1,n2);
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
    }



}
