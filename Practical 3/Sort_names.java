import java.util.Scanner;
class Sort_names{
	public static void main(String cp[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size: ");
		int n=sc.nextInt();

		String a[]=new String[n];
		System.out.print("Enter names: ");
		for(int i=0; i<n; i++){
			a[i]=sc.next();
		}
		for(int i=0; i<n-1; i++){
			for(int j=i+1; j<n; j++){
				if(a[i].compareTo(a[j])>0){
					String temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Names: ");
		for(int i=0; i<n; i++){	
			System.out.println(a[i]);
		}
	}
}

