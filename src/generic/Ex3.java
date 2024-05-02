package generic;

public class Ex3 {

	public static void main(String[] args) {
		
		//파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();
		printer1.setMaterial(new Powder());
		Powder powder = printer1.getMaterial();
		powder.doPrinting();
		
		//플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
	}
}

//제네릭 클라스 만들기
class ThreeDPrinter<T> {
	
	private T material;
	
	// 멤버변수 하늘색, 지역변수 푸른색?
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
}