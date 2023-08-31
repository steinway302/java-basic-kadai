package kadai_017;

public class KatoExec_Chapter17 {

	public static void main(String[] args) {
		
		//インスタンス生成
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17(); //太郎
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17(); //一郎
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17(); //花子
		
		
		//名前セットメソッド実行
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		//紹介メソッド実行
		taro.execIntroduce();
		ichiro.execIntroduce();
		hanako.execIntroduce();
		
		

	}

}
