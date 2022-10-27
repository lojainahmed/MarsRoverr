package x;
import java.util.*;
import x.ChangePosition;
import x.Rover;
import x.ChangePosition.Direction;
import x.Rover.Command;
public class main {   
    public static void main(String[] args) {  
           System.out.println("\nTest Case 1:");
    // obstacles:
   ObstaclePoint[] obstacles={new ObstaclePoint(1, 4),new ObstaclePoint(3, 5),
   new ObstaclePoint(7, 4)};
   
  Rover rover1 = new Rover(new ChangePosition.Movement(4),
   new ChangePosition.Movement(2), Direction.EAST); //FLFFFRFLB
  rover1.processCommands(new Command[] { Command.F, Command.L,
   Command.F, Command.F, Command.F, Command.R,
   Command.F, Command.L, Command.B },obstacles);
  System.out.println(rover1.getPosition()); 
  
        System.out.println("\nTest Case 2 The Rover Should Stop:");
        ObstaclePoint[] obstacles2={new ObstaclePoint(1, 4),new ObstaclePoint(3, 5),
   new ObstaclePoint(6, 4)};
   
  Rover rover2 = new Rover(new ChangePosition.Movement(4),
   new ChangePosition.Movement(2), Direction.EAST); //FLFFFRFLB
  rover2.processCommands(new Command[] { Command.F, Command.L,
   Command.F, Command.F, Command.F, Command.R,
   Command.F, Command.L, Command.B },obstacles2);
  System.out.println(rover2.getPosition()); 
        
}
}


   


