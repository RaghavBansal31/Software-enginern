package Assignment1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
public class SimpleList 
{
   private int list[];//Declaring the variables of the list
   private int c;

   public SimpleList() //this is a constructor
   {
       this.c = 0;
       list = new int[10];
   }
   public void add(int n) //This method is used to add a number to the list
   {
       if (c== 0)
       {
           list[c] = n;
           c++;
       } else if (c < 10) 
       {
           for (int j = c; j >= 0; j--) 
           {
               list[j + 1] = list[j];
           }
           list[0] = n;
           c++;
       } else 
       {
           list[c - 1] = 0;
           for (int j = c; j >= 0; j--) 
           {
               list[j + 1] = list[j];
           }
           list[0] = n;
           c++;
       }
       System.out.println("Number is added to the list");
   }

   public void remove(int n) // This method is used to remove a number from the list
   {
       int in = search(n);
       if (in != -1) 
       {
           
           for (int j = in; j < c - 1; j++) 
           {
               list[j] = list[j + 1];
           }
           c--;
           System.out.println("number is removed ");
       } else 
       {
           System.out.println(n + " number is found");
       }
   }
   public int count() 
   {
       return c;
   }

   public int search(int n)// This method will search the list 
   {
       int in = -1;
       for (int j = 0; j < c; j++) 
       {
           if (list[j] == n) 
           {
               in = j;
           }
       }
       return in;
   }
   
 
   public String toString() // this will give the string
   {
       String s = "";
       for (int j = 0; j < c; j++) 
       {
           s = s + list[j];
           if (j != c - 1) 
           {
               s = s + " ";
           }
       }
       return s;
   }
}
