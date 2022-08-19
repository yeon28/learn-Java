package p06.interface_inheritance;

/*
 Interface 상속(inheritance)
 - 여러개의 부모 인터페이스를 상속 가능
 - 부모 인터페이스를 상속할 때는 클래스처럼 extends 키워드 사용
 */
public interface InterfaceC extends InterfaceA, InterfaceB {
	
	void methodC();
	
}
