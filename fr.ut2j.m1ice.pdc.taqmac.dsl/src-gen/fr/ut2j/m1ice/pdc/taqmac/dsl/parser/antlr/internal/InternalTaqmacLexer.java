package fr.ut2j.m1ice.pdc.taqmac.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaqmacLexer extends Lexer {
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_TYPEAFFICHAGE=5;
    public static final int EOF=-1;
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_TYPETRANSPORT=4;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__20=20;

    // delegates
    // delegators

    public InternalTaqmacLexer() {;} 
    public InternalTaqmacLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTaqmacLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalTaqmac.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:11:7: ( 'Itineraire' )
            // InternalTaqmac.g:11:9: 'Itineraire'
            {
            match("Itineraire"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:12:7: ( 'transport' )
            // InternalTaqmac.g:12:9: 'transport'
            {
            match("transport"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:13:7: ( ',' )
            // InternalTaqmac.g:13:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:14:7: ( 'affichage' )
            // InternalTaqmac.g:14:9: 'affichage'
            {
            match("affichage"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:15:7: ( 'adresse' )
            // InternalTaqmac.g:15:9: 'adresse'
            {
            match("adresse"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:16:7: ( 'horaires' )
            // InternalTaqmac.g:16:9: 'horaires'
            {
            match("horaires"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:17:7: ( 'debut' )
            // InternalTaqmac.g:17:9: 'debut'
            {
            match("debut"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:18:7: ( 'fin' )
            // InternalTaqmac.g:18:9: 'fin'
            {
            match("fin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "RULE_TYPETRANSPORT"
    public final void mRULE_TYPETRANSPORT() throws RecognitionException {
        try {
            int _type = RULE_TYPETRANSPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:493:20: ( ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' ) )
            // InternalTaqmac.g:493:22: ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' )
            {
            // InternalTaqmac.g:493:22: ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 'T':
                {
                alt1=1;
                }
                break;
            case 'V':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='o') ) {
                    alt1=2;
                }
                else if ( (LA1_2=='e') ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 'P':
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalTaqmac.g:493:23: 'Tisseo'
                    {
                    match("Tisseo"); 


                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:493:32: 'Voiture'
                    {
                    match("Voiture"); 


                    }
                    break;
                case 3 :
                    // InternalTaqmac.g:493:42: 'Pieton'
                    {
                    match("Pieton"); 


                    }
                    break;
                case 4 :
                    // InternalTaqmac.g:493:51: 'Velo'
                    {
                    match("Velo"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPETRANSPORT"

    // $ANTLR start "RULE_TYPEAFFICHAGE"
    public final void mRULE_TYPEAFFICHAGE() throws RecognitionException {
        try {
            int _type = RULE_TYPEAFFICHAGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:495:20: ( ( 'Carte' | 'Texte' ) )
            // InternalTaqmac.g:495:22: ( 'Carte' | 'Texte' )
            {
            // InternalTaqmac.g:495:22: ( 'Carte' | 'Texte' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='C') ) {
                alt2=1;
            }
            else if ( (LA2_0=='T') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTaqmac.g:495:23: 'Carte'
                    {
                    match("Carte"); 


                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:495:31: 'Texte'
                    {
                    match("Texte"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEAFFICHAGE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:497:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTaqmac.g:497:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTaqmac.g:497:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaqmac.g:497:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalTaqmac.g:497:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalTaqmac.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:499:10: ( ( '0' .. '9' )+ )
            // InternalTaqmac.g:499:12: ( '0' .. '9' )+
            {
            // InternalTaqmac.g:499:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTaqmac.g:499:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:501:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTaqmac.g:501:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTaqmac.g:501:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalTaqmac.g:501:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTaqmac.g:501:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalTaqmac.g:501:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaqmac.g:501:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:501:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTaqmac.g:501:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalTaqmac.g:501:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaqmac.g:501:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:503:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTaqmac.g:503:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTaqmac.g:503:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTaqmac.g:503:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:505:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTaqmac.g:505:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTaqmac.g:505:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaqmac.g:505:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTaqmac.g:505:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaqmac.g:505:41: ( '\\r' )? '\\n'
                    {
                    // InternalTaqmac.g:505:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTaqmac.g:505:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:507:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTaqmac.g:507:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTaqmac.g:507:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaqmac.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalTaqmac.g:509:16: ( . )
            // InternalTaqmac.g:509:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalTaqmac.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_TYPETRANSPORT | RULE_TYPEAFFICHAGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=17;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalTaqmac.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalTaqmac.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalTaqmac.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalTaqmac.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalTaqmac.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalTaqmac.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalTaqmac.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalTaqmac.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalTaqmac.g:1:58: RULE_TYPETRANSPORT
                {
                mRULE_TYPETRANSPORT(); 

                }
                break;
            case 10 :
                // InternalTaqmac.g:1:77: RULE_TYPEAFFICHAGE
                {
                mRULE_TYPEAFFICHAGE(); 

                }
                break;
            case 11 :
                // InternalTaqmac.g:1:96: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 12 :
                // InternalTaqmac.g:1:104: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalTaqmac.g:1:113: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalTaqmac.g:1:125: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalTaqmac.g:1:141: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalTaqmac.g:1:157: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalTaqmac.g:1:165: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\2\25\1\uffff\10\25\1\23\2\uffff\3\23\2\uffff\1\25\1\uffff\1\25\1\uffff\13\25\5\uffff\6\25\1\73\14\25\1\uffff\3\25\1\113\7\25\1\123\1\25\1\125\1\25\1\uffff\1\25\1\125\5\25\1\uffff\1\113\1\uffff\1\25\1\113\3\25\1\141\1\25\1\113\3\25\1\uffff\1\146\1\25\1\150\1\151\1\uffff\1\152\3\uffff";
    static final String DFA14_eofS =
        "\153\uffff";
    static final String DFA14_minS =
        "\1\0\1\164\1\162\1\uffff\1\144\1\157\1\145\1\151\2\145\1\151\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\151\1\uffff\1\141\1\uffff\1\146\2\162\1\142\1\156\1\163\1\170\1\151\1\154\1\145\1\162\5\uffff\2\156\1\151\1\145\1\141\1\165\1\60\1\163\2\164\1\157\2\164\1\145\1\163\1\143\1\163\1\151\1\164\1\uffff\2\145\1\165\1\60\1\157\1\145\1\162\1\160\1\150\1\163\1\162\1\60\1\157\1\60\1\162\1\uffff\1\156\1\60\1\141\1\157\1\141\2\145\1\uffff\1\60\1\uffff\1\145\1\60\1\151\1\162\1\147\1\60\1\163\1\60\1\162\1\164\1\145\1\uffff\1\60\1\145\2\60\1\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\162\1\uffff\1\146\1\157\1\145\2\151\1\157\1\151\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\151\1\uffff\1\141\1\uffff\1\146\2\162\1\142\1\156\1\163\1\170\1\151\1\154\1\145\1\162\5\uffff\2\156\1\151\1\145\1\141\1\165\1\172\1\163\2\164\1\157\2\164\1\145\1\163\1\143\1\163\1\151\1\164\1\uffff\2\145\1\165\1\172\1\157\1\145\1\162\1\160\1\150\1\163\1\162\1\172\1\157\1\172\1\162\1\uffff\1\156\1\172\1\141\1\157\1\141\2\145\1\uffff\1\172\1\uffff\1\145\1\172\1\151\1\162\1\147\1\172\1\163\1\172\1\162\1\164\1\145\1\uffff\1\172\1\145\2\172\1\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\3\uffff\1\3\11\uffff\1\13\1\14\3\uffff\1\20\1\21\1\uffff\1\13\1\uffff\1\3\13\uffff\1\14\1\15\1\16\1\17\1\20\23\uffff\1\10\17\uffff\1\11\7\uffff\1\7\1\uffff\1\12\13\uffff\1\5\4\uffff\1\6\1\uffff\1\2\1\4\1\1";
    static final String DFA14_specialS =
        "\1\0\16\uffff\1\1\1\2\132\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\23\2\22\2\23\1\22\22\23\1\22\1\23\1\17\4\23\1\20\4\23\1\3\2\23\1\21\12\16\7\23\2\15\1\13\5\15\1\1\6\15\1\12\3\15\1\10\1\15\1\11\4\15\3\23\1\14\1\15\1\23\1\4\2\15\1\6\1\15\1\7\1\15\1\5\13\15\1\2\6\15\uff85\23",
            "\1\24",
            "\1\26",
            "",
            "\1\31\1\uffff\1\30",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\36\3\uffff\1\35",
            "\1\40\11\uffff\1\37",
            "\1\41",
            "\1\42",
            "\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\0\44",
            "\0\44",
            "\1\45\4\uffff\1\46",
            "",
            "",
            "\1\50",
            "",
            "\1\51",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\124",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\126",
            "",
            "\1\127",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\1\135",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\136",
            "\1\137",
            "\1\140",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\142",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\147",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | RULE_TYPETRANSPORT | RULE_TYPEAFFICHAGE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='I') ) {s = 1;}

                        else if ( (LA14_0=='t') ) {s = 2;}

                        else if ( (LA14_0==',') ) {s = 3;}

                        else if ( (LA14_0=='a') ) {s = 4;}

                        else if ( (LA14_0=='h') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0=='f') ) {s = 7;}

                        else if ( (LA14_0=='T') ) {s = 8;}

                        else if ( (LA14_0=='V') ) {s = 9;}

                        else if ( (LA14_0=='P') ) {s = 10;}

                        else if ( (LA14_0=='C') ) {s = 11;}

                        else if ( (LA14_0=='^') ) {s = 12;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='c')||LA14_0=='e'||LA14_0=='g'||(LA14_0>='i' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 13;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 14;}

                        else if ( (LA14_0=='\"') ) {s = 15;}

                        else if ( (LA14_0=='\'') ) {s = 16;}

                        else if ( (LA14_0=='/') ) {s = 17;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 18;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 19;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 36;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_16 = input.LA(1);

                        s = -1;
                        if ( ((LA14_16>='\u0000' && LA14_16<='\uFFFF')) ) {s = 36;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}