package Gson;


import com.google.gson.Gson;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo = new Member("홍길동",30,"na@naver.com");
        //Json -> { "name" : "홍길동" , "age" : 30, "email" : "na@naver.com"}

       Gson gson = new Gson();
       String json = gson.toJson(mvo);

        System.out.println(json);
    }
}
