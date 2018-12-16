package singletonPack;

public class Singleton {

	public static void main(String[] args) {
		
		MyConnection con = MyConnection.getInstance();

		if(con.getConnection() == null) {
			
			System.out.println("Error!!");
			
		}
		
	}

}
