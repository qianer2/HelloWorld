/**
*@program:ArrayCopy
*@Description:Copies an array from the specified source array.
*@author:zhuojiaqian
*@date:2019.9.25
*/
public class ArrayCopy{
	public static void main(String[] args){
		char a1[] = {'b','b','b'}; 
        char a2[] = {'a','a','a'}; 
        char a3[] = new char[a1.length+a2.length]; 
			System.arraycopy(a1,0,a3,0,a1.length); 
            System.arraycopy(a2,0,a3,a1.length,a2.length); 
            System.out.print(a3);
	}
}