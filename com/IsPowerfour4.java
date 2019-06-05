package com.zbr.language;

import java.util.regex.Pattern;

public class IsPowerfour4 {
    public boolean Isfour(int num){
        String nums= Integer.toString(num);
        String pattern="/^1(00)*$/";
        boolean isMatch= Pattern.matches(pattern, nums);
        System.out.println(isMatch);
        return isMatch;
    }
    public static void main(String[] args) {
        IsPowerfour4 is4=new IsPowerfour4();
        is4.Isfour(4);
    }
}
