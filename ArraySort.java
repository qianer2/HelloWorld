/**
*@program:ArraySort
*@Description:Sorts the specified array into ascending numerical order.
*@author:zhuojiaqian
*@date:2019.9.25
*/
import java.util.Arrays;
public class ArraySort{
    public static void main(String[] args){
         int[] a = {8,7,9,67,38,3,329,20,5};        
         Arrays.sort(a);
         for(int i = 0;i<a.length;i++){
			 System.out.print(a[i]+"");
		 }
      }
}
