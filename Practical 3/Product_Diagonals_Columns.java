import java.util.Scanner;
class Product_Diagonals_Columns{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows & columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int a[][]=new int[r][c];
		System.out.print("Enter elements: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j]=sc.nextInt();
			}
		}

		int DP=1;
		for(int i=0; i<r; i++){
			DP=DP*a[i][i];
		}
		
		System.out.print("Product of diagonal: "+ DP);
		System.out.println();
		
		for(int j=0; j<c; j++){
			int CP=1;
			for(int i=0; i<r; i++){
				CP=CP*a[i][j];
			}
		System.out.println("Product of column "+(j+1)+": " + CP);
		}
	}
}