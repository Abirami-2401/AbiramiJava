package Assignment;

public class PrimeNumbers {

	public static void main(String[] args) {
		int a, b=0, prime=0;      
		  int n=4;   
		  b=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(a=2;a<=b;a++){      
		    if(n%a==0){      
		     System.out.println(n+" is not prime number");      
		     prime=1;      
		     break;      
		    }      
		   }      
		   if(prime==0)  { System.out.println(n+" is prime number"); 
		   }  
		  } 
		}    
		
	}

