package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	
	public void setGivenName() {
		this.givenName = "花子";
	}
	
	public void commonIntroduce() {
		System.out.println("名前は"+familyName+givenName+"です");
	}
	
	public void execIntroduce() {
		System.out.println("住所は"+address+"です");
	}
	
	public void eachIntroduce() {
		System.out.println("趣味は読書です");
	}
}
