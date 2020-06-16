package project;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Program {

	static Logger logger = Logger.getLogger(Program.class);
	
	public static void main(String[] args) {	
		
		PropertyConfigurator.configure("log4j.properties");
		logger.info("NEW PROGRAM STARTUP +++++++++++++++++");
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GUI.createGUI();
			}
		});
		
		
		
		
		
		/*
		
		
		// TODO Auto-generated method stub
		System.out.println("hello flights");
		//DBConnection obj1 = new DBConnection();
		User user1 = new User();
		user1.Login("admin","adminPass");
		user1.Register("NewUser","newuserpass","Jan","Kowalski","jankowal@gmail.com");
		ArrayList<String> list1 = user1.ShowUserData();
		for (int i=0;i<list1.size();i++)
			System.out.println(list1.get(i));
		Reservations reservator = new Reservations();
		reservator.CancelReservation(user1.username, 9);
	*/
		//Zostawiam na razie wszystkie metody do wy�wietlania bo nie wiem co maj� zwraca�, �eby wy�wietla� to w SWINGU
		//Te� mog� p�zniej dorzu�ic jakie� metdoy do wy�wietlania lotnisk itd
	}

}
