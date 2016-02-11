package sml;

/**
 * This class ....
 *
 * @author Oliver White
 */

public class AddInstruction extends Instruction {

    private int result;
    private int op1;
    private int op2;

    public AddInstruction(String label, String op) {
        super(label, op);
    }

    public AddInstruction(String label, int result, int op1, int op2) {
        this(label, "add");
        this.result = result;
        this.op1 = op1;
        this.op2 = op2;
    }

    // Retrieve what is stored in the register and store them in value
    //1 and 2, and then save the result in the result register.
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        int value2 = m.getRegisters().getRegister(op2);
        m.getRegisters().setRegister(result, value1 + value2);
    }

    @Override
    public String toString() {
        return super.toString() + " " + op1 + " + " + op2 + " to " + result;
    }
}
