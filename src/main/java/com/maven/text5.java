package com.maven;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

public class text5 {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.add("aaa");
        list.add("atr");
        list.add("ooo");
        list.add("pop");
        list.add("tyrt");
        list.add("aio");
        list.add("ahj");
        list.add("lll");
        list.add("lkj");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.remove("aaa"));
        System.out.println(list);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
    }
}
