package electricity;
import java.time.LocalDate;
import java.util.*;
class Electricity {
	long customerID;
	String consumerNAME;
	long MobileNumber;
	int GSTNumber;
	String Address;
	String Zone;
	String Division;
	String ConnectionType;
	long FeederCode;
	double currentReading;
	double previousReading;
	double UnitConsume;
	
	// double fixedCharges;
	// double EnergyCharges;
	// double ElectricityDuty;
	// double subsidyAmout;
	// double securityDeposit;
	
	// Electricity(double fixedCharges,double EnergyCharges,double ElectricityDuty,double securityDeposit,double subsidyAmout){
	// 	this.fixedCharges=fixedCharges;
	// 	this.EnergyCharges=EnergyCharges;
	// 	this.ElectricityDuty=ElectricityDuty;
	// 	this.securityDeposit=securityDeposit;
	// 	this.subsidyAmout=subsidyAmout;
	// }
    // public String toString(){
    //     return consumerNAME+":"+Total;
    // }
}
class domestic extends Electricity {
	
	//double netReading;
	domestic(String consumerNAME,long MobileNumber,String Address,String Zone,String Division,double currentReading,double previousReading,double UnitConsume){
		//super(fixedCharges,EnergyCharges,ElectricityDuty,securityDeposit,subsidyAmount);
		this.customerID=customerID;
		this.consumerNAME=consumerNAME;
		this.MobileNumber=MobileNumber;
		this.Address=Address;
		//this.GSTNumber=GSTNumber;
		this.Zone=Zone;             
		this.Division=Division;
		//this.ConnectionType=ConnectionType;
		//this.FeederCode=FeederCode;
		this.currentReading=currentReading;
		this.previousReading=previousReading;
		this.UnitConsume=UnitConsume;
		
		
	}
    public double getNetReading(){
        double netReading =currentReading-previousReading;
        return netReading;
    }
    public double getBaseBillAmount(){
        return getNetReading()*UnitConsume;
    }
    public int getGstNumber(){
        GSTNumber = (int) (Math.random()*(10000000))+1000000;
        return GSTNumber;
    }
     public long getFeederCode(){
        FeederCode = (int) (Math.random()*(1000000000))+90000000;
        return FeederCode;
    }
    public long getConsumerId(){
        customerID = (int) (Math.random()*(1000000))+100000;
        return customerID;
    }
    public void GETGenrateBIll(){
        LocalDate dtf = LocalDate.now();
        System.out.println("____________________________Genrating BILL, wait for minute____________________________");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("                                   @ Electricity Bill                                  ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("              Madhya Pradesh Paschim kshetra Vidyut Vitran Company Ltd                 ");
        System.out.println("                     G.P.H. compound,pologround,Indore(M.P.)                           ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println(" GST No."+getGstNumber()+"                                     Call Centre No. 1912    ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("   Date : "+dtf+"                                                                      ");
        System.out.println("_______________________________________________________________________________________");
        System.out.println("Consumer Number : "+getConsumerId()+"                  Connection Type : "+Domestic+"  ");
        System.out.println("Consumer Name : "+consumerNAME+"                          DC/Zone : "+Zone+"           ");
        System.out.println("Address : "+Address+"                                     Division : "+Division+"      ");
        System.out.println("Mobile Num. : "+MobileNumber+"                         Feeder Code : "+getFeederCode()+"  ");
        System.out.println("_______________________________________________________________________________________");
    }
    }
class commercial extends Electricity {
	commercial(String consumerNAME,long MobileNumber,String Address,String Zone,String Division,double currentReading,double previousReading,double UnitConsume){
		//this.customerID=customerID;
		this.consumerNAME=consumerNAME;
		this.MobileNumber=MobileNumber;
		this.Address=Address;
//		this.GSTNumber=GSTNumber;
		this.Zone=Zone;
		this.Division=Zone;
//		this.ConnectionType=ConnectionType;
//		this.FeederCode=FeederCode;
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
		String choose = sc.nextLine();
		
		if(choose.equals("Domestic")) {
            
			//int customerID;
			System.out.println("Enter Consumer Name >>>> ");
            String consumerNAME = sc.nextLine();
            System.out.println("Enter Consumer Mo. Number >>>> ");
			long MobileNumber = Long.parseLong(sc.nextLine());
            System.out.println("Enter Consumer Address >>>> ");
			String Address= sc.nextLine();
			// int GSTNumber;
            System.out.println("Enter Consumer Zone : ");
			String Zone = sc.nextLine();
            System.out.println("Enter Consumer Division : ");
			String Division = sc.nextLine();

			String ConnectionType=choose;
			// int FeederCode;
            System.out.println("Enter Previous Reading : ");
			double previousReading = sc.nextDouble();
            System.out.println("Enter Current Reading : ");
			double currentReading= sc.nextDouble();
            System.out.println("Enter Unit : ");
			double UnitConsume= sc.nextDouble();
			domestic obj = new domestic(consumerNAME,MobileNumber,Address,Zone,Division,previousReading,currentReading,UnitConsume);
            obj.GETGenrateBIll();
        }



		else if(choose.equals("Commercial")) {
            //int customerID;
			System.out.println("Enter Consumer Name >>>> ");
            String consumerNAME = sc.nextLine();
            System.out.println("Enter Consumer Mo. Number >>>> ");
			long MobileNumber = Long.parseLong(sc.nextLine());
            System.out.println("Enter Consumer Address >>>> ");
			String Address= sc.nextLine();
			
            System.out.println("Enter Consumer Zone : ");
			String Zone = sc.nextLine();
            System.out.println("Enter Consumer Division : ");
			String Division = sc.nextLine();

			String ConnectionType=choose;
			// int FeederCode;
            System.out.println("Enter Previous Reading : ");
			double previousReading = sc.nextDouble();
            System.out.println("Enter Current Reading : ");
			double currentReading= sc.nextDouble();
            System.out.println("Enter Unit : ");
			double UnitConsume= sc.nextDouble();
			Electricity obj = new commercial(consumerNAME,MobileNumber,Address,Zone,Division,previousReading,currentReading,UnitConsume);
		}
	}

}
