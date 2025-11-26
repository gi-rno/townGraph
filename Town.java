import java.util.HashSet;
import java.util.Set;
/**@author Christopher Joya Lopez. This class represents Towns(vertices) for our graph.
 * Some towns will be linked through roads(edges), so this class also stores adjacent(next to)
 * towns. You can also compare towns by their corresponding names.
 */
public class Town implements Comparable<Town>{

	private String townName;
	
	private Set<Town> adjTowns;
	
	private int weight;
	
	private Town backPath;

	public Town(String name) {
		
		townName = name;
		
		adjTowns = new HashSet<>();
		
		weight = Integer.MAX_VALUE;
		
		backPath = null;
	}
	
	public Town(Town templateTown) {
		
		townName = templateTown.townName;
		
		adjTowns = new HashSet<>(templateTown.adjTowns);
		
		weight = templateTown.weight;
		
		backPath = templateTown.backPath;
	}
	
	public String getName() {
		
		return townName;
	}
	
	public void setTownName(String name) {
		
		townName = name;
		
		adjTowns.clear();
	}
	
	public int getWeight() {
		
		return weight;
	}
	
	public void setWeight(int weight) {
		
		this.weight = weight;
	}
	
	public void addAdjTown(Town adjacentTown) {
		
		adjTowns.add(adjacentTown);
	}
	
	public Set<Town> getAdjacentTowns() {
		
		return adjTowns;
	}
	
	public void setAdjacentTowns(Town name) {
		
		adjTowns.add(name);
	}
	
	public void setBackPath(Town bp) {
		
		backPath = bp;
	}
	
	public Town getBackPath() {
		
		return backPath;
	}
	
	@Override
	public String toString() {
		
		return townName;
	}

	@Override
	public int compareTo(Town o) {
		
		return this.getName().compareTo(o.getName());
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(!(obj instanceof Town)) {
			
			return false;
		}
		
		Town other = (Town) obj;
		
		return this.townName.equals(other.townName);
	}
	
	@Override
	public int hashCode() {
		
		return townName.hashCode();
	}
	
	public int getMinWtToSource(Town sourceVertex) {
		
		return weight;
	}
}
