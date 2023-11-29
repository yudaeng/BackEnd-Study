package org.collectionAPI;

public class Movie { //MovieExample을 위한 VO클래스
    private  String title;
    private String director;
    private  String year;
    private  String country;
    public Movie(){} //기본 생성자

    public Movie(String title, String director, String year, String country) { //생성자 오버로딩해서 초기화하기
        this.title = title;
        this.director = director;
        this.year = year;
        this.country = country;
    }

    public String getTitle() { //getter로 값을 얻어오기
        return title;
    }

    public void setTitle(String title) { //setter로 값을 저장
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() { //디버깅하기위한 toString
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
