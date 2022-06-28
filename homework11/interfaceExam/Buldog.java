package interfaceExam;

public class Buldog implements Runnable {

	@Override
	public void start() {
		System.out.println("Buldog 네 발로 출발한다.");
	}

	@Override
	public void running() {
		System.out.println("Buldog 최고 속도로 네 발로 뛴다.");
	}

	@Override
	public void stop() {
		System.out.println("Buldog 먹이를 보고 멈추었다.");
	}

}
