package exam1105;

public class MemoExample {

	public static void main(String[] args) {
		MemoRepository repository;
		
		repository = new LocalRepository();
		
		repository.addMemo("1", "Hello");
		
		repository = new NetwordRepository();
		
		repository.addMemo("1", "Hello");
		
		repository.updateMemo("1", null);
	}

}
