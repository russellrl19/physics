package projectiletest;

public class SetWeapon extends Variables{
    
    private double projectileMass;      //40.34 g
    private double projectileVelocity;  //887 mps
    
    public void setShooter () {
        
    }
    
    public void setTarget () {
        
    }
    
    public void setProjectile (double projectileMass, double projectileVelocity) {
        this.projectileMass = projectileMass;
        this.projectileVelocity = projectileVelocity;
    }
    
    public double getProjectile () {
//        this.projectileMass = projectileMass;
//        this.projectileVelocity = projectileVelocity;
        return 6.6;
    }
    
    public double setShooterAngle () {
        double angle = getDistanceH() + getGravity();
        return angle;
    }
    
    public static void main (String [] args) {
        Variables variables = new Variables();
        variables.Variables(37.78896, -79.43911, 100, 'E', 3.12928);
        variables.setGravity(37.78896, 316.4);
        System.out.println(variables.getGravity());
    }
            
}
