import java.util.*;

public class Parser {

    public Parser() {}

    public Instruction Parse(String line) {
        // split the string using white spaces
        // read the first part
        //    : if not a recognized stack operation nor quit
        //          parse error
        //    : else
        //          add to the instruction object
        //

        // split the line and pick first string
        String part = line.split(" ")[0];
        Instruction instr = Instruction.UNKNOWN;

        switch(part.toLowerCase()) {
        case "push":
            instr= Instruction.PUSH;
	    break;
        case "pop":
            instr = Instruction.POP;
       	    break;
	case "top":
            instr = Instruction.TOP;
	    break;
        case "size":
            instr =  Instruction.SIZE;
	    break;
        case "quit":
            instr = Instruction.QUIT;
	    break;
        }
        return instr;

    }

}
