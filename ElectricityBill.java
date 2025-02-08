package electricity;

import java.util.*;
class Electricity {
	int customerID;
	String consumerNAME;
	int MobileNumber;
	int GSTNumber;
	String Address;
	String Zone;
	String Division;
	String ConnectionType;
	int FeederCode;
	double currentReading;
	double previousReading;
	double UnitConsume;
	
	double fixedCharges;
	double EnergyCharges;
	double ElectricityDuty;
	double subsidyAmout;
	double securityDeposit;
	
	Electricity(double fixedCharges,double EnergyCharges,double ElectricityDuty,double securityDeposit,double subsidyAmout){
		this.fixedCharges=fixedCharges;
		this.EnergyCharges=EnergyCharges;
		this.ElectricityDuty=ElectricityDuty;
		this.securityDeposit=securityDeposit;
		this.subsidyAmout=subsidyAmout;
	}
}
class domestic extends Electricity {
	
	
	domestic(int customerID,String consumerNAME,int MobileNumber,String Address,int GSTNumber,String Zone,String Division,String ConnectionType,int FeederCode,double currentReading,double previousReading,double UnitConsume){
		super(fixedCharges,EnergyCharges,ElectricityDuty,securityDeposit,subsidyAmount);
		this.customerID=customerID;
		this.consumerNAME=consumerNAME;
		this.MobileNumber=MobileNumber;
		this.Address=Address;
		this.GSTNumber=GSTNumber;
		this.Zone=Zone;             
		this.Division=Division;
		this.ConnectionType=ConnectionType;
		this.FeederCode=FeederCode;
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.UnitConsume=UnitConsume;
		
		
	}
}
class commercial extends Electricity {
	commercial(int customerID,String consumerNAME,int MobileNumber,String Address,int GSTNumber,String Zone,String Division,String ConnectionType,int FeederCode,double currentReading,double previousReading,double UnitConsume){
		this.customerID=customerID;
		this.consumerNAME=consumerNAME;
		this.MobileNumber=MobileNumber;
		this.Address=Address;
		this.GSTNumber=GSTNumber;
		this.Zone=Zone;
		this.Division=Zone;
		this.ConnectionType=ConnectionType;
		this.FeederCode=FeederCode;
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.UnitConsume=UnitConsume;
	}
}
public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("--------------------Electricity Bill--------------------");
		System.out.println("choose your type >>> 1. Domestic   2. Commercial");
		int choose = sc.nextInt();
		
		if(choose==1) {
			int customerID;
			String consumerNAME;
			int MobileNumber;
			String Address;
			int GSTNumber;
			String Zone;
			String Division;
			String ConnectionType;
			int FeederCode;
			double currentReading;
			double previousReading;
			double UnitConsume;
			Electricity obj = new domestic(customerID,consumerNAME,MobileNumber,Address,GSTNumber,Zone,Division,ConnectionType,FeederCode,currentReading,previousReading,UnitConsume);
		}
		else if(choose==2) {
			Electricity obj = new commercial(customerID,consumerNAME,MobileNumber,Address,GSTNumber,Zone,Division,ConnectionType,FeederCode,currentReading,previousReading,UnitConsume);
		}
	}

}
