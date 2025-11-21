import java.util.ArrayList;
/**@author Christopher Joya Lopez. This class represents Towns(vertices) for our graph.
 * Some towns will be linked through roads(edges), so this class also stores adjacent(next to)
 * towns. You can also compare towns by their corresponding names.
 */
public class Town implements Comparable<Town>{

	private String townName;
	
	private ArrayList<Town> adjTowns = new ArrayList<>();

	public Town(String name) {
		
		townName = name;
	}
	
	public String getTownName() {
		
		return townName;
	}
	
	public void setTownName(String name) {
		
		townName = name;
		
		adjTowns.clear();
	}
	
	public Town getAdjacentTown(int index) {
		
		return adjTowns.get(index);
	}
	
	public String getAdjacentTowns() {
		
		String[] adjTown = new String[adjTowns.size()];
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < adjTowns.size(); i++) {
			
			adjTown[i] = adjTowns.get(i).getTownName();
			
			sb.append(adjTown[i]);
			
			sb.append(", ");
		}
		
		return sb.toString();
	}
	
	public void setAdjacentTowns(Town name) {
		
		adjTowns.add(name);
	}
	
	@Override
	public String toString() {
		
		return "Town name: " + townName + ", \nAdjacent Towns: "
				+ getAdjacentTowns();
	}

	@Override
	public int compareTo(Town o) {
		
		return this.getTownName().compareTo(o.getTownName());
	}
	
	
}
