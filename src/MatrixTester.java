import java.util.Scanner;

class MatrixTester
{

// -------------------------------------
public static void main(String[] args)
{
SquareMatrix matrix = new SquareMatrix(NodePairList.getHighNode() + 1);


matrix.randomInitialize();
matrix.display();
System.out.println();

matrix.initialize();
matrix.display();
System.out.println();

buildNetwork(matrix);
matrix.display();
System.out.println();

testLinkRemoval(matrix);

} // End main


// ------------------------------------------------
private static void buildNetwork(SquareMatrix matrix)
{
int size = NodePairList.size();
Pair pair;

for (int i = 0; i < size; i++)
   {
   pair = NodePairList.getPair(i); 
   matrix.insertLink(pair.getX(), pair.getY());  
   } // End for

} // End buildNetwork


// ----------------------------------
private static void testLinkRemoval(SquareMatrix matrix)
{
Scanner keyboard = new Scanner(System.in);
int nodeX;
int nodeY;
String phrase;

System.out.println();
System.out.println("*** TEST LINK REMOVAL ***");


do
   {
   System.out.println();   
   System.out.print("Enter node X: ");
   phrase = keyboard.nextLine();
   nodeX = Integer.parseInt(phrase); 
   System.out.print("Enter node Y: ");
   phrase = keyboard.nextLine();
   nodeY = Integer.parseInt(phrase); 

   if (!matrix.linkExists(nodeX, nodeY))
      {
      System.out.println();
      System.out.println("That link does not exist");
      }
   else
      {
      System.out.println();
      System.out.println("Attempting to remove the link between " + nodeX + " and " + nodeY);
      System.out.println();
      matrix.removeLink(nodeX, nodeY);

      if (matrix.linkExists(nodeX, nodeY))
         System.out.println("!!Problem: The link still exists!!");
      else
         System.out.println("The action was successful.  The link no longer exists");
      } // End else

   System.out.println();
   System.out.print("Remove another link (Y/N)? ");
   phrase = keyboard.nextLine();
   }
while (phrase.charAt(0) == 'Y');
   
} // End testLinkRemoval


} // End class


