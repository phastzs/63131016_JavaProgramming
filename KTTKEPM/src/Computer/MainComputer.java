package Computer;

public class MainComputer {

	public static void main(String[] args) {
		Computer computer = new Computer.Builder()
				.buildCPU("Intel 3")
				.buildRAM("4GB")
				.buildSTORAGE("4TB NVMe")
				.buildSCREEN("15.6inchs")
				.build();
		System.out.println(computer.toString());
	}

}
