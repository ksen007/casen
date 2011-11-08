// $ANTLR 3.4 Casen.g 2011-09-26 09:26:40

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CasenLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CasenLexer() {} 
    public CasenLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CasenLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Casen.g"; }

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:2:7: ( '!' )
            // Casen.g:2:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:3:7: ( '!=' )
            // Casen.g:3:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:4:7: ( '%' )
            // Casen.g:4:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:5:7: ( '%=' )
            // Casen.g:5:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:6:7: ( '&&' )
            // Casen.g:6:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:7:7: ( '&' )
            // Casen.g:7:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:8:7: ( '&=' )
            // Casen.g:8:9: '&='
            {
            match("&="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:9:7: ( '(' )
            // Casen.g:9:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:10:7: ( ')' )
            // Casen.g:10:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:11:7: ( '*' )
            // Casen.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:12:7: ( '*=' )
            // Casen.g:12:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:13:7: ( '+' )
            // Casen.g:13:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:14:7: ( '+=' )
            // Casen.g:14:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:15:7: ( ',' )
            // Casen.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:16:7: ( '-' )
            // Casen.g:16:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:17:7: ( '-=' )
            // Casen.g:17:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:18:7: ( '.' )
            // Casen.g:18:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:19:7: ( '/' )
            // Casen.g:19:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:20:7: ( '/=' )
            // Casen.g:20:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:21:7: ( ':' )
            // Casen.g:21:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:22:7: ( '<' )
            // Casen.g:22:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:23:7: ( '<<' )
            // Casen.g:23:9: '<<'
            {
            match("<<"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:24:7: ( '<<=' )
            // Casen.g:24:9: '<<='
            {
            match("<<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:25:7: ( '<=' )
            // Casen.g:25:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:26:7: ( '=' )
            // Casen.g:26:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:27:7: ( '==' )
            // Casen.g:27:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:28:7: ( '>' )
            // Casen.g:28:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:29:7: ( '>=' )
            // Casen.g:29:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:30:7: ( '>>' )
            // Casen.g:30:9: '>>'
            {
            match(">>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:31:7: ( '>>=' )
            // Casen.g:31:9: '>>='
            {
            match(">>="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:32:7: ( 'GOTO' )
            // Casen.g:32:9: 'GOTO'
            {
            match("GOTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:33:7: ( 'IF' )
            // Casen.g:33:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:34:7: ( '[' )
            // Casen.g:34:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:35:7: ( '[[' )
            // Casen.g:35:9: '[['
            {
            match("[["); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:36:7: ( ']' )
            // Casen.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:37:7: ( ']]' )
            // Casen.g:37:9: ']]'
            {
            match("]]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:38:7: ( '^' )
            // Casen.g:38:9: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:39:7: ( '^=' )
            // Casen.g:39:9: '^='
            {
            match("^="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:40:7: ( 'def' )
            // Casen.g:40:9: 'def'
            {
            match("def"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:41:7: ( 'resume' )
            // Casen.g:41:9: 'resume'
            {
            match("resume"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:42:7: ( 'return' )
            // Casen.g:42:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:43:7: ( 'yield' )
            // Casen.g:43:9: 'yield'
            {
            match("yield"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:44:7: ( '|' )
            // Casen.g:44:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:45:7: ( '|=' )
            // Casen.g:45:9: '|='
            {
            match("|="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:46:7: ( '||' )
            // Casen.g:46:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:47:7: ( '~' )
            // Casen.g:47:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:191:7: ( '{' ( NL )? )
            // Casen.g:191:9: '{' ( NL )?
            {
            match('{'); 

            // Casen.g:191:13: ( NL )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='\n'||LA1_0=='\r'||LA1_0==';') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Casen.g:191:13: NL
                    {
                    mNL(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:193:7: ( '}' )
            // Casen.g:193:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    // $ANTLR start "LID"
    public final void mLID() throws RecognitionException {
        try {
            int _type = LID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:196:5: ( '$' LETTER ( LETTER | '0' .. '9' )* )
            // Casen.g:196:10: '$' LETTER ( LETTER | '0' .. '9' )*
            {
            match('$'); 

            mLETTER(); 


            // Casen.g:196:21: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LID"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:200:5: ( LETTER ( LETTER | '0' .. '9' )* | ( SYMBOL )+ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
                alt5=1;
            }
            else if ( (LA5_0=='!'||(LA5_0 >= '%' && LA5_0 <= '&')||(LA5_0 >= '*' && LA5_0 <= '+')||LA5_0=='-'||LA5_0==':'||(LA5_0 >= '<' && LA5_0 <= '@')||LA5_0=='^'||LA5_0=='|'||LA5_0=='~') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // Casen.g:200:10: LETTER ( LETTER | '0' .. '9' )*
                    {
                    mLETTER(); 


                    // Casen.g:200:17: ( LETTER | '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // Casen.g:201:7: ( SYMBOL )+
                    {
                    // Casen.g:201:7: ( SYMBOL )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='!'||(LA4_0 >= '%' && LA4_0 <= '&')||(LA4_0 >= '*' && LA4_0 <= '+')||LA4_0=='-'||LA4_0==':'||(LA4_0 >= '<' && LA4_0 <= '@')||LA4_0=='^'||LA4_0=='|'||LA4_0=='~') ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( input.LA(1)=='!'||(input.LA(1) >= '%' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '@')||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~' ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // Casen.g:207:5: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // Casen.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "SYMBOL"
    public final void mSYMBOL() throws RecognitionException {
        try {
            // Casen.g:214:5: ( '-' | '&' | '*' | '+' | '%' | '<' | '>' | '=' | '~' | '!' | '|' | '^' | '@' | ':' | '?' )
            // Casen.g:
            {
            if ( input.LA(1)=='!'||(input.LA(1) >= '%' && input.LA(1) <= '&')||(input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)==':'||(input.LA(1) >= '<' && input.LA(1) <= '@')||input.LA(1)=='^'||input.LA(1)=='|'||input.LA(1)=='~' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SYMBOL"

    // $ANTLR start "SCONST"
    public final void mSCONST() throws RecognitionException {
        try {
            int _type = SCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:216:5: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
            // Casen.g:216:12: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // Casen.g:216:16: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\\') ) {
                    alt6=1;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // Casen.g:216:18: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // Casen.g:216:35: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SCONST"

    // $ANTLR start "ICONST"
    public final void mICONST() throws RecognitionException {
        try {
            int _type = ICONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:221:5: ( DECIMAL_LITERAL | HEX_LITERAL | OCTAL_LITERAL )
            int alt7=3;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt7=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt7=3;
                    }
                    break;
                default:
                    alt7=1;
                }

            }
            else if ( ((LA7_0 >= '1' && LA7_0 <= '9')) ) {
                alt7=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // Casen.g:221:10: DECIMAL_LITERAL
                    {
                    mDECIMAL_LITERAL(); 


                    }
                    break;
                case 2 :
                    // Casen.g:222:10: HEX_LITERAL
                    {
                    mHEX_LITERAL(); 


                    }
                    break;
                case 3 :
                    // Casen.g:223:10: OCTAL_LITERAL
                    {
                    mOCTAL_LITERAL(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ICONST"

    // $ANTLR start "DECIMAL_LITERAL"
    public final void mDECIMAL_LITERAL() throws RecognitionException {
        try {
            // Casen.g:228:17: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // Casen.g:228:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // Casen.g:228:19: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='0') ) {
                alt9=1;
            }
            else if ( ((LA9_0 >= '1' && LA9_0 <= '9')) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Casen.g:228:20: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // Casen.g:228:26: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 

                    // Casen.g:228:35: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DECIMAL_LITERAL"

    // $ANTLR start "HEX_LITERAL"
    public final void mHEX_LITERAL() throws RecognitionException {
        try {
            // Casen.g:231:13: ( '0' ( 'x' | 'X' ) ( HexDigit )+ )
            // Casen.g:231:15: '0' ( 'x' | 'X' ) ( HexDigit )+
            {
            match('0'); 

            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Casen.g:231:29: ( HexDigit )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= '0' && LA10_0 <= '9')||(LA10_0 >= 'A' && LA10_0 <= 'F')||(LA10_0 >= 'a' && LA10_0 <= 'f')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_LITERAL"

    // $ANTLR start "OCTAL_LITERAL"
    public final void mOCTAL_LITERAL() throws RecognitionException {
        try {
            // Casen.g:234:15: ( '0' ( '0' .. '7' )+ )
            // Casen.g:234:17: '0' ( '0' .. '7' )+
            {
            match('0'); 

            // Casen.g:234:21: ( '0' .. '7' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= '0' && LA11_0 <= '7')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_LITERAL"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // Casen.g:238:10: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // Casen.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "FCONST"
    public final void mFCONST() throws RecognitionException {
        try {
            int _type = FCONST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:240:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // Casen.g:240:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
                    {
                    // Casen.g:240:9: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);


                    match('.'); 

                    // Casen.g:240:25: ( '0' .. '9' )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( ((LA13_0 >= '0' && LA13_0 <= '9')) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    // Casen.g:240:37: ( Exponent )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // Casen.g:240:37: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // Casen.g:241:9: '.' ( '0' .. '9' )+ ( Exponent )?
                    {
                    match('.'); 

                    // Casen.g:241:13: ( '0' .. '9' )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '0' && LA15_0 <= '9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);


                    // Casen.g:241:25: ( Exponent )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='E'||LA16_0=='e') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // Casen.g:241:25: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // Casen.g:242:9: ( '0' .. '9' )+ Exponent
                    {
                    // Casen.g:242:9: ( '0' .. '9' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Casen.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    mExponent(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FCONST"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // Casen.g:247:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // Casen.g:247:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Casen.g:247:22: ( '+' | '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='+'||LA19_0=='-') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Casen.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Casen.g:247:33: ( '0' .. '9' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // Casen.g:251:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | OctalEscape )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\\') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='\"'||LA21_1=='\''||LA21_1=='\\'||LA21_1=='b'||LA21_1=='f'||LA21_1=='n'||LA21_1=='r'||LA21_1=='t') ) {
                    alt21=1;
                }
                else if ( ((LA21_1 >= '0' && LA21_1 <= '7')) ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // Casen.g:251:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Casen.g:252:9: OctalEscape
                    {
                    mOctalEscape(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "OctalEscape"
    public final void mOctalEscape() throws RecognitionException {
        try {
            // Casen.g:257:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt22=3;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\\') ) {
                int LA22_1 = input.LA(2);

                if ( ((LA22_1 >= '0' && LA22_1 <= '3')) ) {
                    int LA22_2 = input.LA(3);

                    if ( ((LA22_2 >= '0' && LA22_2 <= '7')) ) {
                        int LA22_4 = input.LA(4);

                        if ( ((LA22_4 >= '0' && LA22_4 <= '7')) ) {
                            alt22=1;
                        }
                        else {
                            alt22=2;
                        }
                    }
                    else {
                        alt22=3;
                    }
                }
                else if ( ((LA22_1 >= '4' && LA22_1 <= '7')) ) {
                    int LA22_3 = input.LA(3);

                    if ( ((LA22_3 >= '0' && LA22_3 <= '7')) ) {
                        alt22=2;
                    }
                    else {
                        alt22=3;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // Casen.g:257:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // Casen.g:258:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // Casen.g:259:9: '\\\\' ( '0' .. '7' )
                    {
                    match('\\'); 

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OctalEscape"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // Casen.g:264:5: ( '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit )
            // Casen.g:264:9: '\\\\' 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('\\'); 

            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:266:3: ( ( '\\r' | '\\n' | ';' )+ )
            // Casen.g:266:5: ( '\\r' | '\\n' | ';' )+
            {
            // Casen.g:266:5: ( '\\r' | '\\n' | ';' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='\n'||LA23_0=='\r'||LA23_0==';') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( input.LA(1)=='\n'||input.LA(1)=='\r'||input.LA(1)==';' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:268:5: ( ( ' ' | '\\t' | '\\u000C' ) )
            // Casen.g:268:8: ( ' ' | '\\t' | '\\u000C' )
            {
            if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Casen.g:274:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // Casen.g:274:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match('#'); 

            // Casen.g:274:11: (~ ( '\\n' | '\\r' ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0 >= '\u0000' && LA24_0 <= '\t')||(LA24_0 >= '\u000B' && LA24_0 <= '\f')||(LA24_0 >= '\u000E' && LA24_0 <= '\uFFFF')) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // Casen.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // Casen.g:274:25: ( '\\r' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='\r') ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // Casen.g:274:25: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // Casen.g:1:8: ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | LBRACE | RBRACE | LID | ID | SCONST | ICONST | FCONST | NL | WS | LINE_COMMENT )
        int alt26=56;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // Casen.g:1:10: T__35
                {
                mT__35(); 


                }
                break;
            case 2 :
                // Casen.g:1:16: T__36
                {
                mT__36(); 


                }
                break;
            case 3 :
                // Casen.g:1:22: T__37
                {
                mT__37(); 


                }
                break;
            case 4 :
                // Casen.g:1:28: T__38
                {
                mT__38(); 


                }
                break;
            case 5 :
                // Casen.g:1:34: T__39
                {
                mT__39(); 


                }
                break;
            case 6 :
                // Casen.g:1:40: T__40
                {
                mT__40(); 


                }
                break;
            case 7 :
                // Casen.g:1:46: T__41
                {
                mT__41(); 


                }
                break;
            case 8 :
                // Casen.g:1:52: T__42
                {
                mT__42(); 


                }
                break;
            case 9 :
                // Casen.g:1:58: T__43
                {
                mT__43(); 


                }
                break;
            case 10 :
                // Casen.g:1:64: T__44
                {
                mT__44(); 


                }
                break;
            case 11 :
                // Casen.g:1:70: T__45
                {
                mT__45(); 


                }
                break;
            case 12 :
                // Casen.g:1:76: T__46
                {
                mT__46(); 


                }
                break;
            case 13 :
                // Casen.g:1:82: T__47
                {
                mT__47(); 


                }
                break;
            case 14 :
                // Casen.g:1:88: T__48
                {
                mT__48(); 


                }
                break;
            case 15 :
                // Casen.g:1:94: T__49
                {
                mT__49(); 


                }
                break;
            case 16 :
                // Casen.g:1:100: T__50
                {
                mT__50(); 


                }
                break;
            case 17 :
                // Casen.g:1:106: T__51
                {
                mT__51(); 


                }
                break;
            case 18 :
                // Casen.g:1:112: T__52
                {
                mT__52(); 


                }
                break;
            case 19 :
                // Casen.g:1:118: T__53
                {
                mT__53(); 


                }
                break;
            case 20 :
                // Casen.g:1:124: T__54
                {
                mT__54(); 


                }
                break;
            case 21 :
                // Casen.g:1:130: T__55
                {
                mT__55(); 


                }
                break;
            case 22 :
                // Casen.g:1:136: T__56
                {
                mT__56(); 


                }
                break;
            case 23 :
                // Casen.g:1:142: T__57
                {
                mT__57(); 


                }
                break;
            case 24 :
                // Casen.g:1:148: T__58
                {
                mT__58(); 


                }
                break;
            case 25 :
                // Casen.g:1:154: T__59
                {
                mT__59(); 


                }
                break;
            case 26 :
                // Casen.g:1:160: T__60
                {
                mT__60(); 


                }
                break;
            case 27 :
                // Casen.g:1:166: T__61
                {
                mT__61(); 


                }
                break;
            case 28 :
                // Casen.g:1:172: T__62
                {
                mT__62(); 


                }
                break;
            case 29 :
                // Casen.g:1:178: T__63
                {
                mT__63(); 


                }
                break;
            case 30 :
                // Casen.g:1:184: T__64
                {
                mT__64(); 


                }
                break;
            case 31 :
                // Casen.g:1:190: T__65
                {
                mT__65(); 


                }
                break;
            case 32 :
                // Casen.g:1:196: T__66
                {
                mT__66(); 


                }
                break;
            case 33 :
                // Casen.g:1:202: T__67
                {
                mT__67(); 


                }
                break;
            case 34 :
                // Casen.g:1:208: T__68
                {
                mT__68(); 


                }
                break;
            case 35 :
                // Casen.g:1:214: T__69
                {
                mT__69(); 


                }
                break;
            case 36 :
                // Casen.g:1:220: T__70
                {
                mT__70(); 


                }
                break;
            case 37 :
                // Casen.g:1:226: T__71
                {
                mT__71(); 


                }
                break;
            case 38 :
                // Casen.g:1:232: T__72
                {
                mT__72(); 


                }
                break;
            case 39 :
                // Casen.g:1:238: T__73
                {
                mT__73(); 


                }
                break;
            case 40 :
                // Casen.g:1:244: T__74
                {
                mT__74(); 


                }
                break;
            case 41 :
                // Casen.g:1:250: T__75
                {
                mT__75(); 


                }
                break;
            case 42 :
                // Casen.g:1:256: T__76
                {
                mT__76(); 


                }
                break;
            case 43 :
                // Casen.g:1:262: T__77
                {
                mT__77(); 


                }
                break;
            case 44 :
                // Casen.g:1:268: T__78
                {
                mT__78(); 


                }
                break;
            case 45 :
                // Casen.g:1:274: T__79
                {
                mT__79(); 


                }
                break;
            case 46 :
                // Casen.g:1:280: T__80
                {
                mT__80(); 


                }
                break;
            case 47 :
                // Casen.g:1:286: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 48 :
                // Casen.g:1:293: RBRACE
                {
                mRBRACE(); 


                }
                break;
            case 49 :
                // Casen.g:1:300: LID
                {
                mLID(); 


                }
                break;
            case 50 :
                // Casen.g:1:304: ID
                {
                mID(); 


                }
                break;
            case 51 :
                // Casen.g:1:307: SCONST
                {
                mSCONST(); 


                }
                break;
            case 52 :
                // Casen.g:1:314: ICONST
                {
                mICONST(); 


                }
                break;
            case 53 :
                // Casen.g:1:321: FCONST
                {
                mFCONST(); 


                }
                break;
            case 54 :
                // Casen.g:1:328: NL
                {
                mNL(); 


                }
                break;
            case 55 :
                // Casen.g:1:331: WS
                {
                mWS(); 


                }
                break;
            case 56 :
                // Casen.g:1:334: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA18_eotS =
        "\5\uffff";
    static final String DFA18_eofS =
        "\5\uffff";
    static final String DFA18_minS =
        "\2\56\3\uffff";
    static final String DFA18_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA18_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA18_specialS =
        "\5\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "239:1: FCONST : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent );";
        }
    }
    static final String DFA26_eotS =
        "\1\uffff\1\45\1\47\1\52\2\uffff\1\54\1\56\1\uffff\1\60\1\61\1\64"+
        "\1\65\1\70\1\72\1\75\2\35\1\101\1\103\1\105\3\35\1\113\1\114\5\uffff"+
        "\2\115\3\uffff\1\120\1\uffff\1\121\1\uffff\1\122\1\123\1\uffff\1"+
        "\124\1\uffff\1\125\1\uffff\1\126\6\uffff\1\130\1\131\1\uffff\1\132"+
        "\1\uffff\1\133\1\135\1\uffff\1\35\1\137\4\uffff\1\140\1\uffff\3"+
        "\35\1\145\1\146\3\uffff\2\115\7\uffff\1\147\4\uffff\1\150\1\uffff"+
        "\1\35\2\uffff\1\152\3\35\4\uffff\1\156\1\uffff\3\35\1\uffff\2\35"+
        "\1\164\1\165\1\166\3\uffff";
    static final String DFA26_eofS =
        "\167\uffff";
    static final String DFA26_minS =
        "\1\11\3\41\2\uffff\2\41\1\uffff\1\41\1\60\1\75\4\41\1\117\1\106"+
        "\1\133\1\135\1\41\2\145\1\151\2\41\5\uffff\2\56\3\uffff\1\41\1\uffff"+
        "\1\41\1\uffff\2\41\1\uffff\1\41\1\uffff\1\41\1\uffff\1\41\6\uffff"+
        "\2\41\1\uffff\1\41\1\uffff\2\41\1\uffff\1\124\1\60\4\uffff\1\41"+
        "\1\uffff\1\146\1\163\1\145\2\41\3\uffff\2\56\7\uffff\1\41\4\uffff"+
        "\1\41\1\uffff\1\117\2\uffff\1\60\2\165\1\154\4\uffff\1\60\1\uffff"+
        "\1\155\1\162\1\144\1\uffff\1\145\1\156\3\60\3\uffff";
    static final String DFA26_maxS =
        "\4\176\2\uffff\2\176\1\uffff\1\176\1\71\1\75\4\176\1\117\1\106\1"+
        "\133\1\135\1\176\2\145\1\151\2\176\5\uffff\2\145\3\uffff\1\176\1"+
        "\uffff\1\176\1\uffff\2\176\1\uffff\1\176\1\uffff\1\176\1\uffff\1"+
        "\176\6\uffff\2\176\1\uffff\1\176\1\uffff\2\176\1\uffff\1\124\1\172"+
        "\4\uffff\1\176\1\uffff\1\146\1\164\1\145\2\176\3\uffff\2\145\7\uffff"+
        "\1\176\4\uffff\1\176\1\uffff\1\117\2\uffff\1\172\2\165\1\154\4\uffff"+
        "\1\172\1\uffff\1\155\1\162\1\144\1\uffff\1\145\1\156\3\172\3\uffff";
    static final String DFA26_acceptS =
        "\4\uffff\1\10\1\11\2\uffff\1\16\21\uffff\1\57\1\60\1\61\1\62\1\63"+
        "\2\uffff\1\66\1\67\1\70\1\uffff\1\1\1\uffff\1\3\2\uffff\1\6\1\uffff"+
        "\1\12\1\uffff\1\14\1\uffff\1\17\1\21\1\65\1\23\1\22\1\24\2\uffff"+
        "\1\25\1\uffff\1\31\2\uffff\1\33\2\uffff\1\42\1\41\1\44\1\43\1\uffff"+
        "\1\45\5\uffff\1\53\1\56\1\64\2\uffff\1\2\1\4\1\5\1\7\1\13\1\15\1"+
        "\20\1\uffff\1\26\1\30\1\32\1\34\1\uffff\1\35\1\uffff\1\40\1\46\4"+
        "\uffff\1\54\1\55\1\27\1\36\1\uffff\1\47\3\uffff\1\37\5\uffff\1\52"+
        "\1\50\1\51";
    static final String DFA26_specialS =
        "\167\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\42\1\41\1\uffff\1\42\1\41\22\uffff\1\42\1\1\1\36\1\43\1\34"+
            "\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\37\11"+
            "\40\1\14\1\41\1\15\1\16\1\17\10\35\1\20\1\35\1\21\21\35\1\22"+
            "\1\uffff\1\23\1\24\1\35\1\uffff\3\35\1\25\15\35\1\26\6\35\1"+
            "\27\1\35\1\32\1\30\1\33\1\31",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\44\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\46\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\1\35\1\50\3\uffff\2\35\1\uffff\1\35\14\uffff"+
            "\1\35\1\uffff\1\35\1\51\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\53\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\55\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\57\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\12\62",
            "\1\63",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\66\1\67\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\71\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\73\1\74\2\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\102",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\104\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\111\3\35\35\uffff\1\35\35\uffff\1\112\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "\1\62\1\uffff\10\116\2\62\13\uffff\1\62\37\uffff\1\62",
            "\1\62\1\uffff\12\117\13\uffff\1\62\37\uffff\1\62",
            "",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\127\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\1\35\1\134\3\35\35\uffff\1\35\35\uffff\1\35\1\uffff"+
            "\1\35",
            "",
            "\1\136",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\141",
            "\1\142\1\143",
            "\1\144",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "",
            "",
            "\1\62\1\uffff\10\116\2\62\13\uffff\1\62\37\uffff\1\62",
            "\1\62\1\uffff\12\117\13\uffff\1\62\37\uffff\1\62",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "",
            "",
            "",
            "\1\35\3\uffff\2\35\3\uffff\2\35\1\uffff\1\35\14\uffff\1\35"+
            "\1\uffff\5\35\35\uffff\1\35\35\uffff\1\35\1\uffff\1\35",
            "",
            "\1\151",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "",
            "",
            "",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
            "",
            "",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | LBRACE | RBRACE | LID | ID | SCONST | ICONST | FCONST | NL | WS | LINE_COMMENT );";
        }
    }
 

}