import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		ArrayList t = new ArrayList();
		t.add(1);
		t.add(2);
		Iterator iterator = t.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}
