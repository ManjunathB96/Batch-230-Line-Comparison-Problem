package com.bridgelabz_line_comparison_program;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program");

        // UC1 : create points consisting of cartesian co-ordinates and calculate length
        Line l1 = new Line();
        l1.p1 = new Point();

        l1.p1.x = 15;
        l1.p1.y = 25;

        l1.p2 = new Point();

        l1.p2.x = 70;
        l1.p2.y = 80;

        Line l2 = new Line();

        l2.p1 = new Point();

        l2.p1.x = 10;
        l2.p1.y = 20;

        l2.p2 = new Point();

        l2.p2.x = 80;
        l2.p2.y = 75;


        Float length1 = l1.getLength();
        System.out.println(length1);

        Float length2 = l2.getLength();
        System.out.println(length2);

       // UC-2 : Compare two lines  using equals method
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");

        } else {
            System.out.println("lines are not equal");
        }


        // UC-3 : Compare two lines Using  compareTo() method
        Float Value1 = new Float(length1);
        Float Value2 = new Float(length2);

        int compare = Value1.compareTo(Value2);
        if (compare > 0) {
            int sub = (int) (Value1 - Value2);
            System.out.println(Value1 + " is greater. \nAnswer after subtraction is= " + sub);
        } else if (compare < 0) {
            int sub = (int) (Value2 - Value1);
            System.out.println(Value2 + " is greater. \nAnswer after subtraction is= " + sub);
        } else {
            int sub = (int) (Value1 - Value2);
            System.out.println(" Both are equal! \nAnswer after subtraction is= " + sub);
        }

    }
}
