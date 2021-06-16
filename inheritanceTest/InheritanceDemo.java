package inheritanceTest;

public class InheritanceDemo {
	public static void main (String[]args) {
		Car Toyota = new Car (4,5,false);
		System.out.println(
				"Number of Doors on Toyota's Car: " + 
				Toyota.getNumDoors());
		System.out.println(
				"Number of Whells on Toyota's Car: "+
				Toyota.getWheels());
		String electric;
		electric = Toyota.getIsElectric()? "yes": "no";
		System.out.println(
				"Is the Toyota's Car electric? " + electric);
				
		Motorbike Honda = new Motorbike (2,false);
		System.out.println(
				"Number of Whells on Honda Motobike: " + 
				Honda.getroda());		
		String beratap;
		beratap = Honda.getberatap()? "memiliki": "tidak";
		System.out.println(
				"Apakah motor beratap? " + beratap);
	}
}
