package com.maven;

public class test2 {
    public static void main(String[] args){
        String s0 = "abkdjfskjaflsjkdldjfla";
        StringBuilder sb = new StringBuilder();

        long t = System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            sb.append(s0);
        }
        t = System.currentTimeMillis() -t;
        System.out.println(t);
    }
}
