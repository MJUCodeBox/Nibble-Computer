package force;

public class SimpleMoveForce {
	
	// Attribute
    private double mass = 1; // �̵� ���� : ���� �� �� ������ ŭ.
	private double friction = 0.96; // ���� ���� : 1�� ����� ���� �������� ����.
    
    // Component
    private ForceVector force, velocity, acceleration;
    
    // Constructor
    public SimpleMoveForce() {
    	this.force = new ForceVector();
    	this.velocity = new ForceVector();
    	this.acceleration = new ForceVector();
    }
    
	public double[] getMoveXY() {
		// Move
		this.velocity.add(this.acceleration);
		this.force.scale(1 / this.mass);
		this.acceleration.set(this.force);
		double[] result = {this.velocity.getX(), this.velocity.getY()}; 
		
		// Resist
		this.velocity.scale(this.friction);
		this.force.set(0, 0);
		return result;
	}
	
	// Getter & Setter
	public void setVelocity(double x, double y) {this.velocity.set(x, y);}
	public void reset() {this.force.set(0,0); this.velocity.set(0,0); this.acceleration.set(0,0);}
}
