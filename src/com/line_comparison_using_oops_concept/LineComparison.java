package com.line_comparison_using_oops_concept;

import java.util.Scanner;

class LineComparison implements EqualMtdImpl, CompareMtdImpl {

    public static void main(String[] args) {
        LineComparison l = new LineComparison();
        System.out.println("Welcome To Line Comparison Program");
        Scanner sc = new Scanner(System.in);

        LineB lineB = new LineB();
        System.out.println("Enter the value of x1 ");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of y1");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of x2");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y2");
        int y2 = sc.nextInt();

        float r1 = lineB.lineALength(x1, y1, x2, y2);


        System.out.println("Enter the value of x3");
        int x3 = sc.nextInt();
        System.out.println("Enter the value of y3");
        int y3 = sc.nextInt();
        System.out.println("Enter the value of x4");
        int x4 = sc.nextInt();
        System.out.println("Enter the value of y4");
        int y4 = sc.nextInt();

        float r2 = lineB.lineBLength(x3, y3, x4, y4);


        Float length1 = r1;
        System.out.println(length1);

        Float length2 = r2;
        System.out.println(length2);

        l.compareLengths(length1, length2);
        l.compareTwoLengths(length1, length2);
    }

    @Override
    public void compareLengths(Float length1, Float length2) {
        // UC-2 : Compare two lines  using equals method
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal");

        } else {
            System.out.println("lines are not equal");
        }
    }

    @Override
    public void compareTwoLengths(Float length1, Float length2) {
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
