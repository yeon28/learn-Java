package p07.default_method_inheritence;

public interface ParentInterface {

	void method1();
	default void method2() {
		System.out.println("ParentInterface default method2() - ����");
	}
	
}
