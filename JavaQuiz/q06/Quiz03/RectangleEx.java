package Quiz03;

public class RectangleEx {
	
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(3, 4);
		Rectangle r2 = new Rectangle(3, 4);
		Rectangle r3 = new Rectangle(3, 5);

		if (r1.equals(r2)) {
			System.out.println("r1,r2는 높이와 너비가 같습니다.");
		} else {
			System.out.println("r1,r2는 높이와 너비가 다릅니다.");
		}
		if (r1.equals(r3)) {
			System.out.println("r1,r3는 높이와 너비가 같습니다.");
		} else {
			System.out.println("r1,r3는 높이와 너비가 다릅니다.");
		}
		if (r2.equals(r3)) {
			System.out.println("r1,r3는 높이와 너비가 같습니다.");
		} else {
			System.out.println("r1,r3는 높이와 너비가 다릅니다.");
		}
		
		System.out.println();

		System.out.println("r1 -> " + r1.toString());
		System.out.println("r2 -> " + r2.toString());
		System.out.println("r3 -> " + r3.toString());
	}
}
