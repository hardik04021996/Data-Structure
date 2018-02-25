package DataStructures;

import java.util.ArrayList;

public class TreeNodes<T> {
	T data;
	ArrayList<TreeNodes<T>> children;
	
	TreeNodes(T data){
		this.data = data;
		children = new ArrayList<TreeNodes<T>>();
	}
	
}
