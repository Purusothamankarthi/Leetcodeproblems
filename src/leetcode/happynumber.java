package leetcode;

 class one{
	public int cal(int n) {
		int tem=n;
        int mul=0;
        while(tem>0){
            int p=tem%10;
            int sq=p*p;
            mul=mul+sq;
            tem/=10;
            
        }
        tem=mul;
        return mul;
	}
}
public class happynumber {

	public static void main(String[] args) {
		int n=26;
		
		 int tem,mul;	
		 while(n!=1 && n!=4) {
			 tem=n;
			 mul=0;
		        while(tem>0){
		            int p=tem%10;
		            int sq=p*p;
		            mul=mul+sq;
		            tem/=10;
		            
		        }
		        n=mul;
		       
			 
//			 c1.cal(n);
		 }
		 if(n==1) System.out.print("True");
		 else System.out.print(false);
	}

}
