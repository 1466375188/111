package hadoop_study2;

import java.util.Scanner;

import org.junit.Test;

public class hahha {

	@Test
	public void aa(){
		int row=13;
		String num_max = "";        
		  String value = "";  
		  int[][] a = new int[row][row];  //声明一个二维数组，存储杨辉三角  
		  for(int i=0;i<row;i++){      
		   if(i==0){      //三角顶点时数字1  
		    a[0][0] = 1;      
		   }  
		   else{       //三角两边也是数字1  
		    a[i][0] = 1;  
		    a[i][i] = 1;  
		   }  
		  }  
		  for(int i=1;i<row;i++){    //去除两边，杨辉三角，就是下面的数是自己上面两个数的和，自己最好画个图  
		   for(int j=1;j<i;j++){  
		    a[i][j] = a[i-1][j-1]+a[i-1][j];  
		   }  
		  }  
		  num_max = String.valueOf(a[row-1][row/2]);  
		  for(int m=0;m<num_max.length();m++)  
		    value += " ";     //根据最大数字的长度计算，空格的单位  
		  for(int i=0;i<row;i++){  
		     for(int n=0;n<=row-i;n++)  //打印数据距左边的距离  
		     System.out.print(value+" ");  
		     for(int j=0;j<=i;j++){  
		      String min="";    //当数字长度大于1，重新计算空格数目  
		      int num_len = String.valueOf(a[i][j]).length();  //得到输出的数字长度  
		      if(num_len>1){    //当数字长度大于1位时,输出空格数要减去自身的长度，这样才能对其  
		       for(int v=0;v<=(num_max.length()-num_len);v++){    
		        min += " ";       
		       }  
		        System.out.print(a[i][j]+value+min+" ");  
		      }  
		      else{    //数字位数为1位时输出    
		       System.out.print(a[i][j]+value+value+" ");  
		      }  
		     }  
		     System.out.println();   //换行  
		  }  
		 }  

	
}
