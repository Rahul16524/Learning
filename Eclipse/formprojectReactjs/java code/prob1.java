import java.util.ArrayList;
import java.util.Iterator;

class prob1{
    public static void main(String[] args) {
        System.out.println("Hi");

        ArrayList<String> al = new ArrayList<>();

        al.add("Turner");
        al.add("Alice");
        al.add("Blake");

        System.out.println(al);

        for( String x: al) 
            System.out.println(x);

        al.sort();
        
        Iterator<String> itr = al.iterator();
        while( itr.hasNext() )
            System.out.println(it.next());
    }
}