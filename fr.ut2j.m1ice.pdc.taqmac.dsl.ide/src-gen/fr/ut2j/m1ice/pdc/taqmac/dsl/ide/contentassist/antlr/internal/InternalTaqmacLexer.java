package fr.ut2j.m1ice.pdc.taqmac.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaqmacLexer extends Lexer {
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_TYPEAFFICHAGE=7;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_TYPETRANSPORT=6;
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
            // InternalTaqmac.g:13:7: ( 'affichage' )
            // InternalTaqmac.g:13:9: 'affichage'
            {
            match("affichage"); 


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
            // InternalTaqmac.g:14:7: ( ',' )
            // InternalTaqmac.g:14:9: ','
            {
            match(','); 

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
            // InternalTaqmac.g:1159:20: ( ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' | 'Bus' | 'Metro' | 'Tram' ) )
            // InternalTaqmac.g:1159:22: ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' | 'Bus' | 'Metro' | 'Tram' )
            {
            // InternalTaqmac.g:1159:22: ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' | 'Bus' | 'Metro' | 'Tram' )
            int alt1=7;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalTaqmac.g:1159:23: 'Tisseo'
                    {
                    match("Tisseo"); 


                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:1159:32: 'Voiture'
                    {
                    match("Voiture"); 


                    }
                    break;
                case 3 :
                    // InternalTaqmac.g:1159:42: 'Pieton'
                    {
                    match("Pieton"); 


                    }
                    break;
                case 4 :
                    // InternalTaqmac.g:1159:51: 'Velo'
                    {
                    match("Velo"); 


                    }
                    break;
                case 5 :
                    // InternalTaqmac.g:1159:58: 'Bus'
                    {
                    match("Bus"); 


                    }
                    break;
                case 6 :
                    // InternalTaqmac.g:1159:64: 'Metro'
                    {
                    match("Metro"); 


                    }
                    break;
                case 7 :
                    // InternalTaqmac.g:1159:72: 'Tram'
                    {
                    match("Tram"); 


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
            // InternalTaqmac.g:1161:20: ( ( 'Carte' | 'Texte' ) )
            // InternalTaqmac.g:1161:22: ( 'Carte' | 'Texte' )
            {
            // InternalTaqmac.g:1161:22: ( 'Carte' | 'Texte' )
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
                    // InternalTaqmac.g:1161:23: 'Carte'
                    {
                    match("Carte"); 


                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:1161:31: 'Texte'
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
            // InternalTaqmac.g:1163:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalTaqmac.g:1163:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalTaqmac.g:1163:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaqmac.g:1163:11: '^'
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

            // InternalTaqmac.g:1163:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // InternalTaqmac.g:1165:10: ( ( '0' .. '9' )+ )
            // InternalTaqmac.g:1165:12: ( '0' .. '9' )+
            {
            // InternalTaqmac.g:1165:12: ( '0' .. '9' )+
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
            	    // InternalTaqmac.g:1165:13: '0' .. '9'
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
            // InternalTaqmac.g:1167:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalTaqmac.g:1167:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalTaqmac.g:1167:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // InternalTaqmac.g:1167:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalTaqmac.g:1167:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // InternalTaqmac.g:1167:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaqmac.g:1167:28: ~ ( ( '\\\\' | '\"' ) )
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
                    // InternalTaqmac.g:1167:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalTaqmac.g:1167:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // InternalTaqmac.g:1167:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalTaqmac.g:1167:61: ~ ( ( '\\\\' | '\\'' ) )
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
            // InternalTaqmac.g:1169:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalTaqmac.g:1169:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalTaqmac.g:1169:24: ( options {greedy=false; } : . )*
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
            	    // InternalTaqmac.g:1169:52: .
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
            // InternalTaqmac.g:1171:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalTaqmac.g:1171:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalTaqmac.g:1171:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaqmac.g:1171:24: ~ ( ( '\\n' | '\\r' ) )
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

            // InternalTaqmac.g:1171:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaqmac.g:1171:41: ( '\\r' )? '\\n'
                    {
                    // InternalTaqmac.g:1171:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalTaqmac.g:1171:41: '\\r'
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
            // InternalTaqmac.g:1173:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalTaqmac.g:1173:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalTaqmac.g:1173:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            // InternalTaqmac.g:1175:16: ( . )
            // InternalTaqmac.g:1175:18: .
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA1_eotS =
        "\12\uffff";
    static final String DFA1_eofS =
        "\12\uffff";
    static final String DFA1_minS =
        "\1\102\1\151\1\145\7\uffff";
    static final String DFA1_maxS =
        "\1\126\1\162\1\157\7\uffff";
    static final String DFA1_acceptS =
        "\3\uffff\1\3\1\5\1\6\1\1\1\7\1\2\1\4";
    static final String DFA1_specialS =
        "\12\uffff}>";
    static final String[] DFA1_transitionS = {
            "\1\4\12\uffff\1\5\2\uffff\1\3\3\uffff\1\1\1\uffff\1\2",
            "\1\6\10\uffff\1\7",
            "\1\11\11\uffff\1\10",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "1159:22: ( 'Tisseo' | 'Voiture' | 'Pieton' | 'Velo' | 'Bus' | 'Metro' | 'Tram' )";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\3\27\1\uffff\11\27\1\25\2\uffff\3\25\2\uffff\1\27\1\uffff\3\27\1\uffff\14\27\5\uffff\6\27\1\103\6\27\1\112\10\27\1\uffff\1\27\1\112\2\27\1\112\1\27\1\uffff\7\27\1\136\1\27\1\140\2\27\1\112\1\140\5\27\1\uffff\1\112\1\uffff\1\27\1\112\3\27\1\154\1\27\1\112\3\27\1\uffff\1\161\1\27\1\163\1\164\1\uffff\1\165\3\uffff";
    static final String DFA14_eofS =
        "\166\uffff";
    static final String DFA14_minS =
        "\1\0\1\164\1\162\1\144\1\uffff\1\157\1\145\1\151\2\145\1\151\1\165\1\145\1\141\1\101\2\uffff\2\0\1\52\2\uffff\1\151\1\uffff\1\141\1\146\1\162\1\uffff\1\162\1\142\1\156\1\163\1\141\1\170\1\151\1\154\1\145\1\163\1\164\1\162\5\uffff\2\156\1\151\1\145\1\141\1\165\1\60\1\163\1\155\2\164\1\157\1\164\1\60\1\162\1\164\1\145\1\163\1\143\1\163\1\151\1\164\1\uffff\1\145\1\60\1\145\1\165\1\60\1\157\1\uffff\1\157\1\145\1\162\1\160\1\150\1\163\1\162\1\60\1\157\1\60\1\162\1\156\2\60\1\141\1\157\1\141\2\145\1\uffff\1\60\1\uffff\1\145\1\60\1\151\1\162\1\147\1\60\1\163\1\60\1\162\1\164\1\145\1\uffff\1\60\1\145\2\60\1\uffff\1\60\3\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\164\1\162\1\146\1\uffff\1\157\1\145\1\151\1\162\1\157\1\151\1\165\1\145\1\141\1\172\2\uffff\2\uffff\1\57\2\uffff\1\151\1\uffff\1\141\1\146\1\162\1\uffff\1\162\1\142\1\156\1\163\1\141\1\170\1\151\1\154\1\145\1\163\1\164\1\162\5\uffff\2\156\1\151\1\145\1\141\1\165\1\172\1\163\1\155\2\164\1\157\1\164\1\172\1\162\1\164\1\145\1\163\1\143\1\163\1\151\1\164\1\uffff\1\145\1\172\1\145\1\165\1\172\1\157\1\uffff\1\157\1\145\1\162\1\160\1\150\1\163\1\162\1\172\1\157\1\172\1\162\1\156\2\172\1\141\1\157\1\141\2\145\1\uffff\1\172\1\uffff\1\145\1\172\1\151\1\162\1\147\1\172\1\163\1\172\1\162\1\164\1\145\1\uffff\1\172\1\145\2\172\1\uffff\1\172\3\uffff";
    static final String DFA14_acceptS =
        "\4\uffff\1\4\12\uffff\1\13\1\14\3\uffff\1\20\1\21\1\uffff\1\13\3\uffff\1\4\14\uffff\1\14\1\15\1\16\1\17\1\20\26\uffff\1\10\6\uffff\1\11\23\uffff\1\7\1\uffff\1\12\13\uffff\1\5\4\uffff\1\6\1\uffff\1\2\1\3\1\1";
    static final String DFA14_specialS =
        "\1\0\20\uffff\1\2\1\1\143\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\4\25\1\22\4\25\1\4\2\25\1\23\12\20\7\25\1\17\1\13\1\15\5\17\1\1\3\17\1\14\2\17\1\12\3\17\1\10\1\17\1\11\4\17\3\25\1\16\1\17\1\25\1\3\2\17\1\6\1\17\1\7\1\17\1\5\13\17\1\2\6\17\uff85\25",
            "\1\26",
            "\1\30",
            "\1\32\1\uffff\1\31",
            "",
            "\1\34",
            "\1\35",
            "\1\36",
            "\1\41\3\uffff\1\37\10\uffff\1\40",
            "\1\43\11\uffff\1\42",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "",
            "\0\51",
            "\0\51",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\1\55",
            "",
            "\1\56",
            "\1\57",
            "\1\60",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\124",
            "\1\125",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\137",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\141",
            "\1\142",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\1\150",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\151",
            "\1\152",
            "\1\153",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\155",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\156",
            "\1\157",
            "\1\160",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\1\162",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27\1\uffff\32\27",
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

                        else if ( (LA14_0=='a') ) {s = 3;}

                        else if ( (LA14_0==',') ) {s = 4;}

                        else if ( (LA14_0=='h') ) {s = 5;}

                        else if ( (LA14_0=='d') ) {s = 6;}

                        else if ( (LA14_0=='f') ) {s = 7;}

                        else if ( (LA14_0=='T') ) {s = 8;}

                        else if ( (LA14_0=='V') ) {s = 9;}

                        else if ( (LA14_0=='P') ) {s = 10;}

                        else if ( (LA14_0=='B') ) {s = 11;}

                        else if ( (LA14_0=='M') ) {s = 12;}

                        else if ( (LA14_0=='C') ) {s = 13;}

                        else if ( (LA14_0=='^') ) {s = 14;}

                        else if ( (LA14_0=='A'||(LA14_0>='D' && LA14_0<='H')||(LA14_0>='J' && LA14_0<='L')||(LA14_0>='N' && LA14_0<='O')||(LA14_0>='Q' && LA14_0<='S')||LA14_0=='U'||(LA14_0>='W' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='b' && LA14_0<='c')||LA14_0=='e'||LA14_0=='g'||(LA14_0>='i' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 15;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 16;}

                        else if ( (LA14_0=='\"') ) {s = 17;}

                        else if ( (LA14_0=='\'') ) {s = 18;}

                        else if ( (LA14_0=='/') ) {s = 19;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 20;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='+')||(LA14_0>='-' && LA14_0<='.')||(LA14_0>=':' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_18 = input.LA(1);

                        s = -1;
                        if ( ((LA14_18>='\u0000' && LA14_18<='\uFFFF')) ) {s = 41;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_17 = input.LA(1);

                        s = -1;
                        if ( ((LA14_17>='\u0000' && LA14_17<='\uFFFF')) ) {s = 41;}

                        else s = 21;

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