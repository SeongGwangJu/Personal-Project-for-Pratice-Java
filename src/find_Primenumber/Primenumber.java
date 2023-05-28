package find_Primenumber;

public class Primenumber {
	public static void main(String[] args) {
		int count = 0; 
		
		for(int n=2; n <= 100; n++) {  //(1)
				for(int i = 1; i <= n; i++) { //(2)
					if((n%i) == 0) {
					 count++; //(3)
					} else {
						}
		}								//두번째 for문 끝
			if(count == 2) {
				System.out.println(n); //(4)
				} else {
				} 
				count = 0 ; //(5)
				 //asdasdad
			} 
	}
}
