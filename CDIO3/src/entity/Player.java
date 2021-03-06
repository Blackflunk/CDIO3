package entity;

public class Player {
	
	private String name;
	private Account account;
	private int currentfield = 1;
	private int Fleetammount = 0;
	private boolean isAlive = true;
	
	public Player () {
		name = "ERROR";
		account = new Account();
	}
	public Player(String new_name) {
		this.name = new_name;
		this.account = new Account();
	}
	public void set(int ammount_of_Fleets){
		Fleetammount = ammount_of_Fleets;
	}
	public int getFleetammount() {
		return Fleetammount;
	}
	public void addFleet() {
		Fleetammount++;
	}
		
	public String getName() {
		return name;
	}
	
	public void setName(String new_name) {
		this.name = new_name;
	}
	public void setCurrentfield(int field) {
		currentfield = field;
	}
	public int getCurrentfield() {
		return currentfield;
	}
	public void movePlayer(int move) {
		currentfield = currentfield + move;
		if (currentfield > 22) {
			currentfield = currentfield - 22;
		}
	}
	
	public int getBalance() {
		return account.getBalance();
	}
	
	public void setBalance(int new_balance) {
		account.setBalance(new_balance);
	}
	
	public void addBalance(int add) {
		account.addBalance(add);
	}
	
	public void CheckDeath(){
		if (account.CheckDeath() == true) {
			isAlive = false;
		}
	}
	public boolean getAlive() {
		return isAlive;
	}
	
	public String toString() {
		return ("The player " + name + " has the " + account.toString());
	}

}
