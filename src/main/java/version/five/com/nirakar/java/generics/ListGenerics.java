package com.nirakar.java.generics;

import java.util.ArrayList;
import java.util.List;

public class ListGenerics {
	
	public static void main(String args[]){
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list);
	}

}
