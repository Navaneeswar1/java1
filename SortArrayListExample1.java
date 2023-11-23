import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortArrayListExample1 {
    public static void main(String[] args) {
		
		ArrayList<Playersone> list=new ArrayList<>();
		Playersone p1=new Playersone(1,"ram",25);
		Playersone p2=new Playersone(2,"lakshman",26);
		Playersone p3=new Playersone(3,"prem",24);
		Playersone p4=new Playersone(4,"eswar",23);

		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);

       System.out.println("All Players:");
        Iterator<Playersone> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

		System.out.println("Before Sorting: ");
		
		for(Playersone p : list)
		{
			System.out.println(p);
		}
		
		Collections.sort(list,(a,b)->a.getName().compareTo(b.getName()));
		
		System.out.println("After Sorting by name: ");	

		for(Playersone p : list)
		{
			System.out.println(p);
		}

		Collections.sort(list,(a,b)->a.getAge()>b.getAge()?1:-1);
		
		System.out.println("After Sorting by age: ");	
		
		for(Playersone p : list)
		{
			System.out.println(p);
		}
}
}

