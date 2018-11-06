package projectiletest;

public class Variables {

    private double gravity;                    // g = 9.780 327 (1 + A sin2 L - B sin2 2L) - 3.086 × 10-6 H
    private double latitude;                   // 37.78896°N 
    private double longitude;                // -79.43911°E
    private double elevation;                // 316.4m
    private double gPoles = 9.832;      // meters per/second squared
    private double g45 = 9.806;           // meters per/second squared
    private double gEquator = 9.780;  // meters per/second squared
    private double distanceH;
    private double distanceV;
    private double angleShooter;
    private double objectDensity;
    private double objectVelocityO;
    private double objectVelocityF;
    private char windDirection;
    private double windVelocity;
    private double height;
    private double heightO;
    private double heightF;
    private double time;
    private double timeO;
    private double timeF;
    
    public void Variables () {
    }
    
    public void Variables (double latitude, double longitude, double distanceH, char windDirection, double windVelocity) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.distanceH = distanceH;
        this.windDirection = windDirection;
        this.windVelocity = windVelocity;
    }
    
    public void setGravity (double latitude, double elevation) {
        double a = 0.0053024;
        double b = 0.0000058;
        //this.gravity = (g45 - (1/2) * (gPoles - gEquator) * Math.cos(2 * latitude * (Math.PI / 180)));
        this.gravity = 9.780327 * (1 + (a * Math.pow(Math.sin(latitude), 2)) - (b * Math.pow(Math.sin(2 * latitude), 2))) -  Math.pow(3.086, -6) * elevation;
    }
    ///Math.pow(Math.sin(a),2)
    
    public double getGravity () {
        return gravity;
    }
    
    public void setLatitude (double latitude) {
        this.latitude = latitude;
    }
    
    public double getLatitude () {
        return latitude;
    }
    
    public void setLongitude (double longitude) {
        this.longitude = longitude;
    }
    
    public double getLongitude  () {
        return longitude;
    }
    
    public void setDistanceH (double distanceH) {
        this.distanceH = objectVelocityO * timeF;
    }
    
    public double getDistanceH () {
        return distanceH;
    }
    
    public void setDistanceV (double distanceV) {
        this.distanceV = distanceV;
    }
    
    public double getDistanceV () {
        return distanceV;
    }
    
    public void setAngleShooter (double angleShooter) {
        this.angleShooter = angleShooter;
    }
    
    public double getAngleShooter () {
        return angleShooter;
    }
    
    public void setObjectDensity (double objectDensity) {
        this.objectDensity = objectDensity;
    }
    
    public double getObjectDensity () {
        return objectDensity;
    }
    
    public void setWindDirection (char windDirection) {
        this.windDirection = windDirection;
    }
    
    public double getWindDirection() {
        return windDirection;
    }  
    
    public void setWindSpeed (double windVelocity) {
        this.windVelocity = windVelocity;
    }
    
    public double getWindVelocity () {
        return windVelocity;
    }  
    
    public void setHeight (double heightO, double heightF) {
        this.height = heightF - heightO;
    }
    
    public double getHeight () {
        return height;
    }
    
    public void setTimeO (double timeO) {
        this.timeO = timeO;
    }
    
    public void setTimeF (double timeF) {
        this.timeF = timeF;
    }
  

//find the angle to hit an object
//find the time to hit an object at a set angle and valocity

}