package interfaceExam;

public class Park implements Runnable {

	@Override
	public void start() {
		System.out.println("Park MAXSPPED = " + MAXSPEED);
		System.out.println("Park 2시에 두발로 뛰기 시작한다");
	}

	@Override
	public void running() {
		System.out.println("Park 1시간째 두 발로 뛰고 있다.");
	}

	@Override
	public void stop() {
		System.out.println("Park 3시 10분에 두 발로 멈추었다.");
	}

}
