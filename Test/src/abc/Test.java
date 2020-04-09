package abc;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		
		
		try{
			System.out.println("try");
			System.out.println(10/0);
		}
		catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("npe");
		}finally {
			System.out.println("finally");
		}
		
	}
	
	static void add() throws Exception {
		System.out.println("add");
		int i=10/0;
	}

}
