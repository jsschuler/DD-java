import java.io.*;
import java.util.*;


public class model {
// set base parameters
// bounds of coefficient of relative risk aversion
double riskLo = .75;
double riskHi = 1.0;
// bounds on endowments
int endowLo =  25;
int endowHi =  500;
// how many agents?
int agentCnt=100;
// What percentage of agents have to cash out in period 1?
double pct = .1;
// For now, we assume runs are exogenous, what is the probability of a run?
double runProb=.1;


  // We need a random generator function
   double dRandomWithRange(double min, double max){
   double range = (max - min);
   //System.out.println(range);
   //System.out.println(Math.random());
   //System.out.println(Math.random() * range + min);
   return (double)(Math.random() * range) + min;
}

int iRandomWithRange(int min, int max){
   int range = (max - min) + 1;
   return (int)(Math.random() * range) + min;
}

    // Set list of all agents
    ArrayList<agent> agtList = new ArrayList<agent>();
    ArrayList<agent> withdrawList = new ArrayList<agent>();
    ArrayList<agent> saveList = new ArrayList<agent>();


    public void agentGen(double risk, int endowment, String name) {

        agent agt= new agent();
        agt.changeEndowment(endowment);
        agt.setRisk(risk);
        agt.setName(name);
        agtList.add(agt);
    }

    public void randomAgentGen(String name) {

      agentGen(dRandomWithRange(riskLo,riskHi),iRandomWithRange(endowLo,endowHi),name);
    }


    public void setUp() {
        // Set up the model
        // generate the agents
        for (int i = 0; i < agentCnt; i++) {
          randomAgentGen("agent " + String.valueOf(i));
        }
    }

public void marketClear() {
  // Now, the agents determine what the agreed upon pay out is


}

public void modelRealization(seed) {
// Generate a model realization deterministic from a seed

}


}
