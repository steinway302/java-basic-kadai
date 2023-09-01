package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	
	//HashMap宣言
	HashMap<String,String> dictionary = new HashMap<String,String>();
			
	//コンストラクタ
	Dictionary_Chapter20(){
		
		//辞書に単語を追加
		dictionary.put("apple","リンゴ");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
	}
	
	//辞書検索メソッド
	void lookUpDictionary(String word) {
		
		if(dictionary.get(word) == null) {
			System.out.println(word + "は辞書に存在しません");
		}else {
			System.out.println(word + "の意味は" + dictionary.get(word));
		}
		
	}
			
}
