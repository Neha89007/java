
public  class RoofTopPoolCafeMain extends CafeSunlight{

	public static void main(String[] args) 
	{	
		
		ChooseCafe();
	}
	private static void ChooseCafe()
	{	
		RoofTopPoolCafeMain c1=new RoofTopPoolCafeManaging().getRoofTopPoolCafe();
		if( c1!=null)
		{
			c1.welcomeDrink();
			c1.starter();
			((SwimmingPool) c1).Relax();
			((RoofTop) c1).ambiance();
			c1.soup();
			c1.rice();
			c1.noodles();
			((MughalResturant) c1).chickenTandoori();
			((MughalResturant) c1).chickenChilli();
		}
		
	}
	

}
