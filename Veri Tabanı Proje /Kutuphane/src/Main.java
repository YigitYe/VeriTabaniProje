import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Kütüphane Yönetim Sistemi");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        // Üye İşlemleri butonuna icon eklenmesi
        ImageIcon uyeIslemleriIcon = new ImageIcon("Kutuphane/src/pngegg.png");
        JButton uyeIslemleriButton = new JButton("Üye İşlemleri", uyeIslemleriIcon);
        uyeIslemleriButton.setBounds(10, 20, 200, 60); // Boyutları ikona göre ayarladım
        panel.add(uyeIslemleriButton);
        uyeIslemleriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame uyeIslemleriFrame = new JFrame("Üye İşlemleri");
                uyeIslemleriFrame.setSize(600, 600);
                JPanel uyeIslemleriPanel = new JPanel();
                uyeIslemleriFrame.add(uyeIslemleriPanel);
                placeUyeIslemleriComponents(uyeIslemleriPanel);
                uyeIslemleriFrame.setVisible(true);
            }
        });

        ImageIcon kitapIslemleriIcon = new ImageIcon("Kutuphane/src/icons8-book-48.png");
        JButton kitapIslemleriButton = new JButton("Kitap İşlemleri", kitapIslemleriIcon);
        kitapIslemleriButton.setBounds(10, 100, 200, 60); // Boyutları ikona göre ayarladım
        panel.add(kitapIslemleriButton);
        kitapIslemleriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame kitapIslemleriFrame = new JFrame("Kitap İşlemleri");
                kitapIslemleriFrame.setSize(300, 300);
                JPanel kitapIslemleriPanel = new JPanel();
                kitapIslemleriFrame.add(kitapIslemleriPanel);
                placeKitapIslemleriComponents(kitapIslemleriPanel);
                kitapIslemleriFrame.setVisible(true);
            }
        });


        ImageIcon emanetKitapIslemleriIcon = new ImageIcon("Kutuphane/src/icons8-borrow-book-48.png");
        JButton emanetKitapIslemleriButton = new JButton("Emanet Kitap İşlemleri", emanetKitapIslemleriIcon);

        emanetKitapIslemleriButton.setBounds(10, 180, 200, 60);
        panel.add(emanetKitapIslemleriButton);
        emanetKitapIslemleriButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame emanetKitapIslemleriFrame = new JFrame("Emanet Kitap İşlemleri");
                emanetKitapIslemleriFrame.setSize(300, 300);
                JPanel emanetKitapIslemleriPanel = new JPanel();
                emanetKitapIslemleriFrame.add(emanetKitapIslemleriPanel);
                placeEmanetKitapIslemleriComponents(emanetKitapIslemleriPanel);
                emanetKitapIslemleriFrame.setVisible(true);
            }
        });
    }

    private static void placeUyeIslemleriComponents(JPanel panel) {
        panel.setLayout(null);

        JButton uyeEkleButton = new JButton("Üye Ekle");
        uyeEkleButton.setBounds(10, 20, 150, 25);
        panel.add(uyeEkleButton);
        uyeEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame uyeFrame = new JFrame("Üye Ekle");
                uyeFrame.setSize(300, 300);
                JPanel uyePanel = new JPanel();
                uyeFrame.add(uyePanel);
                placeUyeEkleComponents(uyePanel);
                uyeFrame.setVisible(true);
            }
        });

        JButton uyeSilButton = new JButton("Üye Sil");
        uyeSilButton.setBounds(10, 60, 150, 25);
        panel.add(uyeSilButton);
        uyeSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame uyeSilFrame = new JFrame("Üye Sil");
                uyeSilFrame.setSize(300, 300);
                JPanel uyeSilPanel = new JPanel();
                uyeSilFrame.add(uyeSilPanel);
                placeUyeSilComponents(uyeSilPanel);
                uyeSilFrame.setVisible(true);
            }
        });

        JButton uyeGuncelleButton = new JButton("Üye Güncelle");
        uyeGuncelleButton.setBounds(10, 100, 150, 25);
        panel.add(uyeGuncelleButton);
        uyeGuncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame uyeGuncelleFrame = new JFrame("Üye Güncelle");
                uyeGuncelleFrame.setSize(300, 300);
                JPanel uyeGuncellePanel = new JPanel();
                uyeGuncelleFrame.add(uyeGuncellePanel);
                placeUyeGuncelleComponents(uyeGuncellePanel);
                uyeGuncelleFrame.setVisible(true);
            }
        });
    }

    private static void placeKitapIslemleriComponents(JPanel panel) {
        panel.setLayout(null);

        JButton kitapEkleButton = new JButton("Kitap Ekle");
        kitapEkleButton.setBounds(10, 20, 150, 25);
        panel.add(kitapEkleButton);
        kitapEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame kitapFrame = new JFrame("Kitap Ekle");
                kitapFrame.setSize(300, 300);
                JPanel kitapPanel = new JPanel();
                kitapFrame.add(kitapPanel);
                placeKitapEkleComponents(kitapPanel);
                kitapFrame.setVisible(true);
            }
        });

        JButton kitapSilButton = new JButton("Kitap Sil");
        kitapSilButton.setBounds(10, 60, 150, 25);
        panel.add(kitapSilButton);
        kitapSilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame kitapSilFrame = new JFrame("Kitap Sil");
                kitapSilFrame.setSize(300, 300);
                JPanel kitapSilPanel = new JPanel();
                kitapSilFrame.add(kitapSilPanel);
                placeKitapSilComponents(kitapSilPanel);
                kitapSilFrame.setVisible(true);
            }
        });

        JButton kitapGuncelleButton = new JButton("Kitap Güncelle");
        kitapGuncelleButton.setBounds(10, 100, 150, 25);
        panel.add(kitapGuncelleButton);
        kitapGuncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame kitapGuncelleFrame = new JFrame("Kitap Güncelle");
                kitapGuncelleFrame.setSize(300, 300);
                JPanel kitapGuncellePanel = new JPanel();
                kitapGuncelleFrame.add(kitapGuncellePanel);
                placeKitapGuncelleComponents(kitapGuncellePanel);
                kitapGuncelleFrame.setVisible(true);
            }
        });
    }

    private static void placeEmanetKitapIslemleriComponents(JPanel panel) {
        panel.setLayout(null);

        JButton emanetEkleButton = new JButton("Emanet Ekle");
        emanetEkleButton.setBounds(10, 20, 150, 25);
        panel.add(emanetEkleButton);
        emanetEkleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame emanetFrame = new JFrame("Emanet Ekle");
                emanetFrame.setSize(300, 300);
                JPanel emanetPanel = new JPanel();
                emanetFrame.add(emanetPanel);
                placeEmanetEkleComponents(emanetPanel);
                emanetFrame.setVisible(true);
            }
        });
    }

    private static void placeUyeEkleComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel adLabel = new JLabel("Ad:");
        adLabel.setBounds(10, 20, 80, 25);
        panel.add(adLabel);

        JTextField adText = new JTextField(20);
        adText.setBounds(100, 20, 165, 25);
        panel.add(adText);

        JLabel soyadLabel = new JLabel("Soyad:");
        soyadLabel.setBounds(10, 50, 80, 25);
        panel.add(soyadLabel);

        JTextField soyadText = new JTextField(20);
        soyadText.setBounds(100, 50, 165, 25);
        panel.add(soyadText);

        JLabel telefonLabel = new JLabel("Telefon:");
        telefonLabel.setBounds(10, 80, 80, 25);
        panel.add(telefonLabel);

        JTextField telefonText = new JTextField(20);
        telefonText.setBounds(100, 80, 165, 25);
        panel.add(telefonText);

        JLabel epostaLabel = new JLabel("E-Posta:");
        epostaLabel.setBounds(10, 110, 80, 25);
        panel.add(epostaLabel);

        JTextField epostaText = new JTextField(20);
        epostaText.setBounds(100, 110, 165, 25);
        panel.add(epostaText);

        JButton ekleButton = new JButton("Ekle");
        ekleButton.setBounds(10, 140, 80, 25);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad = adText.getText();
                String soyad = soyadText.getText();
                String telefon = telefonText.getText();
                String eposta = epostaText.getText();

                UyeDAO uyeDAO = new UyeDAO();
                uyeDAO.insertUye(ad, soyad, telefon, eposta);
            }
        });
        panel.add(ekleButton);
    }

    private static void placeUyeSilComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel uyeNoLabel = new JLabel("Üye No:");
        uyeNoLabel.setBounds(10, 20, 80, 25);
        panel.add(uyeNoLabel);

        JTextField uyeNoText = new JTextField(20);
        uyeNoText.setBounds(100, 20, 165, 25);
        panel.add(uyeNoText);

        JButton silButton = new JButton("Sil");
        silButton.setBounds(10, 50, 80, 25);
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int uyeNo = Integer.parseInt(uyeNoText.getText());

                UyeDAO uyeDAO = new UyeDAO();
                uyeDAO.deleteUye(uyeNo);
            }
        });
        panel.add(silButton);
    }

    private static void placeUyeGuncelleComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel uyeNoLabel = new JLabel("Üye No:");
        uyeNoLabel.setBounds(10, 20, 80, 25);
        panel.add(uyeNoLabel);

        JTextField uyeNoText = new JTextField(20);
        uyeNoText.setBounds(100, 20, 165, 25);
        panel.add(uyeNoText);

        JLabel adLabel = new JLabel("Yeni Ad:");
        adLabel.setBounds(10, 50, 80, 25);
        panel.add(adLabel);

        JTextField adText = new JTextField(20);
        adText.setBounds(100, 50, 165, 25);
        panel.add(adText);

        JLabel soyadLabel = new JLabel("Yeni Soyad:");
        soyadLabel.setBounds(10, 80, 80, 25);
        panel.add(soyadLabel);

        JTextField soyadText = new JTextField(20);
        soyadText.setBounds(100, 80, 165, 25);
        panel.add(soyadText);

        JLabel telefonLabel = new JLabel("Yeni Telefon:");
        telefonLabel.setBounds(10, 110, 80, 25);
        panel.add(telefonLabel);

        JTextField telefonText = new JTextField(20);
        telefonText.setBounds(100, 110, 165, 25);
        panel.add(telefonText);

        JLabel epostaLabel = new JLabel("Yeni E-Posta:");
        epostaLabel.setBounds(10, 140, 80, 25);
        panel.add(epostaLabel);

        JTextField epostaText = new JTextField(20);
        epostaText.setBounds(100, 140, 165, 25);
        panel.add(epostaText);

        JButton guncelleButton = new JButton("Güncelle");
        guncelleButton.setBounds(10, 170, 100, 25);
        guncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int uyeNo = Integer.parseInt(uyeNoText.getText());
                String yeniAd = adText.getText();
                String yeniSoyad = soyadText.getText();
                String yeniTelefon = telefonText.getText();
                String yeniEposta = epostaText.getText();

                UyeDAO uyeDAO = new UyeDAO();
                uyeDAO.updateUye(uyeNo, yeniAd, yeniSoyad, yeniTelefon, yeniEposta);
            }
        });
        panel.add(guncelleButton);
    }

    private static void placeKitapEkleComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(10, 20, 80, 25);
        panel.add(isbnLabel);

        JTextField isbnText = new JTextField(20);
        isbnText.setBounds(100, 20, 165, 25);
        panel.add(isbnText);

        JLabel adLabel = new JLabel("Kitap Adı:");
        adLabel.setBounds(10, 50, 80, 25);
        panel.add(adLabel);

        JTextField adText = new JTextField(20);
        adText.setBounds(100, 50, 165, 25);
        panel.add(adText);

        JLabel yayinTarihiLabel = new JLabel("Yayın Tarihi:");
        yayinTarihiLabel.setBounds(10, 80, 80, 25);
        panel.add(yayinTarihiLabel);

        JTextField yayinTarihiText = new JTextField(20);
        yayinTarihiText.setBounds(100, 80, 165, 25);
        panel.add(yayinTarihiText);

        JLabel sayfaSayisiLabel = new JLabel("Sayfa Sayısı:");
        sayfaSayisiLabel.setBounds(10, 110, 80, 25);
        panel.add(sayfaSayisiLabel);

        JTextField sayfaSayisiText = new JTextField(20);
        sayfaSayisiText.setBounds(100, 110, 165, 25);
        panel.add(sayfaSayisiText);

        JButton ekleButton = new JButton("Ekle");
        ekleButton.setBounds(10, 140, 80, 25);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(isbnText.getText());
                String ad = adText.getText();
                String yayinTarihi = yayinTarihiText.getText();
                int sayfaSayisi = Integer.parseInt(sayfaSayisiText.getText());

                KitapDAO kitapDAO = new KitapDAO();
                kitapDAO.insertKitap(isbn, ad, yayinTarihi, sayfaSayisi);
            }
        });
        panel.add(ekleButton);
    }

    private static void placeKitapSilComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(10, 20, 80, 25);
        panel.add(isbnLabel);

        JTextField isbnText = new JTextField(20);
        isbnText.setBounds(100, 20, 165, 25);
        panel.add(isbnText);

        JButton silButton = new JButton("Sil");
        silButton.setBounds(10, 50, 80, 25);
        silButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(isbnText.getText());

                KitapDAO kitapDAO = new KitapDAO();
                kitapDAO.deleteKitap(isbn);
            }
        });
        panel.add(silButton);
    }

    private static void placeKitapGuncelleComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(10, 20, 80, 25);
        panel.add(isbnLabel);

        JTextField isbnText = new JTextField(20);
        isbnText.setBounds(100, 20, 165, 25);
        panel.add(isbnText);

        JLabel adLabel = new JLabel("Yeni Kitap Adı:");
        adLabel.setBounds(10, 50, 100, 25);
        panel.add(adLabel);

        JTextField adText = new JTextField(20);
        adText.setBounds(130, 50, 165, 25);
        panel.add(adText);

        JLabel yayinTarihiLabel = new JLabel("Yeni Yayın Tarihi:");
        yayinTarihiLabel.setBounds(10, 80, 100, 25);
        panel.add(yayinTarihiLabel);

        JTextField yayinTarihiText = new JTextField(20);
        yayinTarihiText.setBounds(130, 80, 165, 25);
        panel.add(yayinTarihiText);

        JLabel sayfaSayisiLabel = new JLabel("Yeni Sayfa Sayısı:");
        sayfaSayisiLabel.setBounds(10, 110, 100, 25);
        panel.add(sayfaSayisiLabel);

        JTextField sayfaSayisiText = new JTextField(20);
        sayfaSayisiText.setBounds(130, 110, 165, 25);
        panel.add(sayfaSayisiText);

        JButton guncelleButton = new JButton("Güncelle");
        guncelleButton.setBounds(10, 140, 100, 25);
        guncelleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(isbnText.getText());
                String yeniAd = adText.getText();
                String yeniYayinTarihi = yayinTarihiText.getText();
                int yeniSayfaSayisi = Integer.parseInt(sayfaSayisiText.getText());

                KitapDAO kitapDAO = new KitapDAO();
                kitapDAO.updateKitap(isbn, yeniAd, yeniYayinTarihi, yeniSayfaSayisi);
            }
        });
        panel.add(guncelleButton);
    }

    private static void placeEmanetEkleComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel isbnLabel = new JLabel("ISBN:");
        isbnLabel.setBounds(10, 20, 80, 25);
        panel.add(isbnLabel);

        JTextField isbnText = new JTextField(20);
        isbnText.setBounds(100, 20, 165, 25);
        panel.add(isbnText);

        JLabel uyeNoLabel = new JLabel("Üye No:");
        uyeNoLabel.setBounds(10, 50, 80, 25);
        panel.add(uyeNoLabel);

        JTextField uyeNoText = new JTextField(20);
        uyeNoText.setBounds(100, 50, 165, 25);
        panel.add(uyeNoText);

        JLabel kutuphaneNoLabel = new JLabel("Kütüphane No:");
        kutuphaneNoLabel.setBounds(10, 80, 100, 25);
        panel.add(kutuphaneNoLabel);

        JTextField kutuphaneNoText = new JTextField(20);
        kutuphaneNoText.setBounds(120, 80, 165, 25);
        panel.add(kutuphaneNoText);

        JLabel emanetTarihiLabel = new JLabel("Emanet Tarihi:");
        emanetTarihiLabel.setBounds(10, 110, 100, 25);
        panel.add(emanetTarihiLabel);

        JTextField emanetTarihiText = new JTextField(20);
        emanetTarihiText.setBounds(120, 110, 165, 25);
        panel.add(emanetTarihiText);

        JLabel teslimTarihiLabel = new JLabel("Teslim Tarihi:");
        teslimTarihiLabel.setBounds(10, 140, 100, 25);
        panel.add(teslimTarihiLabel);

        JTextField teslimTarihiText = new JTextField(20);
        teslimTarihiText.setBounds(120, 140, 165, 25);
        panel.add(teslimTarihiText);

        JButton ekleButton = new JButton("Ekle");
        ekleButton.setBounds(10, 170, 80, 25);
        ekleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int isbn = Integer.parseInt(isbnText.getText());
                int uyeNo = Integer.parseInt(uyeNoText.getText());
                int kutuphaneNo = Integer.parseInt(kutuphaneNoText.getText());
                String emanetTarihi = emanetTarihiText.getText();
                String teslimTarihi = teslimTarihiText.getText();

                EmanetDAO emanetDAO = new EmanetDAO();
                emanetDAO.insertEmanet(isbn, uyeNo, kutuphaneNo, emanetTarihi, teslimTarihi);
            }
        });
        panel.add(ekleButton);
    }
}
