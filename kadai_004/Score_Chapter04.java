package kadai_004;

public class Score_Chapter04 {

	public static void main(String[] args) {
		
		String name[] = {"A","B","C","D","E","F","G","H","I","J"};
		int score[] = {10,20,30,40,50,60,70,80,90,100};
		//int amount = 0;
		
		for(int i=0; i<10; i++) {
			System.out.println(name[i] + "����̓_����" + score[i] + "�_");
			//amount += score[i];
		}
	
		//System.out.println("�e�X�g�̕��ϓ_��" + amount/score.length + "�_");
		System.out.println("�e�X�g�̕��ϓ_��" + (10 + 20 + 30 + 40 + 50 + 60 + 70 + 80 + 90 + 100)/10 + "�_");
	}

}
