package inheritanceTest;

public class Bike extends Vehicle {
	private String bikeType;
	
	public Bike (int numWheels, String bikeType) {
		super(numWheels);
		this.bikeType = bikeType;
	}
	public String getBikeType() {
		return bikeType;
	}
}
class Motorbike{
	private int roda;
	private boolean beratap;
	
	public Motorbike (int roda, boolean beratap) {
		super();
		this.beratap=beratap;
	}
	
	public int getroda() {
		return roda;
	}
	
	public boolean getberatap() {
		return beratap;
	}
}