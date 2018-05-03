
public class Cercle {
	
	private float x;
	private float y;
	Cercle(float xx, float yy)
	{
	x=xx;
	y=yy;
	}
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Cercle () {
		
		this.x = 2;
		this.y = 5;
	}
	
	// Constructora copiadora
	public Cercle (Cercle c) {
		this.x=c.getX();
		this.y=c.getY();
		
	}

	
}
