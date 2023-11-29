package JavaGeneric;

import java.util.HashMap;

//멀티타입 제네릭
public class PairGeneric {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("hello",1);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());


    }
}
