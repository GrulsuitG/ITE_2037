package abstractExam;

public class PlayGame {
	public static void main(String[] args) {
		SportsPlayer[] players = {new BasketBallPlayer("서장훈", 25, 10000000),
								 new SoccerPlayer("손흥민", 23, 100000)};
		
		for(SportsPlayer player : players) {
			player.printInfo();
			player.playGame();
		}
	}
}
