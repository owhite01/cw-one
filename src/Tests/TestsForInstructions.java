package Tests;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import sml.*;


public class TestsForInstructions {

    Machine m = new Machine();

    @Before
    public void initialise(){
        m.setPc(0);
        m.setRegisters(new Registers());

    }


    @Test
    public void testToEnsureAddInstructionWorks() {
        Instruction instructionLin = new LinInstruction("f0", 1, 5);
        instructionLin.execute(m);

        assertEquals(m.getRegisters().getRegister(1), 5);
        assertEquals(m.getRegisters().getRegister(2), -1);

    }



}


