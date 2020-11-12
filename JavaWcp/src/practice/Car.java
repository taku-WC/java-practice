package practice;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;
//コンストラクタ「燃費」「残量」の引数を「double」型で定義します。引数をフィールドに代入します。
    public Car(double fuelCost, double fuelAmount) {
        this.fuelCost = fuelCost;
        this.fuelAmount = fuelAmount;
    }
//moveメソッド
    public void move(int km) {
//「int」型を引数にして定義。「km + " km 走ります"」を出力
        System.out.println(km + " km 走ります");
//残量から走った分の燃料を計算して、引き算
        this.fuelAmount -= (km / fuelCost);
    }

    public double getFuelAmount() {
        return this.fuelAmount;
    }
}