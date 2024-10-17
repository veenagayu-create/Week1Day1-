package Week1Day2HomeAssignment;

import java.util.Iterator;

public class IsPrime {
	public static void main(String[] args) {
		
		int num=13;
		int count=0;
		for(int i=1; i<=num; i++) {
			if(num % i ==0) {
				count ++;
				
			}
		
	
		}
	
	if (count==2) {
		System.out.println("The number is prime");
		
	}else {
		System.out.println("The number is not prime");
	}

	

	
	
	}
}


