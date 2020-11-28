
public enum Dessert {
	APPLE(100) {
		@Override
		void advertise() {
			System.out.println("真っ赤なリンゴが" + getPrice() + "円");
		}
	},
	ICE_CREAM(200){
		@Override
		void advertise() {
			System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円");
		}
	},
	CAKE(300){
		@Override
		void advertise() {
			System.out.println("みんな大好き甘いケーキが" + getPrice() + "円");
		}
	},
	;
	public int getPrice() {
		return price;
	}
	private int price;

	private Dessert(int price) {
		this.price = price;
	}

	abstract void advertise();

}
