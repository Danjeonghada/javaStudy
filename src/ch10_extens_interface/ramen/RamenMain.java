package ch10_extens_interface.ramen;

public class RamenMain {
	public static void main(String[] args) {
//		Ramen ramen = new Ramen();  // 추상 클래스는 객체로 만들 수 없음.
		MepTaeng mep = new MepTaeng("맵탕", 1000);
		mep.printRecipe();
		JjaPpagheti jja = new JjaPpagheti("짜파게티", 12000);
		jja.printRecipe();
	}

}
