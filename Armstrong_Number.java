/*Armstrong Number */

import java.io.*;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int originalnumber,remainder,result = 0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 originalnumber=num;
		while(originalnumber!=0) {
		remainder=originalnumber%10;
		result=(int) (result + Math.pow(remainder,3));
		originalnumber=originalnumber/10;
		}
		if(result==num) {
			System.out.println("Armstrong Number:"+num);
		}else
		{
			System.out.println("This is not a Armstrong Number:"+num);
		}
	}

}


/*Output
Enter the number
153
Armstrong Number:153
*/
