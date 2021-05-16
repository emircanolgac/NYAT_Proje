package G191210011;

import java.util.Random;

public class AgArayuzu implements IEyleyici, ISicaklikAlgilayici {
	@Override
	public void SogutucuAc() {
		System.out.println("Sogutucu Acildi");
	}
	
	@Override
	public void SogutucuKapat() {	
		System.out.println("Sogutucu Kapatildi");
	}
	
	@Override
	public int SicaklikOlc() {
		Random random = new Random();
		int sicaklik = random.nextInt(50);
		return sicaklik;
	}
	
	public void SicakikGoruntule() {
		int sicaklik = SicaklikOlc();
		System.out.println("Sicaklik : " + sicaklik);
	}
	
}
