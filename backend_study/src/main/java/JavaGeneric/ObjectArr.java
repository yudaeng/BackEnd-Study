package JavaGeneric;

public class ObjectArr<T> {

        private T[] array; //T배열
        private int size;

        public ObjectArr(int size){ //생성자
            array= (T[])new Object[size]; //T배열로 형변환해주기
        }

        public void set(int index, T value){
            array[index]=value;
            size++;
        }

        public T get(int index){
            return array[index];
        }

        public int size(){
            return size;
        }
}
