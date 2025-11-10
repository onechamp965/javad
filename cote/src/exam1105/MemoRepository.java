package exam1105;

public interface MemoRepository {
	void getMemo();
	void addMemo(String id, String body);
	void deleteMemo(String id);
	void updateMemo(String id, String body);
}
