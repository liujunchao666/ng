package com.example.demo.xml;

public class Test {




    public int   add(int a ,int b){
        int c=a+b;
        int d=127;
        int e=c+d;
        return e;
    }
    public static void main(String[] args) {
        Test t=new Test();
        System.out.println(t.add(1,2));

    }
}
