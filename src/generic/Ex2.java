package generic;

public class Ex2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		printer.setMaterial(p1); // 매개변수가 자동으로 형변환됨 Object material = p1;
		
		// 재료를 꺼낼때는 직접 형변환을 해야함
		Powder p2 = (Powder)printer.getMaterial();
		
		p2.doPrinting();
		
	}

}

class ThreeDPrinter3 {
	
	private Object material;
	
	// 멤버변수 하늘색, 지역변수 푸른색?
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
}