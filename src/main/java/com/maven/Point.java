package com.maven;

public class Point {
    //定义变量
    int x;
    int y;
    //生成构造方法
    public Point(int x,int y){
        this.x = x;
        this.y = y;

    }
    public String toString(){
        return "("+x+","+y+")";
    }
}
