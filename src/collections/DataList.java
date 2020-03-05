package collections;
import java.util.Arrays;

public class DataList<E> 
{
    private int len= 0;
     
    private static final int MIN_CAPACITY = 10;
     
    private Object a[];
 
    public DataList() {
        a = new Object[MIN_CAPACITY];
    }
 
    public void add(E e) {
        if (len == a.length) {
            ensureCapacity();
        }
        a[len++] = e;
    }
     
    @SuppressWarnings("unchecked")
    public E get(int i) {
        if (i >= len || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) a[i];
    }
     
    @SuppressWarnings("unchecked")
    public E remove(int i) {
        if (i >= len || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        Object item = a[i];
        int num = len - ( i + 1 ) ;
        System.arraycopy( a, i + 1, a, i, num ) ;
        len--;
        return (E) item;
    }
     
    public int len() {
        return len;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < len ;i++) {
             sb.append(a[i].toString());
             if(i<len-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
     
    private void ensureCapacity() {
        int newlen = a.length * 2;
        a = Arrays.copyOf(a, newlen);
    }
}

