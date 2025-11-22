package lesson14.storage;

public class Storage <T>{

    private Object[] array;
    private int size;

    public Storage (){
        array = new Object[10];
        size = 0;
    }

    public void add(T obj){
        array[size++] = obj;
    }

    public T getByIndex(int index){
        return (T)array[index];
    }

    public  void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }


}
