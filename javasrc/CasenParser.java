// $ANTLR 3.4 Casen.g 2011-09-26 09:26:39

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class CasenParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APPLY", "ARG", "CONTEXT", "DECIMAL_LITERAL", "DEF", "EscapeSequence", "Exponent", "FCONST", "FUN", "HEX_LITERAL", "HexDigit", "ICONST", "ID", "IFGOTO", "LBRACE", "LETTER", "LID", "LINE_COMMENT", "LSTMT", "NL", "OCTAL_LITERAL", "OctalEscape", "PARAM", "RBRACE", "RESUME", "RETURN", "SCONST", "SYMBOL", "UnicodeEscape", "WS", "YIELD", "'!'", "'!='", "'%'", "'%='", "'&&'", "'&'", "'&='", "'('", "')'", "'*'", "'*='", "'+'", "'+='", "','", "'-'", "'-='", "'.'", "'/'", "'/='", "':'", "'<'", "'<<'", "'<<='", "'<='", "'='", "'=='", "'>'", "'>='", "'>>'", "'>>='", "'GOTO'", "'IF'", "'['", "'[['", "']'", "']]'", "'^'", "'^='", "'def'", "'resume'", "'return'", "'yield'", "'|'", "'|='", "'||'", "'~'"
    };

    public static final int EOF=-1;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int APPLY=4;
    public static final int ARG=5;
    public static final int CONTEXT=6;
    public static final int DECIMAL_LITERAL=7;
    public static final int DEF=8;
    public static final int EscapeSequence=9;
    public static final int Exponent=10;
    public static final int FCONST=11;
    public static final int FUN=12;
    public static final int HEX_LITERAL=13;
    public static final int HexDigit=14;
    public static final int ICONST=15;
    public static final int ID=16;
    public static final int IFGOTO=17;
    public static final int LBRACE=18;
    public static final int LETTER=19;
    public static final int LID=20;
    public static final int LINE_COMMENT=21;
    public static final int LSTMT=22;
    public static final int NL=23;
    public static final int OCTAL_LITERAL=24;
    public static final int OctalEscape=25;
    public static final int PARAM=26;
    public static final int RBRACE=27;
    public static final int RESUME=28;
    public static final int RETURN=29;
    public static final int SCONST=30;
    public static final int SYMBOL=31;
    public static final int UnicodeEscape=32;
    public static final int WS=33;
    public static final int YIELD=34;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CasenParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CasenParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return CasenParser.tokenNames; }
    public String getGrammarFileName() { return "Casen.g"; }


    public static class program_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // Casen.g:23:1: program : ( NL )? ( stmt_list )? -> ( stmt_list )? ;
    public final CasenParser.program_return program() throws RecognitionException {
        CasenParser.program_return retval = new CasenParser.program_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL1=null;
        CasenParser.stmt_list_return stmt_list2 =null;


        CommonTree NL1_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        try {
            // Casen.g:24:5: ( ( NL )? ( stmt_list )? -> ( stmt_list )? )
            // Casen.g:24:11: ( NL )? ( stmt_list )?
            {
            // Casen.g:24:11: ( NL )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==NL) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Casen.g:24:11: NL
                    {
                    NL1=(Token)match(input,NL,FOLLOW_NL_in_program132);  
                    stream_NL.add(NL1);


                    }
                    break;

            }


            // Casen.g:24:15: ( stmt_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FCONST||(LA2_0 >= ICONST && LA2_0 <= ID)||LA2_0==LBRACE||LA2_0==LID||LA2_0==SCONST||LA2_0==35||LA2_0==42||LA2_0==49||LA2_0==66||(LA2_0 >= 73 && LA2_0 <= 76)||LA2_0==80) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // Casen.g:24:15: stmt_list
                    {
                    pushFollow(FOLLOW_stmt_list_in_program135);
                    stmt_list2=stmt_list();

                    state._fsp--;

                    stream_stmt_list.add(stmt_list2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: stmt_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 24:26: -> ( stmt_list )?
            {
                // Casen.g:24:29: ( stmt_list )?
                if ( stream_stmt_list.hasNext() ) {
                    adaptor.addChild(root_0, stream_stmt_list.nextTree());

                }
                stream_stmt_list.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class stmt_list_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt_list"
    // Casen.g:27:1: stmt_list : labeled_stmt ( NL labeled_stmt )* ( NL )? -> ( labeled_stmt )+ ;
    public final CasenParser.stmt_list_return stmt_list() throws RecognitionException {
        CasenParser.stmt_list_return retval = new CasenParser.stmt_list_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token NL6=null;
        CasenParser.labeled_stmt_return labeled_stmt3 =null;

        CasenParser.labeled_stmt_return labeled_stmt5 =null;


        CommonTree NL4_tree=null;
        CommonTree NL6_tree=null;
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_labeled_stmt=new RewriteRuleSubtreeStream(adaptor,"rule labeled_stmt");
        try {
            // Casen.g:28:5: ( labeled_stmt ( NL labeled_stmt )* ( NL )? -> ( labeled_stmt )+ )
            // Casen.g:28:11: labeled_stmt ( NL labeled_stmt )* ( NL )?
            {
            pushFollow(FOLLOW_labeled_stmt_in_stmt_list167);
            labeled_stmt3=labeled_stmt();

            state._fsp--;

            stream_labeled_stmt.add(labeled_stmt3.getTree());

            // Casen.g:28:24: ( NL labeled_stmt )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==NL) ) {
                    int LA3_1 = input.LA(2);

                    if ( (LA3_1==FCONST||(LA3_1 >= ICONST && LA3_1 <= ID)||LA3_1==LBRACE||LA3_1==LID||LA3_1==SCONST||LA3_1==35||LA3_1==42||LA3_1==49||LA3_1==66||(LA3_1 >= 73 && LA3_1 <= 76)||LA3_1==80) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // Casen.g:28:25: NL labeled_stmt
            	    {
            	    NL4=(Token)match(input,NL,FOLLOW_NL_in_stmt_list170);  
            	    stream_NL.add(NL4);


            	    pushFollow(FOLLOW_labeled_stmt_in_stmt_list172);
            	    labeled_stmt5=labeled_stmt();

            	    state._fsp--;

            	    stream_labeled_stmt.add(labeled_stmt5.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // Casen.g:28:44: ( NL )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==NL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Casen.g:28:44: NL
                    {
                    NL6=(Token)match(input,NL,FOLLOW_NL_in_stmt_list177);  
                    stream_NL.add(NL6);


                    }
                    break;

            }


            // AST REWRITE
            // elements: labeled_stmt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 28:48: -> ( labeled_stmt )+
            {
                if ( !(stream_labeled_stmt.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_labeled_stmt.hasNext() ) {
                    adaptor.addChild(root_0, stream_labeled_stmt.nextTree());

                }
                stream_labeled_stmt.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt_list"


    public static class labeled_stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "labeled_stmt"
    // Casen.g:31:1: labeled_stmt : ( ID ':' stmt -> ^( LSTMT ID stmt ) | stmt );
    public final CasenParser.labeled_stmt_return labeled_stmt() throws RecognitionException {
        CasenParser.labeled_stmt_return retval = new CasenParser.labeled_stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID7=null;
        Token char_literal8=null;
        CasenParser.stmt_return stmt9 =null;

        CasenParser.stmt_return stmt10 =null;


        CommonTree ID7_tree=null;
        CommonTree char_literal8_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_stmt=new RewriteRuleSubtreeStream(adaptor,"rule stmt");
        try {
            // Casen.g:32:5: ( ID ':' stmt -> ^( LSTMT ID stmt ) | stmt )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==54) ) {
                    alt5=1;
                }
                else if ( (LA5_1==EOF||LA5_1==FCONST||(LA5_1 >= ICONST && LA5_1 <= ID)||LA5_1==LBRACE||LA5_1==LID||LA5_1==NL||LA5_1==RBRACE||LA5_1==SCONST||(LA5_1 >= 36 && LA5_1 <= 42)||(LA5_1 >= 44 && LA5_1 <= 47)||(LA5_1 >= 49 && LA5_1 <= 53)||(LA5_1 >= 55 && LA5_1 <= 64)||(LA5_1 >= 67 && LA5_1 <= 68)||(LA5_1 >= 71 && LA5_1 <= 73)||(LA5_1 >= 77 && LA5_1 <= 79)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA5_0==FCONST||LA5_0==ICONST||LA5_0==LBRACE||LA5_0==LID||LA5_0==SCONST||LA5_0==35||LA5_0==42||LA5_0==49||LA5_0==66||(LA5_0 >= 73 && LA5_0 <= 76)||LA5_0==80) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Casen.g:32:11: ID ':' stmt
                    {
                    ID7=(Token)match(input,ID,FOLLOW_ID_in_labeled_stmt206);  
                    stream_ID.add(ID7);


                    char_literal8=(Token)match(input,54,FOLLOW_54_in_labeled_stmt208);  
                    stream_54.add(char_literal8);


                    pushFollow(FOLLOW_stmt_in_labeled_stmt210);
                    stmt9=stmt();

                    state._fsp--;

                    stream_stmt.add(stmt9.getTree());

                    // AST REWRITE
                    // elements: stmt, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 32:23: -> ^( LSTMT ID stmt )
                    {
                        // Casen.g:32:26: ^( LSTMT ID stmt )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(LSTMT, "LSTMT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_stmt.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // Casen.g:33:10: stmt
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_stmt_in_labeled_stmt231);
                    stmt10=stmt();

                    state._fsp--;

                    adaptor.addChild(root_0, stmt10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "labeled_stmt"


    public static class stmt_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stmt"
    // Casen.g:36:1: stmt : ( expr | 'return' expr -> ^( RETURN expr ) | 'return' -> RETURN | 'IF' '(' expr ')' 'GOTO' ID -> ^( IFGOTO expr ID ) | 'yield' expr -> ^( YIELD expr ) | 'resume' expr -> ^( RESUME expr ) );
    public final CasenParser.stmt_return stmt() throws RecognitionException {
        CasenParser.stmt_return retval = new CasenParser.stmt_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal12=null;
        Token string_literal14=null;
        Token string_literal15=null;
        Token char_literal16=null;
        Token char_literal18=null;
        Token string_literal19=null;
        Token ID20=null;
        Token string_literal21=null;
        Token string_literal23=null;
        CasenParser.expr_return expr11 =null;

        CasenParser.expr_return expr13 =null;

        CasenParser.expr_return expr17 =null;

        CasenParser.expr_return expr22 =null;

        CasenParser.expr_return expr24 =null;


        CommonTree string_literal12_tree=null;
        CommonTree string_literal14_tree=null;
        CommonTree string_literal15_tree=null;
        CommonTree char_literal16_tree=null;
        CommonTree char_literal18_tree=null;
        CommonTree string_literal19_tree=null;
        CommonTree ID20_tree=null;
        CommonTree string_literal21_tree=null;
        CommonTree string_literal23_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Casen.g:37:5: ( expr | 'return' expr -> ^( RETURN expr ) | 'return' -> RETURN | 'IF' '(' expr ')' 'GOTO' ID -> ^( IFGOTO expr ID ) | 'yield' expr -> ^( YIELD expr ) | 'resume' expr -> ^( RESUME expr ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case FCONST:
            case ICONST:
            case ID:
            case LBRACE:
            case LID:
            case SCONST:
            case 35:
            case 42:
            case 49:
            case 73:
            case 80:
                {
                alt6=1;
                }
                break;
            case 75:
                {
                int LA6_12 = input.LA(2);

                if ( (LA6_12==FCONST||(LA6_12 >= ICONST && LA6_12 <= ID)||LA6_12==LBRACE||LA6_12==LID||LA6_12==SCONST||LA6_12==35||LA6_12==42||LA6_12==49||LA6_12==73||LA6_12==80) ) {
                    alt6=2;
                }
                else if ( (LA6_12==EOF||LA6_12==NL||LA6_12==RBRACE) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 12, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                alt6=4;
                }
                break;
            case 76:
                {
                alt6=5;
                }
                break;
            case 74:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Casen.g:37:9: expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_expr_in_stmt251);
                    expr11=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr11.getTree());

                    }
                    break;
                case 2 :
                    // Casen.g:38:10: 'return' expr
                    {
                    string_literal12=(Token)match(input,75,FOLLOW_75_in_stmt262);  
                    stream_75.add(string_literal12);


                    pushFollow(FOLLOW_expr_in_stmt264);
                    expr13=expr();

                    state._fsp--;

                    stream_expr.add(expr13.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 38:24: -> ^( RETURN expr )
                    {
                        // Casen.g:38:27: ^( RETURN expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RETURN, "RETURN")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // Casen.g:39:10: 'return'
                    {
                    string_literal14=(Token)match(input,75,FOLLOW_75_in_stmt283);  
                    stream_75.add(string_literal14);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 39:19: -> RETURN
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(RETURN, "RETURN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // Casen.g:40:10: 'IF' '(' expr ')' 'GOTO' ID
                    {
                    string_literal15=(Token)match(input,66,FOLLOW_66_in_stmt298);  
                    stream_66.add(string_literal15);


                    char_literal16=(Token)match(input,42,FOLLOW_42_in_stmt300);  
                    stream_42.add(char_literal16);


                    pushFollow(FOLLOW_expr_in_stmt302);
                    expr17=expr();

                    state._fsp--;

                    stream_expr.add(expr17.getTree());

                    char_literal18=(Token)match(input,43,FOLLOW_43_in_stmt304);  
                    stream_43.add(char_literal18);


                    string_literal19=(Token)match(input,65,FOLLOW_65_in_stmt306);  
                    stream_65.add(string_literal19);


                    ID20=(Token)match(input,ID,FOLLOW_ID_in_stmt308);  
                    stream_ID.add(ID20);


                    // AST REWRITE
                    // elements: expr, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 40:38: -> ^( IFGOTO expr ID )
                    {
                        // Casen.g:40:41: ^( IFGOTO expr ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(IFGOTO, "IFGOTO")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // Casen.g:41:10: 'yield' expr
                    {
                    string_literal21=(Token)match(input,76,FOLLOW_76_in_stmt329);  
                    stream_76.add(string_literal21);


                    pushFollow(FOLLOW_expr_in_stmt331);
                    expr22=expr();

                    state._fsp--;

                    stream_expr.add(expr22.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 41:23: -> ^( YIELD expr )
                    {
                        // Casen.g:41:26: ^( YIELD expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(YIELD, "YIELD")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 6 :
                    // Casen.g:42:9: 'resume' expr
                    {
                    string_literal23=(Token)match(input,74,FOLLOW_74_in_stmt349);  
                    stream_74.add(string_literal23);


                    pushFollow(FOLLOW_expr_in_stmt351);
                    expr24=expr();

                    state._fsp--;

                    stream_expr.add(expr24.getTree());

                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 42:23: -> ^( RESUME expr )
                    {
                        // Casen.g:42:26: ^( RESUME expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(RESUME, "RESUME")
                        , root_1);

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stmt"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // Casen.g:45:1: expr : assign_expr ;
    public final CasenParser.expr_return expr() throws RecognitionException {
        CasenParser.expr_return retval = new CasenParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CasenParser.assign_expr_return assign_expr25 =null;



        try {
            // Casen.g:46:5: ( assign_expr )
            // Casen.g:46:7: assign_expr
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_assign_expr_in_expr377);
            assign_expr25=assign_expr();

            state._fsp--;

            adaptor.addChild(root_0, assign_expr25.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class assign_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assign_expr"
    // Casen.g:49:1: assign_expr : lor_expr ( assignop ^ assign_expr )? ;
    public final CasenParser.assign_expr_return assign_expr() throws RecognitionException {
        CasenParser.assign_expr_return retval = new CasenParser.assign_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CasenParser.lor_expr_return lor_expr26 =null;

        CasenParser.assignop_return assignop27 =null;

        CasenParser.assign_expr_return assign_expr28 =null;



        try {
            // Casen.g:50:5: ( lor_expr ( assignop ^ assign_expr )? )
            // Casen.g:50:10: lor_expr ( assignop ^ assign_expr )?
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_lor_expr_in_assign_expr398);
            lor_expr26=lor_expr();

            state._fsp--;

            adaptor.addChild(root_0, lor_expr26.getTree());

            // Casen.g:50:19: ( assignop ^ assign_expr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==38||LA7_0==41||LA7_0==45||LA7_0==47||LA7_0==50||LA7_0==53||LA7_0==57||LA7_0==59||LA7_0==64||LA7_0==72||LA7_0==78) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Casen.g:50:20: assignop ^ assign_expr
                    {
                    pushFollow(FOLLOW_assignop_in_assign_expr401);
                    assignop27=assignop();

                    state._fsp--;

                    root_0 = (CommonTree)adaptor.becomeRoot(assignop27.getTree(), root_0);

                    pushFollow(FOLLOW_assign_expr_in_assign_expr404);
                    assign_expr28=assign_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_expr28.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assign_expr"


    public static class allops_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "allops"
    // Casen.g:53:1: allops : ( '+' | '-' | '*' | '/' | '%' | '|' | '&' | '~' | '^' | '<<' | '>>' | '||' | '&&' | '!' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' );
    public final CasenParser.allops_return allops() throws RecognitionException {
        CasenParser.allops_return retval = new CasenParser.allops_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set29=null;

        CommonTree set29_tree=null;

        try {
            // Casen.g:54:5: ( '+' | '-' | '*' | '/' | '%' | '|' | '&' | '~' | '^' | '<<' | '>>' | '||' | '&&' | '!' | '<' | '<=' | '>' | '>=' | '==' | '!=' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '^=' | '|=' )
            // Casen.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set29=(Token)input.LT(1);

            if ( (input.LA(1) >= 35 && input.LA(1) <= 41)||(input.LA(1) >= 44 && input.LA(1) <= 47)||(input.LA(1) >= 49 && input.LA(1) <= 50)||(input.LA(1) >= 52 && input.LA(1) <= 53)||(input.LA(1) >= 55 && input.LA(1) <= 64)||(input.LA(1) >= 71 && input.LA(1) <= 72)||(input.LA(1) >= 77 && input.LA(1) <= 80) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set29)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "allops"


    public static class assignop_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignop"
    // Casen.g:87:1: assignop : ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '|=' | '^=' );
    public final CasenParser.assignop_return assignop() throws RecognitionException {
        CasenParser.assignop_return retval = new CasenParser.assignop_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set30=null;

        CommonTree set30_tree=null;

        try {
            // Casen.g:88:5: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '<<=' | '>>=' | '&=' | '|=' | '^=' )
            // Casen.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            set30=(Token)input.LT(1);

            if ( input.LA(1)==38||input.LA(1)==41||input.LA(1)==45||input.LA(1)==47||input.LA(1)==50||input.LA(1)==53||input.LA(1)==57||input.LA(1)==59||input.LA(1)==64||input.LA(1)==72||input.LA(1)==78 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set30)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignop"


    public static class lor_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lor_expr"
    // Casen.g:101:1: lor_expr : ( land_expr ) ( '||' ^ land_expr )* ;
    public final CasenParser.lor_expr_return lor_expr() throws RecognitionException {
        CasenParser.lor_expr_return retval = new CasenParser.lor_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal32=null;
        CasenParser.land_expr_return land_expr31 =null;

        CasenParser.land_expr_return land_expr33 =null;


        CommonTree string_literal32_tree=null;

        try {
            // Casen.g:102:5: ( ( land_expr ) ( '||' ^ land_expr )* )
            // Casen.g:102:9: ( land_expr ) ( '||' ^ land_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:102:9: ( land_expr )
            // Casen.g:102:10: land_expr
            {
            pushFollow(FOLLOW_land_expr_in_lor_expr1046);
            land_expr31=land_expr();

            state._fsp--;

            adaptor.addChild(root_0, land_expr31.getTree());

            }


            // Casen.g:102:21: ( '||' ^ land_expr )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==79) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Casen.g:102:22: '||' ^ land_expr
            	    {
            	    string_literal32=(Token)match(input,79,FOLLOW_79_in_lor_expr1050); 
            	    string_literal32_tree = 
            	    (CommonTree)adaptor.create(string_literal32)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal32_tree, root_0);


            	    pushFollow(FOLLOW_land_expr_in_lor_expr1053);
            	    land_expr33=land_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, land_expr33.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lor_expr"


    public static class land_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "land_expr"
    // Casen.g:105:1: land_expr : ( or_expr ) ( '&&' ^ or_expr )* ;
    public final CasenParser.land_expr_return land_expr() throws RecognitionException {
        CasenParser.land_expr_return retval = new CasenParser.land_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal35=null;
        CasenParser.or_expr_return or_expr34 =null;

        CasenParser.or_expr_return or_expr36 =null;


        CommonTree string_literal35_tree=null;

        try {
            // Casen.g:106:5: ( ( or_expr ) ( '&&' ^ or_expr )* )
            // Casen.g:106:11: ( or_expr ) ( '&&' ^ or_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:106:11: ( or_expr )
            // Casen.g:106:12: or_expr
            {
            pushFollow(FOLLOW_or_expr_in_land_expr1078);
            or_expr34=or_expr();

            state._fsp--;

            adaptor.addChild(root_0, or_expr34.getTree());

            }


            // Casen.g:106:21: ( '&&' ^ or_expr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==39) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Casen.g:106:22: '&&' ^ or_expr
            	    {
            	    string_literal35=(Token)match(input,39,FOLLOW_39_in_land_expr1082); 
            	    string_literal35_tree = 
            	    (CommonTree)adaptor.create(string_literal35)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal35_tree, root_0);


            	    pushFollow(FOLLOW_or_expr_in_land_expr1085);
            	    or_expr36=or_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, or_expr36.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "land_expr"


    public static class or_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "or_expr"
    // Casen.g:109:1: or_expr : ( xor_expr ) ( '|' ^ xor_expr )* ;
    public final CasenParser.or_expr_return or_expr() throws RecognitionException {
        CasenParser.or_expr_return retval = new CasenParser.or_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal38=null;
        CasenParser.xor_expr_return xor_expr37 =null;

        CasenParser.xor_expr_return xor_expr39 =null;


        CommonTree char_literal38_tree=null;

        try {
            // Casen.g:110:5: ( ( xor_expr ) ( '|' ^ xor_expr )* )
            // Casen.g:110:11: ( xor_expr ) ( '|' ^ xor_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:110:11: ( xor_expr )
            // Casen.g:110:12: xor_expr
            {
            pushFollow(FOLLOW_xor_expr_in_or_expr1110);
            xor_expr37=xor_expr();

            state._fsp--;

            adaptor.addChild(root_0, xor_expr37.getTree());

            }


            // Casen.g:110:22: ( '|' ^ xor_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==77) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Casen.g:110:23: '|' ^ xor_expr
            	    {
            	    char_literal38=(Token)match(input,77,FOLLOW_77_in_or_expr1114); 
            	    char_literal38_tree = 
            	    (CommonTree)adaptor.create(char_literal38)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal38_tree, root_0);


            	    pushFollow(FOLLOW_xor_expr_in_or_expr1117);
            	    xor_expr39=xor_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, xor_expr39.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "or_expr"


    public static class xor_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "xor_expr"
    // Casen.g:113:1: xor_expr : ( and_expr ) ( '^' ^ and_expr )* ;
    public final CasenParser.xor_expr_return xor_expr() throws RecognitionException {
        CasenParser.xor_expr_return retval = new CasenParser.xor_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal41=null;
        CasenParser.and_expr_return and_expr40 =null;

        CasenParser.and_expr_return and_expr42 =null;


        CommonTree char_literal41_tree=null;

        try {
            // Casen.g:114:5: ( ( and_expr ) ( '^' ^ and_expr )* )
            // Casen.g:114:11: ( and_expr ) ( '^' ^ and_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:114:11: ( and_expr )
            // Casen.g:114:12: and_expr
            {
            pushFollow(FOLLOW_and_expr_in_xor_expr1142);
            and_expr40=and_expr();

            state._fsp--;

            adaptor.addChild(root_0, and_expr40.getTree());

            }


            // Casen.g:114:22: ( '^' ^ and_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==71) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Casen.g:114:23: '^' ^ and_expr
            	    {
            	    char_literal41=(Token)match(input,71,FOLLOW_71_in_xor_expr1146); 
            	    char_literal41_tree = 
            	    (CommonTree)adaptor.create(char_literal41)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal41_tree, root_0);


            	    pushFollow(FOLLOW_and_expr_in_xor_expr1149);
            	    and_expr42=and_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, and_expr42.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "xor_expr"


    public static class and_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "and_expr"
    // Casen.g:117:1: and_expr : ( eq_expr ) ( '&' ^ eq_expr )* ;
    public final CasenParser.and_expr_return and_expr() throws RecognitionException {
        CasenParser.and_expr_return retval = new CasenParser.and_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal44=null;
        CasenParser.eq_expr_return eq_expr43 =null;

        CasenParser.eq_expr_return eq_expr45 =null;


        CommonTree char_literal44_tree=null;

        try {
            // Casen.g:118:5: ( ( eq_expr ) ( '&' ^ eq_expr )* )
            // Casen.g:118:11: ( eq_expr ) ( '&' ^ eq_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:118:11: ( eq_expr )
            // Casen.g:118:12: eq_expr
            {
            pushFollow(FOLLOW_eq_expr_in_and_expr1174);
            eq_expr43=eq_expr();

            state._fsp--;

            adaptor.addChild(root_0, eq_expr43.getTree());

            }


            // Casen.g:118:21: ( '&' ^ eq_expr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==40) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Casen.g:118:22: '&' ^ eq_expr
            	    {
            	    char_literal44=(Token)match(input,40,FOLLOW_40_in_and_expr1178); 
            	    char_literal44_tree = 
            	    (CommonTree)adaptor.create(char_literal44)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal44_tree, root_0);


            	    pushFollow(FOLLOW_eq_expr_in_and_expr1181);
            	    eq_expr45=eq_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, eq_expr45.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "and_expr"


    public static class eq_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "eq_expr"
    // Casen.g:121:1: eq_expr : ( ineq_expr ) ( '==' ^ ineq_expr | '!=' ^ ineq_expr )* ;
    public final CasenParser.eq_expr_return eq_expr() throws RecognitionException {
        CasenParser.eq_expr_return retval = new CasenParser.eq_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal47=null;
        Token string_literal49=null;
        CasenParser.ineq_expr_return ineq_expr46 =null;

        CasenParser.ineq_expr_return ineq_expr48 =null;

        CasenParser.ineq_expr_return ineq_expr50 =null;


        CommonTree string_literal47_tree=null;
        CommonTree string_literal49_tree=null;

        try {
            // Casen.g:122:5: ( ( ineq_expr ) ( '==' ^ ineq_expr | '!=' ^ ineq_expr )* )
            // Casen.g:122:11: ( ineq_expr ) ( '==' ^ ineq_expr | '!=' ^ ineq_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:122:11: ( ineq_expr )
            // Casen.g:122:12: ineq_expr
            {
            pushFollow(FOLLOW_ineq_expr_in_eq_expr1206);
            ineq_expr46=ineq_expr();

            state._fsp--;

            adaptor.addChild(root_0, ineq_expr46.getTree());

            }


            // Casen.g:122:23: ( '==' ^ ineq_expr | '!=' ^ ineq_expr )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==60) ) {
                    alt13=1;
                }
                else if ( (LA13_0==36) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // Casen.g:122:24: '==' ^ ineq_expr
            	    {
            	    string_literal47=(Token)match(input,60,FOLLOW_60_in_eq_expr1210); 
            	    string_literal47_tree = 
            	    (CommonTree)adaptor.create(string_literal47)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal47_tree, root_0);


            	    pushFollow(FOLLOW_ineq_expr_in_eq_expr1213);
            	    ineq_expr48=ineq_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ineq_expr48.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:122:42: '!=' ^ ineq_expr
            	    {
            	    string_literal49=(Token)match(input,36,FOLLOW_36_in_eq_expr1217); 
            	    string_literal49_tree = 
            	    (CommonTree)adaptor.create(string_literal49)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal49_tree, root_0);


            	    pushFollow(FOLLOW_ineq_expr_in_eq_expr1220);
            	    ineq_expr50=ineq_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, ineq_expr50.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "eq_expr"


    public static class ineq_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ineq_expr"
    // Casen.g:125:1: ineq_expr : ( shift_expr ) ( '<' ^ shift_expr | '<=' ^ shift_expr | '>=' ^ shift_expr | '>' ^ shift_expr )* ;
    public final CasenParser.ineq_expr_return ineq_expr() throws RecognitionException {
        CasenParser.ineq_expr_return retval = new CasenParser.ineq_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal52=null;
        Token string_literal54=null;
        Token string_literal56=null;
        Token char_literal58=null;
        CasenParser.shift_expr_return shift_expr51 =null;

        CasenParser.shift_expr_return shift_expr53 =null;

        CasenParser.shift_expr_return shift_expr55 =null;

        CasenParser.shift_expr_return shift_expr57 =null;

        CasenParser.shift_expr_return shift_expr59 =null;


        CommonTree char_literal52_tree=null;
        CommonTree string_literal54_tree=null;
        CommonTree string_literal56_tree=null;
        CommonTree char_literal58_tree=null;

        try {
            // Casen.g:126:5: ( ( shift_expr ) ( '<' ^ shift_expr | '<=' ^ shift_expr | '>=' ^ shift_expr | '>' ^ shift_expr )* )
            // Casen.g:126:11: ( shift_expr ) ( '<' ^ shift_expr | '<=' ^ shift_expr | '>=' ^ shift_expr | '>' ^ shift_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:126:11: ( shift_expr )
            // Casen.g:126:12: shift_expr
            {
            pushFollow(FOLLOW_shift_expr_in_ineq_expr1245);
            shift_expr51=shift_expr();

            state._fsp--;

            adaptor.addChild(root_0, shift_expr51.getTree());

            }


            // Casen.g:126:24: ( '<' ^ shift_expr | '<=' ^ shift_expr | '>=' ^ shift_expr | '>' ^ shift_expr )*
            loop14:
            do {
                int alt14=5;
                switch ( input.LA(1) ) {
                case 55:
                    {
                    alt14=1;
                    }
                    break;
                case 58:
                    {
                    alt14=2;
                    }
                    break;
                case 62:
                    {
                    alt14=3;
                    }
                    break;
                case 61:
                    {
                    alt14=4;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // Casen.g:126:25: '<' ^ shift_expr
            	    {
            	    char_literal52=(Token)match(input,55,FOLLOW_55_in_ineq_expr1249); 
            	    char_literal52_tree = 
            	    (CommonTree)adaptor.create(char_literal52)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal52_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_ineq_expr1252);
            	    shift_expr53=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr53.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:126:43: '<=' ^ shift_expr
            	    {
            	    string_literal54=(Token)match(input,58,FOLLOW_58_in_ineq_expr1256); 
            	    string_literal54_tree = 
            	    (CommonTree)adaptor.create(string_literal54)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal54_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_ineq_expr1259);
            	    shift_expr55=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr55.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Casen.g:126:62: '>=' ^ shift_expr
            	    {
            	    string_literal56=(Token)match(input,62,FOLLOW_62_in_ineq_expr1263); 
            	    string_literal56_tree = 
            	    (CommonTree)adaptor.create(string_literal56)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal56_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_ineq_expr1266);
            	    shift_expr57=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr57.getTree());

            	    }
            	    break;
            	case 4 :
            	    // Casen.g:126:81: '>' ^ shift_expr
            	    {
            	    char_literal58=(Token)match(input,61,FOLLOW_61_in_ineq_expr1270); 
            	    char_literal58_tree = 
            	    (CommonTree)adaptor.create(char_literal58)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal58_tree, root_0);


            	    pushFollow(FOLLOW_shift_expr_in_ineq_expr1273);
            	    shift_expr59=shift_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, shift_expr59.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ineq_expr"


    public static class shift_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "shift_expr"
    // Casen.g:129:1: shift_expr : ( plus_expr ) ( '<<' ^ plus_expr | '>>' ^ plus_expr )* ;
    public final CasenParser.shift_expr_return shift_expr() throws RecognitionException {
        CasenParser.shift_expr_return retval = new CasenParser.shift_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal61=null;
        Token string_literal63=null;
        CasenParser.plus_expr_return plus_expr60 =null;

        CasenParser.plus_expr_return plus_expr62 =null;

        CasenParser.plus_expr_return plus_expr64 =null;


        CommonTree string_literal61_tree=null;
        CommonTree string_literal63_tree=null;

        try {
            // Casen.g:130:5: ( ( plus_expr ) ( '<<' ^ plus_expr | '>>' ^ plus_expr )* )
            // Casen.g:130:11: ( plus_expr ) ( '<<' ^ plus_expr | '>>' ^ plus_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:130:11: ( plus_expr )
            // Casen.g:130:12: plus_expr
            {
            pushFollow(FOLLOW_plus_expr_in_shift_expr1298);
            plus_expr60=plus_expr();

            state._fsp--;

            adaptor.addChild(root_0, plus_expr60.getTree());

            }


            // Casen.g:130:23: ( '<<' ^ plus_expr | '>>' ^ plus_expr )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==56) ) {
                    alt15=1;
                }
                else if ( (LA15_0==63) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // Casen.g:130:24: '<<' ^ plus_expr
            	    {
            	    string_literal61=(Token)match(input,56,FOLLOW_56_in_shift_expr1302); 
            	    string_literal61_tree = 
            	    (CommonTree)adaptor.create(string_literal61)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal61_tree, root_0);


            	    pushFollow(FOLLOW_plus_expr_in_shift_expr1305);
            	    plus_expr62=plus_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, plus_expr62.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:130:42: '>>' ^ plus_expr
            	    {
            	    string_literal63=(Token)match(input,63,FOLLOW_63_in_shift_expr1309); 
            	    string_literal63_tree = 
            	    (CommonTree)adaptor.create(string_literal63)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(string_literal63_tree, root_0);


            	    pushFollow(FOLLOW_plus_expr_in_shift_expr1312);
            	    plus_expr64=plus_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, plus_expr64.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "shift_expr"


    public static class plus_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "plus_expr"
    // Casen.g:133:1: plus_expr : ( mul_expr ) ( '+' ^ mul_expr | '-' ^ mul_expr )* ;
    public final CasenParser.plus_expr_return plus_expr() throws RecognitionException {
        CasenParser.plus_expr_return retval = new CasenParser.plus_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal66=null;
        Token char_literal68=null;
        CasenParser.mul_expr_return mul_expr65 =null;

        CasenParser.mul_expr_return mul_expr67 =null;

        CasenParser.mul_expr_return mul_expr69 =null;


        CommonTree char_literal66_tree=null;
        CommonTree char_literal68_tree=null;

        try {
            // Casen.g:134:5: ( ( mul_expr ) ( '+' ^ mul_expr | '-' ^ mul_expr )* )
            // Casen.g:134:11: ( mul_expr ) ( '+' ^ mul_expr | '-' ^ mul_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:134:11: ( mul_expr )
            // Casen.g:134:12: mul_expr
            {
            pushFollow(FOLLOW_mul_expr_in_plus_expr1337);
            mul_expr65=mul_expr();

            state._fsp--;

            adaptor.addChild(root_0, mul_expr65.getTree());

            }


            // Casen.g:134:22: ( '+' ^ mul_expr | '-' ^ mul_expr )*
            loop16:
            do {
                int alt16=3;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }
                else if ( (LA16_0==49) ) {
                    alt16=2;
                }


                switch (alt16) {
            	case 1 :
            	    // Casen.g:134:23: '+' ^ mul_expr
            	    {
            	    char_literal66=(Token)match(input,46,FOLLOW_46_in_plus_expr1341); 
            	    char_literal66_tree = 
            	    (CommonTree)adaptor.create(char_literal66)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal66_tree, root_0);


            	    pushFollow(FOLLOW_mul_expr_in_plus_expr1344);
            	    mul_expr67=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr67.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:134:39: '-' ^ mul_expr
            	    {
            	    char_literal68=(Token)match(input,49,FOLLOW_49_in_plus_expr1348); 
            	    char_literal68_tree = 
            	    (CommonTree)adaptor.create(char_literal68)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal68_tree, root_0);


            	    pushFollow(FOLLOW_mul_expr_in_plus_expr1351);
            	    mul_expr69=mul_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mul_expr69.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "plus_expr"


    public static class mul_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "mul_expr"
    // Casen.g:137:1: mul_expr : ( unop_expr ) ( '*' ^ unop_expr | '/' ^ unop_expr | '%' ^ unop_expr )* ;
    public final CasenParser.mul_expr_return mul_expr() throws RecognitionException {
        CasenParser.mul_expr_return retval = new CasenParser.mul_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal71=null;
        Token char_literal73=null;
        Token char_literal75=null;
        CasenParser.unop_expr_return unop_expr70 =null;

        CasenParser.unop_expr_return unop_expr72 =null;

        CasenParser.unop_expr_return unop_expr74 =null;

        CasenParser.unop_expr_return unop_expr76 =null;


        CommonTree char_literal71_tree=null;
        CommonTree char_literal73_tree=null;
        CommonTree char_literal75_tree=null;

        try {
            // Casen.g:138:5: ( ( unop_expr ) ( '*' ^ unop_expr | '/' ^ unop_expr | '%' ^ unop_expr )* )
            // Casen.g:138:11: ( unop_expr ) ( '*' ^ unop_expr | '/' ^ unop_expr | '%' ^ unop_expr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:138:11: ( unop_expr )
            // Casen.g:138:12: unop_expr
            {
            pushFollow(FOLLOW_unop_expr_in_mul_expr1376);
            unop_expr70=unop_expr();

            state._fsp--;

            adaptor.addChild(root_0, unop_expr70.getTree());

            }


            // Casen.g:138:23: ( '*' ^ unop_expr | '/' ^ unop_expr | '%' ^ unop_expr )*
            loop17:
            do {
                int alt17=4;
                switch ( input.LA(1) ) {
                case 44:
                    {
                    alt17=1;
                    }
                    break;
                case 52:
                    {
                    alt17=2;
                    }
                    break;
                case 37:
                    {
                    alt17=3;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // Casen.g:138:24: '*' ^ unop_expr
            	    {
            	    char_literal71=(Token)match(input,44,FOLLOW_44_in_mul_expr1380); 
            	    char_literal71_tree = 
            	    (CommonTree)adaptor.create(char_literal71)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal71_tree, root_0);


            	    pushFollow(FOLLOW_unop_expr_in_mul_expr1383);
            	    unop_expr72=unop_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unop_expr72.getTree());

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:138:41: '/' ^ unop_expr
            	    {
            	    char_literal73=(Token)match(input,52,FOLLOW_52_in_mul_expr1387); 
            	    char_literal73_tree = 
            	    (CommonTree)adaptor.create(char_literal73)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal73_tree, root_0);


            	    pushFollow(FOLLOW_unop_expr_in_mul_expr1390);
            	    unop_expr74=unop_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unop_expr74.getTree());

            	    }
            	    break;
            	case 3 :
            	    // Casen.g:138:58: '%' ^ unop_expr
            	    {
            	    char_literal75=(Token)match(input,37,FOLLOW_37_in_mul_expr1394); 
            	    char_literal75_tree = 
            	    (CommonTree)adaptor.create(char_literal75)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal75_tree, root_0);


            	    pushFollow(FOLLOW_unop_expr_in_mul_expr1397);
            	    unop_expr76=unop_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unop_expr76.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "mul_expr"


    public static class unop_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unop_expr"
    // Casen.g:142:1: unop_expr : ( apply_expr | '!' ^ unop_expr | '~' ^ unop_expr | '-' ^ unop_expr );
    public final CasenParser.unop_expr_return unop_expr() throws RecognitionException {
        CasenParser.unop_expr_return retval = new CasenParser.unop_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        CasenParser.apply_expr_return apply_expr77 =null;

        CasenParser.unop_expr_return unop_expr79 =null;

        CasenParser.unop_expr_return unop_expr81 =null;

        CasenParser.unop_expr_return unop_expr83 =null;


        CommonTree char_literal78_tree=null;
        CommonTree char_literal80_tree=null;
        CommonTree char_literal82_tree=null;

        try {
            // Casen.g:143:5: ( apply_expr | '!' ^ unop_expr | '~' ^ unop_expr | '-' ^ unop_expr )
            int alt18=4;
            switch ( input.LA(1) ) {
            case FCONST:
            case ICONST:
            case ID:
            case LBRACE:
            case LID:
            case SCONST:
            case 42:
            case 73:
                {
                alt18=1;
                }
                break;
            case 35:
                {
                alt18=2;
                }
                break;
            case 80:
                {
                alt18=3;
                }
                break;
            case 49:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Casen.g:143:11: apply_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_apply_expr_in_unop_expr1422);
                    apply_expr77=apply_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, apply_expr77.getTree());

                    }
                    break;
                case 2 :
                    // Casen.g:144:10: '!' ^ unop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal78=(Token)match(input,35,FOLLOW_35_in_unop_expr1433); 
                    char_literal78_tree = 
                    (CommonTree)adaptor.create(char_literal78)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal78_tree, root_0);


                    pushFollow(FOLLOW_unop_expr_in_unop_expr1436);
                    unop_expr79=unop_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unop_expr79.getTree());

                    }
                    break;
                case 3 :
                    // Casen.g:145:9: '~' ^ unop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal80=(Token)match(input,80,FOLLOW_80_in_unop_expr1446); 
                    char_literal80_tree = 
                    (CommonTree)adaptor.create(char_literal80)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal80_tree, root_0);


                    pushFollow(FOLLOW_unop_expr_in_unop_expr1449);
                    unop_expr81=unop_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unop_expr81.getTree());

                    }
                    break;
                case 4 :
                    // Casen.g:146:9: '-' ^ unop_expr
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    char_literal82=(Token)match(input,49,FOLLOW_49_in_unop_expr1459); 
                    char_literal82_tree = 
                    (CommonTree)adaptor.create(char_literal82)
                    ;
                    root_0 = (CommonTree)adaptor.becomeRoot(char_literal82_tree, root_0);


                    pushFollow(FOLLOW_unop_expr_in_unop_expr1462);
                    unop_expr83=unop_expr();

                    state._fsp--;

                    adaptor.addChild(root_0, unop_expr83.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unop_expr"


    public static class apply_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "apply_expr"
    // Casen.g:151:1: apply_expr : context_expr ( context_expr )* -> context_expr ( ^( APPLY context_expr ) )* ;
    public final CasenParser.apply_expr_return apply_expr() throws RecognitionException {
        CasenParser.apply_expr_return retval = new CasenParser.apply_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CasenParser.context_expr_return context_expr84 =null;

        CasenParser.context_expr_return context_expr85 =null;


        RewriteRuleSubtreeStream stream_context_expr=new RewriteRuleSubtreeStream(adaptor,"rule context_expr");
        try {
            // Casen.g:152:5: ( context_expr ( context_expr )* -> context_expr ( ^( APPLY context_expr ) )* )
            // Casen.g:152:10: context_expr ( context_expr )*
            {
            pushFollow(FOLLOW_context_expr_in_apply_expr1501);
            context_expr84=context_expr();

            state._fsp--;

            stream_context_expr.add(context_expr84.getTree());

            // Casen.g:152:24: ( context_expr )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==FCONST||(LA19_0 >= ICONST && LA19_0 <= ID)||LA19_0==LBRACE||LA19_0==LID||LA19_0==SCONST||LA19_0==42||LA19_0==73) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // Casen.g:152:25: context_expr
            	    {
            	    pushFollow(FOLLOW_context_expr_in_apply_expr1505);
            	    context_expr85=context_expr();

            	    state._fsp--;

            	    stream_context_expr.add(context_expr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // AST REWRITE
            // elements: context_expr, context_expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 152:41: -> context_expr ( ^( APPLY context_expr ) )*
            {
                adaptor.addChild(root_0, stream_context_expr.nextTree());

                // Casen.g:152:57: ( ^( APPLY context_expr ) )*
                while ( stream_context_expr.hasNext() ) {
                    // Casen.g:152:57: ^( APPLY context_expr )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(APPLY, "APPLY")
                    , root_1);

                    adaptor.addChild(root_1, stream_context_expr.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_context_expr.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "apply_expr"


    public static class context_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "context_expr"
    // Casen.g:155:1: context_expr : atom_expr ( '[[' expr ']]' )? -> atom_expr ( ^( CONTEXT expr ) )? ;
    public final CasenParser.context_expr_return context_expr() throws RecognitionException {
        CasenParser.context_expr_return retval = new CasenParser.context_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token string_literal87=null;
        Token string_literal89=null;
        CasenParser.atom_expr_return atom_expr86 =null;

        CasenParser.expr_return expr88 =null;


        CommonTree string_literal87_tree=null;
        CommonTree string_literal89_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_atom_expr=new RewriteRuleSubtreeStream(adaptor,"rule atom_expr");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Casen.g:156:5: ( atom_expr ( '[[' expr ']]' )? -> atom_expr ( ^( CONTEXT expr ) )? )
            // Casen.g:156:7: atom_expr ( '[[' expr ']]' )?
            {
            pushFollow(FOLLOW_atom_expr_in_context_expr1536);
            atom_expr86=atom_expr();

            state._fsp--;

            stream_atom_expr.add(atom_expr86.getTree());

            // Casen.g:156:17: ( '[[' expr ']]' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==68) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // Casen.g:156:18: '[[' expr ']]'
                    {
                    string_literal87=(Token)match(input,68,FOLLOW_68_in_context_expr1539);  
                    stream_68.add(string_literal87);


                    pushFollow(FOLLOW_expr_in_context_expr1541);
                    expr88=expr();

                    state._fsp--;

                    stream_expr.add(expr88.getTree());

                    string_literal89=(Token)match(input,70,FOLLOW_70_in_context_expr1543);  
                    stream_70.add(string_literal89);


                    }
                    break;

            }


            // AST REWRITE
            // elements: atom_expr, expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 156:35: -> atom_expr ( ^( CONTEXT expr ) )?
            {
                adaptor.addChild(root_0, stream_atom_expr.nextTree());

                // Casen.g:156:48: ( ^( CONTEXT expr ) )?
                if ( stream_expr.hasNext() ) {
                    // Casen.g:156:48: ^( CONTEXT expr )
                    {
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    root_1 = (CommonTree)adaptor.becomeRoot(
                    (CommonTree)adaptor.create(CONTEXT, "CONTEXT")
                    , root_1);

                    adaptor.addChild(root_1, stream_expr.nextTree());

                    adaptor.addChild(root_0, root_1);
                    }

                }
                stream_expr.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "context_expr"


    public static class atom_expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom_expr"
    // Casen.g:159:1: atom_expr : ( atom ) ( '[' ^ expr ']' !| '.' ^ ID )* ;
    public final CasenParser.atom_expr_return atom_expr() throws RecognitionException {
        CasenParser.atom_expr_return retval = new CasenParser.atom_expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal91=null;
        Token char_literal93=null;
        Token char_literal94=null;
        Token ID95=null;
        CasenParser.atom_return atom90 =null;

        CasenParser.expr_return expr92 =null;


        CommonTree char_literal91_tree=null;
        CommonTree char_literal93_tree=null;
        CommonTree char_literal94_tree=null;
        CommonTree ID95_tree=null;

        try {
            // Casen.g:160:5: ( ( atom ) ( '[' ^ expr ']' !| '.' ^ ID )* )
            // Casen.g:160:11: ( atom ) ( '[' ^ expr ']' !| '.' ^ ID )*
            {
            root_0 = (CommonTree)adaptor.nil();


            // Casen.g:160:11: ( atom )
            // Casen.g:160:12: atom
            {
            pushFollow(FOLLOW_atom_in_atom_expr1579);
            atom90=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom90.getTree());

            }


            // Casen.g:160:18: ( '[' ^ expr ']' !| '.' ^ ID )*
            loop21:
            do {
                int alt21=3;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==67) ) {
                    alt21=1;
                }
                else if ( (LA21_0==51) ) {
                    alt21=2;
                }


                switch (alt21) {
            	case 1 :
            	    // Casen.g:160:19: '[' ^ expr ']' !
            	    {
            	    char_literal91=(Token)match(input,67,FOLLOW_67_in_atom_expr1583); 
            	    char_literal91_tree = 
            	    (CommonTree)adaptor.create(char_literal91)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal91_tree, root_0);


            	    pushFollow(FOLLOW_expr_in_atom_expr1586);
            	    expr92=expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expr92.getTree());

            	    char_literal93=(Token)match(input,69,FOLLOW_69_in_atom_expr1588); 

            	    }
            	    break;
            	case 2 :
            	    // Casen.g:160:35: '.' ^ ID
            	    {
            	    char_literal94=(Token)match(input,51,FOLLOW_51_in_atom_expr1592); 
            	    char_literal94_tree = 
            	    (CommonTree)adaptor.create(char_literal94)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal94_tree, root_0);


            	    ID95=(Token)match(input,ID,FOLLOW_ID_in_atom_expr1595); 
            	    ID95_tree = 
            	    (CommonTree)adaptor.create(ID95)
            	    ;
            	    adaptor.addChild(root_0, ID95_tree);


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom_expr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // Casen.g:164:1: atom : ( ID | LID | '(' ')' -> ARG | '(' arglist ')' -> arglist | ICONST | FCONST | SCONST | 'def' ID fun -> ^( DEF ID fun ) | 'def' allops fun -> ^( DEF allops fun ) | fun );
    public final CasenParser.atom_return atom() throws RecognitionException {
        CasenParser.atom_return retval = new CasenParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID96=null;
        Token LID97=null;
        Token char_literal98=null;
        Token char_literal99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        Token ICONST103=null;
        Token FCONST104=null;
        Token SCONST105=null;
        Token string_literal106=null;
        Token ID107=null;
        Token string_literal109=null;
        CasenParser.arglist_return arglist101 =null;

        CasenParser.fun_return fun108 =null;

        CasenParser.allops_return allops110 =null;

        CasenParser.fun_return fun111 =null;

        CasenParser.fun_return fun112 =null;


        CommonTree ID96_tree=null;
        CommonTree LID97_tree=null;
        CommonTree char_literal98_tree=null;
        CommonTree char_literal99_tree=null;
        CommonTree char_literal100_tree=null;
        CommonTree char_literal102_tree=null;
        CommonTree ICONST103_tree=null;
        CommonTree FCONST104_tree=null;
        CommonTree SCONST105_tree=null;
        CommonTree string_literal106_tree=null;
        CommonTree ID107_tree=null;
        CommonTree string_literal109_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_arglist=new RewriteRuleSubtreeStream(adaptor,"rule arglist");
        RewriteRuleSubtreeStream stream_allops=new RewriteRuleSubtreeStream(adaptor,"rule allops");
        RewriteRuleSubtreeStream stream_fun=new RewriteRuleSubtreeStream(adaptor,"rule fun");
        try {
            // Casen.g:165:5: ( ID | LID | '(' ')' -> ARG | '(' arglist ')' -> arglist | ICONST | FCONST | SCONST | 'def' ID fun -> ^( DEF ID fun ) | 'def' allops fun -> ^( DEF allops fun ) | fun )
            int alt22=10;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt22=1;
                }
                break;
            case LID:
                {
                alt22=2;
                }
                break;
            case 42:
                {
                int LA22_3 = input.LA(2);

                if ( (LA22_3==43) ) {
                    alt22=3;
                }
                else if ( (LA22_3==FCONST||(LA22_3 >= ICONST && LA22_3 <= ID)||LA22_3==LBRACE||LA22_3==LID||LA22_3==SCONST||LA22_3==35||LA22_3==42||LA22_3==49||LA22_3==73||LA22_3==80) ) {
                    alt22=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 3, input);

                    throw nvae;

                }
                }
                break;
            case ICONST:
                {
                alt22=5;
                }
                break;
            case FCONST:
                {
                alt22=6;
                }
                break;
            case SCONST:
                {
                alt22=7;
                }
                break;
            case 73:
                {
                int LA22_7 = input.LA(2);

                if ( (LA22_7==ID) ) {
                    alt22=8;
                }
                else if ( ((LA22_7 >= 35 && LA22_7 <= 41)||(LA22_7 >= 44 && LA22_7 <= 47)||(LA22_7 >= 49 && LA22_7 <= 50)||(LA22_7 >= 52 && LA22_7 <= 53)||(LA22_7 >= 55 && LA22_7 <= 64)||(LA22_7 >= 71 && LA22_7 <= 72)||(LA22_7 >= 77 && LA22_7 <= 80)) ) {
                    alt22=9;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 7, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                alt22=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // Casen.g:165:9: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID96=(Token)match(input,ID,FOLLOW_ID_in_atom1621); 
                    ID96_tree = 
                    (CommonTree)adaptor.create(ID96)
                    ;
                    adaptor.addChild(root_0, ID96_tree);


                    }
                    break;
                case 2 :
                    // Casen.g:166:9: LID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LID97=(Token)match(input,LID,FOLLOW_LID_in_atom1632); 
                    LID97_tree = 
                    (CommonTree)adaptor.create(LID97)
                    ;
                    adaptor.addChild(root_0, LID97_tree);


                    }
                    break;
                case 3 :
                    // Casen.g:167:10: '(' ')'
                    {
                    char_literal98=(Token)match(input,42,FOLLOW_42_in_atom1643);  
                    stream_42.add(char_literal98);


                    char_literal99=(Token)match(input,43,FOLLOW_43_in_atom1645);  
                    stream_43.add(char_literal99);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 167:18: -> ARG
                    {
                        adaptor.addChild(root_0, 
                        (CommonTree)adaptor.create(ARG, "ARG")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // Casen.g:168:10: '(' arglist ')'
                    {
                    char_literal100=(Token)match(input,42,FOLLOW_42_in_atom1660);  
                    stream_42.add(char_literal100);


                    pushFollow(FOLLOW_arglist_in_atom1662);
                    arglist101=arglist();

                    state._fsp--;

                    stream_arglist.add(arglist101.getTree());

                    char_literal102=(Token)match(input,43,FOLLOW_43_in_atom1664);  
                    stream_43.add(char_literal102);


                    // AST REWRITE
                    // elements: arglist
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 168:26: -> arglist
                    {
                        adaptor.addChild(root_0, stream_arglist.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 5 :
                    // Casen.g:169:10: ICONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ICONST103=(Token)match(input,ICONST,FOLLOW_ICONST_in_atom1679); 
                    ICONST103_tree = 
                    (CommonTree)adaptor.create(ICONST103)
                    ;
                    adaptor.addChild(root_0, ICONST103_tree);


                    }
                    break;
                case 6 :
                    // Casen.g:170:9: FCONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    FCONST104=(Token)match(input,FCONST,FOLLOW_FCONST_in_atom1690); 
                    FCONST104_tree = 
                    (CommonTree)adaptor.create(FCONST104)
                    ;
                    adaptor.addChild(root_0, FCONST104_tree);


                    }
                    break;
                case 7 :
                    // Casen.g:171:9: SCONST
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    SCONST105=(Token)match(input,SCONST,FOLLOW_SCONST_in_atom1701); 
                    SCONST105_tree = 
                    (CommonTree)adaptor.create(SCONST105)
                    ;
                    adaptor.addChild(root_0, SCONST105_tree);


                    }
                    break;
                case 8 :
                    // Casen.g:172:10: 'def' ID fun
                    {
                    string_literal106=(Token)match(input,73,FOLLOW_73_in_atom1713);  
                    stream_73.add(string_literal106);


                    ID107=(Token)match(input,ID,FOLLOW_ID_in_atom1715);  
                    stream_ID.add(ID107);


                    pushFollow(FOLLOW_fun_in_atom1717);
                    fun108=fun();

                    state._fsp--;

                    stream_fun.add(fun108.getTree());

                    // AST REWRITE
                    // elements: fun, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 172:24: -> ^( DEF ID fun )
                    {
                        // Casen.g:172:27: ^( DEF ID fun )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DEF, "DEF")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_fun.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 9 :
                    // Casen.g:173:10: 'def' allops fun
                    {
                    string_literal109=(Token)match(input,73,FOLLOW_73_in_atom1739);  
                    stream_73.add(string_literal109);


                    pushFollow(FOLLOW_allops_in_atom1741);
                    allops110=allops();

                    state._fsp--;

                    stream_allops.add(allops110.getTree());

                    pushFollow(FOLLOW_fun_in_atom1743);
                    fun111=fun();

                    state._fsp--;

                    stream_fun.add(fun111.getTree());

                    // AST REWRITE
                    // elements: allops, fun
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 173:28: -> ^( DEF allops fun )
                    {
                        // Casen.g:173:31: ^( DEF allops fun )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(DEF, "DEF")
                        , root_1);

                        adaptor.addChild(root_1, stream_allops.nextTree());

                        adaptor.addChild(root_1, stream_fun.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 10 :
                    // Casen.g:174:10: fun
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    pushFollow(FOLLOW_fun_in_atom1765);
                    fun112=fun();

                    state._fsp--;

                    adaptor.addChild(root_0, fun112.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class arglist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arglist"
    // Casen.g:176:1: arglist : ( expr ) ( ',' expr )* -> ^( ARG ( expr )+ ) ;
    public final CasenParser.arglist_return arglist() throws RecognitionException {
        CasenParser.arglist_return retval = new CasenParser.arglist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token char_literal114=null;
        CasenParser.expr_return expr113 =null;

        CasenParser.expr_return expr115 =null;


        CommonTree char_literal114_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // Casen.g:177:5: ( ( expr ) ( ',' expr )* -> ^( ARG ( expr )+ ) )
            // Casen.g:177:8: ( expr ) ( ',' expr )*
            {
            // Casen.g:177:8: ( expr )
            // Casen.g:177:9: expr
            {
            pushFollow(FOLLOW_expr_in_arglist1785);
            expr113=expr();

            state._fsp--;

            stream_expr.add(expr113.getTree());

            }


            // Casen.g:177:15: ( ',' expr )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==48) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Casen.g:177:16: ',' expr
            	    {
            	    char_literal114=(Token)match(input,48,FOLLOW_48_in_arglist1789);  
            	    stream_48.add(char_literal114);


            	    pushFollow(FOLLOW_expr_in_arglist1791);
            	    expr115=expr();

            	    state._fsp--;

            	    stream_expr.add(expr115.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 177:27: -> ^( ARG ( expr )+ )
            {
                // Casen.g:177:30: ^( ARG ( expr )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(ARG, "ARG")
                , root_1);

                if ( !(stream_expr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arglist"


    public static class fun_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fun"
    // Casen.g:182:1: fun : LBRACE ( '|' paramlist '|' )? ( NL )? ( stmt_list )? RBRACE -> ^( FUN ( paramlist )? ( stmt_list )? ) ;
    public final CasenParser.fun_return fun() throws RecognitionException {
        CasenParser.fun_return retval = new CasenParser.fun_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token LBRACE116=null;
        Token char_literal117=null;
        Token char_literal119=null;
        Token NL120=null;
        Token RBRACE122=null;
        CasenParser.paramlist_return paramlist118 =null;

        CasenParser.stmt_list_return stmt_list121 =null;


        CommonTree LBRACE116_tree=null;
        CommonTree char_literal117_tree=null;
        CommonTree char_literal119_tree=null;
        CommonTree NL120_tree=null;
        CommonTree RBRACE122_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
        RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
        RewriteRuleSubtreeStream stream_stmt_list=new RewriteRuleSubtreeStream(adaptor,"rule stmt_list");
        RewriteRuleSubtreeStream stream_paramlist=new RewriteRuleSubtreeStream(adaptor,"rule paramlist");
        try {
            // Casen.g:183:5: ( LBRACE ( '|' paramlist '|' )? ( NL )? ( stmt_list )? RBRACE -> ^( FUN ( paramlist )? ( stmt_list )? ) )
            // Casen.g:183:9: LBRACE ( '|' paramlist '|' )? ( NL )? ( stmt_list )? RBRACE
            {
            LBRACE116=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_fun1826);  
            stream_LBRACE.add(LBRACE116);


            // Casen.g:183:16: ( '|' paramlist '|' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==77) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // Casen.g:183:17: '|' paramlist '|'
                    {
                    char_literal117=(Token)match(input,77,FOLLOW_77_in_fun1829);  
                    stream_77.add(char_literal117);


                    pushFollow(FOLLOW_paramlist_in_fun1831);
                    paramlist118=paramlist();

                    state._fsp--;

                    stream_paramlist.add(paramlist118.getTree());

                    char_literal119=(Token)match(input,77,FOLLOW_77_in_fun1833);  
                    stream_77.add(char_literal119);


                    }
                    break;

            }


            // Casen.g:183:37: ( NL )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==NL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Casen.g:183:37: NL
                    {
                    NL120=(Token)match(input,NL,FOLLOW_NL_in_fun1837);  
                    stream_NL.add(NL120);


                    }
                    break;

            }


            // Casen.g:183:41: ( stmt_list )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==FCONST||(LA26_0 >= ICONST && LA26_0 <= ID)||LA26_0==LBRACE||LA26_0==LID||LA26_0==SCONST||LA26_0==35||LA26_0==42||LA26_0==49||LA26_0==66||(LA26_0 >= 73 && LA26_0 <= 76)||LA26_0==80) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // Casen.g:183:41: stmt_list
                    {
                    pushFollow(FOLLOW_stmt_list_in_fun1840);
                    stmt_list121=stmt_list();

                    state._fsp--;

                    stream_stmt_list.add(stmt_list121.getTree());

                    }
                    break;

            }


            RBRACE122=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_fun1843);  
            stream_RBRACE.add(RBRACE122);


            // AST REWRITE
            // elements: paramlist, stmt_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 183:59: -> ^( FUN ( paramlist )? ( stmt_list )? )
            {
                // Casen.g:183:62: ^( FUN ( paramlist )? ( stmt_list )? )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(FUN, "FUN")
                , root_1);

                // Casen.g:183:68: ( paramlist )?
                if ( stream_paramlist.hasNext() ) {
                    adaptor.addChild(root_1, stream_paramlist.nextTree());

                }
                stream_paramlist.reset();

                // Casen.g:183:79: ( stmt_list )?
                if ( stream_stmt_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_stmt_list.nextTree());

                }
                stream_stmt_list.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "fun"


    public static class paramlist_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "paramlist"
    // Casen.g:186:1: paramlist : ( ID ) ( ',' ID )* -> ^( PARAM ( ID )+ ) ;
    public final CasenParser.paramlist_return paramlist() throws RecognitionException {
        CasenParser.paramlist_return retval = new CasenParser.paramlist_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token ID123=null;
        Token char_literal124=null;
        Token ID125=null;

        CommonTree ID123_tree=null;
        CommonTree char_literal124_tree=null;
        CommonTree ID125_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // Casen.g:187:5: ( ( ID ) ( ',' ID )* -> ^( PARAM ( ID )+ ) )
            // Casen.g:187:12: ( ID ) ( ',' ID )*
            {
            // Casen.g:187:12: ( ID )
            // Casen.g:187:13: ID
            {
            ID123=(Token)match(input,ID,FOLLOW_ID_in_paramlist1879);  
            stream_ID.add(ID123);


            }


            // Casen.g:187:17: ( ',' ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // Casen.g:187:18: ',' ID
            	    {
            	    char_literal124=(Token)match(input,48,FOLLOW_48_in_paramlist1883);  
            	    stream_48.add(char_literal124);


            	    ID125=(Token)match(input,ID,FOLLOW_ID_in_paramlist1885);  
            	    stream_ID.add(ID125);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 187:27: -> ^( PARAM ( ID )+ )
            {
                // Casen.g:187:30: ^( PARAM ( ID )+ )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(PARAM, "PARAM")
                , root_1);

                if ( !(stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_ID.nextNode()
                    );

                }
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "paramlist"

    // Delegated rules


 

    public static final BitSet FOLLOW_NL_in_program132 = new BitSet(new long[]{0x0002040840158802L,0x0000000000011E04L});
    public static final BitSet FOLLOW_stmt_list_in_program135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labeled_stmt_in_stmt_list167 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NL_in_stmt_list170 = new BitSet(new long[]{0x0002040840158800L,0x0000000000011E04L});
    public static final BitSet FOLLOW_labeled_stmt_in_stmt_list172 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_NL_in_stmt_list177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_labeled_stmt206 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_labeled_stmt208 = new BitSet(new long[]{0x0002040840158800L,0x0000000000011E04L});
    public static final BitSet FOLLOW_stmt_in_labeled_stmt210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stmt_in_labeled_stmt231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stmt251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_stmt262 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_stmt264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_stmt283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_stmt298 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_stmt300 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_stmt302 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_stmt304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_stmt306 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_stmt308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_stmt329 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_stmt331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_stmt349 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_stmt351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_expr_in_expr377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lor_expr_in_assign_expr398 = new BitSet(new long[]{0x0A24A24000000002L,0x0000000000004101L});
    public static final BitSet FOLLOW_assignop_in_assign_expr401 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_assign_expr_in_assign_expr404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_land_expr_in_lor_expr1046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_lor_expr1050 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_land_expr_in_lor_expr1053 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_or_expr_in_land_expr1078 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_39_in_land_expr1082 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_or_expr_in_land_expr1085 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_xor_expr_in_or_expr1110 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_or_expr1114 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_xor_expr_in_or_expr1117 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr1142 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_xor_expr1146 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_and_expr_in_xor_expr1149 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_eq_expr_in_and_expr1174 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_40_in_and_expr1178 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_eq_expr_in_and_expr1181 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_ineq_expr_in_eq_expr1206 = new BitSet(new long[]{0x1000001000000002L});
    public static final BitSet FOLLOW_60_in_eq_expr1210 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_ineq_expr_in_eq_expr1213 = new BitSet(new long[]{0x1000001000000002L});
    public static final BitSet FOLLOW_36_in_eq_expr1217 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_ineq_expr_in_eq_expr1220 = new BitSet(new long[]{0x1000001000000002L});
    public static final BitSet FOLLOW_shift_expr_in_ineq_expr1245 = new BitSet(new long[]{0x6480000000000002L});
    public static final BitSet FOLLOW_55_in_ineq_expr1249 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_shift_expr_in_ineq_expr1252 = new BitSet(new long[]{0x6480000000000002L});
    public static final BitSet FOLLOW_58_in_ineq_expr1256 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_shift_expr_in_ineq_expr1259 = new BitSet(new long[]{0x6480000000000002L});
    public static final BitSet FOLLOW_62_in_ineq_expr1263 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_shift_expr_in_ineq_expr1266 = new BitSet(new long[]{0x6480000000000002L});
    public static final BitSet FOLLOW_61_in_ineq_expr1270 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_shift_expr_in_ineq_expr1273 = new BitSet(new long[]{0x6480000000000002L});
    public static final BitSet FOLLOW_plus_expr_in_shift_expr1298 = new BitSet(new long[]{0x8100000000000002L});
    public static final BitSet FOLLOW_56_in_shift_expr1302 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_plus_expr_in_shift_expr1305 = new BitSet(new long[]{0x8100000000000002L});
    public static final BitSet FOLLOW_63_in_shift_expr1309 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_plus_expr_in_shift_expr1312 = new BitSet(new long[]{0x8100000000000002L});
    public static final BitSet FOLLOW_mul_expr_in_plus_expr1337 = new BitSet(new long[]{0x0002400000000002L});
    public static final BitSet FOLLOW_46_in_plus_expr1341 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_mul_expr_in_plus_expr1344 = new BitSet(new long[]{0x0002400000000002L});
    public static final BitSet FOLLOW_49_in_plus_expr1348 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_mul_expr_in_plus_expr1351 = new BitSet(new long[]{0x0002400000000002L});
    public static final BitSet FOLLOW_unop_expr_in_mul_expr1376 = new BitSet(new long[]{0x0010102000000002L});
    public static final BitSet FOLLOW_44_in_mul_expr1380 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_mul_expr1383 = new BitSet(new long[]{0x0010102000000002L});
    public static final BitSet FOLLOW_52_in_mul_expr1387 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_mul_expr1390 = new BitSet(new long[]{0x0010102000000002L});
    public static final BitSet FOLLOW_37_in_mul_expr1394 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_mul_expr1397 = new BitSet(new long[]{0x0010102000000002L});
    public static final BitSet FOLLOW_apply_expr_in_unop_expr1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_unop_expr1433 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_unop_expr1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_unop_expr1446 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_unop_expr1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_unop_expr1459 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_unop_expr_in_unop_expr1462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_context_expr_in_apply_expr1501 = new BitSet(new long[]{0x0000040040158802L,0x0000000000000200L});
    public static final BitSet FOLLOW_context_expr_in_apply_expr1505 = new BitSet(new long[]{0x0000040040158802L,0x0000000000000200L});
    public static final BitSet FOLLOW_atom_expr_in_context_expr1536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_context_expr1539 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_context_expr1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_context_expr1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_atom_expr1579 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_atom_expr1583 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_atom_expr1586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_atom_expr1588 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_51_in_atom_expr1592 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_atom_expr1595 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_atom1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LID_in_atom1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_atom1643 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_atom1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_atom1660 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_arglist_in_atom1662 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_atom1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ICONST_in_atom1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FCONST_in_atom1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SCONST_in_atom1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_atom1713 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_atom1715 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_in_atom1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_atom1739 = new BitSet(new long[]{0xFFB6F3F800000000L,0x000000000001E181L});
    public static final BitSet FOLLOW_allops_in_atom1741 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_fun_in_atom1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fun_in_atom1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_arglist1785 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_arglist1789 = new BitSet(new long[]{0x0002040840158800L,0x0000000000010200L});
    public static final BitSet FOLLOW_expr_in_arglist1791 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_LBRACE_in_fun1826 = new BitSet(new long[]{0x0002040848958800L,0x0000000000013E04L});
    public static final BitSet FOLLOW_77_in_fun1829 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_paramlist_in_fun1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_fun1833 = new BitSet(new long[]{0x0002040848958800L,0x0000000000011E04L});
    public static final BitSet FOLLOW_NL_in_fun1837 = new BitSet(new long[]{0x0002040848158800L,0x0000000000011E04L});
    public static final BitSet FOLLOW_stmt_list_in_fun1840 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_RBRACE_in_fun1843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_paramlist1879 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_paramlist1883 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_paramlist1885 = new BitSet(new long[]{0x0001000000000002L});

}