import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmanetDAO {
    public void insertEmanet(int isbn, int uyeNo, int kutuphaneNo, String emanetTarihi, String teslimTarihi) {
        String query = "INSERT INTO tbl_emanet (isbn, uye_no, kutuphane_no, emanet_tarihi, teslim_tarihi) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, isbn);
            stmt.setInt(2, uyeNo);
            stmt.setInt(3, kutuphaneNo);
            stmt.setString(4, emanetTarihi);
            stmt.setString(5, teslimTarihi);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Emanet başarıyla eklendi.");
            } else {
                System.out.println("Emanet ekleme başarısız oldu.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
