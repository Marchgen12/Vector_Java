import java.util.*;

public class DemoVector {

	public static void main(String[] args) {
		Vector list = new Vector(20);
		
		list.addElement(new String("This"));
		list.addElement(new String("is"));
		list.add(new String("yes"));
		list.add(1, "sample");
		list.add(3, new Float(1.55505));
		
		System.out.println("The size of the Vectorlist is " + list.size());
		System.out.println("The capacity of the Vectorlist is " + list.capacity() + "\n");
		
		Enumeration listEnum = list.elements();
		System.out.println("The elements inside the vector is : " );

		
		while(listEnum.hasMoreElements()) {
			System.out.print(listEnum.nextElement() + " ");
		}
		System.out.println();
	}
	
}
