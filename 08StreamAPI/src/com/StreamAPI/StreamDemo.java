package com.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> nums = List.of(4,6,7,5,2,9,1);

        //stream

        Stream<Integer> s1 = nums.stream();
//        stream.forEach(n -> System.out.println(n));

//        Predicate<Integer> isEven = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer num) {
//                return num % 2 == 0;
//            }
//        };

        Stream<Integer> s2 = s1.filter(num -> num % 2 == 1);
        Stream<Integer> s3 = s2.map(num -> num * 2);
        int total = s3.reduce(0,(c,e) -> c + e);
        System.out.println(total);
//
//        s2.forEach(n -> System.out.println(n));
//        s3.forEach(n -> System.out.println(n));



        List<Integer> oddNums = new ArrayList<>();
        List<Integer> doubleOddNums = new ArrayList<>();

//        for (int num : nums){
//            if (num % 2 != 0){
//                oddNums.add(num);
//            }
//        }
//
//        for (int n : oddNums){
//            System.out.println(n);
//        }
    }
}
