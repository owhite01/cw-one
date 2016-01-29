package sml;


public class OutInstruction extends Instruction{

    private int op1;

    public OutInstruction(String label, String op) {
        super(label, op);
    }


    @Override
    public void execute(Machine m){


    }

    @Override
    public String toString() {
        return super.toString() + op1;


    }



}
