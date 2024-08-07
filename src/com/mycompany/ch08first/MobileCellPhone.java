package com.mycompany.ch08first;

public class MobileCellPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOn();
		
		dmbCellPhone.changeChannelDmb(4);
		
	}

}
