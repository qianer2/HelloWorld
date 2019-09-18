/**
*@program:Pyramid
*@Description:Enter the number of layers of the pyramid and print out the pyramid pattern
*@author:zhuojiaqian
*@date:2019.0.17
*/
//每一行*号数=该行行数*2-1
//每行空格数=总行数-该行行数
public class Pyramid{
	public static void main(String[] args){
		int i = 5;
		for (int j = 1; j <= i; j++){
			int times = (2 * j) - 1;
			int time = 0;
			while(time != (i - j))
			{
				System.out.printf(" ");
				time++;
			}
			while(times != 0){
				System.out.printf("*");
				times--;
			}
			System.out.printf("\n");
		}
	}
	
}