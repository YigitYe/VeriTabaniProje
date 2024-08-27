import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class KitapDAO {
    public void updateKitap(int isbn, String yeniAd, String yayinTarihi, int sayfaSayisi) {
        String query = "UPDATE tbl_kitaplar SET kitap_adi = ?, yayin_tarihi = ?, sayfa_sayisi = ? WHERE isbn = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, yeniAd);
            stmt.setString(2, yayinTarihi);
            stmt.setInt(3, sayfaSayisi);
            stmt.setInt(4, isbn);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Kitap bilgileri başarıyla güncellendi.");
            } else {
                System.out.println("Güncelleme başarısız oldu. Kitap bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String selectKitap(int isbn) {
        String query = "SELECT * FROM tbl_kitaplar WHERE isbn = ?";
        StringBuilder result = new StringBuilder();

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, isbn);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                result.append("ISBN: ").append(rs.getInt("isbn")).append("\n");
                result.append("Kitap Adı: ").append(rs.getString("kitap_adi")).append("\n");
                result.append("Yayın Tarihi: ").append(rs.getString("yayin_tarihi")).append("\n");
                result.append("Sayfa Sayısı: ").append(rs.getInt("sayfa_sayisi")).append("\n");
            } else {
                result.append("Kitap bulunamadı.\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public void insertKitap(int isbn, String kitapAdi, String yayinTarihi, int sayfaSayisi) {
        String query = "INSERT INTO tbl_kitaplar (isbn, kitap_adi, yayin_tarihi, sayfa_sayisi) VALUES (?, ?, ?, ?)";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, isbn);
            stmt.setString(2, kitapAdi);
            stmt.setString(3, yayinTarihi);
            stmt.setInt(4, sayfaSayisi);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Kitap başarıyla eklendi.");
            } else {
                System.out.println("Kitap ekleme başarısız oldu.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteKitap(int isbn) {
        String query = "DELETE FROM tbl_kitaplar WHERE isbn = ?";

        try (Connection conn = DatabaseConnector.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setInt(1, isbn);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Kitap başarıyla silindi.");
            } else {
                System.out.println("Silme işlemi başarısız oldu. Kitap bulunamadı.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
