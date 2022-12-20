package com.company.OOPS.ExceptionHandling;

public class MAIN {

    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            String name = "kunal";
            if (name.equals("kunal")){
                throw new MyException("name is kunal");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }
    }

    // throws to declare an exception it may throw an exception.

    static int divide(int a , int b) throws ArithmeticException
    {
        if (b == 0)
        {
            // explicitly throwing an exception
            throw new ArithmeticException("please do not divide by zero");

        }
        return a/b;
    }



}
