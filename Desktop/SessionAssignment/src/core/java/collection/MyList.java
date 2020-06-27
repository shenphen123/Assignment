package core.java.collection;

import java.util.ArrayList;
import java.util.List;



public class MyList {
	
	public static void main(String [] args){
List <Integer> _list= new ArrayList<Integer>();
	
	_list.add(13);
	_list.add(12);
	_list.add(10);
	_list.add(11);
	
	for (Integer num : _list){
	System.out.println("Element in a list: " + num);
	}
		

	}
}
