public class bank {
// This agent is the bank
// it has assets and liabilities
ArrayList<agent> depositors = new ArrayList<agent>();
ArrayList<agent> deposits = new ArrayList<agent>();

public int calculateAssets(){
  // sum all deposits
}

public void withdraw(note withdrawNote) {
// withdraw from bank

}

public void deposit(agent agt, int qty) {
  // make a deposit
}

public note issue(int qty) {
  note issueNote = new note();
  issueNote.faceValue = qty;
  issueNote.redemptionTick = 1;

  return(issueNote);
}



}
