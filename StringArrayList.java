import java.util.*;
public class StringArrayList{
	public static void main(String[] args){
		ArrayList<String> stringlist=new ArrayList<>();
		stringlist.add("Apple");
		stringlist.add("Cherry");
		stringlist.add("Banana");
		stringlist.add("Orange");
		stringlist.add("Mango");
		 Collections.sort(stringlist);
        System.out.println("List after sorting: " + stringlist);
		System.out.println("First element:"+stringlist.get(0));
		stringlist.set(2, "Blueberry");
        System.out.println("updating Cherry to Blueberry: " + stringlist);
        stringlist.remove("Mango");
        System.out.println("List after removing 'Mango': " + stringlist);
        System.out.println("Does the list contain 'Cherry'? " + stringlist.contains("Cherry"));
         System.out.println("Size of the list: " + stringlist.size());
          Iterator itr = stringlist.iterator();
          System.out.println("Iterating over the list using Iterator:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
       
         stringlist.clear();
        System.out.println("List after clearing all elements: " + stringlist);
    }
}
