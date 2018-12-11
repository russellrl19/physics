package projectiletest;

public class SetWeapon extends Variables{
    
    private double projectileMass;      //40.34 g
    private double projectileVelocity = 887;  //887 mps
    private double angleShooter = 45;
    private double distance;
    
    public void setShooter () {
        
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
        double angle = getDistance() + getGravity();
        return angle;
    }
    
    public void setQuestionDistance () {
        this.distance = (Math.pow(projectileVelocity, 2) * Math.sin(2 * 45)) / 2 * getGravity();
    }
    
    public double getQuestionDistance () {
        return distance;
    }
    
    public static void main (String [] args) {
        Variables variables = new Variables();
        variables.Variables(37.78896, -79.43911, 316.4, 100, 45, 'E', 3.12928);
        // latitude, longitude, elevation, distance horizontal, angle of shooter, wind direction, wind speed
        
        variables.setGravity(37.78896, 316.4);
        
        System.out.println(variables.getGravity());
        System.out.println(variables.getDistance());
    }
            
}