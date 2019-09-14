package ua.lviv.lgs;

public class Task3 {
public static void main(String[] args) {
	
	int[] arr = new int[]{89 ,56 ,890 ,24 ,68 ,-9 , 116, -37, 580, 1290};
	 
	 int x = arr[0];
	 int y = arr[0];
	 
	 for(int i = 0; i < arr.length; i++) {
	 
	   
	    if(arr[i] >= x) {
	   
	      x= arr[i];
	   
	    }
	   
	    if(arr[i] <= y)
	       
	       y = arr[i];
	   
	   
	 
	 }
	 
	 
	 System.out.println("Max number is: " + x +" and min number is: " + y);
	
}
}
