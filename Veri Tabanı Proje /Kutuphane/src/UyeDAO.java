import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UyeDAO {
    public void updateUye(int uyeNo, String yeniAd, String yeniSoyad, String yeniTelefon, String yeniEposta) {
        String query = "UPDATE tbl_uyeler SET uye_adi = ?, uye_soyadi = ?, telefon = ?, e_posta = ? WHERE uye_no = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, yeniAd);
            stmt.setString(2, yeniSoyad);
            stmt.setString(3, yeniTelefon);
            stmt.setString(4, yeniEposta);
            stmt.setInt(5, uyeNo);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Üye bilgileri başarıyla güncellendi.");
            } else {
                System.out.println("Güncelleme başarısız oldu. Üye bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String selectUye(int uyeNo) {
        String query = "SELECT * FROM tbl_uyeler WHERE uye_no = ?";
        StringBuilder result = new StringBuilder();

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, uyeNo);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                result.append("Üye No: ").append(rs.getInt("uye_no")).append("\n");
                result.append("Ad: ").append(rs.getString("uye_adi")).append("\n");
                result.append("Soyad: ").append(rs.getString("uye_soyadi")).append("\n");
                result.append("Telefon: ").append(rs.getString("telefon")).append("\n");
                result.append("E-Posta: ").append(rs.getString("e_posta")).append("\n");
            } else {
                result.append("Üye bulunamadı.\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public void insertUye(String ad, String soyad, String telefon, String eposta) {
        String query = "INSERT INTO tbl_uyeler (uye_adi, uye_soyadi, telefon, e_posta) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, ad);
            stmt.setString(2, soyad);
            stmt.setString(3, telefon);
            stmt.setString(4, eposta);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Üye başarıyla eklendi.");
            } else {
                System.out.println("Üye ekleme başarısız oldu.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUye(int uyeNo) {
        String query = "DELETE FROM tbl_uyeler WHERE uye_no = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, uyeNo);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Üye başarıyla silindi.");
            } else {
                System.out.println("Silme işlemi başarısız oldu. Üye bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
