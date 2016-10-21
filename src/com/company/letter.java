package com.company;

/**
 * Created by lizhengxiang on 16-10-21.
 */

class litter{
    char x;
}

public class letter {
    static void f(litter y){
        y.x = 'a';
    }
    public static void main(String[] args) {
        // write your code here
        litter m = new litter();
        litter y = new litter();
        m.x = 'z';
        System.out.print(m.equals(y));
    }

}
