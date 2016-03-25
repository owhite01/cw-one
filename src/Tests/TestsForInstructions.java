package Tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import sml.*;


public class TestsForInstructions {
    private Machine m;
    private Registers r;



    @Before
    public void initialise(){
        m = new Machine();
        m.setPc(0);
        r = new Registers();
        m.setRegisters(r);

    }



    @Test
    public void testToEnsureAddInstructionWorks() {
        Instruction storeIntsInRegisters1 = new LinInstruction("f0", 4, 6);
        storeIntsInRegisters1.execute(m);
        Instruction storeIntsInRegisters2 = new LinInstruction("f1", 5, 2);
        storeIntsInRegisters2.execute(m);

        assertEquals(m.getRegisters().getRegister(4), 6);
        assertEquals(m.getRegisters().getRegister(5), 2);

        Instruction addInstruction1 = new AddInstruction("f2", 4, 4, 5);
        addInstruction1.execute(m);
        assertEquals(m.getRegisters().getRegister(4), 8);

    }

    @Test
    public void testToEnsureMulInstructionWorks() {
        Instruction storeIntsInRegisters3 = new LinInstruction("f0", 3, 2);
        storeIntsInRegisters3.execute(m);
        Instruction storeIntsInRegisters4 = new LinInstruction("f1", 5, 7);
        storeIntsInRegisters4.execute(m);

        assertEquals(m.getRegisters().getRegister(3), 2);
        assertEquals(m.getRegisters().getRegister(5), 7);

        Instruction mulInstruction1 = new MulInstruction("f2", 3, 3, 5);
        mulInstruction1.execute(m);
        assertEquals(m.getRegisters().getRegister(3), 14);

    }

    @Test
    public void testToEnsureMDivInstructionWorks() {
        Instruction storeIntsInRegisters5 = new LinInstruction("f0", 12, 18);
        storeIntsInRegisters5.execute(m);
        Instruction storeIntsInRegisters6 = new LinInstruction("f1", 10, 6);
        storeIntsInRegisters6.execute(m);

        assertEquals(m.getRegisters().getRegister(12), 18);
        assertEquals(m.getRegisters().getRegister(10), 6);

        Instruction DivInstruction1 = new DivInstruction("f2", 12, 12, 10);
        DivInstruction1.execute(m);
        assertEquals(m.getRegisters().getRegister(12), 3);

    }



}


