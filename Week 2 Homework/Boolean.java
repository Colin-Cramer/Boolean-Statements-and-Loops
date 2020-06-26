
public class Boolean {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = false;
		
		double costOfMilk = 3.50;
		int moneyInWallet = 20;
		int thirstLevel = 6;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		System.out.println(shouldByIcecream);
		
		boolean willGoSwimming = isHotOutside && !isWeekday;
		System.out.println(willGoSwimming);
		
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday;
		System.out.println(isAGoodDay);
		
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk * 2;
		System.out.println(willBuyMilk);
		
	}

}