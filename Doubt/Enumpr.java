interface Operator {
    int apply (int a, int b);
}
public class Enumpr implements Operator1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hellooo");	
	}
}
public enum Enumpr1 implements Operator {
    PLUS { 
        public int apply(int a, int b) { return a + b; }
    },
    MINUS { 
        public int apply(int a, int b) { return a - b; }
    };
}

