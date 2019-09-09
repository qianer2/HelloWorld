public class SayHelloTwo{
	public static void main(String[] args){
		System.out.println("Below is the function of sayhello");
		sayhello(sum());
		
	}
	public static void sayhello(int sum){
		System.out.println("say Hello!"+sum);
	}
	public static int sum(){
		return 1+3;
	}
}