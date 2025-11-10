package exam1105;

public class NetwordRepository implements MemoRepository{

	@Override
	public void getMemo() {
		System.out.println("원격 메모를 저장합니다");
		
	}

	@Override
	public void addMemo(String id, String body) {
		System.out.println("PC에 메모를 조회합니다");
		
	}

	@Override
	public void deleteMemo(String id) {
		System.out.println("PC에 메모를 삭제합니다");
		
	}

	@Override
	public void updateMemo(String id, String body) {
		System.out.println("PC에 메모를 수정합니다");
		
	}

}
