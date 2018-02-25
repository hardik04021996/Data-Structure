package DataStructures;

import java.util.ArrayList;

public class Vertex {


	String name;
	private ArrayList<Edge> edges;
	Vertex(String name){
		edges  = new ArrayList<>();
		this.name = name;
	}
	public int numEdges() {
		return edges.size();
	}
	public void addEdge(Edge e) {
		edges.add(e);
	}
	public boolean isAdjacent(Vertex v2) {

		for(Edge e : edges){
			if(e.first == v2 || e.second == v2){
				return true;
			}
		}
		return false;
	}
	public ArrayList<Vertex> getAdjacent() {
		ArrayList<Vertex> adjacent = new ArrayList<>();
		for(Edge e : edges){
			if(e.first == this){
				adjacent.add(e.second);
			}
			else{
				adjacent.add(e.first);
			}
		}
		return adjacent;
	}

	public void removeEdgeWith(Vertex v) {
		for(int i = 0; i < edges.size(); i++){
			Edge e = edges.get(i);
			if(e.first == v || e.second == v){
				edges.remove(i);
				return;
			}
		}	
	}


	public void print(){
		String toBePrinted = this.name +" :";
		for(Edge e : edges){
			if(e.first == this){
				toBePrinted +=e.second.name+", ";
			}
			else{
				toBePrinted +=e.first.name+", ";
			}
		}
		System.out.println(toBePrinted);
	}
}