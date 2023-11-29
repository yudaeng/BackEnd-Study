package FucntionalInterFace;

public class FunctionInterFaceTest2 {
    public static void main(String[] args) {
        //MathOperation 인터페이스를 익명내부클래스로 구현하기

        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
       int result =  mo.operation(10,20);
        System.out.println(result);
    }
}
