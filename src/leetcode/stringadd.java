package leetcode;
import java.math.*;

public class stringadd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String num1="11",num2="123";
			int a=Integer.parseInt(num1);
			int b=Integer.parseInt(num2);
			int sum=a+b;
//			System.out.print(b);
			String ans=String.valueOf(sum);
			System.out.print(ans);
			BigInteger t=new BigInteger(num1);
            BigInteger o=new BigInteger(num2);
			 BigInteger anse=t.add(o);
            String answer=anse.toString();
           System.out.print(answer);
	}

}
