package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//�C���X�^���X����
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17(); //���Y
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17(); //��Y
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17(); //�Ԏq
		
		
		//���O�Z�b�g���\�b�h���s
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//�Љ�\�b�h���s
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		
		

	}

}
