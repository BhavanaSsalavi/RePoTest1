package com.bhavana;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   int c= 0;
	   int b= 1;
	    int sum =c+b;
	    
	    while(sum<100) {
	    	System.out.println(sum);
	    	 c=b;
	    	 b=sum;
	    	 
	    	 sum= c+b;
	    	 
	 	    }
		System.out.println(sum);

	}

}
