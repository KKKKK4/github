package com.maven;

public class text1 {
    public static void main(String[] args){
      System.out.println("----------------");
      f1();
      System.out.println("================");
      f2();
    }

    private static void f1(){
        for (int i=1; ;i++){
            double d = Math.random();
            if (d>0.999){
                System.out.println("第"+i+"次："+d);
                break;
            }
        }
    }

    private static void f2(){
        for(int i=1;i<=100;i++){
            int y = i%10;
            if(y==3 || y==5 || y==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
