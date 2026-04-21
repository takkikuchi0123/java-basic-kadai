package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	HashMap<String, String> hashHands = new HashMap<String, String>();
	
	String jHands[] = {"r","s","p"};
	

	
	public String getMyChoice(){
		
		Scanner scanHands = new Scanner(System.in);
		String myHands = "";
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			if(scanHands.hasNext()) {
				myHands = scanHands.next();
			}
			
			if(myHands.equals("r")||myHands.equals("s")||myHands.equals("p")) {
				break;
			}
			else {
				System.out.println("エラー: r s p　のいずれかを入力してください");
			}
		}
		
		return myHands;
		
	}
	
	public String getRandom(){
		int randHands = (int)Math.floor(Math.random()*3 );
		String enemyHands = jHands[randHands];
		
		return enemyHands;
	}
	
	public void playGame(){
		hashHands.put("r", "グー");
	    hashHands.put("s", "チョキ");
	    hashHands.put("p", "パー");
	    
	    String myChoice = getMyChoice();
	    String enemyChoice = getRandom();
	    
	    System.out.println("自分の手は"+hashHands.get(myChoice)+",対戦相手の手は"+hashHands.get(enemyChoice));
	    
	    if(myChoice.equals(enemyChoice)) {
	    	System.out.println("あいこです");
	    }
	    else if((myChoice.equals("r") && enemyChoice.equals("s"))||
	    		(myChoice.equals("s") && enemyChoice.equals("p"))||
	    		(myChoice.equals("p") && enemyChoice.equals("r"))) {
	    	System.out.println("自分の勝ちです");
	    }
	    else {
	    	System.out.println("自分の負けです");
	    }
		
	}

}
