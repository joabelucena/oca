package chapter4.specifiers.statics.imports;

import java.util.List;
import static java.util.Arrays.asList;

public class StaticImports {

	public static void main(String[] args) {
		List<String> list = asList("one", "two");
		
		System.out.println(list);		

	}

}
