/**
*@program:BinarySearch
*@Description:Searches a range of the specified array of ints for the specified value using the binary search algorithm. 
*@author:zhuojiaqian
*@date:2019.9.25
*/
public class BinarySearch{
    public static void main (String[] args)
    {
        int y[] = new int[] {1, 3, 4, 6, 8, 9};
        int x1 = Arrays.binarySearch(y, 1, 4, 5);
        int x2 = Arrays.binarySearch(y, 1, 4, 4);
        int x3 = Arrays.binarySearch(y, 1, 4, 2);
        int x4 = Arrays.binarySearch(y, 1, 3, 10);
        System.out.println("x1:" + x1 + ", x2:" + x2);
        System.out.println("x3:" + x3 + ", x4:" + x4);
    }
}