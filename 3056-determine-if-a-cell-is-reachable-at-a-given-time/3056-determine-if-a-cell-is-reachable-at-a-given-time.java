public class Solution {
    public boolean isReachableAtTime(int startX, int startY, int targetX, int targetY, int time) {
        // Check if the starting point is the same as the target point.
        if (startX == targetX && startY == targetY) {
            
            if (time == 1) {
                return false;
            }
        }

        int xDifference = startX - targetX;
        int yDifference = startY - targetY;
        
        // Ensure that xDifference and yDifference are non-negative.
        if (xDifference < 0) {
            xDifference = -xDifference;
        }
        if (yDifference < 0) {
            yDifference = -yDifference;
        }
        
     
        int maxDifference = Math.max(xDifference, yDifference);
        
    
        if (maxDifference <= time) {
            return true; 
        }
       
        return false;
    }
}