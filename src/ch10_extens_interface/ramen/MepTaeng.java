package ch10_extens_interface.ramen;

public class MepTaeng extends Ramen{

	public MepTaeng(String name, int price) {
		super(name, price);
	}
	
	
	public void printRecipe() {
		System.out.println("끓는 물에 면과 스프를 넣고 4분 후에 드셔요");
		System.out.println("tip.물은 500ml (한강라면 스탈은 430ml)");
	}
}
