package x;

public interface ChangePosition {
    public static final class Movement {
  private int x = 0;
  
  public Movement(int x){
   this.x = x;
  }
  public int getx(){
   return x;
  }
  void inc(){
   x++;
  }
  void dec(){
   x--;
  }
  
 }
    public Direction getDirection();
public Movement getX();
 public Movement getY();
 @Override
 public String toString();
 
    public enum Direction {

  NORTH {
   @Override
   public Direction right() {
    return EAST;
   }
   @Override
   public Direction left() {
    return WEST;
   }
  },
  SOUTH {
   @Override
   public Direction right() {
    return WEST;
   }
   @Override
   public Direction left() {
    return EAST;
   }
  },

  EAST {
   @Override
   public Direction right() {
    return SOUTH;
   }
   @Override
   public Direction left() {
    return NORTH;
   }
  },
  

  WEST {
   @Override
   public Direction right() {
    return NORTH;
   }
   @Override
   public Direction left() {
    return SOUTH;
   }
  };

  public abstract Direction right();
  public abstract Direction left();
 }
  
}