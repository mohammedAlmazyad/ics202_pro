package ics202_pro;
import java.util.HashMap;
public class TestMain {
	public static void main(String args []){

		Trie t1=new Trie();

		String str="car";

		t1.insert(str);




		t1.insert("side");
		t1.insert("sid");
		System.out.println(t1.contains("side"));
		System.out.println(t1.size);
		System.out.println(t1.contains("sid"));

		System.out.println(t1.contains("cat"));
		t1.delete("sid");
		t1.delete("side");
		System.out.println(t1.size);
		System.out.println(t1.contains("side"));
		System.out.println(t1.contains("sid"));


		//ch1
	}

}
