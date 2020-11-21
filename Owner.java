public class Owner {

    public int ownerId;
    public int vpn;
    public String modelp;
    public String make;
    public String color;
    public String location;
    public String time;
    public int mileage;
	private Job cJob; 
	
	public Owner (int ownerID, int vpn, String modelp,String make,String color, String location,String time,int mileage, Job cJob)
	{
		ownerId =ownerId;
		vpn=vpn;
		modelp=modelp;
		make=make;
		color=color;
		location=location;
		time=time;
		mileage=mileage;
		cJob= new Job();
		
	}


    //Setter Methods
    public void setOwnerId(int ownerID ) {
      ownerID= ownerID ;
    }

    public void setVpn(int vpn) {
      vpn=vpn;
    }

    public void setModelp(String modelp) {
        modelp = modelp;
    }

    public void setMake(String make) {
        make = make;
    }

    public void setColor(String color) {
        color = color;
    }

    public void setLocation(String location) {
        location = location;
    }

    public void setTime(String time) {
        time = time;
    }

    public void setMileage(int mileage) {
        mileage = mileage;
    }

    //Getter Methods
    public int getOwnerId() {
        return ownerId;
    }

    public int getVpn() {
        return vpn;
    }

    public String getModelp() {
        return modelp;
    }

    public String getMake() {
        return make;
    }

    public String getColor() {
        return color;
    }
    
    public String getLocation() {
        return location;
    }

    public String getTime() {
        return time;
    }

    public int getMileage() {
        return mileage;
    }

  
    
    public void setJobc(Job cJob)
	{
		this.cJob = cJob;
	}
	
	public Job getJobc()
	{
		return this.cJob;
	}
}
    
    


    