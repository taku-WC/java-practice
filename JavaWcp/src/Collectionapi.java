import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Collectionapi {
	public static void main(String[] args) {

		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();

		list1.add("A");
		list1.add("B");

		for (int i =0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}

	}

}

