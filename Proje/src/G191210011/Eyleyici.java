package G191210011;

public class Eyleyici implements IEyleyici{
	boolean acikMi = false;
	@Override
	public void SogutucuAc() {
		System.out.println("Sogutucu Acildi");	
	}
	
	@Override
	public void SogutucuKapat() {
		System.out.println("Sogutucu Kapatildi");
	}
}
