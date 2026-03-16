package leetcode;

public class adddigit {

	public static void main(String[] args) {
		int n=199;
		int temp=n,sum=0;
		while(n>9) {
			sum=0;
		while(n>0 ) {
			int p=n%10;
			sum=sum+p;
			n/=10;	
		}
		n=sum;
		
		}
		System.out.print(sum);
		
		
		
	}

}
