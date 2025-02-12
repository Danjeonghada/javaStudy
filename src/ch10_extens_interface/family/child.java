package ch10_extens_interface.family;

// child는 parent를 상속받음 (extends)
public class child extends Parent{

	public child() {
		super();
	}
	public child(String name, int ago) {
		super(name, ago); // 부모 생성자 호출
	}
	@Override
	public void sayHello() {
		System.out.println("자식 입니다.");
	}
	@Override
	public String toString() {
		return "child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
