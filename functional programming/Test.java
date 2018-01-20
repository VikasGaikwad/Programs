import java.util.*;
import java.lang.Object.*;
public class Test{

	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		 
		long start=System.nanoTime();
		long stop=System.nanoTime();

		long elepsed=stop-start;

		double seconds=(double)elepsed/1000000000.0;
		TimeUnit.SECONDS.convert(elepsed, TimeUnit.NANOSECONDS);
		System.out.println(elepsed);
	}
}

