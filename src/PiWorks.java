
public class PiWorks {

	public static int findFactorial(int n) {
		
		int factorial=1; // 0 and 1 factorial equals 1.
		
		
		if(n!=0 && n!=1) {
			for(int j = n ; j>0 ; j--) {
				factorial*=j;
			}
		}
		
	
		return factorial;
	}
	
	public static int findPower(int base , int power) {
	 
	        int result = 1; //Any number to the 0 power is 1.
	        while (power != 0) {
	            result = result * base;

	            power--;
	        }
	        return result;
		}
	
	public static void main(String[] args) {
		
		int result=0;
		int arr []= {1, 2, 2, 3, 3, 3, 5, 7, 11, 15};
		int n = arr.length;
		
		for(int i = 0 ; i<n-1 ; i++) {
			result+=(findPower(arr[i], i)) / findFactorial(i);   //	formula is applied
		
		}
		
		System.out.println("Result  = "+result);
	}

}
