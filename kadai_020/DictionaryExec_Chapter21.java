package kadai_020;


public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		
		//辞書インスタンスを生成
		Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();
		
		//調べる単語を配列にセット
		String[] words = {"apple","banana","grape","orange"};
		
		//辞書を調べる
		for(String word : words) {
			dictionary.lookUpDictionary(word);
		}	
		
	}

}
