
public class DemoOverriding{
	int getRateOfInterest() {
		return 0;
	}
}
class SBI extends DemoOverriding{
    int getRateOfInterest(){
        return 8;
    }
}
class ICICI extends DemoOverriding{
    int getRateOfInterest(){
        return 7;
    }
}
class Axis extends DemoOverriding{
    int getRateOfInterest(){
        return 9;
    }
}
class Test2{
    public static void main(String args[]){
        SBI s=new SBI();
        Axis a=new Axis();
        ICICI i=new ICICI();
        System.out.println("SBI Rate of Interest : "+s.getRateOfInterest());
        System.out.println("Axis Rate of Interest : "+a.getRateOfInterest());
        System.out.println("ICICI Rate of Interest : "+i.getRateOfInterest());
    }
}