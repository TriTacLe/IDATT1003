
public class loopThroughArrays {
    public static void main(String[] args) {
      
      int[][] nedborSep = new int[3][5];
      int[][] anotherMatrix = new int[3][5];
      
      int count = 0;
      
      //nedborSep = anotherMatrix; //?
      
      for (int indexX = 0; indexX < 3; indexX++){
        for (int indexY = 0; indexY < 5; indexY++){
          anotherMatrix[indexX][indexY] = nedborSep[indexX][indexY];         
          count++;
        }
      }
      
      for (int indexX = 0; indexX < 3; indexX++){
        for (int indexY = 0; indexY < 5; indexY++){
          anotherMatrix[indexX][indexY] = count++;
          System.out.println(anotherMatrix[indexX][indexY]);  
        }
      }
    
      System.out.println(nedborSep[0][2]);
    }
}