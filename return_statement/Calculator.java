public class Calculator {
	
	int addition(int n1, int n2,int n3) {
		int sum =n1+n2+n3;
		return sum;
	}
	
	int average(int n1,int n2,int n3) {
		int res = addition(n1,n2,n3);
		int avg = res / 3;
		return avg;
	}

}
