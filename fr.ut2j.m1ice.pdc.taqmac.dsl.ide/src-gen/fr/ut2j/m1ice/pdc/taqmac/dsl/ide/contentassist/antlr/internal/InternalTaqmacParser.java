package fr.ut2j.m1ice.pdc.taqmac.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import fr.ut2j.m1ice.pdc.taqmac.dsl.services.TaqmacGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaqmacParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_TYPETRANSPORT", "RULE_TYPEAFFICHAGE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Itineraire'", "'transport'", "'affichage'", "','", "'adresse'", "'horaires'", "'debut'", "'fin'"
    };
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


        public InternalTaqmacParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaqmacParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaqmacParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaqmac.g"; }


    	private TaqmacGrammarAccess grammarAccess;

    	public void setGrammarAccess(TaqmacGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleItineraire"
    // InternalTaqmac.g:53:1: entryRuleItineraire : ruleItineraire EOF ;
    public final void entryRuleItineraire() throws RecognitionException {
        try {
            // InternalTaqmac.g:54:1: ( ruleItineraire EOF )
            // InternalTaqmac.g:55:1: ruleItineraire EOF
            {
             before(grammarAccess.getItineraireRule()); 
            pushFollow(FOLLOW_1);
            ruleItineraire();

            state._fsp--;

             after(grammarAccess.getItineraireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItineraire"


    // $ANTLR start "ruleItineraire"
    // InternalTaqmac.g:62:1: ruleItineraire : ( ( rule__Itineraire__Group__0 ) ) ;
    public final void ruleItineraire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:66:2: ( ( ( rule__Itineraire__Group__0 ) ) )
            // InternalTaqmac.g:67:2: ( ( rule__Itineraire__Group__0 ) )
            {
            // InternalTaqmac.g:67:2: ( ( rule__Itineraire__Group__0 ) )
            // InternalTaqmac.g:68:3: ( rule__Itineraire__Group__0 )
            {
             before(grammarAccess.getItineraireAccess().getGroup()); 
            // InternalTaqmac.g:69:3: ( rule__Itineraire__Group__0 )
            // InternalTaqmac.g:69:4: rule__Itineraire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItineraire"


    // $ANTLR start "entryRuleDestination"
    // InternalTaqmac.g:78:1: entryRuleDestination : ruleDestination EOF ;
    public final void entryRuleDestination() throws RecognitionException {
        try {
            // InternalTaqmac.g:79:1: ( ruleDestination EOF )
            // InternalTaqmac.g:80:1: ruleDestination EOF
            {
             before(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getDestinationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalTaqmac.g:87:1: ruleDestination : ( ( rule__Destination__Group__0 ) ) ;
    public final void ruleDestination() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:91:2: ( ( ( rule__Destination__Group__0 ) ) )
            // InternalTaqmac.g:92:2: ( ( rule__Destination__Group__0 ) )
            {
            // InternalTaqmac.g:92:2: ( ( rule__Destination__Group__0 ) )
            // InternalTaqmac.g:93:3: ( rule__Destination__Group__0 )
            {
             before(grammarAccess.getDestinationAccess().getGroup()); 
            // InternalTaqmac.g:94:3: ( rule__Destination__Group__0 )
            // InternalTaqmac.g:94:4: rule__Destination__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRulePlageHoraire"
    // InternalTaqmac.g:103:1: entryRulePlageHoraire : rulePlageHoraire EOF ;
    public final void entryRulePlageHoraire() throws RecognitionException {
        try {
            // InternalTaqmac.g:104:1: ( rulePlageHoraire EOF )
            // InternalTaqmac.g:105:1: rulePlageHoraire EOF
            {
             before(grammarAccess.getPlageHoraireRule()); 
            pushFollow(FOLLOW_1);
            rulePlageHoraire();

            state._fsp--;

             after(grammarAccess.getPlageHoraireRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlageHoraire"


    // $ANTLR start "rulePlageHoraire"
    // InternalTaqmac.g:112:1: rulePlageHoraire : ( ( rule__PlageHoraire__Group__0 ) ) ;
    public final void rulePlageHoraire() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:116:2: ( ( ( rule__PlageHoraire__Group__0 ) ) )
            // InternalTaqmac.g:117:2: ( ( rule__PlageHoraire__Group__0 ) )
            {
            // InternalTaqmac.g:117:2: ( ( rule__PlageHoraire__Group__0 ) )
            // InternalTaqmac.g:118:3: ( rule__PlageHoraire__Group__0 )
            {
             before(grammarAccess.getPlageHoraireAccess().getGroup()); 
            // InternalTaqmac.g:119:3: ( rule__PlageHoraire__Group__0 )
            // InternalTaqmac.g:119:4: rule__PlageHoraire__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlageHoraireAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlageHoraire"


    // $ANTLR start "entryRuleModeTransport"
    // InternalTaqmac.g:128:1: entryRuleModeTransport : ruleModeTransport EOF ;
    public final void entryRuleModeTransport() throws RecognitionException {
        try {
            // InternalTaqmac.g:129:1: ( ruleModeTransport EOF )
            // InternalTaqmac.g:130:1: ruleModeTransport EOF
            {
             before(grammarAccess.getModeTransportRule()); 
            pushFollow(FOLLOW_1);
            ruleModeTransport();

            state._fsp--;

             after(grammarAccess.getModeTransportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModeTransport"


    // $ANTLR start "ruleModeTransport"
    // InternalTaqmac.g:137:1: ruleModeTransport : ( ( rule__ModeTransport__Group__0 ) ) ;
    public final void ruleModeTransport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:141:2: ( ( ( rule__ModeTransport__Group__0 ) ) )
            // InternalTaqmac.g:142:2: ( ( rule__ModeTransport__Group__0 ) )
            {
            // InternalTaqmac.g:142:2: ( ( rule__ModeTransport__Group__0 ) )
            // InternalTaqmac.g:143:3: ( rule__ModeTransport__Group__0 )
            {
             before(grammarAccess.getModeTransportAccess().getGroup()); 
            // InternalTaqmac.g:144:3: ( rule__ModeTransport__Group__0 )
            // InternalTaqmac.g:144:4: rule__ModeTransport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModeTransport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModeTransportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModeTransport"


    // $ANTLR start "entryRuleModeAffichage"
    // InternalTaqmac.g:153:1: entryRuleModeAffichage : ruleModeAffichage EOF ;
    public final void entryRuleModeAffichage() throws RecognitionException {
        try {
            // InternalTaqmac.g:154:1: ( ruleModeAffichage EOF )
            // InternalTaqmac.g:155:1: ruleModeAffichage EOF
            {
             before(grammarAccess.getModeAffichageRule()); 
            pushFollow(FOLLOW_1);
            ruleModeAffichage();

            state._fsp--;

             after(grammarAccess.getModeAffichageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModeAffichage"


    // $ANTLR start "ruleModeAffichage"
    // InternalTaqmac.g:162:1: ruleModeAffichage : ( ( rule__ModeAffichage__Group__0 ) ) ;
    public final void ruleModeAffichage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:166:2: ( ( ( rule__ModeAffichage__Group__0 ) ) )
            // InternalTaqmac.g:167:2: ( ( rule__ModeAffichage__Group__0 ) )
            {
            // InternalTaqmac.g:167:2: ( ( rule__ModeAffichage__Group__0 ) )
            // InternalTaqmac.g:168:3: ( rule__ModeAffichage__Group__0 )
            {
             before(grammarAccess.getModeAffichageAccess().getGroup()); 
            // InternalTaqmac.g:169:3: ( rule__ModeAffichage__Group__0 )
            // InternalTaqmac.g:169:4: rule__ModeAffichage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModeAffichage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModeAffichageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModeAffichage"


    // $ANTLR start "entryRuleEString"
    // InternalTaqmac.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTaqmac.g:179:1: ( ruleEString EOF )
            // InternalTaqmac.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTaqmac.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalTaqmac.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalTaqmac.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalTaqmac.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalTaqmac.g:194:3: ( rule__EString__Alternatives )
            // InternalTaqmac.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalTaqmac.g:202:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:206:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTaqmac.g:207:2: ( RULE_STRING )
                    {
                    // InternalTaqmac.g:207:2: ( RULE_STRING )
                    // InternalTaqmac.g:208:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:213:2: ( RULE_ID )
                    {
                    // InternalTaqmac.g:213:2: ( RULE_ID )
                    // InternalTaqmac.g:214:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Itineraire__Group__0"
    // InternalTaqmac.g:223:1: rule__Itineraire__Group__0 : rule__Itineraire__Group__0__Impl rule__Itineraire__Group__1 ;
    public final void rule__Itineraire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:227:1: ( rule__Itineraire__Group__0__Impl rule__Itineraire__Group__1 )
            // InternalTaqmac.g:228:2: rule__Itineraire__Group__0__Impl rule__Itineraire__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Itineraire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__0"


    // $ANTLR start "rule__Itineraire__Group__0__Impl"
    // InternalTaqmac.g:235:1: rule__Itineraire__Group__0__Impl : ( () ) ;
    public final void rule__Itineraire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:239:1: ( ( () ) )
            // InternalTaqmac.g:240:1: ( () )
            {
            // InternalTaqmac.g:240:1: ( () )
            // InternalTaqmac.g:241:2: ()
            {
             before(grammarAccess.getItineraireAccess().getItineraireAction_0()); 
            // InternalTaqmac.g:242:2: ()
            // InternalTaqmac.g:242:3: 
            {
            }

             after(grammarAccess.getItineraireAccess().getItineraireAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__0__Impl"


    // $ANTLR start "rule__Itineraire__Group__1"
    // InternalTaqmac.g:250:1: rule__Itineraire__Group__1 : rule__Itineraire__Group__1__Impl rule__Itineraire__Group__2 ;
    public final void rule__Itineraire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:254:1: ( rule__Itineraire__Group__1__Impl rule__Itineraire__Group__2 )
            // InternalTaqmac.g:255:2: rule__Itineraire__Group__1__Impl rule__Itineraire__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Itineraire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__1"


    // $ANTLR start "rule__Itineraire__Group__1__Impl"
    // InternalTaqmac.g:262:1: rule__Itineraire__Group__1__Impl : ( 'Itineraire' ) ;
    public final void rule__Itineraire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:266:1: ( ( 'Itineraire' ) )
            // InternalTaqmac.g:267:1: ( 'Itineraire' )
            {
            // InternalTaqmac.g:267:1: ( 'Itineraire' )
            // InternalTaqmac.g:268:2: 'Itineraire'
            {
             before(grammarAccess.getItineraireAccess().getItineraireKeyword_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getItineraireAccess().getItineraireKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__1__Impl"


    // $ANTLR start "rule__Itineraire__Group__2"
    // InternalTaqmac.g:277:1: rule__Itineraire__Group__2 : rule__Itineraire__Group__2__Impl rule__Itineraire__Group__3 ;
    public final void rule__Itineraire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:281:1: ( rule__Itineraire__Group__2__Impl rule__Itineraire__Group__3 )
            // InternalTaqmac.g:282:2: rule__Itineraire__Group__2__Impl rule__Itineraire__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Itineraire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__2"


    // $ANTLR start "rule__Itineraire__Group__2__Impl"
    // InternalTaqmac.g:289:1: rule__Itineraire__Group__2__Impl : ( ( rule__Itineraire__EntrepriseAssignment_2 ) ) ;
    public final void rule__Itineraire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:293:1: ( ( ( rule__Itineraire__EntrepriseAssignment_2 ) ) )
            // InternalTaqmac.g:294:1: ( ( rule__Itineraire__EntrepriseAssignment_2 ) )
            {
            // InternalTaqmac.g:294:1: ( ( rule__Itineraire__EntrepriseAssignment_2 ) )
            // InternalTaqmac.g:295:2: ( rule__Itineraire__EntrepriseAssignment_2 )
            {
             before(grammarAccess.getItineraireAccess().getEntrepriseAssignment_2()); 
            // InternalTaqmac.g:296:2: ( rule__Itineraire__EntrepriseAssignment_2 )
            // InternalTaqmac.g:296:3: rule__Itineraire__EntrepriseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__EntrepriseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getEntrepriseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__2__Impl"


    // $ANTLR start "rule__Itineraire__Group__3"
    // InternalTaqmac.g:304:1: rule__Itineraire__Group__3 : rule__Itineraire__Group__3__Impl rule__Itineraire__Group__4 ;
    public final void rule__Itineraire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:308:1: ( rule__Itineraire__Group__3__Impl rule__Itineraire__Group__4 )
            // InternalTaqmac.g:309:2: rule__Itineraire__Group__3__Impl rule__Itineraire__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Itineraire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__3"


    // $ANTLR start "rule__Itineraire__Group__3__Impl"
    // InternalTaqmac.g:316:1: rule__Itineraire__Group__3__Impl : ( ( rule__Itineraire__DestinationAssignment_3 ) ) ;
    public final void rule__Itineraire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:320:1: ( ( ( rule__Itineraire__DestinationAssignment_3 ) ) )
            // InternalTaqmac.g:321:1: ( ( rule__Itineraire__DestinationAssignment_3 ) )
            {
            // InternalTaqmac.g:321:1: ( ( rule__Itineraire__DestinationAssignment_3 ) )
            // InternalTaqmac.g:322:2: ( rule__Itineraire__DestinationAssignment_3 )
            {
             before(grammarAccess.getItineraireAccess().getDestinationAssignment_3()); 
            // InternalTaqmac.g:323:2: ( rule__Itineraire__DestinationAssignment_3 )
            // InternalTaqmac.g:323:3: rule__Itineraire__DestinationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__DestinationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getDestinationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__3__Impl"


    // $ANTLR start "rule__Itineraire__Group__4"
    // InternalTaqmac.g:331:1: rule__Itineraire__Group__4 : rule__Itineraire__Group__4__Impl rule__Itineraire__Group__5 ;
    public final void rule__Itineraire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:335:1: ( rule__Itineraire__Group__4__Impl rule__Itineraire__Group__5 )
            // InternalTaqmac.g:336:2: rule__Itineraire__Group__4__Impl rule__Itineraire__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Itineraire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__4"


    // $ANTLR start "rule__Itineraire__Group__4__Impl"
    // InternalTaqmac.g:343:1: rule__Itineraire__Group__4__Impl : ( ( rule__Itineraire__PlageHoraireAssignment_4 ) ) ;
    public final void rule__Itineraire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:347:1: ( ( ( rule__Itineraire__PlageHoraireAssignment_4 ) ) )
            // InternalTaqmac.g:348:1: ( ( rule__Itineraire__PlageHoraireAssignment_4 ) )
            {
            // InternalTaqmac.g:348:1: ( ( rule__Itineraire__PlageHoraireAssignment_4 ) )
            // InternalTaqmac.g:349:2: ( rule__Itineraire__PlageHoraireAssignment_4 )
            {
             before(grammarAccess.getItineraireAccess().getPlageHoraireAssignment_4()); 
            // InternalTaqmac.g:350:2: ( rule__Itineraire__PlageHoraireAssignment_4 )
            // InternalTaqmac.g:350:3: rule__Itineraire__PlageHoraireAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__PlageHoraireAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getPlageHoraireAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__4__Impl"


    // $ANTLR start "rule__Itineraire__Group__5"
    // InternalTaqmac.g:358:1: rule__Itineraire__Group__5 : rule__Itineraire__Group__5__Impl rule__Itineraire__Group__6 ;
    public final void rule__Itineraire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:362:1: ( rule__Itineraire__Group__5__Impl rule__Itineraire__Group__6 )
            // InternalTaqmac.g:363:2: rule__Itineraire__Group__5__Impl rule__Itineraire__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Itineraire__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__5"


    // $ANTLR start "rule__Itineraire__Group__5__Impl"
    // InternalTaqmac.g:370:1: rule__Itineraire__Group__5__Impl : ( 'transport' ) ;
    public final void rule__Itineraire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:374:1: ( ( 'transport' ) )
            // InternalTaqmac.g:375:1: ( 'transport' )
            {
            // InternalTaqmac.g:375:1: ( 'transport' )
            // InternalTaqmac.g:376:2: 'transport'
            {
             before(grammarAccess.getItineraireAccess().getTransportKeyword_5()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getItineraireAccess().getTransportKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__5__Impl"


    // $ANTLR start "rule__Itineraire__Group__6"
    // InternalTaqmac.g:385:1: rule__Itineraire__Group__6 : rule__Itineraire__Group__6__Impl rule__Itineraire__Group__7 ;
    public final void rule__Itineraire__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:389:1: ( rule__Itineraire__Group__6__Impl rule__Itineraire__Group__7 )
            // InternalTaqmac.g:390:2: rule__Itineraire__Group__6__Impl rule__Itineraire__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Itineraire__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__6"


    // $ANTLR start "rule__Itineraire__Group__6__Impl"
    // InternalTaqmac.g:397:1: rule__Itineraire__Group__6__Impl : ( ( rule__Itineraire__ModesTransportAssignment_6 ) ) ;
    public final void rule__Itineraire__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:401:1: ( ( ( rule__Itineraire__ModesTransportAssignment_6 ) ) )
            // InternalTaqmac.g:402:1: ( ( rule__Itineraire__ModesTransportAssignment_6 ) )
            {
            // InternalTaqmac.g:402:1: ( ( rule__Itineraire__ModesTransportAssignment_6 ) )
            // InternalTaqmac.g:403:2: ( rule__Itineraire__ModesTransportAssignment_6 )
            {
             before(grammarAccess.getItineraireAccess().getModesTransportAssignment_6()); 
            // InternalTaqmac.g:404:2: ( rule__Itineraire__ModesTransportAssignment_6 )
            // InternalTaqmac.g:404:3: rule__Itineraire__ModesTransportAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__ModesTransportAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getModesTransportAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__6__Impl"


    // $ANTLR start "rule__Itineraire__Group__7"
    // InternalTaqmac.g:412:1: rule__Itineraire__Group__7 : rule__Itineraire__Group__7__Impl rule__Itineraire__Group__8 ;
    public final void rule__Itineraire__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:416:1: ( rule__Itineraire__Group__7__Impl rule__Itineraire__Group__8 )
            // InternalTaqmac.g:417:2: rule__Itineraire__Group__7__Impl rule__Itineraire__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Itineraire__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__7"


    // $ANTLR start "rule__Itineraire__Group__7__Impl"
    // InternalTaqmac.g:424:1: rule__Itineraire__Group__7__Impl : ( ( rule__Itineraire__Group_7__0 )* ) ;
    public final void rule__Itineraire__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:428:1: ( ( ( rule__Itineraire__Group_7__0 )* ) )
            // InternalTaqmac.g:429:1: ( ( rule__Itineraire__Group_7__0 )* )
            {
            // InternalTaqmac.g:429:1: ( ( rule__Itineraire__Group_7__0 )* )
            // InternalTaqmac.g:430:2: ( rule__Itineraire__Group_7__0 )*
            {
             before(grammarAccess.getItineraireAccess().getGroup_7()); 
            // InternalTaqmac.g:431:2: ( rule__Itineraire__Group_7__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaqmac.g:431:3: rule__Itineraire__Group_7__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Itineraire__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getItineraireAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__7__Impl"


    // $ANTLR start "rule__Itineraire__Group__8"
    // InternalTaqmac.g:439:1: rule__Itineraire__Group__8 : rule__Itineraire__Group__8__Impl rule__Itineraire__Group__9 ;
    public final void rule__Itineraire__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:443:1: ( rule__Itineraire__Group__8__Impl rule__Itineraire__Group__9 )
            // InternalTaqmac.g:444:2: rule__Itineraire__Group__8__Impl rule__Itineraire__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Itineraire__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__8"


    // $ANTLR start "rule__Itineraire__Group__8__Impl"
    // InternalTaqmac.g:451:1: rule__Itineraire__Group__8__Impl : ( 'affichage' ) ;
    public final void rule__Itineraire__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:455:1: ( ( 'affichage' ) )
            // InternalTaqmac.g:456:1: ( 'affichage' )
            {
            // InternalTaqmac.g:456:1: ( 'affichage' )
            // InternalTaqmac.g:457:2: 'affichage'
            {
             before(grammarAccess.getItineraireAccess().getAffichageKeyword_8()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getItineraireAccess().getAffichageKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__8__Impl"


    // $ANTLR start "rule__Itineraire__Group__9"
    // InternalTaqmac.g:466:1: rule__Itineraire__Group__9 : rule__Itineraire__Group__9__Impl rule__Itineraire__Group__10 ;
    public final void rule__Itineraire__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:470:1: ( rule__Itineraire__Group__9__Impl rule__Itineraire__Group__10 )
            // InternalTaqmac.g:471:2: rule__Itineraire__Group__9__Impl rule__Itineraire__Group__10
            {
            pushFollow(FOLLOW_12);
            rule__Itineraire__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__9"


    // $ANTLR start "rule__Itineraire__Group__9__Impl"
    // InternalTaqmac.g:478:1: rule__Itineraire__Group__9__Impl : ( ( rule__Itineraire__ModesAffichageAssignment_9 ) ) ;
    public final void rule__Itineraire__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:482:1: ( ( ( rule__Itineraire__ModesAffichageAssignment_9 ) ) )
            // InternalTaqmac.g:483:1: ( ( rule__Itineraire__ModesAffichageAssignment_9 ) )
            {
            // InternalTaqmac.g:483:1: ( ( rule__Itineraire__ModesAffichageAssignment_9 ) )
            // InternalTaqmac.g:484:2: ( rule__Itineraire__ModesAffichageAssignment_9 )
            {
             before(grammarAccess.getItineraireAccess().getModesAffichageAssignment_9()); 
            // InternalTaqmac.g:485:2: ( rule__Itineraire__ModesAffichageAssignment_9 )
            // InternalTaqmac.g:485:3: rule__Itineraire__ModesAffichageAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__ModesAffichageAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getModesAffichageAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__9__Impl"


    // $ANTLR start "rule__Itineraire__Group__10"
    // InternalTaqmac.g:493:1: rule__Itineraire__Group__10 : rule__Itineraire__Group__10__Impl ;
    public final void rule__Itineraire__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:497:1: ( rule__Itineraire__Group__10__Impl )
            // InternalTaqmac.g:498:2: rule__Itineraire__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__10"


    // $ANTLR start "rule__Itineraire__Group__10__Impl"
    // InternalTaqmac.g:504:1: rule__Itineraire__Group__10__Impl : ( ( rule__Itineraire__Group_10__0 )* ) ;
    public final void rule__Itineraire__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:508:1: ( ( ( rule__Itineraire__Group_10__0 )* ) )
            // InternalTaqmac.g:509:1: ( ( rule__Itineraire__Group_10__0 )* )
            {
            // InternalTaqmac.g:509:1: ( ( rule__Itineraire__Group_10__0 )* )
            // InternalTaqmac.g:510:2: ( rule__Itineraire__Group_10__0 )*
            {
             before(grammarAccess.getItineraireAccess().getGroup_10()); 
            // InternalTaqmac.g:511:2: ( rule__Itineraire__Group_10__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTaqmac.g:511:3: rule__Itineraire__Group_10__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Itineraire__Group_10__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getItineraireAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group__10__Impl"


    // $ANTLR start "rule__Itineraire__Group_7__0"
    // InternalTaqmac.g:520:1: rule__Itineraire__Group_7__0 : rule__Itineraire__Group_7__0__Impl rule__Itineraire__Group_7__1 ;
    public final void rule__Itineraire__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:524:1: ( rule__Itineraire__Group_7__0__Impl rule__Itineraire__Group_7__1 )
            // InternalTaqmac.g:525:2: rule__Itineraire__Group_7__0__Impl rule__Itineraire__Group_7__1
            {
            pushFollow(FOLLOW_8);
            rule__Itineraire__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_7__0"


    // $ANTLR start "rule__Itineraire__Group_7__0__Impl"
    // InternalTaqmac.g:532:1: rule__Itineraire__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Itineraire__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:536:1: ( ( ',' ) )
            // InternalTaqmac.g:537:1: ( ',' )
            {
            // InternalTaqmac.g:537:1: ( ',' )
            // InternalTaqmac.g:538:2: ','
            {
             before(grammarAccess.getItineraireAccess().getCommaKeyword_7_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getItineraireAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_7__0__Impl"


    // $ANTLR start "rule__Itineraire__Group_7__1"
    // InternalTaqmac.g:547:1: rule__Itineraire__Group_7__1 : rule__Itineraire__Group_7__1__Impl ;
    public final void rule__Itineraire__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:551:1: ( rule__Itineraire__Group_7__1__Impl )
            // InternalTaqmac.g:552:2: rule__Itineraire__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_7__1"


    // $ANTLR start "rule__Itineraire__Group_7__1__Impl"
    // InternalTaqmac.g:558:1: rule__Itineraire__Group_7__1__Impl : ( ( rule__Itineraire__ModesTransportAssignment_7_1 ) ) ;
    public final void rule__Itineraire__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:562:1: ( ( ( rule__Itineraire__ModesTransportAssignment_7_1 ) ) )
            // InternalTaqmac.g:563:1: ( ( rule__Itineraire__ModesTransportAssignment_7_1 ) )
            {
            // InternalTaqmac.g:563:1: ( ( rule__Itineraire__ModesTransportAssignment_7_1 ) )
            // InternalTaqmac.g:564:2: ( rule__Itineraire__ModesTransportAssignment_7_1 )
            {
             before(grammarAccess.getItineraireAccess().getModesTransportAssignment_7_1()); 
            // InternalTaqmac.g:565:2: ( rule__Itineraire__ModesTransportAssignment_7_1 )
            // InternalTaqmac.g:565:3: rule__Itineraire__ModesTransportAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__ModesTransportAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getModesTransportAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_7__1__Impl"


    // $ANTLR start "rule__Itineraire__Group_10__0"
    // InternalTaqmac.g:574:1: rule__Itineraire__Group_10__0 : rule__Itineraire__Group_10__0__Impl rule__Itineraire__Group_10__1 ;
    public final void rule__Itineraire__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:578:1: ( rule__Itineraire__Group_10__0__Impl rule__Itineraire__Group_10__1 )
            // InternalTaqmac.g:579:2: rule__Itineraire__Group_10__0__Impl rule__Itineraire__Group_10__1
            {
            pushFollow(FOLLOW_11);
            rule__Itineraire__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itineraire__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_10__0"


    // $ANTLR start "rule__Itineraire__Group_10__0__Impl"
    // InternalTaqmac.g:586:1: rule__Itineraire__Group_10__0__Impl : ( ',' ) ;
    public final void rule__Itineraire__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:590:1: ( ( ',' ) )
            // InternalTaqmac.g:591:1: ( ',' )
            {
            // InternalTaqmac.g:591:1: ( ',' )
            // InternalTaqmac.g:592:2: ','
            {
             before(grammarAccess.getItineraireAccess().getCommaKeyword_10_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getItineraireAccess().getCommaKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_10__0__Impl"


    // $ANTLR start "rule__Itineraire__Group_10__1"
    // InternalTaqmac.g:601:1: rule__Itineraire__Group_10__1 : rule__Itineraire__Group_10__1__Impl ;
    public final void rule__Itineraire__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:605:1: ( rule__Itineraire__Group_10__1__Impl )
            // InternalTaqmac.g:606:2: rule__Itineraire__Group_10__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__Group_10__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_10__1"


    // $ANTLR start "rule__Itineraire__Group_10__1__Impl"
    // InternalTaqmac.g:612:1: rule__Itineraire__Group_10__1__Impl : ( ( rule__Itineraire__ModesAffichageAssignment_10_1 ) ) ;
    public final void rule__Itineraire__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:616:1: ( ( ( rule__Itineraire__ModesAffichageAssignment_10_1 ) ) )
            // InternalTaqmac.g:617:1: ( ( rule__Itineraire__ModesAffichageAssignment_10_1 ) )
            {
            // InternalTaqmac.g:617:1: ( ( rule__Itineraire__ModesAffichageAssignment_10_1 ) )
            // InternalTaqmac.g:618:2: ( rule__Itineraire__ModesAffichageAssignment_10_1 )
            {
             before(grammarAccess.getItineraireAccess().getModesAffichageAssignment_10_1()); 
            // InternalTaqmac.g:619:2: ( rule__Itineraire__ModesAffichageAssignment_10_1 )
            // InternalTaqmac.g:619:3: rule__Itineraire__ModesAffichageAssignment_10_1
            {
            pushFollow(FOLLOW_2);
            rule__Itineraire__ModesAffichageAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getItineraireAccess().getModesAffichageAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__Group_10__1__Impl"


    // $ANTLR start "rule__Destination__Group__0"
    // InternalTaqmac.g:628:1: rule__Destination__Group__0 : rule__Destination__Group__0__Impl rule__Destination__Group__1 ;
    public final void rule__Destination__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:632:1: ( rule__Destination__Group__0__Impl rule__Destination__Group__1 )
            // InternalTaqmac.g:633:2: rule__Destination__Group__0__Impl rule__Destination__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Destination__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0"


    // $ANTLR start "rule__Destination__Group__0__Impl"
    // InternalTaqmac.g:640:1: rule__Destination__Group__0__Impl : ( () ) ;
    public final void rule__Destination__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:644:1: ( ( () ) )
            // InternalTaqmac.g:645:1: ( () )
            {
            // InternalTaqmac.g:645:1: ( () )
            // InternalTaqmac.g:646:2: ()
            {
             before(grammarAccess.getDestinationAccess().getDestinationAction_0()); 
            // InternalTaqmac.g:647:2: ()
            // InternalTaqmac.g:647:3: 
            {
            }

             after(grammarAccess.getDestinationAccess().getDestinationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__0__Impl"


    // $ANTLR start "rule__Destination__Group__1"
    // InternalTaqmac.g:655:1: rule__Destination__Group__1 : rule__Destination__Group__1__Impl rule__Destination__Group__2 ;
    public final void rule__Destination__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:659:1: ( rule__Destination__Group__1__Impl rule__Destination__Group__2 )
            // InternalTaqmac.g:660:2: rule__Destination__Group__1__Impl rule__Destination__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Destination__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Destination__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1"


    // $ANTLR start "rule__Destination__Group__1__Impl"
    // InternalTaqmac.g:667:1: rule__Destination__Group__1__Impl : ( 'adresse' ) ;
    public final void rule__Destination__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:671:1: ( ( 'adresse' ) )
            // InternalTaqmac.g:672:1: ( 'adresse' )
            {
            // InternalTaqmac.g:672:1: ( 'adresse' )
            // InternalTaqmac.g:673:2: 'adresse'
            {
             before(grammarAccess.getDestinationAccess().getAdresseKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDestinationAccess().getAdresseKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__1__Impl"


    // $ANTLR start "rule__Destination__Group__2"
    // InternalTaqmac.g:682:1: rule__Destination__Group__2 : rule__Destination__Group__2__Impl ;
    public final void rule__Destination__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:686:1: ( rule__Destination__Group__2__Impl )
            // InternalTaqmac.g:687:2: rule__Destination__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Destination__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2"


    // $ANTLR start "rule__Destination__Group__2__Impl"
    // InternalTaqmac.g:693:1: rule__Destination__Group__2__Impl : ( ( rule__Destination__AdresseAssignment_2 ) ) ;
    public final void rule__Destination__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:697:1: ( ( ( rule__Destination__AdresseAssignment_2 ) ) )
            // InternalTaqmac.g:698:1: ( ( rule__Destination__AdresseAssignment_2 ) )
            {
            // InternalTaqmac.g:698:1: ( ( rule__Destination__AdresseAssignment_2 ) )
            // InternalTaqmac.g:699:2: ( rule__Destination__AdresseAssignment_2 )
            {
             before(grammarAccess.getDestinationAccess().getAdresseAssignment_2()); 
            // InternalTaqmac.g:700:2: ( rule__Destination__AdresseAssignment_2 )
            // InternalTaqmac.g:700:3: rule__Destination__AdresseAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Destination__AdresseAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDestinationAccess().getAdresseAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__Group__2__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__0"
    // InternalTaqmac.g:709:1: rule__PlageHoraire__Group__0 : rule__PlageHoraire__Group__0__Impl rule__PlageHoraire__Group__1 ;
    public final void rule__PlageHoraire__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:713:1: ( rule__PlageHoraire__Group__0__Impl rule__PlageHoraire__Group__1 )
            // InternalTaqmac.g:714:2: rule__PlageHoraire__Group__0__Impl rule__PlageHoraire__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__PlageHoraire__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__0"


    // $ANTLR start "rule__PlageHoraire__Group__0__Impl"
    // InternalTaqmac.g:721:1: rule__PlageHoraire__Group__0__Impl : ( () ) ;
    public final void rule__PlageHoraire__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:725:1: ( ( () ) )
            // InternalTaqmac.g:726:1: ( () )
            {
            // InternalTaqmac.g:726:1: ( () )
            // InternalTaqmac.g:727:2: ()
            {
             before(grammarAccess.getPlageHoraireAccess().getPlageHoraireAction_0()); 
            // InternalTaqmac.g:728:2: ()
            // InternalTaqmac.g:728:3: 
            {
            }

             after(grammarAccess.getPlageHoraireAccess().getPlageHoraireAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__0__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__1"
    // InternalTaqmac.g:736:1: rule__PlageHoraire__Group__1 : rule__PlageHoraire__Group__1__Impl rule__PlageHoraire__Group__2 ;
    public final void rule__PlageHoraire__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:740:1: ( rule__PlageHoraire__Group__1__Impl rule__PlageHoraire__Group__2 )
            // InternalTaqmac.g:741:2: rule__PlageHoraire__Group__1__Impl rule__PlageHoraire__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PlageHoraire__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__1"


    // $ANTLR start "rule__PlageHoraire__Group__1__Impl"
    // InternalTaqmac.g:748:1: rule__PlageHoraire__Group__1__Impl : ( 'horaires' ) ;
    public final void rule__PlageHoraire__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:752:1: ( ( 'horaires' ) )
            // InternalTaqmac.g:753:1: ( 'horaires' )
            {
            // InternalTaqmac.g:753:1: ( 'horaires' )
            // InternalTaqmac.g:754:2: 'horaires'
            {
             before(grammarAccess.getPlageHoraireAccess().getHorairesKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPlageHoraireAccess().getHorairesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__1__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__2"
    // InternalTaqmac.g:763:1: rule__PlageHoraire__Group__2 : rule__PlageHoraire__Group__2__Impl rule__PlageHoraire__Group__3 ;
    public final void rule__PlageHoraire__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:767:1: ( rule__PlageHoraire__Group__2__Impl rule__PlageHoraire__Group__3 )
            // InternalTaqmac.g:768:2: rule__PlageHoraire__Group__2__Impl rule__PlageHoraire__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__PlageHoraire__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__2"


    // $ANTLR start "rule__PlageHoraire__Group__2__Impl"
    // InternalTaqmac.g:775:1: rule__PlageHoraire__Group__2__Impl : ( 'debut' ) ;
    public final void rule__PlageHoraire__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:779:1: ( ( 'debut' ) )
            // InternalTaqmac.g:780:1: ( 'debut' )
            {
            // InternalTaqmac.g:780:1: ( 'debut' )
            // InternalTaqmac.g:781:2: 'debut'
            {
             before(grammarAccess.getPlageHoraireAccess().getDebutKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlageHoraireAccess().getDebutKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__2__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__3"
    // InternalTaqmac.g:790:1: rule__PlageHoraire__Group__3 : rule__PlageHoraire__Group__3__Impl rule__PlageHoraire__Group__4 ;
    public final void rule__PlageHoraire__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:794:1: ( rule__PlageHoraire__Group__3__Impl rule__PlageHoraire__Group__4 )
            // InternalTaqmac.g:795:2: rule__PlageHoraire__Group__3__Impl rule__PlageHoraire__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__PlageHoraire__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__3"


    // $ANTLR start "rule__PlageHoraire__Group__3__Impl"
    // InternalTaqmac.g:802:1: rule__PlageHoraire__Group__3__Impl : ( ( rule__PlageHoraire__DebutAssignment_3 ) ) ;
    public final void rule__PlageHoraire__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:806:1: ( ( ( rule__PlageHoraire__DebutAssignment_3 ) ) )
            // InternalTaqmac.g:807:1: ( ( rule__PlageHoraire__DebutAssignment_3 ) )
            {
            // InternalTaqmac.g:807:1: ( ( rule__PlageHoraire__DebutAssignment_3 ) )
            // InternalTaqmac.g:808:2: ( rule__PlageHoraire__DebutAssignment_3 )
            {
             before(grammarAccess.getPlageHoraireAccess().getDebutAssignment_3()); 
            // InternalTaqmac.g:809:2: ( rule__PlageHoraire__DebutAssignment_3 )
            // InternalTaqmac.g:809:3: rule__PlageHoraire__DebutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PlageHoraire__DebutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPlageHoraireAccess().getDebutAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__3__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__4"
    // InternalTaqmac.g:817:1: rule__PlageHoraire__Group__4 : rule__PlageHoraire__Group__4__Impl rule__PlageHoraire__Group__5 ;
    public final void rule__PlageHoraire__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:821:1: ( rule__PlageHoraire__Group__4__Impl rule__PlageHoraire__Group__5 )
            // InternalTaqmac.g:822:2: rule__PlageHoraire__Group__4__Impl rule__PlageHoraire__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__PlageHoraire__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__4"


    // $ANTLR start "rule__PlageHoraire__Group__4__Impl"
    // InternalTaqmac.g:829:1: rule__PlageHoraire__Group__4__Impl : ( 'fin' ) ;
    public final void rule__PlageHoraire__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:833:1: ( ( 'fin' ) )
            // InternalTaqmac.g:834:1: ( 'fin' )
            {
            // InternalTaqmac.g:834:1: ( 'fin' )
            // InternalTaqmac.g:835:2: 'fin'
            {
             before(grammarAccess.getPlageHoraireAccess().getFinKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPlageHoraireAccess().getFinKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__4__Impl"


    // $ANTLR start "rule__PlageHoraire__Group__5"
    // InternalTaqmac.g:844:1: rule__PlageHoraire__Group__5 : rule__PlageHoraire__Group__5__Impl ;
    public final void rule__PlageHoraire__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:848:1: ( rule__PlageHoraire__Group__5__Impl )
            // InternalTaqmac.g:849:2: rule__PlageHoraire__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlageHoraire__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__5"


    // $ANTLR start "rule__PlageHoraire__Group__5__Impl"
    // InternalTaqmac.g:855:1: rule__PlageHoraire__Group__5__Impl : ( ( rule__PlageHoraire__FinAssignment_5 ) ) ;
    public final void rule__PlageHoraire__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:859:1: ( ( ( rule__PlageHoraire__FinAssignment_5 ) ) )
            // InternalTaqmac.g:860:1: ( ( rule__PlageHoraire__FinAssignment_5 ) )
            {
            // InternalTaqmac.g:860:1: ( ( rule__PlageHoraire__FinAssignment_5 ) )
            // InternalTaqmac.g:861:2: ( rule__PlageHoraire__FinAssignment_5 )
            {
             before(grammarAccess.getPlageHoraireAccess().getFinAssignment_5()); 
            // InternalTaqmac.g:862:2: ( rule__PlageHoraire__FinAssignment_5 )
            // InternalTaqmac.g:862:3: rule__PlageHoraire__FinAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PlageHoraire__FinAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPlageHoraireAccess().getFinAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__Group__5__Impl"


    // $ANTLR start "rule__ModeTransport__Group__0"
    // InternalTaqmac.g:871:1: rule__ModeTransport__Group__0 : rule__ModeTransport__Group__0__Impl rule__ModeTransport__Group__1 ;
    public final void rule__ModeTransport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:875:1: ( rule__ModeTransport__Group__0__Impl rule__ModeTransport__Group__1 )
            // InternalTaqmac.g:876:2: rule__ModeTransport__Group__0__Impl rule__ModeTransport__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ModeTransport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModeTransport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeTransport__Group__0"


    // $ANTLR start "rule__ModeTransport__Group__0__Impl"
    // InternalTaqmac.g:883:1: rule__ModeTransport__Group__0__Impl : ( () ) ;
    public final void rule__ModeTransport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:887:1: ( ( () ) )
            // InternalTaqmac.g:888:1: ( () )
            {
            // InternalTaqmac.g:888:1: ( () )
            // InternalTaqmac.g:889:2: ()
            {
             before(grammarAccess.getModeTransportAccess().getModeTransportAction_0()); 
            // InternalTaqmac.g:890:2: ()
            // InternalTaqmac.g:890:3: 
            {
            }

             after(grammarAccess.getModeTransportAccess().getModeTransportAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeTransport__Group__0__Impl"


    // $ANTLR start "rule__ModeTransport__Group__1"
    // InternalTaqmac.g:898:1: rule__ModeTransport__Group__1 : rule__ModeTransport__Group__1__Impl ;
    public final void rule__ModeTransport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:902:1: ( rule__ModeTransport__Group__1__Impl )
            // InternalTaqmac.g:903:2: rule__ModeTransport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModeTransport__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeTransport__Group__1"


    // $ANTLR start "rule__ModeTransport__Group__1__Impl"
    // InternalTaqmac.g:909:1: rule__ModeTransport__Group__1__Impl : ( ( rule__ModeTransport__TypeAssignment_1 ) ) ;
    public final void rule__ModeTransport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:913:1: ( ( ( rule__ModeTransport__TypeAssignment_1 ) ) )
            // InternalTaqmac.g:914:1: ( ( rule__ModeTransport__TypeAssignment_1 ) )
            {
            // InternalTaqmac.g:914:1: ( ( rule__ModeTransport__TypeAssignment_1 ) )
            // InternalTaqmac.g:915:2: ( rule__ModeTransport__TypeAssignment_1 )
            {
             before(grammarAccess.getModeTransportAccess().getTypeAssignment_1()); 
            // InternalTaqmac.g:916:2: ( rule__ModeTransport__TypeAssignment_1 )
            // InternalTaqmac.g:916:3: rule__ModeTransport__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModeTransport__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModeTransportAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeTransport__Group__1__Impl"


    // $ANTLR start "rule__ModeAffichage__Group__0"
    // InternalTaqmac.g:925:1: rule__ModeAffichage__Group__0 : rule__ModeAffichage__Group__0__Impl rule__ModeAffichage__Group__1 ;
    public final void rule__ModeAffichage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:929:1: ( rule__ModeAffichage__Group__0__Impl rule__ModeAffichage__Group__1 )
            // InternalTaqmac.g:930:2: rule__ModeAffichage__Group__0__Impl rule__ModeAffichage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ModeAffichage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ModeAffichage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeAffichage__Group__0"


    // $ANTLR start "rule__ModeAffichage__Group__0__Impl"
    // InternalTaqmac.g:937:1: rule__ModeAffichage__Group__0__Impl : ( () ) ;
    public final void rule__ModeAffichage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:941:1: ( ( () ) )
            // InternalTaqmac.g:942:1: ( () )
            {
            // InternalTaqmac.g:942:1: ( () )
            // InternalTaqmac.g:943:2: ()
            {
             before(grammarAccess.getModeAffichageAccess().getModeAffichageAction_0()); 
            // InternalTaqmac.g:944:2: ()
            // InternalTaqmac.g:944:3: 
            {
            }

             after(grammarAccess.getModeAffichageAccess().getModeAffichageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeAffichage__Group__0__Impl"


    // $ANTLR start "rule__ModeAffichage__Group__1"
    // InternalTaqmac.g:952:1: rule__ModeAffichage__Group__1 : rule__ModeAffichage__Group__1__Impl ;
    public final void rule__ModeAffichage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:956:1: ( rule__ModeAffichage__Group__1__Impl )
            // InternalTaqmac.g:957:2: rule__ModeAffichage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModeAffichage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeAffichage__Group__1"


    // $ANTLR start "rule__ModeAffichage__Group__1__Impl"
    // InternalTaqmac.g:963:1: rule__ModeAffichage__Group__1__Impl : ( ( rule__ModeAffichage__TypeAssignment_1 ) ) ;
    public final void rule__ModeAffichage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:967:1: ( ( ( rule__ModeAffichage__TypeAssignment_1 ) ) )
            // InternalTaqmac.g:968:1: ( ( rule__ModeAffichage__TypeAssignment_1 ) )
            {
            // InternalTaqmac.g:968:1: ( ( rule__ModeAffichage__TypeAssignment_1 ) )
            // InternalTaqmac.g:969:2: ( rule__ModeAffichage__TypeAssignment_1 )
            {
             before(grammarAccess.getModeAffichageAccess().getTypeAssignment_1()); 
            // InternalTaqmac.g:970:2: ( rule__ModeAffichage__TypeAssignment_1 )
            // InternalTaqmac.g:970:3: rule__ModeAffichage__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModeAffichage__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModeAffichageAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeAffichage__Group__1__Impl"


    // $ANTLR start "rule__Itineraire__EntrepriseAssignment_2"
    // InternalTaqmac.g:979:1: rule__Itineraire__EntrepriseAssignment_2 : ( ruleEString ) ;
    public final void rule__Itineraire__EntrepriseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:983:1: ( ( ruleEString ) )
            // InternalTaqmac.g:984:2: ( ruleEString )
            {
            // InternalTaqmac.g:984:2: ( ruleEString )
            // InternalTaqmac.g:985:3: ruleEString
            {
             before(grammarAccess.getItineraireAccess().getEntrepriseEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getEntrepriseEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__EntrepriseAssignment_2"


    // $ANTLR start "rule__Itineraire__DestinationAssignment_3"
    // InternalTaqmac.g:994:1: rule__Itineraire__DestinationAssignment_3 : ( ruleDestination ) ;
    public final void rule__Itineraire__DestinationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:998:1: ( ( ruleDestination ) )
            // InternalTaqmac.g:999:2: ( ruleDestination )
            {
            // InternalTaqmac.g:999:2: ( ruleDestination )
            // InternalTaqmac.g:1000:3: ruleDestination
            {
             before(grammarAccess.getItineraireAccess().getDestinationDestinationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDestination();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getDestinationDestinationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__DestinationAssignment_3"


    // $ANTLR start "rule__Itineraire__PlageHoraireAssignment_4"
    // InternalTaqmac.g:1009:1: rule__Itineraire__PlageHoraireAssignment_4 : ( rulePlageHoraire ) ;
    public final void rule__Itineraire__PlageHoraireAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1013:1: ( ( rulePlageHoraire ) )
            // InternalTaqmac.g:1014:2: ( rulePlageHoraire )
            {
            // InternalTaqmac.g:1014:2: ( rulePlageHoraire )
            // InternalTaqmac.g:1015:3: rulePlageHoraire
            {
             before(grammarAccess.getItineraireAccess().getPlageHorairePlageHoraireParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePlageHoraire();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getPlageHorairePlageHoraireParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__PlageHoraireAssignment_4"


    // $ANTLR start "rule__Itineraire__ModesTransportAssignment_6"
    // InternalTaqmac.g:1024:1: rule__Itineraire__ModesTransportAssignment_6 : ( ruleModeTransport ) ;
    public final void rule__Itineraire__ModesTransportAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1028:1: ( ( ruleModeTransport ) )
            // InternalTaqmac.g:1029:2: ( ruleModeTransport )
            {
            // InternalTaqmac.g:1029:2: ( ruleModeTransport )
            // InternalTaqmac.g:1030:3: ruleModeTransport
            {
             before(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleModeTransport();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__ModesTransportAssignment_6"


    // $ANTLR start "rule__Itineraire__ModesTransportAssignment_7_1"
    // InternalTaqmac.g:1039:1: rule__Itineraire__ModesTransportAssignment_7_1 : ( ruleModeTransport ) ;
    public final void rule__Itineraire__ModesTransportAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1043:1: ( ( ruleModeTransport ) )
            // InternalTaqmac.g:1044:2: ( ruleModeTransport )
            {
            // InternalTaqmac.g:1044:2: ( ruleModeTransport )
            // InternalTaqmac.g:1045:3: ruleModeTransport
            {
             before(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModeTransport();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__ModesTransportAssignment_7_1"


    // $ANTLR start "rule__Itineraire__ModesAffichageAssignment_9"
    // InternalTaqmac.g:1054:1: rule__Itineraire__ModesAffichageAssignment_9 : ( ruleModeAffichage ) ;
    public final void rule__Itineraire__ModesAffichageAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1058:1: ( ( ruleModeAffichage ) )
            // InternalTaqmac.g:1059:2: ( ruleModeAffichage )
            {
            // InternalTaqmac.g:1059:2: ( ruleModeAffichage )
            // InternalTaqmac.g:1060:3: ruleModeAffichage
            {
             before(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleModeAffichage();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__ModesAffichageAssignment_9"


    // $ANTLR start "rule__Itineraire__ModesAffichageAssignment_10_1"
    // InternalTaqmac.g:1069:1: rule__Itineraire__ModesAffichageAssignment_10_1 : ( ruleModeAffichage ) ;
    public final void rule__Itineraire__ModesAffichageAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1073:1: ( ( ruleModeAffichage ) )
            // InternalTaqmac.g:1074:2: ( ruleModeAffichage )
            {
            // InternalTaqmac.g:1074:2: ( ruleModeAffichage )
            // InternalTaqmac.g:1075:3: ruleModeAffichage
            {
             before(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_2);
            ruleModeAffichage();

            state._fsp--;

             after(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itineraire__ModesAffichageAssignment_10_1"


    // $ANTLR start "rule__Destination__AdresseAssignment_2"
    // InternalTaqmac.g:1084:1: rule__Destination__AdresseAssignment_2 : ( ruleEString ) ;
    public final void rule__Destination__AdresseAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1088:1: ( ( ruleEString ) )
            // InternalTaqmac.g:1089:2: ( ruleEString )
            {
            // InternalTaqmac.g:1089:2: ( ruleEString )
            // InternalTaqmac.g:1090:3: ruleEString
            {
             before(grammarAccess.getDestinationAccess().getAdresseEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDestinationAccess().getAdresseEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Destination__AdresseAssignment_2"


    // $ANTLR start "rule__PlageHoraire__DebutAssignment_3"
    // InternalTaqmac.g:1099:1: rule__PlageHoraire__DebutAssignment_3 : ( ruleEString ) ;
    public final void rule__PlageHoraire__DebutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1103:1: ( ( ruleEString ) )
            // InternalTaqmac.g:1104:2: ( ruleEString )
            {
            // InternalTaqmac.g:1104:2: ( ruleEString )
            // InternalTaqmac.g:1105:3: ruleEString
            {
             before(grammarAccess.getPlageHoraireAccess().getDebutEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlageHoraireAccess().getDebutEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__DebutAssignment_3"


    // $ANTLR start "rule__PlageHoraire__FinAssignment_5"
    // InternalTaqmac.g:1114:1: rule__PlageHoraire__FinAssignment_5 : ( ruleEString ) ;
    public final void rule__PlageHoraire__FinAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1118:1: ( ( ruleEString ) )
            // InternalTaqmac.g:1119:2: ( ruleEString )
            {
            // InternalTaqmac.g:1119:2: ( ruleEString )
            // InternalTaqmac.g:1120:3: ruleEString
            {
             before(grammarAccess.getPlageHoraireAccess().getFinEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPlageHoraireAccess().getFinEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlageHoraire__FinAssignment_5"


    // $ANTLR start "rule__ModeTransport__TypeAssignment_1"
    // InternalTaqmac.g:1129:1: rule__ModeTransport__TypeAssignment_1 : ( RULE_TYPETRANSPORT ) ;
    public final void rule__ModeTransport__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1133:1: ( ( RULE_TYPETRANSPORT ) )
            // InternalTaqmac.g:1134:2: ( RULE_TYPETRANSPORT )
            {
            // InternalTaqmac.g:1134:2: ( RULE_TYPETRANSPORT )
            // InternalTaqmac.g:1135:3: RULE_TYPETRANSPORT
            {
             before(grammarAccess.getModeTransportAccess().getTypeTypeTransportTerminalRuleCall_1_0()); 
            match(input,RULE_TYPETRANSPORT,FOLLOW_2); 
             after(grammarAccess.getModeTransportAccess().getTypeTypeTransportTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeTransport__TypeAssignment_1"


    // $ANTLR start "rule__ModeAffichage__TypeAssignment_1"
    // InternalTaqmac.g:1144:1: rule__ModeAffichage__TypeAssignment_1 : ( RULE_TYPEAFFICHAGE ) ;
    public final void rule__ModeAffichage__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaqmac.g:1148:1: ( ( RULE_TYPEAFFICHAGE ) )
            // InternalTaqmac.g:1149:2: ( RULE_TYPEAFFICHAGE )
            {
            // InternalTaqmac.g:1149:2: ( RULE_TYPEAFFICHAGE )
            // InternalTaqmac.g:1150:3: RULE_TYPEAFFICHAGE
            {
             before(grammarAccess.getModeAffichageAccess().getTypeTypeAffichageTerminalRuleCall_1_0()); 
            match(input,RULE_TYPEAFFICHAGE,FOLLOW_2); 
             after(grammarAccess.getModeAffichageAccess().getTypeTypeAffichageTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModeAffichage__TypeAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});

}