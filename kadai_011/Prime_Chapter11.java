package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {

		boolean[] primeNumArray = new boolean[101];
		for(int i=0; i<=100; i++) {
			primeNumArray[i] = true;
		}
		
		//�f����1���傫�����ƂȂ邽�߁A���[�v��2�����
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
		
		//�f����1���傫�����ƂȂ邽�߁A���[�v��2�����
		for(int i=2; i<=100; i++) {
			if(primeNumArray[i]) {
				System.out.println(i);
			}
		}
			
	}

}


