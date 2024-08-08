package CoreJava2;

public class NestedLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method
//NestedForloop -oneloop inside another
		for (int i = 1; i <= 4; i++)// outerforloop
		{
			System.out.println(i);
			for (int j = 1; j <= 4; j++)// (innerloop)
			{
				System.out.println(j);

			}

		}

	}

}
