package kadai_021;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 engDict = new Dictionary_Chapter21();
		engDict.addWords();
		
		String[] searchlist = {"apple", "banana", "grape", "orange"};
		
		engDict.search(searchlist);
	}

}
