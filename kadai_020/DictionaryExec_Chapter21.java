package kadai_020;


public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//�����C���X�^���X�𐶐�
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		//���ׂ�P���z��ɃZ�b�g
		String[] words = {"apple","banana","grape","orange"};
		
		//�����𒲂ׂ�
		for(String word : words) {
			dictionary.lookUpDictionary(word);
		}	
		
	}

}
