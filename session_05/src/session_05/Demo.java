package session_05;
public class Demo {
	public static void main(String[] args) {	
		int[][] arr = new int[2][3];
		int sum = 0;
		//arr[0][0] = 1;
		//arr[1][2] = 10;
		
		/*for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<arr.length;i++)
		{
			sum = 0;
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j] = i+j+1;
				sum +=arr[i][j];
				
			}
			System.out.println("sum ="+ sum);
		}
		
		
		for(int[] i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}	
	}
}
