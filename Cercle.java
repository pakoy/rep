
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
	public String toString() {
		
		return "El cercle te un atribut x:"+ x +"i un atribut y :"+ y ;
	}
	
	public boolean equals (Cercle c ) {
		
		return x==(c.getX() );
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
