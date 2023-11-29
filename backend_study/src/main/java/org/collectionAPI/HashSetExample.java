package org.collectionAPI;

import java.util.HashSet;
import java.util.Set;
//hashset이용해보기
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // set은 중복x

        System.out.println(set.size());

        for(String elemnet : set){
            System.out.println(elemnet);
        }

        set.remove("Banana"); //banana 삭제

        for(String elment : set){
            System.out.println(elment);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("체리가 포함되어있어요?" + contains);

        set.clear(); // 셋 전체 비우기

        boolean empty = set.isEmpty();
        System.out.println("모두 비워져있어요?" + empty);
    }
}
