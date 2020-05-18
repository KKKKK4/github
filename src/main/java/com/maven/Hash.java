package com.maven;

import java.util.HashMap;

public class Hash {
    public static void main(String[] args){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(9527,"唐伯虎");
        map.put(9528,"欸那天四年前哦");
        map.put(9529,"定心哦");
        map.put(9527,"新购");
        map.put(9527,"四大皆空");
        map.put(9531,"快点睡觉");
        map.put(9527,"可视对讲");
        map.put(9527,"山东科技");
        map.put(9527,"速度快");
        map.put(9533,null);
        map.put(null,"---");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(9527));
        System.out.println(map.get(9533));
        System.out.println(map.remove(9531));

    }
}
