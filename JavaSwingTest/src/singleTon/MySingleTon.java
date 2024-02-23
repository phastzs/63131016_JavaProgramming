package singleTon;

public class MySingleTon {
	//khai báo biên isngle toon
	private static  MySingleTon instance;
	
	int count = 0;
	//2/ Phương thức khởi tạo private hoặc protected
	protected MySingleTon() {}
	//3 Phương thức tỉnh dùng để trả về biên instance
	public static MySingleTon getInstancee() {
		if(instance == null)
			instance = new MySingleTon();
		return instance;
	}
	public static inCount() {
		count
	}
}
