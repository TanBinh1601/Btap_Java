package moveablePoint;

public class moveablePoint extends point {
    private float xSpeed;
    private float ySpeed;

    public moveablePoint(){}

    public moveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public moveablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] arr = {xSpeed, ySpeed};
        return arr;
    }

    public moveablePoint move(){
        super.setXY(super.getX() + xSpeed, super.getY() +ySpeed);
        return this;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + ", "+ super.getY() + "), " +
                "moveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
