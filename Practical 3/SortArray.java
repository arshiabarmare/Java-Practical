import java.util.Scanner;
class SortArray{
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
		
		System.out.println("Given Matrix: "); 
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				for(int x=0; x<r; x++){
					for(int y=0; y<c; y++){
						if(a[i][j]<a[x][y]){
							int temp=a[i][j];
							a[i][j]=a[x][y];
							a[x][y]=temp;
						}
					}
				}
			}
		}
		System.out.println("Sorted Matrix: "); 
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		} 
	}
}