package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	// 1. インスタンスの生成
    HashMap<String, String> engWord = new HashMap<String, String>();
    
    // 2. データの追加（メソッドの中で行う）
    
    public void addWords() {
    	
    engWord.put("apple", "りんご");
    engWord.put("peach", "桃");
    engWord.put("banana", "バナナ");
    engWord.put("lemon", "レモン");
    engWord.put("pear", "梨");
    engWord.put("kiwi", "キウィ");
    engWord.put("straberry", "いちご");
    engWord.put("grape", "ぶどう");
    engWord.put("muscat", "マスカット");
    engWord.put("cherry", "さくらんぼ");
    }
    
    public void search (String[] words) {
    	for(String word : words) {
    		if (engWord.containsKey(word)) {
                System.out.println(word + "の意味は" + engWord.get(word));
            } 
    		else {
                System.out.println(word + "は辞書に存在しません");
            }
    	}
    }
}