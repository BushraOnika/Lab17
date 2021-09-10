package Lab17;
import java.util.ArrayList;
public class GenericStack<T> {
    private ArrayList<T> list;

    public GenericStack() {
       list = new ArrayList<T>();
    }
    public int getSize(){
        return list.size();
    }
    public T peek(){
        return list.get(getSize()-1);
    }
    public T pop(){
        T item = peek();
        list.remove(getSize()-1);
        return item;
    }

}
