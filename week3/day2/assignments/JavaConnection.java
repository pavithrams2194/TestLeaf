package week3.day2.assignments;

public class JavaConnection extends MySqlConnection{

	@Override
	public void connect() {
		System.out.println("Connect ");
	}

	@Override
	public void disconnect() {
		System.out.println("disconnect");		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate");
	}
	
	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
	}
}
