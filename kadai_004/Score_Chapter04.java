package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		String name[] = {"A","B","C","D","E","F","G","H","I","J"};
		int score[] = {10,20,30,40,50,60,70,80,90,100};
		//int amount = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println(name[i] + "さんの点数は" + score[i] + "点");
			//amount += score[i];
		}
	
		//System.out.println("テストの平均点は" + amount/score.length + "点");
		System.out.println("テストの平均点は" + (10 + 20 + 30 + 40 + 50 + 60 + 70 + 80 + 90 + 100)/10 + "点");
	}

}
