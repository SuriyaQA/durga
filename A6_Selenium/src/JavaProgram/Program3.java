package JavaProgram;
 class Program3 {

	public static void main(String[] args) {
		
		int num = 12345;
		int evenCount = 0;
		int oddCount = 0;
		while(num!=0) {
			
			int last = num%10;
			
			if(last%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
			num/=10;
			
		}
		System.out.println(evenCount);
		System.out.println(oddCount);
	}
	
}
