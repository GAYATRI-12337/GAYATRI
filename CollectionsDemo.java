import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
public class CollectionsDemo
{
public static void main(String[] args)
{
// List
ArrayList<String> obj=new ArrayList<>();
obj.add("Mohan");
obj.add("Gayatri");
obj.add("Ganesh");
System.out.println("List is : "+obj);
// Queue
Queue<Integer> que=new LinkedList<>();
que.add(02);
que.add(03);
que.add(01);
System.out.println("Peak element is : " + que.peek());
que.remove();
System.out.println("Queue is : "+que);
System.out.println("Peak element is : " + que.peek());
// HashMap
Map<String, Integer> h=new HashMap<>();
h.put("Gayatri", 01);
h.put("Mohan",27);
System.out.println("Hash map is : "+h);
}
}
