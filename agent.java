import java.lang.Math;

public class agent {
    private double RiskAversion;
    private int Endowment;
    private String name;

    // agents can hold notes
    ArrayList<note> wallet = new ArrayList<note>();


    public double revealRisk() {
        return(RiskAversion);
    }

    public int revealEndowment() {
        return(Endowment);
    }

    public void changeEndowment(int newEndow) {
        Endowment=newEndow;
    }

    public void setRisk(double risk) {
        RiskAversion=risk;
    }

    public void setName(String nomen) {
        name=nomen;
    }

    public String getName() {
        return(name);
    }

    public double utility(int consumption) {
      if( RiskAversion==1.0) {return(Math.log(consumption));}
      else {return((Math.pow(consumption,1-RiskAversion))/(1-RiskAversion));}
    }

    

}
