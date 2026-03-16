package leetcode;

public class reversenumber {
	public static void main(String[] ags) {
		int x=-123;
		int len=String.valueOf(x).length();
		int num=0;
		if(x>0) {
		 for (int i=0;i<len;i++){
			int a=x%10;
			num=(num+a)*10;
			x/=10;
		}
		System.out.print(num/10);
		}
		else {
			for (int i=0;i<len-1;i++){
				int a=x%10;
				num=(num+a)*10;
				x/=10;
			}
			System.out.print(num/10);
		}
	}
}
