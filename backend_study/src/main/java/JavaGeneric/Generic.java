package JavaGeneric;

//제네릭 타입을 선언할 때 어떤 데이터 타입이 들어올지 결정하지 않으므로,
//다양한 데이터 타입에 대해 메서드나 클래스를 작성할 수 있다.
//유연성,재사용성,타입의 안전성 보장 가능

public class Generic {
    public static void main(String[] args) {
        ObjectArr<String> array = new ObjectArr<>(5); //스트링으로 타입정하기

        array.set(0,"Hello");
        array.set(1,"Helle");
        array.set(2,"Hellw");
        array.set(3,"Hellq");

        for(int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }
    }
}
