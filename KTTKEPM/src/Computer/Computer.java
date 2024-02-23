package Computer;
//Lớp cần tạo đôi tượng , việc tạo đối tượng gồm nhiều thành phần thông qua nhiều bước
public class Computer {
	//2. Xác định các thành phần phức tạp cần khởi tạo thông qua các bước
	String CPU, RAM, STORAGE, SCREEN;
	//4. Viêt hàm khởi tạo
	private Computer(Builder b) {// private thì cho thừa kế , protected thì k cho
		CPU = b.CPU;
		RAM = b.RAM;
		STORAGE = b.STORAGE;
		SCREEN = b.SCREEN;
	}
	@Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", STORAGE=" + STORAGE + ", SCREEN=" + SCREEN + "]";
    }
	//3.Khai báo , viết lớp builder
	public static class Builder{ //dùng public static vì phải có builder mới tạo được computer còn neeus không có static thì phải từ comuter mới tạo được builder vô lý
		private String CPU, RAM, STORAGE, SCREEN;
	}
	//6.Các phương thức để xây dựng từng thành phần
	public Builder buildCPU(String CPU) {
		this.CPU = CPU;
		return this;
	}
	public Builder buildRAM(String RAM) {
		this.RAM = RAM;
		return this;
	}
	public Builder buildSTORAGE(String STORAGE) {
		this.STORAGE = STORAGE;
		return this;
	}
	public Builder buildSCREEN(String SCREEN) {
		this.SCREEN = SCREEN;
		return this;
	}
	
	//5. Phương thưc build trả về đối tượng cần khởi tạo
	public Computer build() {
		return new Computer(this);
	}
}
