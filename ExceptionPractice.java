package com.bridgelabz.Exception;

import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {
       try {
           System.out.println(10 / 0);
       }catch (NullPointerException e){
           System.out.println("catch");
       }
        finally {
           System.out.println("finally");
       }


    }

}

class Practice2{
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println(10/0);
        }
        finally {
            System.out.println("finally");
        }
    }
}


class Practice3{
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
            int a[]=new int[5];
            a[7]=10;
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutex handled");
        }catch (ArithmeticException e){
            System.out.println("Arithmetic ex handled");
        }
    }
}

//throws
class Test1{
    void m3() throws InterruptedException {
        System.out.println("in m3");
        Thread.sleep(3000);
        System.out.println("in m3");
    }
    void m2()throws InterruptedException{
        m3();
    }
    void m1()throws InterruptedException{
        m2();
    }
    public static void main(String[] args)throws InterruptedException {
        Test1 t = new Test1();
        t.m1();

    }
}


//throw

class Test{
    static void status(int age){
        if(age>20){
            System.out.println("Eligible");
        }else {
            throw new ArithmeticException("not eligible");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        Test.status(age);

    }
}

//user defined checked exception using default constructor
class CheckedException {
    static void status(int age) throws InvalidAgeException {
        if (age > 20) {
            System.out.println("Eligible");
        } else {
            throw new InvalidAgeException();
        }
    }

    public static void main(String[] args)throws InvalidAgeException {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        CheckedException.status(age);

    }
}
 class InvalidAgeException extends Exception{

 }


//user defined checked exception using parameterised constructor
class CheckedException1 {
    static void status(int age) throws InvalidAgeException1 {
        if (age > 20) {
            System.out.println("Eligible");
        } else {
            throw new InvalidAgeException1("not eligible");
        }
    }

    public static void main(String[] args)throws InvalidAgeException1 {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        CheckedException1.status(age);

    }
}
class InvalidAgeException1 extends Exception{
InvalidAgeException1(String str){
    super(str);
}
}

//user defined unchecked exception using parameterised constructor-> extends runtimeexception , throws optional
class UncheckedException {
    static void status(int age)  {
        if (age > 20) {
            System.out.println("Eligible");
        } else {
            throw new InvalidAgeException2("not eligible");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter age");
        int age = s.nextInt();
        UncheckedException.status(age);

    }
}
class InvalidAgeException2 extends RuntimeException{
    InvalidAgeException2(String str){
        super(str);
    }
}






