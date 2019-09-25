/**
*@program:ArraySort
*@Description:Sorts the specified array into ascending numerical order.
*@author:zhuojiaqian
*@date:2019.9.25
*/
public class ArraySort{
    public static void main(String[] args){
         int[] a = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};        
         Arrays.sort(a);
         for(int arr:a){
			 System.out.print(arr + " ");
		 }
      }
}