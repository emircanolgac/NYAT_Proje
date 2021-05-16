package G191210011;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Veritabani {
	
	public boolean KullaniciDogrula(String kullaniciAdi, String sifre) {
		boolean bagliMi = false;
		
		try {
			String sqlSorgu = "SELECT* FROM \"Kullanici\" WHERE \"kullaniciAdi\" = '"+kullaniciAdi+"' AND \"sifre\" = '"+sifre+"'";
			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proje", "postgres", "temp");
			
			if(conn != null) {
				System.out.println("Veritabanina Baglandi");
			}
			else {
				System.out.println("Veritabanina Baglanmadi!");
			}
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlSorgu);
			
			if(rs.next()) {
				bagliMi = true;
				System.out.println("Kullanıcı Dogrulandi!");
			}
			else {
				System.out.println("Kullanici Dogrulanamadi!");
			}
			rs.close();
			stmt.close();
			conn.close();				
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bagliMi;
	}
}
