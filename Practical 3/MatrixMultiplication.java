import java.util.Scanner;
class MatrixMultiplication{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows & columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int a[][]=new int[r][c];
		System.out.print("Enter elements of 1st Matrix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		int b[][]=new int[r][c];
		System.out.print("Enter elements of 2nd Matrix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				b[i][j]=sc.nextInt();
			}
		}

		int mul[][]=new int[r][c];
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				mul[i][j]=0;
				for(int k=0; k<c; k++){
					mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Multiplication Matix: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
	} 
}