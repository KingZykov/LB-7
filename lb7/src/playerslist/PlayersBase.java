package playerslist;

public class PlayersBase {
	private static final String[] PLAYERS = new String[] {
			"Undertaker", "Brock Lesnar", "CM Punk", "Roman Reigns",
			"Kenny Omega", "Seth Rollins", "AJ Styles",
			"Kazuchika Okada", "Hulk Hogan"
	};

	public static String[] getPlayers() {
		return PLAYERS;
	}
}
