public class Banana 
{

	private double length;
	private int peelThickness;
	private double percentLeft;
	
	public Banana()
	{
		this.percentLeft = 100.0;
	} // end Banana constructor
	
	public Banana(double length)
	{
		this.percentLeft = 100.0;
		this.length = length;
	} // end Banana constructor
	
	public double getLength()
	{
		return this.length;
	} // end getLength method
	
	public void setLength(double length)
	{
		this.length = length;
	} // end setLength method
	
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
	
	public void eat(double eatenAmount)
	{
		this.percentLeft -= eatenAmount;
	} // end eat method
	
} // end class