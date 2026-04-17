package kadai_015;

public class CarExec_Chapter15 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Car_Chapter15 myCar = new Car_Chapter15();
		int randomGear = (int)(Math.ceil(Math.random()*5));
		
		myCar.changeGear(randomGear);
		myCar.run();
		
	}

}
