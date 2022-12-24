package com.line_comparison_using_oops_concept;

public abstract class LineA {
    public float lineALength(int x1, int y1, int x2, int y2){
        float result1= (float) Math.sqrt(Math.pow((x2 - x1),2 )+ Math.pow((y2 - y1),2));

        return result1;
    }
}
