import java.io.*;
import java.util.*;
class Fibonacci{  
public static void main(String args[])  
{    
 int n1=1,n2=1,n3,i; 
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of elements in fibonacci"); 
int count=sc.nextInt();  
 System.out.println(n1);
System.out.println(n2);    
    
 for(i=2;i<count;i++) 
 {    
  n3=n1+n2;    
   System.out.println(n3);   
  n1=n2;    
  n2=n3;    
 }  
}}  
