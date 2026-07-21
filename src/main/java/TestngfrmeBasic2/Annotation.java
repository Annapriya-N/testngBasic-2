package TestngfrmeBasic2;

import org.testng.annotations.Test;

public class Annotation {
	
	@Test
	public void Carclass()
	{
		System.out.println("Car");
	}
	
	@Test(dependsOnMethods = {"PlaneClass"}, alwaysRun=true )
	public void Bikeclass()
	{
		System.out.println("Bike");
	}
	
	@Test(enabled=true)
	public void PlaneClass()
	{
		System.out.println("Plane");
	}
	
	@Test
	public void Walk()
	{
		System.out.println("Walk");
	}
	
	@Test(dependsOnMethods = {"PlaneClass"}, alwaysRun =true )
	public void Cycle()
	{
		System.out.println("Cycle");
	}

}
