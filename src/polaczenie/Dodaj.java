package polaczenie;

import java.sql.*;


public class Dodaj {
	
	
	public static void dodajUcznia(int id, String imie, String nazwisko, 
			String uwagi, int klasa, int rok) throws SQLException {

		    String query = String.format(
				" INSERT INTO uczniowie VALUES('%d', '%s', '%s','%s','%d','%d');",
				id, imie, nazwisko, uwagi, klasa, rok);
				
			Statement stmt = null;
		    try {
		    	
		    	Connection conn = Main.getConnection();
		        stmt = conn.createStatement();
		        stmt.executeUpdate(query);
		        
		      
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        if (stmt != null) { stmt.close(); }
		    }
		}

}
