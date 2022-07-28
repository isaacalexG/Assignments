package day7;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Stack;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class CollectionClasses {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		list.add("l1");
		list.add("l2");
		list.add("l3");
		list.remove(1);
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		List<String> array = new ArrayList<String>();
		array.add("a1");
		array.add("a2");
		array.add("a3");
		array.remove(1);
		Iterator<String> itrA = array.iterator();
		while (itrA.hasNext()) {
			System.out.println(itrA.next());
		}
		
		Vector<String> vector = new Vector<String>();
		vector.add("v1");
		vector.add("v2");
		vector.add("v3");
		vector.remove(1);
		Iterator<String> itrV = vector.iterator();
		while (itrV.hasNext()) {
			System.out.println(itrV.next());
		}
		
		Stack<String> stack = new Stack<>();
		stack.push("s1");
		stack.push("s2");
		stack.push("s3");
		stack.remove(1);
		Iterator<String> itrS = stack.iterator();
		while (itrS.hasNext()) {
			System.out.println(itrS.next());
		}
		
		
		
		Set<String> hashSet = new HashSet<>();
		hashSet.add("hs1");
		hashSet.add("hs2");
		hashSet.add("hs3");
		hashSet.remove("hs2");
		Iterator<String> itrHS = hashSet.iterator();
		while (itrHS.hasNext()) {
			System.out.println(itrHS.next());
		}
		
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("lhs1");
		linkedHashSet.add("lhs2");
		linkedHashSet.add("lhs3");
		linkedHashSet.remove("lhs2");
		Iterator<String> itrLHS = linkedHashSet.iterator();
		while (itrLHS.hasNext()) {
			System.out.println(itrLHS.next());
		}
		
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("ts1");
		treeSet.add("ts2");
		treeSet.add("ts3");
		treeSet.remove("ts2");
		Iterator<String> itrTS = treeSet.iterator();
		while (itrTS.hasNext()) {
			System.out.println(itrTS.next());
		}


		Object o1 = new Object("obj1", 5);
		Object o2 = new Object("obj2", 7);
		Object o3 = new Object("obj3", 10);
		
		Map<String, Object> hashMap = new HashMap<>();
		hashMap.put("h1", o1);
		hashMap.put("h2", o2);
		hashMap.put("h3", o3);
		Iterator<Map.Entry<String, Object>> itrHM = hashMap.entrySet().iterator();
		while(itrHM.hasNext()) {
			System.out.println(itrHM.next());
		}

		
		Map<String, Object> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("lh1", o1);
		linkedHashMap.put("lh2", o2);
		linkedHashMap.put("lh3", o3);
		Iterator<Map.Entry<String, Object>> itrLHM = linkedHashMap.entrySet().iterator();
		while(itrLHM.hasNext()) {
			System.out.println(itrLHM.next());
		}
		

		Map<String, Object> treeMap = new TreeMap<>();
		treeMap.put("tm1", o1);
		treeMap.put("tm2", o2);
		treeMap.put("tm3", o3);
		Iterator<Map.Entry<String, Object>> itrTM = treeMap.entrySet().iterator();
		while(itrTM.hasNext()) {
			System.out.println(itrTM.next());
		}
	}
}
	
class Object {
	
	private int num;
	private String name;
	
	Object(String s, int i) {
		this.num = i;
		this.name = s;
	}
	
	
}

