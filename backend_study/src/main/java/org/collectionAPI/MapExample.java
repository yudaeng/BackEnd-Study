package org.collectionAPI;

import java.util.HashMap;
import java.util.Map;
//hashmap 사용해보기
public class MapExample  {
    public static void main(String[] args) {
        Map<String, Integer> stdScores = new HashMap<>();
        stdScores.put("Kim",95);
        stdScores.put("Lee",85);
        stdScores.put("Park",75);
        stdScores.put("Choi",65);

        System.out.println("Kim의 스코어는" + stdScores.get("Kim"));

        stdScores.put("Choi",85); //수정하기
        System.out.println("Choi의 스코어는" + stdScores.get("Choi"));

        stdScores.remove("Choi");
        System.out.println("Choi의 스코어는" + stdScores.get("Choi"));

        for(Map.Entry<String,Integer> entry : stdScores.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }




    }
}
