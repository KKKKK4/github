package com.maven;

import java.util.Arrays;

public class ShuZuLieBiao<T> {
    T[] a;
    int index;

    public ShuZuLieBiao(){
        this(10);
    }
    public ShuZuLieBiao(int length){
        a = (T[]) new Object[length];
    }
    public void add(T t){
        queRenRongLiang();
        a[index] = t;
        index++;
    }

    private void queRenRongLiang(){
        if(index<a.length){
            return;
        }

        int n = a.length + a.length/2 +2;
        a = Arrays.copyOf(a,n);
    }

    public T get(int i){
        jianChaFanWei(i);
         return a[i];
    }

    private void jianChaFanWei(int i){
        if(i<0 || i>=index){
            throw new IndexOutOfBoundsException("下标："+i);
        }
    }
    public int size(){
        return index;
    }

    public T remove(int i){
        jianChaFanWei(i);
        T t = a[i];
        System.arraycopy(a,i+1,a,i,index-i-1);
        a[index-1] = null;
        index--;
        return t;
    }
}
