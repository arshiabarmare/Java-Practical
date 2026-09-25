import java.util.Scanner;
class sumby4{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows and columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();
		
		int a[][]=new int[r][c];	
		System.out.print("Enter elements: ");
		int sum=0;
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j]=sc.nextInt();
				if(a[i][j]%10==4){
					sum=sum+a[i][j];
				}
			}
		}
		
		System.out.println("Given Matrix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
			
		System.out.print("Sum of Elements ending with 4: "+ sum);
	}
}