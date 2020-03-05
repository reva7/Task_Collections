package collections;

public class MainClass{
    public static void main(String[] args) 
    {
        DataList<Integer> list = new DataList<>();
 
        //Add elements
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(2);
        System.out.println(list);
         
        //Remove elements from index
        list.remove(1);
        System.out.println(list);
         
        //Get element with index
        System.out.println( list.get(3) );
        System.out.println( list.get(1) );
 
        //List Size
        System.out.println(list.len());
    }
}