package ch10_extens_interface.starcraft;

public class Zealot extends StarUnit{

	private int shield; // 질럿은 보호막이 있음.
	
	public Zealot() {
		// Zealot(String name, int damage, int hp, int armor, int shield) 호출
		// new Zealot()으로 인스턴스 생성 시 디폴트 값
		this("질럿", 16, 100, 1, 60);
	}
	public int getShield() {
		return shield;
	}
	@Override
	public String toString() {
		return "Zealot [shield=" + shield + ", getName()=" + getName() + ", getDamage()=" + getDamage() + ", getHp()="
				+ getHp() + ", getArmor()=" + getArmor() + "]";
	}
	public void setShield(int shield) {
		this.shield = shield;
	}
	public Zealot(String name, int damage, int hp, int armor,  int shield) {
		super(name, damage, hp, armor);
		this.shield = shield;
	}
}
