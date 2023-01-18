package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Strat");
		System.out.println("1. Array List");
		List<String> nameList = new ArrayList<>();
		
		System.out.println("Name List size :: "+ nameList.size());
		
		System.out.println("Name List" + nameList);
		
		nameList.add("Paritosh");
		nameList.add("Paradada");
		nameList.add("kjhjgfgdsdfgh");
		
		System.out.println("Name List size :: "+ nameList.size());
		
		System.out.println("Name List" + nameList);
		System.out.println("name at index 2 ::" +nameList.get(2));
		
		nameList.remove(1);
		System.out.println("Name List size :: "+ nameList.size());
		System.out.println("Name List" + nameList);
		
		
		nameList.add("Paritosh");
		nameList.add("Paritosh");
		System.out.println("Name List size :: "+ nameList.size());
		System.out.println("Name List" + nameList);
		
		
		System.out.println("");
		System.out.println("2. HashSet");
		
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("number Size::" + numberSet.size());
		System.out.println("numberSet ::"  + numberSet);
		
		numberSet.add(101);
		numberSet.add(1);
		numberSet.add(10);
		numberSet.add(11);
		numberSet.add(01);
		numberSet.add(1011);
		
		System.out.println("after adding:");
		System.out.println("NumberSet sIZE::" + numberSet.size());
		System.out.println("Number Set::" + numberSet);
		System.out.println("Main end");
		
		
		System.out.println("");
		System.out.println("3. TreeSet");
		
		Set<String> nameTreeSet = new TreeSet<String>();
		System.out.println("nameTreeSet Size::" + nameTreeSet.size());
		System.out.println("numTreeSet ::"  + nameTreeSet);
		
		nameTreeSet.add("A");
		nameTreeSet.add("b");
		nameTreeSet.add("c");
		nameTreeSet.add("D");
		nameTreeSet.add("R");
		nameTreeSet.add("ASDAD");
		
		System.out.println("after adding:");
		System.out.println("nameTree sIZE::" + nameTreeSet.size());
		System.out.println("Name Tree Set::" + nameTreeSet);
		System.out.println("Main end");
	}

}
