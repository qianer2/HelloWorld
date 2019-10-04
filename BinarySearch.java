/**
*@program:BinarySearch
*@Description:Searches a range of the specified array of ints for the specified value using the binary search algorithm. 
*@author:zhuojiaqian
*@date:2019.9.25
*/
import java.util.*;
public class ArrayBinarySearch{
	public static void main(String[] args){
		int a[] = {3,15,40,67,70,83},i;
		i = Arrays.binarySearch(a,67);
		System.out.println(i);
	}
}
