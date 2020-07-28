/* Program: Linear Search Example
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers
 */
 
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,counter,item,array[];
		 //To capture user input
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers in array");
		num=sc.nextInt();
		 //Creating array to store the all the numbers
		array=new int[num];
		System.out.println("Enter"+num+"integers");
		  //Loop to store each numbers in array
		for (counter = 0; counter < num; counter++)
	        array[counter] = sc.nextInt();

	      System.out.println("Enter the search value:");
	      item = sc.nextInt();

	      for (counter = 0; counter < num; counter++)
	      {
	         if (array[counter] == item) 
	         {
	           System.out.println(item+" is present at location "+(counter+1));
	           /*Item is found so to stop the search and to come out of the 
	            * loop use break statement.*/
	           break;
	         }
	      }
	      if (counter == num)
	        System.out.println(item + " doesn't exist in array.");
	   
	}
	}
  

/*Output

Enter the numbers in array
10
Enter10integers
45
55
12
48
16
10
23
78
98
47
Enter the search value:
16
16 is present at location 5

*/
