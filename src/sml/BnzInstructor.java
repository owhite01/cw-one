package sml;

public class BnzInstructor extends Instruction {

    //Only need one register of S1 in the class
    private int op1;
    private String nextLabel;


    public BnzInstructor(String label, String op) {
        super(label, op);
    }

    //Use correct label, in this case 'bnz'
    public BnzInstructor(String label, int op1, String nextLabel) {
        this(label, "bnz");
        this.op1 = op1;
        this.nextLabel = nextLabel;
    }


    //Should check if the contents of register S1 (op1) is not 0. Not sure
    //what it should then do.
    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(op1) != 0){
            m.setPc(m.getLabels().indexOf(nextLabel));
        }

    }

    @Override
    public String toString() {
        return super.toString() + op1 + nextLabel;
    }
}
