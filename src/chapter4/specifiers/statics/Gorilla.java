package chapter4.specifiers.statics;

public class Gorilla {
	public static int count;
	public static void addGorilla(){count++;}
	public void babyGorilla(){ count++ ;}
	public void announceBabies() {
		addGorilla();
		babyGorilla();
	}
	public static void announceBabiestorEveryon(){
		addGorilla();
		babyGorilla();
	}
	public int total;
	public static average = total / count;
}
