package ch10_extens_interface.ramen;

public class JjaPpagheti extends Ramen{

	public JjaPpagheti(String name, int price) {
		super(name, price);
	}
	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶은 후 물은 버리고 스프를 비벼 드세요");
		System.out.println("tip.스프를 비빌때는 불을 끄고 비벼 드세요");
	}
	
}
