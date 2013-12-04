import java.util.ArrayList;
import java.util.LinkedList;


public class Test {

	public static void main(String[] args) {
		int u = 2;
		int v = 1;

		if((u >= 3 || v >= 3) && (u <= 1000 && v <= 1000)) // Can't have edge between node 1 & 2.
			System.out.print(u + " " + v);

	}

}