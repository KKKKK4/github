package com.maven;

public class text3 {
    public static void main(String[] args){
        ShuZuLieBiao<String> lb = new ShuZuLieBiao<>();
        lb.add("aaa");
        lb.add("aoa");
        lb.add("hga");
        lb.add("oia");
        lb.add("kaa");
        lb.add("tta");
        lb.add("lla");
        System.out.println(lb.size());
        System.out.println(lb.get(0));
        System.out.println(lb.get(lb.size()-1));
        System.out.println(lb.remove(4));
        for (int i=0;i<lb.size();i++){
            System.out.println(lb.get(i));
        }
    }
}
