import java.util.*;
public class Main3vector {
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();
		System.out.println("=== After trimToSize()===");
		print(v);
		
		v.ensureCapacity(6);  // Vector는 사이즈가 부족할 경우 2배정도 증가한다
		System.out.println("=== After ensureCapacity(6)");
		print(v);
		
		v.setSize(7);
		System.out.println("=== After setSize(7)===");
		print(v);
		
		v.clear();
		System.out.println("=== After clear()===");
	}
	public static void print(Vector<String> v) {
		System.out.println(v);
		System.out.println("size :" + v.size());
		System.out.println("capacity :" + v.capacity());
	}

}
