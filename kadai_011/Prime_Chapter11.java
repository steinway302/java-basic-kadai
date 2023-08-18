package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		boolean[] primeNumArray = new boolean[101];
		for(int i=0; i<=100; i++) {
			primeNumArray[i] = true;
		}
		
		//素数は1より大きい数となるため、ループは2から回す
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=100; j++) {
				if(i==j) {
					continue;
				}
				if(i%j == 0) {
					primeNumArray[i] = false;
					continue;
				}
			}
		}
		
		//素数は1より大きい数となるため、ループは2から回す
		for(int i=2; i<=100; i++) {
			if(primeNumArray[i]) {
				System.out.println(i);
			}
		}
			
	}

}


