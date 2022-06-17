package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	// write your code here
     Integer integer= Stream.of(1,2,3,14,5,6,7,8,9,10).map(x->x%2==0 ? x*x:0).max(Comparator.comparing(x->x*x)).get();
        System.out.println(integer);
    }
}
