/**@author Christopher Joya Lopez. This class is designed to represent
 * roads/routes, but because I will be using a graph data structure, the 
 * roads/routes can be viewed as edges connecting the towns(vertices). This
 * class will also store the distances connecting towns(vertices) with the values 
 * in miles. Roads are undirected.
 */
public class Road implements Comparable<Road>{
	
	private String edgeName;
	
	private Town town1;
	
	private Town town2;
	
	private int distance; // in miles
	
	public Road(Town source, Town destination, int degrees, String name) {
		
		town1 = t1;
		
		town2 = t2;
		
		this.distance = distance;
		
		this.edgeName = edgeName;
	}
	
	public Road(Town source, Town destination, String name) {
		
		
	}
	
	public String getEdgeName() {
		
		return edgeName;
	}
	
	public void setEdgeName(String name) {
		
		edgeName = name;
	}
	
	public Town getTown1() {
		
		return town1;
	}
	
	public Town getTown2() {
		
		return town2;
	}
	
	public int getTownDistance() {
		
		return distance;
	}
	
	public void setTownDistance(int distance) {
		
		this.distance = distance;
	}
}
