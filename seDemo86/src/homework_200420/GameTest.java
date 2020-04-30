package homework_200420;

public class GameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playerId="逆风尿三寸";
		
		Game game=new Game(playerId, "祖安", "狗头人", "排位", true);
		game.openGame();
		game.registerAccount(playerId);
		game.login(playerId);
		game.chooseServer();
		game.patternRank();
		game.chooseHero();
		game.goSurrender();
		game.bloodPressure();
	}

}
