package sml;

public class BnzInstructor extends Instruction {

    //Only need one register of S1 in the class
    private int op1;

    public BnzInstructor(String label, String op) {
        super(label, op);
    }

    //Use correct label, in this case 'bnz'
    public BnzInstructor(String label, int op1) {
        this(label, "bnz");
        this.op1 = op1;
    }


    //Should check if the contents of register S1 (op1) is not 0. Not sure
    //what it should then do.
    @Override
    public void execute(Machine m) {
        if (m.getRegisters().getRegister(op1) != 0){
            //make the statement labeled L2 the next one to execute??

        }

    }

    @Override
    public String toString() {
        return null;
    }
}
