import java.util.Random;

class SquareMatrix
{
private boolean[][] matrix;
private int dimension;

// -------------------------------------
SquareMatrix(int dimension)
{
this.dimension = dimension;
matrix = new boolean[dimension][dimension];

} // End constructor


// ----------------------------------
public void display()
{
System.out.print("  |");
for (int i = 0; i < dimension; i++)
   {
   if (i < 10)
      System.out.print(" ");
   System.out.print(i + "|");
   } // End for i
System.out.println();
   
for (int i = 0; i < dimension; i++)
   {
   if (i < 10)
      System.out.print(" ");
   System.out.print(i + "|");
   for (int j = 0; j < dimension; j++)
      {
      if (matrix[i][j])
         System.out.print(" X");
      else
         System.out.print("  ");
      System.out.print("|");
      } // End j
   System.out.println();
   } // End i
} // End display


// **** MAKE NO CHANGES ABOVE THIS LINE ****


// --------------------------------
public void initialize()
{
   for (int i = 0; i < dimension; i++)
   {
      for (int j = 0; j < dimension; j++)
      {
         matrix[i][i] = false;
      }
   }


} // End initialize


// --------------------------------
public void randomInitialize()
{
   Random rand = new Random();
   for (int i = 0; i < dimension; i++)
   {
      for (int j = 0; j < dimension; j++)
      {
         matrix[i][j] = rand.nextBoolean();
      }
   }
} // End randomInitialize


// ------------------------------------
public void insertLink(int nodeA, int nodeB)
{
      if (isValidIndex(nodeA) && isValidIndex(nodeB))
      {
         matrix[nodeA][nodeB] = true;
      }
} // End insertLink


// ------------------------------------
public void removeLink(int nodeA, int nodeB)
{
   if (isValidIndex(nodeA) && isValidIndex(nodeB))
   {
      matrix[nodeA][nodeB] = false;
   }
} // End removeLink


// ------------------------------------
public boolean linkExists(int nodeA, int nodeB)
{
      if (isValidIndex(nodeA) && isValidIndex(nodeB))
      {
         return matrix[nodeA][nodeB];
      }

   return false;
} // End linkExists


} // End class
