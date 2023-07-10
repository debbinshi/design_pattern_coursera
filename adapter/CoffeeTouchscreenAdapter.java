public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

  private OldCoffeeMachine OldVendingMachine;

	public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
		OldVendingMachine = newMachine;
	}

  public void chooseFirstSelection() {
    OldVendingMachine.selectA();
  }

  public void chooseSecondSelection() {
    OldVendingMachine.selectB();
  }
}