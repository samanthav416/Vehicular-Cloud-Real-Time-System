public class Vehicle 
{
	private String licensePlate;
	private String make;
	private String model;
	private String color;


	public Vehicle ()
	{
	}

	public Vehicle(String licensePlate, String make, String model, String color)
	{
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.color = color;
	}
	public void setLicensePlate(String licensePlate) 
	{
		this.licensePlate = licensePlate;
	}
	
	public String getLicensePlate() 
	{
		return licensePlate;
	}
	public void setMake(String make)
	{
		this.make = make;
	}
	public String getMake()
	{
		return make;
	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getModel()
	{
		return model;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public String getColor()
	{
		return color;
	}
	
}
