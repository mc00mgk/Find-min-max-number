
public class Main {

	public static void main(String[] args) {
		int[] list = new int [] {55,32,2,9,100,-1,-36};
		
		int min = list[0];
		int max = list[0];
		
		for ( int i : list) {
			if( i < min) {
				min = i;
			}
			if(i> max) {
				max = i;
			}
		}
		System.out.println("minumum deger :" + min);
		System.out.println("maximum deger : " + max);
	}

}
