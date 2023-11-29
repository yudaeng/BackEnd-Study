package Gson;

import com.google.gson.Gson;
//Json -> Object
public class GsonfromJson {
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"na@naver.com\"}";
        Gson gson = new Gson();

        Member mvo=gson.fromJson(json, Member.class);
        System.out.println(mvo);

    }
}
