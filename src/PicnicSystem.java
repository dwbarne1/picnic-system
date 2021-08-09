public class PicnicSystem 
{

	public static void main(String[] args) 
	{
		PicnicSystem myPicnicSystem = new PicnicSystem();
		myPicnicSystem.makeFruitBaskets();
	} // end main method

	public void makeFruitBaskets()
	{
		FruitBasket basket1 = new FruitBasket();
		FruitBasket basket2 = new FruitBasket();
		
		basket1.setBasketName("Weekend");
		basket2.setBasketName("Weekday");
		
		basket1.makeFruits();
		basket1.eatFruits();
		
		basket2.makeFruits();
		basket2.eatFruits();
	} // end makeFruitBaskets method
	
} // end class
