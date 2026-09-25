import java.util.Scanner;
class Transpose{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of rows and columns: ");
		int r=sc.nextInt();
		int c=sc.nextInt();

		int [][]a=new int[r][c];
		System.out.print("Enter elements: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Given Array: ");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		System.out.println("Tranpose Array: ");
		for(int i=0; i<c; i++){
			for(int j=0; j<r; j++){
				System.out.print(a[j][i] +" ");
			}
			System.out.println();
		}
		

	} 
}