package kadai_017;

abstract public class Kato_Chapter17 {
	
	//フィールド
	public String familyName = "加藤";
	public String givenName;
	public String address = "東京都中野区〇×";
	
	//共通紹介出力メソッド
	public void commonIntroduce() {
		System.out.println("住所は" + this.address + "です");
	}
	
	//個別紹介出力メソッド
	abstract public void eachIntroduce();
	
	//紹介実行メソッド
	public void execIntroduce() {
		System.out.println("私の名前は" + this.familyName + this.givenName + "です");
		commonIntroduce();
		eachIntroduce();
		System.out.println();
	}

}
