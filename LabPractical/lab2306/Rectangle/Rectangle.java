package rectangle;

public class Rectangle 
{
	private int l;				// l as length
	private int b;				// b as breadth
	
	
	public int getLen() {
		return l;
	}
	public void setLen(int l) {

		if(l<10 || l>50)
		{
			
			throw new IllegalArgumentException("lenght is out of range");
		}
		
		this.l=l;
	}
	
	
	
	public int getBre() {
		return b;
	}
	public void setBre(int b) {
		
		if(b< 5|| b> 20)
		{
		
			throw new IllegalArgumentException("breadth is out of range");
		}
		
		this.b = b;
	}
	
	
	
	public Rectangle(int l, int b) {
		setLen( l);
		setBre( b);
		
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [Length= " + getLen() + ", Breadth= " + getBre() + "]" + "[AREA = " + getLen()*getBre() +"]";
		
	}
}
