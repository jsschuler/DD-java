public class modelRun {


  public static void main(String[] args) {
    // set up model

    model modelBase = new model();
    modelBase.setUp();

    for (int i = 0; i < modelBase.agentCnt; i++) {
      System.out.println(modelBase.agtList.get(i).getName());

    }


  }
}
