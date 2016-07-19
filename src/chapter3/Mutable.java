package chapter3;

public class Mutable {
	private String s;

	public void setS(String newS) {
		s = newS;
	}

	public String getS() {
		return s;
	}

	final class Immutable {
		private String s = "name";

		public String getS() {
			return s;
		}
	}

}
