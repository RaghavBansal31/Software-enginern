package Assignment1;

import java.util.Scanner;
public class SimpleListTest {
   public static void main(String[] args)
   {
       int option;
       /*Create Scanner class object which is used to get the inputs
       * typed in by the user*/
       Scanner ju = new Scanner(System.in);
       SimpleList ty=new SimpleList();
       /*while loop is used to work until the user chooses a valid choice*/
       while (true)
       {
           System.out.println("\nAdd:1");
           System.out.println("Remove:2");
           System.out.println("Search:3");
           System.out.println("toString:4");
           System.out.println("Count:5");
           System.out.println("Exit:6");
           System.out.print("Enter your choice :");// To get input by the user
           option = ju.nextInt();
switch (option) { //switch is used, to make choice for the user
           
           case 1: // this case give choice of addition in the list
           {
               System.out.print("Enter digit add :");
               int n=ju.nextInt();
               ty.add(n);
              
               continue;
           }
           case 2: // this case give choice of elimination from the list
           {
               System.out.print("Enter digit to remove :");
               int n=ju.nextInt();
               ty.remove(n);
              
               continue;
           }
           case 3: // this case give choice to search the list
           {
               System.out.print("Enter Num to search :");
               int n=ju.nextInt();
               int u=ty.search(n);
               if(u==-1)// if loop is used to define whether anything is there in the list or not
               {
                   System.out.println(n+" is not there in the list");
               }
               else
               {
                   System.out.println(n+" is there in the list "+u);
               }
              
               continue;
           }
           case 4:// this case give choice to print string 
           {
               System.out.println(ty);
               continue;
           }
           case 5: // this case give choice to show count
           {
               System.out.println("Count is :"+ty.count());
               continue;
           }
           case 6: // this case to exit
           {
               break;
           }
           default: // this is the default case
           {
               System.out.println("Incorrect selection");
               continue;
           }
           }
           break;
       }
   }
}
