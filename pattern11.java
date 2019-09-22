package pattern;

public class pattern11 {
	public static void main(String[] args) {
		int n=5;
		n=n/2+1;
		int row=1;
		int k=1;
		while(k<=2*n-1) {
			int s=1;
			while(s<=n-row) {
				System.out.print("   ");
				s+=1;
			}
			int col=1;
			while(col<=2*row-1) {
				System.out.print(" * ");
				col+=1;
			}
			if(k<n) {
				row+=1;
			}
			else {
				row-=1;
			}
			System.out.println();
			k+=1;
		}
	}

}
