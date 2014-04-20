package football;

public class Football {
	private String name;
	private String position;
	private String fiend[];

	public Football() {
		name = "Masato Kugo";
		position = "Forward";
		fiend = new String[] { "Manabu and Genki Hara" };
	}

	public Football(int a) {

	}

	public String getName() {
		return name;
	}

	public String getPosition() {
		return position;
	}

	public String[] getFiend() {
		return fiend;
	}

	public String getname() {
		return null;
	}
}
