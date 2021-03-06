package entity;

public class Fleet extends Ownable {
	private int rent_1 = 500;
	private int rent_2 = 1000;
	private int rent_3 = 2000;
	private int rent_4 = 4000;
	
	public Fleet() {
		super();
	}
	public Fleet(String name, int price) {
		super(name, price);
	}
	
	@Override
	public int getRent() {
		if (owner.getFleetammount() == 1)
			return rent_1;
		else if (owner.getFleetammount() == 2)
			return rent_2;
		else if (owner.getFleetammount() == 3)
			return rent_3;
		else if (owner.getFleetammount() == 4)
			return rent_4; 
		else
			return 0;
	}
	@Override
	public void buyField(Player player) {
			owner = player;
			owner.addBalance(-price);
			isowned = true;
			owner.addFleet();
	}
	@Override
	public void landOnField(Player player) {
		if (isowned == true) {
			player.addBalance(-getRent());
			if (owner.getAlive() == true)
				owner.addBalance(getRent());
		}
		else if (buyit){
			buyField(player);
			buyit = false;
		}
	}
	
	public int getRent_1() {
		return rent_1;
	}
	public void setRent_1(int rent_1) {
		this.rent_1 = rent_1;
	}
	public int getRent_2() {
		return rent_2;
	}
	public void setRent_2(int rent_2) {
		this.rent_2 = rent_2;
	}
	public int getRent_3() {
		return rent_3;
	}
	public void setRent_3(int rent_3) {
		this.rent_3 = rent_3;
	}
	public int getRent_4() {
		return rent_4;
	}
	public void setRent_4(int rent_4) {
		this.rent_4 = rent_4;
	}
	@Override
	public String toString() {
		return name+": Type[Fleet] [rent_1=" + rent_1 + ", rent_2=" + rent_2 + ", rent_3="
				+ rent_3 + ", rent_4=" + rent_4 + "]";
	}
}
