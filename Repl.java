import java.awt.image.BufferedImage;
import java.util.Scanner;

public class Repl {


    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        Run(in);
    }

     public static void Run(Scanner in) {
         ArrayStack st = new ArrayStack<BufferedImage>();
         Parser p = new Parser();
         Eval e = new Eval();
         System.out.println("> ");
         while(true) {
             while (in.hasNext()) {
                 String input  = in.next();
                 Instruction instr = p.Parse(input);
                 String evaluated = e.eval(st, instr);
                 System.out.println(evaluated);
                 }
         }
    }
}
