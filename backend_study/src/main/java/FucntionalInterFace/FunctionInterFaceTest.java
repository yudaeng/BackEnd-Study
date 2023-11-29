package FucntionalInterFace;

public class FunctionInterFaceTest implements MathOperation{
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterFaceTest();
        int result = mo.operation(10,20);
        System.out.println(result);
    }

    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
