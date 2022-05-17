
public class PhoneStore {
	public static void main(String[] args) {
		PhoneFactory pf = new PhoneFactory();
		RunningApp p1 = pf.createSamsungPhone();
		p1.running();
		
		RunningApp p2 = pf.createSamsungPhone1();
		p2.running();
	}
}
