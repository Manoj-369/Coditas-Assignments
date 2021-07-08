

/*	The Singleton's purpose is to control object creation, limiting the number of objects to only one    */

public class SingletonMain {

	public static void main(String[] args) {

		Abc obj1 =Abc.getInstance();
		
	}
}

	
	class Abc {
		
		static Abc obj =new Abc();
		
		private Abc() {
			
		}
		
		public static Abc getInstance() {
			return obj;
		}
	}


