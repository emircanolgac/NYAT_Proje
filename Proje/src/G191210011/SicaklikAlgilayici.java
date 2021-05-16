package G191210011;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {
	ISicaklikAlgilayici sicaklikAlgilayici = new AgArayuzu();
	@Override
	public int SicaklikOlc() {
		int sicaklik = sicaklikAlgilayici.SicaklikOlc();
		return sicaklik;
	}
}