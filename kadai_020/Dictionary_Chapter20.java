package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	//HashMap�錾
	HashMap<String,String> dictionary = new HashMap<String,String>();
			
	//�R���X�g���N�^
	Dictionary_Chapter20(){
		
		//�����ɒP���ǉ�
		dictionary.put("apple","�����S");
		dictionary.put("peach","��");
		dictionary.put("banana","�o�i�i");
		dictionary.put("lemon","������");
		dictionary.put("pear","��");
		dictionary.put("kiwi","�L�E�B");
		dictionary.put("strawberry","������");
		dictionary.put("grape","�Ԃǂ�");
		dictionary.put("muscat","�}�X�J�b�g");
		dictionary.put("cherry","��������");
		
	}
	
	//�����������\�b�h
	void lookUpDictionary(String word) {
		
		if(dictionary.get(word) == null) {
			System.out.println(word + "�͎����ɑ��݂��܂���");
		}else {
			System.out.println(word + "�̈Ӗ���" + dictionary.get(word));
		}
		
	}
			
}
