import java.awt.image.BufferedImage;
import java.io.*;

public class Eval {

    private Screenshot scr;
    private Display disp;

    public Eval() {
        scr = new Screenshot();
        disp = new Display();
    }

    public String eval(ArrayStack<BufferedImage> st, Instruction instr) {
        String evaled = "";
        switch(instr) {
        case POP:
            try {
                // display image
                disp.displayImage(st.pop());
                evaled =  "POPPED";
            }
            catch(IOException e) { 
            }
            break;

        case PUSH:
            try{
                // take screenshot and add it to stack
                st.push(scr.take());
                evaled =  "PUSHED";
            }
            catch(Exception e){}
            break;

        case TOP:
            try{
                disp.displayImage(st.top());
                evaled = "TOPPED";
            }
            catch(IOException e){}
            break;

        case SIZE:
            evaled = String.valueOf(st.size());
            break;

        case UNKNOWN:
            evaled = "Unknown instruction";
            break;

        case QUIT:
            System.exit(0);
            break;
        }

        return evaled;
    }

}
