package com.maven;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class text4 {
    public static void main(String[] args){
        System.out.println("输入毫秒值：");
        long t = new Scanner(System.in).nextLong();

    //把t封装到java.util.Date
    //new Date()；//无参构造，封装当前时间毫秒值
        Date d = new Date(t);
        System.out.println(d);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);
    }


}
