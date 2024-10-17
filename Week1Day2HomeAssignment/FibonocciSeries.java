package Week1Day2HomeAssignment;

public class FibonocciSeries {

	public static void main(String[] args) {
		int f=0;
		int s = 1; 
		int t=0;
		int n=0;
		System.out.println("Enter a value : 8");
		System.out.println(f);
		System.out.println(s);
		
		for (int i = 3; i <=8; i++) {
			t=f+s;
			f=s;
			s=t;
			System.out.println(t);
			
		}
		
		
		

	}

}
