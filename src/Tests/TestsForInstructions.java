package Tests;
import org.junit.Before;
import org.junit.After;
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
        Instruction LinIns0 = new LinInstruction("f0", 4, 6);
        LinIns0.execute(m);
        Instruction LinIns1 = new LinInstruction("f1", 5, 2);
        LinIns1.execute(m);

        assertEquals(m.getRegisters().getRegister(4), 6);
        assertEquals(m.getRegisters().getRegister(5), 2);

        Instruction addIns = new AddInstruction("f2", 4, 4, 5);
        addIns.execute(m);
        assertEquals(m.getRegisters().getRegister(4), 8);



    }



}


