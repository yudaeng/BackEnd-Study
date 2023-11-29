package org.collectionAPI;

import java.util.HashSet;
import java.util.Set;
//set 이용하는 예제
public class SetUniqueNumbers {
    public static void main(String[] args) {
        int[]  nums={1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> uniqueNums = new HashSet<>();
        for(int number : nums){
            uniqueNums.add(number);

        }

        System.out.println("유니크 넘버" );
        for( int number : uniqueNums){
            System.out.println(number);
        }

    }
}
