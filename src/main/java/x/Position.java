package x;

public class Position implements ChangePosition {
 
 private Movement x = null;
 private Movement y = null;
 String Stopped="";
 private Direction direction = null;
  
 public Position(Movement x, Movement y, Direction direction) {
  if ( x == null || y == null || direction == null ) {
   throw new IllegalArgumentException("Position can't be null");
  }
  this.x = x;
  this.y = y;
  this.direction = direction;
 }
  
  protected void DirectionLeft() {
  direction = direction.left();
 }
  
  protected void DirectionRight() {
  direction = direction.right();
 }
  
 @Override
 public Movement getX() {
  return x;
 }

 @Override
 public Movement getY() {
  return y;
 }

 @Override
 public Direction getDirection() {
  return direction;
 }

 @Override
 public String toString() {
  return "("+getX().getx() + " , " + getY().getx() +")"+ "  " + getDirection().name() +" "+ Stopped ;
 }
 
}