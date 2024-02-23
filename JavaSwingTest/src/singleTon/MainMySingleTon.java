package singleTon;

public class MainMySingleTon {

	public static void main(String[] args) {
		MySingleTon s1 = MySingleTon.getInstancee();
		MySingleTon s2 = MySingleTon.getInstancee();
		s1.inCount();//1
		s1.inCount();//2
		s2.inCount();//1
		s1.inCount();//3
	}
}
