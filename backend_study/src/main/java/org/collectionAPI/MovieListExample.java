package org.collectionAPI;

import java.util.ArrayList;
//movie list 이용해보기

public class MovieListExample {

    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("괴물","봉준호","2006", "한국"));
        list.add(new Movie("기생충","봉준호","2013", "한국"));

        for(Movie m : list) {
            System.out.println(m);
        }
    }
}
