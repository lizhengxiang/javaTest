package com.company;

/**
 * Created by lizhengxiang on 16-10-23.
 */

class rock{
    rock(int i){
        System.out.print("hello world"+i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            new rock(i);
        }
    }
}
