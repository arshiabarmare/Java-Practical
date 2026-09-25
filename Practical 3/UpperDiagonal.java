import java.util.Scanner;
class UpperDiagonal{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows and columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int a[][]=new int[r][c];
		System.out.print("Enter element:");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Upper Diagonal: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				if(i<j){
					System.out.print(a[i][j]+" ");
				}
				else{
					System.out.print("  ");
				}
			}
		System.out.println();
		}

	}
}