package org.collectionAPI;

import java.util.ArrayList;
//list 이용해보기
public class ListAPI {
    public static void main(String[] args) {
        //ArrayList 객체 생성

        ArrayList<String> list = new ArrayList<>();

        //데이터 추가

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana");//중복 데이터 추가(list는 중복데이터가 가능)


        //데이터 접근 및 출력
        System.out.println("첫번째 데이터" + list.get(0));
        System.out.println("두번째 데이터" + list.get(1));
        System.out.println("마지막 데이터" + list.get(list.size() -1)); // 마지막데이터는 사이즈 출력

        //데이터 삭제
        list.remove(0); //첫번재 데이터 삭제

        //데이터 수정
        list.set(1,"orange"); //두번째 데이터 수정

        for(String str : list){
            System.out.println(str);
        }
    }
}
