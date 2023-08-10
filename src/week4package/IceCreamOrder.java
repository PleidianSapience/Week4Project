package week4package;
import java.util.List;
import java.util.ArrayList;


public class IceCreamOrder {

	String user;
	String size;
	String cupOrCone;
	
	List<String> flavors = new ArrayList<String>();
	
	//Default
	public IceCreamOrder() { 
	this.user = "";
	this.flavors.add(null);
	this.size = "";
	this.cupOrCone = "";
	}
	public void describe() {
		int num = 0;
		int boxSize  = 40;
		char star = '*';
		
		for (int i = 0; i < boxSize; i++) {
			System.out.print(star);
		}
		
		System.out.println("\nIce Cream Order:\n----------------");
		System.out.print("Name:\n\t" + this.user + "\nOrder: \n\t");
		System.out.println(this.size + " " + this.cupOrCone);
		
		if (this.flavors.size() > 1) {
			System.out.print("Flavors:\n\t");
			} 
		else {
			System.out.print("Flavor:\n\t");
			}
		
		if (this.flavors.isEmpty()) {
			System.out.println("No Ice Cream Flavors Were Chosen");
		} else {
			for (String flavor : this.flavors) {
				System.out.print(flavor);
				num++;
				if (num == flavors.size()-1) {
				System.out.print (" & \n\t");
				} else if (num < flavors.size()-1) {
				System.out.print (", \n\t");
				}
			}
		}
		System.out.println();
		for (int i = 0; i < boxSize; i++) {
		System.out.print(star);
		}
		
	}
	public IceCreamOrder(String user, List<String> flavors) {
		this.user = user;
		this.flavors = flavors;
		}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getCupOrCone() {
		return cupOrCone;
	}

	public void setCupOrCone(String cupOrCone) {
		this.cupOrCone = cupOrCone;
	}

	public List<String> getFlavors() {
		return flavors;
	}

	public void setFlavors(List<String> flavors) {
		this.flavors = flavors;
	}

	public IceCreamOrder(String user, String size, String cupOrCone, List<String> flavors) {
		super();
		this.user = user;
		this.size = size;
		this.cupOrCone = cupOrCone;
		this.flavors = flavors;
	}
	
	
}
