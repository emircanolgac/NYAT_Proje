package G191210011;
import java.util.Scanner;

public class Uygulama {

	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		AgArayuzu agArayuzu = new AgArayuzu();
		
		Subscriber1 s1 = new Subscriber1();
		Subscriber2 s2 = new Subscriber2();
		Publisher p = new Publisher();
		
		p.attach(s1); //s1 subscribers listesine ekleniyor.
		p.attach(s2); // s2 susbscriber listesine ekleniyor.
		
		int secim;
		boolean acikMi = false;
		String kullaniciAdi, sifre;
		System.out.print("Kullanici Adi: ");
		kullaniciAdi = input.next();
		System.out.print("Sifre: ");
		sifre = input.next();
			
		Kullanici kullanici1 = new Kullanici.KullaniciBuilder(kullaniciAdi, sifre).build();	
		Veritabani db = new Veritabani();
		boolean bagliMi = db.KullaniciDogrula(kullanici1.getKullaniciAdi(), kullanici1.getSifre());
		if(bagliMi) {
			
			while(true) {
				System.out.println("\nLütfen Bir Seçim Yapınız");
				System.out.println("1. Sogutucuyu Aç");
				System.out.println("2. Sogutucuyu Kapat");
				System.out.println("3. Sıcaklıgı Görüntüle");
				System.out.println("4. Çıkış"); 
				System.out.print("Secim: ");
				secim = input.nextInt();
				switch(secim) {
				case 1:
					if(acikMi == false) {
						acikMi = true;
						agArayuzu.SogutucuAc();		
						p.notify("Sogutucu Acildi!");
					}
					else {
						System.out.println("Sogutucu Zaten Acik!");
						p.notify("Sogutucu Zaten Acik!");
					}
					break;
				case 2:
					if(acikMi == true) {
						acikMi = false;
						agArayuzu.SogutucuKapat();					
						p.notify("Sogutucu Kapatildi!");
					}
					else {
						System.out.println("Sogutucu Zaten Kapali!");
						p.notify("Sogutucu Zaten Kapali!");
					}
					break;
				case 3:
					agArayuzu.SicakikGoruntule();
					break;
				case 4:
					System.out.println("Cikis Yapiliyor...");
					Thread.sleep(700);
					System.out.println("Cikis Yapildi");
					System.exit(0);
					break;
				default:
					System.out.println("HATALI SECIM!");
					System.exit(0);
					break;
				}
			}
			
		}
		else {
			System.out.println("Cikis Yapiliyor...");
			Thread.sleep(700);
			System.out.println("Cikis Yapildi");
			System.exit(0);
		}
	}
}
