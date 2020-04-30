package homework_200420;

/**
 * 
 * @author 29ktsNelson
 * @date 2020年4月20日
 */
public class Game {
	// 成员变量
	String playerId;// 玩家名称
	String server;// 区服
	String heroName;// 英雄名
	String pattern;// 选择模式
	boolean surrender;// 是否投降
	
	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public String getHeroName() {
		return heroName;
	}

	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}

	public String getPattern() {
		return pattern;
	}

	public void setPattern(String pattern) {
		this.pattern = pattern;
	}

	public boolean isSurrender() {
		return surrender;
	}

	public void setSurrender(boolean surrender) {
		this.surrender = surrender;
	}

	/**
	 * 构造方法
	 */
	public Game() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param playerId
	 * @param area
	 * @param heroName
	 * @param pattern
	 * @param surrender
	 */
	public Game(String playerId, String server, String heroName, String pattern, boolean surrender) {
		this.playerId = playerId;
		this.server = server;
		this.heroName = heroName;
		this.pattern = pattern;
		this.surrender = surrender;
	}

	/**
	 * 流程方法
	 */
	public void openGame() {// 打开游戏
		System.out.println("打开游戏");
	}

	public void registerAccount(String playerId) {// 注册账户
		System.out.println(playerId + "注册成功");
	}

	public void login(String playerId) {// 登陆
		System.out.println(playerId + "登陆成功");
	}

	public void chooseServer() {// 登陆选区
		System.out.println("选择的区服为："+server);
	}

	public void patternRank() {// 模式_排位
		System.out.println("模式："+pattern);
	}

	public void chooseHero() {// 选择英雄
		System.out.println("英雄："+heroName);
	}

	public void goSurrender() {//投降
		if(surrender) {
			System.out.println("五分钟三路全崩，投降");
		}
	}
	
	public void bloodPressure() {// 当血压高于多少时退出游戏
		// if
		System.out.println("我崩溃了真的");
	}

	
}
