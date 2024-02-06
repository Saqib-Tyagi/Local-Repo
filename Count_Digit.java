class Count_Digit{
	public static void main(String []args){
	int a=100001234,sum=0;
        while(a>0){
			a=a/10;
			sum++;
		}	
		System.out.println("Digit of Number :- "+sum);
	}
	
	
	
}