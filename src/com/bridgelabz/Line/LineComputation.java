package com.bridgelabz.Line;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;
import java.lang.Double;

public class LineComputation {


    public static double x1,x2,y1,y2,x3,y3,y4,x4,lineLength;

    public static double calculateLength(double x1, double y1, double x2, double y2){

        lineLength = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        //System.out.println("line length :"+lineLength1);
        return lineLength;

    }

    /*public void checkEqual(){

        double l1 = calculateLength(x1, y1, x2, y2);
        double l2 = calculateLength(x3, y3, x4, y4);

        if (Objects.equals(l1, l2)){

            System.out.println("Lines are equal");
        }


    }
*/
    public void compare(){

        double l1 = calculateLength(x1, y1, x2, y2);
        double l2 = calculateLength(x3, y3, x4, y4);

        //if (l1.toString().compareTo.(l2.toString())){}
        // System.out.println((l1.toString()).compareTo(l2.toString()));

        if (Double.compare(l1, l2) < 0) {
            System.out.println("Line 1 less than line 2");
        }
        else if (Double.compare(l1, l2) > 0) {
            System.out.println("Line 2 less than line 1");
        }
        else{
            System.out.println("Line 1 equals to line 2");
        }

    }

    public static void main(String[] args) {

        //double x1,x2,y1,y2,x3,y3,y4,x4;
        Scanner s = new Scanner(System.in);

        System.out.println("Welcome to Line comparison computation");
        System.out.println("enter the values");

        x1 = s.nextDouble();
        y1 = s.nextDouble();
        x2 = s.nextDouble();
        y2 = s.nextDouble();

        System.out.println("enter the values x3,y3,x4,y4");

        x3 = s.nextDouble();
        y3 = s.nextDouble();
        x4 = s.nextDouble();
        y4 = s.nextDouble();

        LineComputation lc = new LineComputation();

        lc.calculateLength(x1, y1, x2, y2);
        lc.calculateLength(x3, y3, x4, y4);

        //lc.checkEqual();
        lc.compare();

    }
}
