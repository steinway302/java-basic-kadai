package kadai_017;

abstract public class Kato_Chapter17 {
	
	//�t�B�[���h
	public String familyName = "����";
	public String givenName;
	public String address = "�����s�����Z�~";
	
	//���ʏЉ�o�̓��\�b�h
	public void commonIntroduce() {
		System.out.println("�Z����" + this.address + "�ł�");
	}
	
	//�ʏЉ�o�̓��\�b�h
	abstract public void eachIntroduce();
	
	//�Љ���s���\�b�h
	public void execIntroduce() {
		System.out.println("���̖��O��" + this.familyName + this.givenName + "�ł�");
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}

}
