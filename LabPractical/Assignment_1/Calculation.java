//Questio No.1

public class Calculation 
{
	double pi=3.14;
	void Areacircle(float r)
	{
		double Cir=pi*r*r;
		System.out.println("area of a circle is:" +Cir );		
	}
	
	void AreaRectangle(int l,int b)
	{
		double Rec=l*b;
		System.out.println("area of a rectangle is:" +Rec );
	}
	
	void AreaBox(int a,int b,int c)
	{
		double Box=2*(a*b + b*c + a*c);
		System.out.println("area of a box is:" +Box );
	}

	public static void main(String[] args) 
	{
		Calculation C=new Calculation();
		Calculation R=new Calculation();
		Calculation B=new Calculation();
		
		C.Areacircle(5);
		R.AreaRectangle(4,3);
		B.AreaBox(5,6,7);	
	}

}

*/
OUTPUT:-
area of a circle is:78.5
area of a rectangle is:12.0
area of a box is:214.0
*/