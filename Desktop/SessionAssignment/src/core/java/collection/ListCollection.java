package core.java.collection;

import java.util.ArrayList;
import java.util.List;

import core.java.Rectangle;

public class ListCollection {

	public static void main(String[] args) {
		
		
		List <Rectangle> _listRec= new ArrayList<Rectangle>();
	
	_listRec.add(new Rectangle(12,13));
	_listRec.add(new Rectangle(12,13));
	_listRec.add(new Rectangle(11,13));
	_listRec.add(new Rectangle(10,13));
	
	for (Rectangle rectangle:_listRec){
		rectangle.calArea();
	}
	
	}

}
