package G191210011;

public class Kullanici{
	private String kullaniciAdi;
	private String sifre;
	
	private Kullanici(KullaniciBuilder builder) {
		this.kullaniciAdi = builder.kullaniciAdi;
		this.sifre = builder.sifre;
	}
	
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}
	public void setKullaniciAdi(String kullaniciAdi) {
		this.kullaniciAdi = kullaniciAdi;
	}
	
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}	
	
	public static class KullaniciBuilder {
		private String kullaniciAdi;
		private String sifre;
		
		public KullaniciBuilder(String kullaniciAdi, String sifre) {
			this.kullaniciAdi = kullaniciAdi;
			this.sifre = sifre;
		}
		
		public KullaniciBuilder setKullaniciAdi(String kullaniciAdi) {
			this.kullaniciAdi = kullaniciAdi;
			return this;
		}
		
		public KullaniciBuilder setSifre(String sifre) {
			this.sifre = sifre;
			return this;
		} 
		
		public Kullanici build() {
			return new Kullanici(this);
		}
	}
}
