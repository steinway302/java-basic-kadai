package kadai_014;

public class Car_Chapter14 {
	
	//�t�B�[���h
	private int gear = 1; //�M�A
	private int speed = 10; //���x
	
	//�M�A�`�F���W���\�b�h
	public void gearChange(int afterGear) {
		int beforeGear = this.gear;
		this.gear = afterGear;
		
		switch(this.gear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default -> this.speed = 10;
		}
		
		System.out.println("�M�A" + beforeGear + "����" + this.gear + "�ɐ؂�ւ��܂���");
	}
	
	//���x�\�����\�b�h
	public void run() {
		System.out.println("���x�͎���" + this.speed + "km�ł�");
	}
}
