
class Basket<E> {
	private E elem;
	
	Basket(E e){
		elem = e;
	}
	
	void replace(E e) {
		elem = e;
	}
	
	E get() {
		return elem;
	}
	
	class Apple {
		private String name;
		
		Apple(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
	}
	
	class Peach {
		private String name;
		
		Peach(String name) {
			this.name = name;
		}
		
		String getName() {
			return name;
		}
	}
}
