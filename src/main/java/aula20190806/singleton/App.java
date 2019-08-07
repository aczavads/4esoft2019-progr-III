package aula20190806.singleton;

import java.util.Arrays;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		
		ConnectionPooling.getInstance().setTimeout(500);
		
		List<ConnectionPooling> cps = Arrays.asList(
				ConnectionPooling.getInstance(),
				ConnectionPooling.getInstance(),
				ConnectionPooling.getInstance(),
				ConnectionPooling.getInstance(),
				ConnectionPooling.getInstance(),
				ConnectionPooling.getInstance());
		
		System.out.println(cps.size());
		
		for (ConnectionPooling connectionPooling : cps) {
			System.out.println(connectionPooling + " => " + connectionPooling.getTimeout());
		}
		
		System.out.println(ConnectionPooling.getInstance() == ConnectionPooling.getInstance());
		
	}

}
