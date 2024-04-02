// Write a program to create user defined exceptions called HrsException, MinException and SecException. Create a class Time which contains data members hours, minutes, seconds and a method to take a time from user which throws the user defined exceptions if hours (>24 &<0),minutes(>60 &<0),seconds(>60 &<0).

package lab08;

import java.util.Scanner;

class HrsException extends Exception {
    HrsException(String s) {
        super(s);
    }
}

class MinException extends Exception {
    MinException(String s) {
        super(s);
    }
}

class SecException extends Exception {
    SecException(String s) {
        super(s);
    }
}

class Time {
    int hours, minutes, seconds;

    public void takeTime() throws HrsException, MinException, SecException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextInt();
        if (hours > 24 || hours < 0) {
            throw new HrsException("Invalid hours");
        }
        System.out.print("Enter minutes: ");
        minutes = sc.nextInt();
        if (minutes > 60 || minutes < 0) {
            throw new MinException("Invalid minutes");
        }
        System.out.print("Enter seconds: ");
        seconds = sc.nextInt();
        if (seconds > 60 || seconds < 0) {
            throw new SecException("Invalid seconds");
        }
    }
}

public class HMS {
    public static void main(String[] args) {
        Time t = new Time();
        try {
            t.takeTime();
        } catch (HrsException e) {
            System.out.println(e);
        } catch (MinException e) {
            System.out.println(e);
        } catch (SecException e) {
            System.out.println(e);
        }
    }
}

