import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void heal(Hero hero) {
		hero.hp += 10;
		System.out.println(this.name + "は" + hero.name + "のHPを10回復した");
	}

	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");

		int recoverActual = new Random().nextInt(3) + sec;

		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}
