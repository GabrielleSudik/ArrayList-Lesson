import java.util.ArrayList;
import java.util.List;

//collections framework:
//the array list

public class Application {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//you can't use in the primitive type in the <>
		//gotta use proper name
		
		//add stuff to the array
		numbers.add(10);
		numbers.add(100);
		numbers.add(50);
		numbers.add(80);
		
		//retrieve items in the array
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(2));
		
		//iterating through loops:
		for(int i=0; i < numbers.size(); i++){
			System.out.println(numbers.get(i));
		}
		
		for(Integer value: numbers){
			System.out.println(value);			
		}
		
		//removing items from list (be careful!)
		//remove last item:
		numbers.remove(numbers.size() - 1);
		//remove first item (goes slow because it re-numbers everything else)
		numbers.remove(0);
		
		for(Integer value: numbers){
			System.out.println(value);			
		}
		
		//List interface:
		List<String> values = new ArrayList<String>();
		//I missed what this is all about. He skimmed through it.
		//He said usually you want ArrayList not List.
	}

}
