//전 세계의 모든 폰의 전원을 켤때 실행되는 메소드
interface RunningApp{
	void running(); 
}


public class PhoneFactory {
	
	public RunningApp createSamsungPhone() {
		class SamsungPhone implements RunningApp{
			public void running() {
				System.out.println("삼성폰이 실행됩니다");
			}
		}
		return new SamsungPhone();
	}
	public RunningApp createSamsungPhone1() {
		return new RunningApp() {
			public void running() {
				System.out.println("삼성폰이 실행됩니다");
			}
		};
	}
	
	
	public RunningApp createLgPhone() {
		class LgPhone implements RunningApp{
			public void running() {
				System.out.println("LG폰이 실행됩니다");
			}
		}
		return new LgPhone();
	}
	public RunningApp createLgPhone1() {
		return new RunningApp() {
			public void running() {
				System.out.println("LG폰이 실행됩니다");
			}
		};
	}
	
	
}
