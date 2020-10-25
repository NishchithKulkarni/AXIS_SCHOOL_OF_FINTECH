package assignments.day6;
abstract class PrepaidCard{
	int cardNo;
	double availableBalance;
	double swipeLimit;
	abstract boolean swipeCard(int amount);
	public PrepaidCard() {}
	public PrepaidCard(int cardNo,double availableBalance,double swipeLimit) { 
	this.cardNo=cardNo;
	this.availableBalance=availableBalance;
	this.swipeLimit=swipeLimit;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public double getSwipeLimit() {
		return swipeLimit;
	}
	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}
	void rechargeCard(int amount) {
		this.setAvailableBalance(getAvailableBalance()+amount);
	}
	@Override
	public String toString() {
		return "Card No:"+this.cardNo+"\nAvailable Balance:"+this.availableBalance+"\nSwipe Limit:"+this.swipeLimit;	
	}
}
class TravelCard extends PrepaidCard{
	private int rewardPoints;
	TravelCard(int cardNo,double availableBalance,double swipeLimit,int rewardPoints){
	super(cardNo,availableBalance,swipeLimit);
	this.rewardPoints=rewardPoints;
	}
	public void CalcRewardPoints(double amount) {
		int points=(int) amount/100;
		setRewardPoints(points);
	}
	
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	@Override
	public boolean swipeCard(int amount) {
		amount=amount*60;
		if(amount<=super.getSwipeLimit() && amount<=super.getAvailableBalance()) {
			setAvailableBalance(getAvailableBalance() - amount-(0.05*amount));
			return true;
		}
		return false;
	}
}
public class InheritanceAbstraction3 {

	public static void main(String[] args) {
		TravelCard card=new TravelCard(1001,120000.00,10000,0);
		System.out.println("Card Details :" + card);
		System.out.println("Reward Points :" +card.getRewardPoints());
		card.rechargeCard(5000);
		if(card.swipeCard(500)) {
			System.out.println("Swipe Successfull");
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
		System.out.println("Card Details:"+card);
		System.out.println("Reward Points:"+card.getRewardPoints());	
	}

}
