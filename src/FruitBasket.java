import java.util.Scanner;
public class FruitBasket 
{

	private Scanner scan = new Scanner(System.in);
	private Apple apple;
	private Banana banana;
	private String basketName;
	
	public String getBasketName()
	{
		return this.basketName;
	} // end getBasketName method
	
	public void setBasketName(String basketName)
	{
		this.basketName = basketName;
	} // end setBasketName method
	
	public void makeFruits()
	{
		this.apple = new Apple(1.5);
		this.banana = new Banana(3.5);
		
		apple.setPeelThickness(1);
		banana.setPeelThickness(4);
	} // end makeFruits method
	
	public void eatFruits()
	{
		double amountToEat;
		System.out.printf("\t\t***%s***\n", this.basketName.toUpperCase());
		System.out.printf("You have an apple and a banana in your %s basket.\n", this.basketName);
		
		System.out.print("What percent of the apple would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		apple.eat(amountToEat);
		
		System.out.print("What percent of the banana would you like to eat? ");
		amountToEat = Double.parseDouble(scan.nextLine());
		banana.eat(amountToEat);
		
		System.out.printf("\nYou have %.2f of your apple and %.2f of your banana left in your %s basket.\n\n", apple.getPercentLeft(), banana.getPercentLeft(), getBasketName());
	} // end eatFruits method
	
} // end class