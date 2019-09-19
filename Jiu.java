/**
*@program:Jiu
*@Description:Output ninety-nine multiplication tables through Java
*@author:zhuojiaqian
*@date:2019.9.19
*/

public class Jiu {
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+(i*j)+"  ");
			}
			System.out.println();
		}
	}
}
