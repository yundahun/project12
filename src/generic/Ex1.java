package generic;

// 파우더 클래스 만들기
class Powder {
	
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Powder 입니다.";
	}
	
}

// 플라스틱 클래스 만들기
class Plastic {
	
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다");
	}
	
	public String toString() {
		return "재료는 Plastic 입니다.";
	}
}

// 파우더를 재료로 사용하는 프린터 만들기
class ThreeDPrinter1 {
	
	private Powder material;
	
	public void setMaterial(Powder powder) {
		this.material = powder;
	}
	
	public Powder getMaterial() {
		return material;
	}
}

// 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter2 {
	
	private Plastic material;

	public void setMaterial(Plastic material) {
		this.material = material;
	}
	
	public Plastic getMaterial() {
		return material;
	}
}
