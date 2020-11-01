package array;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.Set;

public class BasketballPlayerDemo {
	
	public static void main(String[] args) {
		PlayerList.init(8);
		PlayerList.add(15);
		PlayerList.add(25);
		PlayerList.add(30);
		PlayerList.add(21);
		PlayerList.add(17);
		PlayerList.add(14);
		PlayerList.add(28);
		PlayerList.add(81);
		PlayerList.print();
		Integer num = PlayerList.get(2);
		System.out.println(num);
		int index = PlayerList.getIndexByPlayerNum(30);
		System.out.println(index);
		PlayerList.set(2,99);
		PlayerList.print();
		PlayerList.update(21,39);
		PlayerList.print();
		PlayerList.delete(2);
		PlayerList.add(67);
		PlayerList.add(75);
		PlayerList.print();
	}
	
	
	
	
	

}
