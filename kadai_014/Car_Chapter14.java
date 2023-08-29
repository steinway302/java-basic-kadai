package kadai_014;

public class Car_Chapter14 {
	
	//フィールド
	private int gear = 1; //ギア
	private int speed = 10; //速度
	
	//ギアチェンジメソッド
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
		
		System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
	}
	
	//速度表示メソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
