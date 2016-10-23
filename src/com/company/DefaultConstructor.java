package com.company;

/**
 * Created by lizhengxiang on 16-10-23.
 */

class Bird{
    Bird(int i){
        System.out.print(i);
    }
    Bird(char i){
        System.out.print(i);
    }
}

public class DefaultConstructor {
    public static void main(String[] args) {
        new Bird('z');
    }
}
