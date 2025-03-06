class NodePairList
{
private final static int NUMBER_OF_PAIRS = 68;
private final static int HIGH_NODE = 22;
private final static int[][] list = 
   {
     {1, 4}, {1,8}, {1, 21},
     {2, 4}, {2, 11}, {2, 12}, {2, 18},
     {3, 19}, {3, 20},
     {4, 11}, {4, 2}, {4, 1}, {4, 13}, {4, 14},
     {5, 19}, {5, 15}, {5, 8}, {5, 12},
     {6, 19},
     {7, 21}, {7,18},
     {8, 12}, {8, 5}, {8, 16}, {8, 1},
     {9, 13}, {9, 16}, {9, 18},
     {10, 22}, {10, 19}, {22, 17},  
     {11, 12}, {11, 2}, {11, 4},
     {12, 8}, {12, 2}, {12, 11}, {12, 5},
     {13, 4}, {13, 11}, {13, 9},
     {14, 4}, {14, 21},
     {15, 18}, {15, 16}, {15, 5}, 
     {16, 18}, {16, 9}, {16, 8}, {16, 15},
     {17, 19}, {17, 10},
     {18, 7}, {18, 9}, {18, 16}, {18, 15},
     {19, 6}, {19, 20}, {19, 3}, {19, 17}, {19, 10}, {19, 5},
     {20, 3}, {20, 19},
     {21, 1}, {21, 7}, {21, 14},
     {22, 10}     
   }; // End of pair list


// No object should be instantiated of this type
private NodePairList()
{
// No code should be here

} // End constructor


// ---------------------------------
public static int size()
{
return NUMBER_OF_PAIRS;
} // End size


// ---------------------------------
public static int getHighNode()
{
return HIGH_NODE;
} // End size


// ------------------------------
public static Pair getPair(int index)
{
return new Pair(list[index][0], list[index][1]);
} // End getPair


} // End class
