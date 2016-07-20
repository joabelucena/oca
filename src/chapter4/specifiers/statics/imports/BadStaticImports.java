package chapter4.specifiers.statics.imports;

//import static java.util.Arrays;		//DOES NOT COMPILE: static import can just import static members not classes
//static import java.util.Arrays.*;		//DOES NOT COMPILE: 'static' keyword must come after 'import' 

import static java.util.Arrays.asList;
import static java.util.Arrays.*;

public class BadStaticImports {

	public static void main(String[] args) {
//		Arrays.asList("one");			//DOES NOT COMPILE: 'Arrays' never been imported

	}

}
