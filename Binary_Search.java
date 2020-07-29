/*
Program: Binary Search Example
 * Input: Number of elements, element's values, value to be searched
 * Output:Position of the number input by user among other numbers
 */
 
import java.util.Scanner;
class BinarySearchExample
{
   public static void main(String args[])
   {
      int counter, num, item, array[], first, last, middle;
      //To capture user input
      Scanner input = new Scanner(System.in);
      System.out.println("Enter number of elements:");
      num = input.nextInt(); 

      //Creating array to store the all the numbers
      array = new int[num];

      System.out.println("Enter " + num + " integers");
      //Loop to store each numbers in array
      for (counter = 0; counter < num; counter++)
          array[counter] = input.nextInt();

      System.out.println("Enter the search value:");
      item = input.nextInt();
      first = 0;
      last = num - 1;
      middle = (first + last)/2;

      while( first <= last )
      {
         if ( array[middle] < item )
           first = middle + 1;
         else if ( array[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
      if ( first > last )
          System.out.println(item + " is not found.\n");
   }
}

/*
Output 1:

Enter number of elements:
7
Enter 7 integers
4
5
66
77
8
99
0
Enter the search value:
77
77 found at location 4.
Output 2:

Enter number of elements:
5
Enter 5 integers
12
3
77
890
23
Enter the search value:
99
99 is not found.
*/