
package predifinetfunctionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class PredifinedMethods {
	public static void main(String[] args) {
		
		Function<Integer,Integer> a=(x)->x+100;//  Function
		System.out.println(a.apply(40));
		
		
	Consumer<Float> b =(y)->System.out.println(y);  //consumer
	b.accept(404.44f);	
	
	
	Supplier<String> c=()->"ganesh raj ";    //supplier
	System.out.println(c.get());
	
	
	Predicate<Integer> d=(z)->z>100;	//predicate
	System.out.println(d.test(600));

	
	}

}
