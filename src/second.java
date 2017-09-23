import java.util.Scanner;


public class second {
	 public static void main(String args[])
	    { 
		 Scanner scan=new Scanner(System.in);
	      final int SIZE=scan.nextInt();
	      int mat[][]=new int[SIZE][SIZE];
	      int i,j,k=0,n,m;
	      n=SIZE;
	      m=(n+1)/2;
	      for(i=0;i<m;i++)
	      {
	         for(j=i;j<=n-i-1;j++)   //顶边，从左到右，行不变列变
	             mat[i][j]=++k;      
	         for(j=i+1;j<=n-i-1;j++)  //右边，从上到下，行变列不变
	             mat[j][n-i-1]=++k;   
	         for(j=n-i-2;j>=i;j--)    //底边，从右到左，行不变列变
	             mat[n-i-1][j]=++k;     
	         for(j=n-i-2;j>=i+1;j--)  //左边，从下到上，行变列不变
	             mat[j][i]=++k;       
	      }
	      for(i=0;i<n;i++)         //输出二维数组
	      {
	          for(j=0;j<n;j++)
	             System.out.print(mat[i][j]+" ");
	          System.out.println();
	      }
	  }
}
