import java.util.*;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>(10);
		list1.add((5));
		list1.add((4));
		list1.add((2));
		list1.add((0));
		list1.add((1));
		list1.add((3));
		
		ArrayList<String> list2 = new ArrayList<String>();
		print(list1, list2);
		
		Collections.sort(list1);//sort 정렬 시키는 것
		Collections.sort(list2);
		print(list1,list2);
		System.out.println("list.constainsAll(list2):"+ list1.containsAll(list2));
		
		list2.add("B");
		list2.add("C");
		list2.add(3,"A");
		print(list1,list2);
		
		list2.set(3, list2);
		
		System.out.println("list1.retainAll(list2):+list1.retainAll(list2");
		print(list1,list2);
		
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) // 포함여부 확인
				list2.remove(i);// 리스트 삭제
		}
		print(list1,list2);
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println("list2:" + list2);
		System.out.println();
	}

}
