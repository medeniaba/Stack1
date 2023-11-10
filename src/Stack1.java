
public class Stack1 {
	int [] dizi ; 

	int ust , N ; 

	public Stack1 ( int N ) {
		this.N = N ;
		dizi = new int [N] ; 
		ust = -1 ; 
		
	}

	int top () {
		
		
		return dizi[ust];
		
		
	}

	boolean isempty () {
		
		if ( ust == -1 ) return true ; 
		
		else return false ; 
	}
	boolean isfull () {
		return ust == N-1 ; 
	}
	void push ( int e ) { // ekleme metodu yıgıda
		if (!isfull()) {
			ust = ust+1 ; 
			dizi[ust] = e ; 
			
		}
	}
	int pop () {     // yıttan çıkarma metodu 
		
		if(!isempty ()) {
			
			ust -- ; 
			return dizi[ust+1];
			
		}

		return -1 ; 

	}

		
		
		
		
		public static void main(String[] args) {
			
			Stack1 s = new Stack1 (10) ; 
			s.push(5);
			s.push(8);
			s.push(13);
			
			int stackust = s.pop();
			System.out.println("Stack üst = " + stackust );
	        s.push(23);
	        System.out.println(s.pop());

		}

	}


