package com.line_comparison_using_oops_concept;

public class LineB extends LineA{

    public float lineBLength(int x3, int y3, int x4, int y4){
        float result2= (float) Math.sqrt(Math.pow((x4 - x3),2 )+ Math.pow((y4 - y3),2));


        return result2;
    }
}
/*
   int x1,y1,x2,y2;

    public LineB(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

 */