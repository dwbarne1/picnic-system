public class Apple 
{

	private int peelThickness;
	private double percentLeft;
	private double radius;
	
	public Apple()
	{
		this.percentLeft = 100.0;
	} // end Apple constructor
	
	public Apple(double radius)
	{
		this.percentLeft = 100.0;
		this.radius = radius;
	} // end Apple constructor
	
	public int getPeelThickness()
	{
		return this.peelThickness;
	} // end getPeelThickness method
	
	public void setPeelThickness(int peelThickness)
	{
		this.peelThickness = peelThickness;
	} // end setPeelThickness method
	
	public double getPercentLeft()
	{
		return this.percentLeft;
	} // end getPercentLeft method
	
	public double getRadius()
	{
		return this.radius;
	} // end getRadius method
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	} // end setRadius method
	
	public void eat(double eatenAmount)
	{
		this.percentLeft -= eatenAmount;
	} // end eat method
	
} // end class