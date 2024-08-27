import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class KutuphaneDAO {
    public void insertKutuphane(String kutuphaneAdi, String aciklama,int adres_No  ) {
        String query = "INSERT INTO tbl_kutuphane (kutuphane_ismi, aciklama, adres_no) VALUES (?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, kutuphaneAdi);
            stmt.setString(2, aciklama);
            stmt.setInt(3, adres_No);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Kütüphane başarıyla eklendi.");
            } else {
                System.out.println("Kütüphane ekleme başarısız oldu.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
