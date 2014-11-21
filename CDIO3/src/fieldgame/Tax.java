package fieldgame;

import boundaryToMatador.GUI;

public class Tax extends Field{
	private int taxAmmount;
	private boolean willing = true;
	
	public Tax() {
		super();
	}
	public Tax(String name, int taxAmmount) {
		super(name);
		this.taxAmmount = taxAmmount;
	}
	public int getTaxAmmount() {
		return taxAmmount;
	}
	public void setTaxAmmount(int taxAmmount) {
		this.taxAmmount = taxAmmount;
	}
	
	public void isUserWilling(){
		this.willing = GUI.getUserLeftButtonPressed("Vil du betale 10% af din pengebeholdning, eller 4000?", "10%", "4000");
	}
	
	@Override
	public void landOnField(Player player) {
		if (getName()=="Goldmine"){
					player.addBalance(-taxAmmount);
		}
		else {
			isUserWilling();
			if (willing == true){
			int i = player.getBalance() / 10;
			player.addBalance(-i);
			}else
			player.addBalance(-taxAmmount);
			}
		}
		
	@Override
	public int getRent() {
		return 0;
	}
	@Override
	public String toString() {
		return name+": Type[Tax] [taxAmmount=" + taxAmmount + "]";
	}
	
	

}