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
	         for(j=i;j<=n-i-1;j++)   //���ߣ������ң��в����б�
	             mat[i][j]=++k;      
	         for(j=i+1;j<=n-i-1;j++)  //�ұߣ����ϵ��£��б��в���
	             mat[j][n-i-1]=++k;   
	         for(j=n-i-2;j>=i;j--)    //�ױߣ����ҵ����в����б�
	             mat[n-i-1][j]=++k;     
	         for(j=n-i-2;j>=i+1;j--)  //��ߣ����µ��ϣ��б��в���
	             mat[j][i]=++k;       
	      }
	      for(i=0;i<n;i++)         //�����ά����
	      {
	          for(j=0;j<n;j++)
	             System.out.print(mat[i][j]+" ");
	          System.out.println();
	      }
	  }
}
