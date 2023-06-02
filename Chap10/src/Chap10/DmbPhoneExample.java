package Chap10;

public class DmbPhoneExample {

	public static void main(String[] args) {
		
		DmbCellphone dmbCellPhone=new DmbCellphone("java phone", "black",10);
		
		System.out.println("model : "+dmbCellPhone.model);
		System.out.println("color : "+dmbCellPhone.color);
		
		System.out.println("channel : "+dmbCellPhone.channel);
		
		dmbCellPhone.poweron();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("hello");
		dmbCellPhone.receiVoice("helloz1 i`m gildong");
		dmbCellPhone.sendVoice("nice to meet you");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
