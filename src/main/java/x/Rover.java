package x;
import x.ChangePosition.Movement;
import x.ChangePosition.Direction;

public class Rover {
 private Position position = null;
 
 public enum Command {
  F, B, R, L;
  private void process(Position position) {
   switch (this) {
    case R:
     position.DirectionRight();
     break;
    case L:
     position.DirectionLeft();
     break;
    case F:
     switch (position.getDirection()) {
      case NORTH:
       position.getY().inc();
       break;
      case EAST:
       position.getX().inc();
       break;
      case SOUTH:
       position.getY().dec();
       break;
      case WEST:
       position.getX().dec();
     }
     break;
     case B:
     switch (position.getDirection()) {
      case NORTH:
       position.getY().dec();
       break;
      case EAST:
       position.getX().dec();
       break;
      case SOUTH:
       position.getY().inc();
       break;
      case WEST:
       position.getX().inc();
     }
     break;
   }
  }
 };
 
 public Rover(Movement x, Movement y, Direction direction) {
  this.position = new Position(x, y, direction);
 }
 
 public void processCommands(Command[] commands , ObstaclePoint [] obstacles ) {
  for (int i = 0; i < commands.length; i++){
   commands[i].process(position);
  }
  
  for(int i=0;i<obstacles.length;i++){
     if((position.getX().getx()==obstacles[i].Xpoint) && (position.getY().getx()==obstacles[i].Ypoint)){
         position.Stopped="STOPPED";
         break;
     }
  }
  
 }
 
 public ChangePosition getPosition() {
  return position;
 }
}
