package trickyPrograms;
/*
 * What is the output of below program?
 */
import java.util.ArrayList;
import java.util.List;

public class WhatIsOutputArrayList {

	public static void main(String[] args) {
		  List<String> list = new ArrayList<>();
		  list.add("A");
		  list.add("B");
		  list.set(1, "C");
		  list.add("D");
		  System.out.println(list);//A,C,D

	}

}
