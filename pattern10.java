package pattern;

public class pattern10 {
	public static void main(String[] args) {
		int n=4;
		int row=1;
		int f=0;
		int s=1;
		int r=0;
		while(r<n) {
			
			while(row<=n) {
				int col=1;
				while(col<=row) {
					System.out.print(f+" ");
					int t=f+s;
					f=s;
					s=t;
					r+=1;
					col+=1;
			}
				System.out.println();
				row+=1;
			}

			
			
		}
	}

}
