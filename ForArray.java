/**
*@program:ForArray
*@Description:It's easy to traverse arrays through for loop syntax.
*@author:zhuojiaqian
*@date:2019.9.25
*/
public class ForArray{
	public static void main(String[] args){
		int[] array = new int[(int)(Math.random()*10)+1];
		for(int i = 0;i<array.length; ++i)
			array[i] = (int)(Math.random()*100);
		for(int value:array)
			System.out.println(value);
	}
}