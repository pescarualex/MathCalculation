package org.fasttrackit;


public class App 
{
    public static void main( String[] args ) {
        MethodsClass math = new MethodsClass();
        System.out.println(math.sumOfTwoNum(5,2));
        System.out.println(math.sumOfTwoNum(5));
        System.out.println(" ");

        System.out.println(math.difecence(10,5));
        System.out.println(math.difecence(10));
        System.out.println(" ");

        System.out.println(math.zecimalCalculation(15.2, 4.3));
        System.out.println(math.zecimalCalculation(15));
        System.out.println(" ");

        System.out.println(math.multiplication(5,4));
        System.out.println(math.multiplication(5));
        System.out.println(" ");

        System.out.println(math.division(65,48));
        System.out.println(math.division(65));


    }
}
