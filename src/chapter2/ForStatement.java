package chapter2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import lib.Car;

public class ForStatement {

	public static void main(String[] args) {

		//Most commom
		{
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
		}

		System.out.println();

		// Optional parameters
		{

			for (int i = 0; i < 10;) {
				System.out.print(++i + " ");
			}
		}

		System.out.println();

		// Multiple variables
		{

			int x = 0;
			long y;
			int z;
			for ( y = 0, z = 4; x < 5 && y < 10; x++, y++) {
				System.out.print(y + " ");
			}
			System.out.println(x);
		}
		
		//for-each loop
		{
			Set<Car> cars = new HashSet<Car>();
			
			cars.add(new Car("VW", "Golf"));
			cars.add(new Car("Ferrari", "LaFerrari"));
			
			for(Car car : cars){
				System.out.println("Brand: " + car.getBrand() + " | Car: " + car.getModel());
			}
			
			final String[] names = new String[3];
			names[0] = "Lisa";
			names[1] = "Kevin";
			names[2] = "Roger";
			
			for(String name : names){
				System.out.print(name + ", ");
			}
			
			System.out.println();
			List<Integer> values = new ArrayList<Integer>();
			values.add(1);
			values.add(2);
			values.add(3);
			for(Iterator<Integer> i = values.iterator(); i.hasNext();){
				int value = i.next();
				System.out.print(value + ", ");
			}
			
		}
		
		
		
	}

}
