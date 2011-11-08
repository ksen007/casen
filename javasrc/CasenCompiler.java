import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.io.*;


public class CasenCompiler {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = null;
        if (args.length == 0){
            input = new ANTLRInputStream(System.in);
        } else {
            FileInputStream fstream = new FileInputStream(args[0]);
            DataInputStream in = new DataInputStream(fstream);
            BufferedInputStream br = new BufferedInputStream(in);
            input = new ANTLRInputStream(br);
        }
        CasenLexer lexer = new CasenLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CasenParser parser = new CasenParser(tokens);
        CasenParser.program_return r = parser.program();
        CommonTree t = (CommonTree)r.getTree();
        System.out.println(t.toStringTree());
    }
}
