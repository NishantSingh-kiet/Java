/*Palindrome Number */
import java.util.*;
public class Palimdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,temp,sum=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0){
			num=n%10;
			sum=(sum*10)+num;
			n=n/10;
		}
		if(temp==sum) {
			 System.out.println("palindrome number ");   
		}
	    else {
	    	 System.out.println("not palindrome");    
		}  
	}
}


/*Input1
Enter the number
161
palindrome number 

Input2
Enter the number
152
not palindrome
*/
