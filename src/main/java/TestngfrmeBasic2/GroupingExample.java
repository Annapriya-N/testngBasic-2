package TestngfrmeBasic2;

import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups= {"smoke"})
	public void Carclass()
	{
		System.out.println("Car");
	}
	
	@Test
	public void Bikeclass()
	{
		System.out.println("Bike");
	}
	
	@Test(groups= {"smoke"})
	public void PlaneClass()
	{
		System.out.println("Plane");
	}
	
	@Test
	public void Walk()
	{
		System.out.println("Walk");
	}
	
	@Test(enabled=false)
	public void Cycle()
	{
		System.out.println("Cycle");
	}

}
