package fr.ut2j.m1ice.pdc.taqmac.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ut2j.m1ice.pdc.taqmac.dsl.services.TaqmacGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaqmacParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_TYPETRANSPORT", "RULE_TYPEAFFICHAGE", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Itineraire'", "'transport'", "','", "'affichage'", "'adresse'", "'horaires'", "'debut'", "'fin'"
    };
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


        public InternalTaqmacParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaqmacParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaqmacParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaqmac.g"; }



     	private TaqmacGrammarAccess grammarAccess;

        public InternalTaqmacParser(TokenStream input, TaqmacGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Itineraire";
       	}

       	@Override
       	protected TaqmacGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleItineraire"
    // InternalTaqmac.g:64:1: entryRuleItineraire returns [EObject current=null] : iv_ruleItineraire= ruleItineraire EOF ;
    public final EObject entryRuleItineraire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItineraire = null;


        try {
            // InternalTaqmac.g:64:51: (iv_ruleItineraire= ruleItineraire EOF )
            // InternalTaqmac.g:65:2: iv_ruleItineraire= ruleItineraire EOF
            {
             newCompositeNode(grammarAccess.getItineraireRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItineraire=ruleItineraire();

            state._fsp--;

             current =iv_ruleItineraire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItineraire"


    // $ANTLR start "ruleItineraire"
    // InternalTaqmac.g:71:1: ruleItineraire returns [EObject current=null] : ( () otherlv_1= 'Itineraire' ( (lv_entreprise_2_0= ruleEString ) ) ( (lv_destination_3_0= ruleDestination ) ) ( (lv_plageHoraire_4_0= rulePlageHoraire ) ) otherlv_5= 'transport' ( (lv_modesTransport_6_0= ruleModeTransport ) ) (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )* otherlv_9= 'affichage' ( (lv_modesAffichage_10_0= ruleModeAffichage ) ) (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )* ) ;
    public final EObject ruleItineraire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_entreprise_2_0 = null;

        EObject lv_destination_3_0 = null;

        EObject lv_plageHoraire_4_0 = null;

        EObject lv_modesTransport_6_0 = null;

        EObject lv_modesTransport_8_0 = null;

        EObject lv_modesAffichage_10_0 = null;

        EObject lv_modesAffichage_12_0 = null;



        	enterRule();

        try {
            // InternalTaqmac.g:77:2: ( ( () otherlv_1= 'Itineraire' ( (lv_entreprise_2_0= ruleEString ) ) ( (lv_destination_3_0= ruleDestination ) ) ( (lv_plageHoraire_4_0= rulePlageHoraire ) ) otherlv_5= 'transport' ( (lv_modesTransport_6_0= ruleModeTransport ) ) (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )* otherlv_9= 'affichage' ( (lv_modesAffichage_10_0= ruleModeAffichage ) ) (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )* ) )
            // InternalTaqmac.g:78:2: ( () otherlv_1= 'Itineraire' ( (lv_entreprise_2_0= ruleEString ) ) ( (lv_destination_3_0= ruleDestination ) ) ( (lv_plageHoraire_4_0= rulePlageHoraire ) ) otherlv_5= 'transport' ( (lv_modesTransport_6_0= ruleModeTransport ) ) (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )* otherlv_9= 'affichage' ( (lv_modesAffichage_10_0= ruleModeAffichage ) ) (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )* )
            {
            // InternalTaqmac.g:78:2: ( () otherlv_1= 'Itineraire' ( (lv_entreprise_2_0= ruleEString ) ) ( (lv_destination_3_0= ruleDestination ) ) ( (lv_plageHoraire_4_0= rulePlageHoraire ) ) otherlv_5= 'transport' ( (lv_modesTransport_6_0= ruleModeTransport ) ) (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )* otherlv_9= 'affichage' ( (lv_modesAffichage_10_0= ruleModeAffichage ) ) (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )* )
            // InternalTaqmac.g:79:3: () otherlv_1= 'Itineraire' ( (lv_entreprise_2_0= ruleEString ) ) ( (lv_destination_3_0= ruleDestination ) ) ( (lv_plageHoraire_4_0= rulePlageHoraire ) ) otherlv_5= 'transport' ( (lv_modesTransport_6_0= ruleModeTransport ) ) (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )* otherlv_9= 'affichage' ( (lv_modesAffichage_10_0= ruleModeAffichage ) ) (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )*
            {
            // InternalTaqmac.g:79:3: ()
            // InternalTaqmac.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getItineraireAccess().getItineraireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getItineraireAccess().getItineraireKeyword_1());
            		
            // InternalTaqmac.g:90:3: ( (lv_entreprise_2_0= ruleEString ) )
            // InternalTaqmac.g:91:4: (lv_entreprise_2_0= ruleEString )
            {
            // InternalTaqmac.g:91:4: (lv_entreprise_2_0= ruleEString )
            // InternalTaqmac.g:92:5: lv_entreprise_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getItineraireAccess().getEntrepriseEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_entreprise_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItineraireRule());
            					}
            					set(
            						current,
            						"entreprise",
            						lv_entreprise_2_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaqmac.g:109:3: ( (lv_destination_3_0= ruleDestination ) )
            // InternalTaqmac.g:110:4: (lv_destination_3_0= ruleDestination )
            {
            // InternalTaqmac.g:110:4: (lv_destination_3_0= ruleDestination )
            // InternalTaqmac.g:111:5: lv_destination_3_0= ruleDestination
            {

            					newCompositeNode(grammarAccess.getItineraireAccess().getDestinationDestinationParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_destination_3_0=ruleDestination();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItineraireRule());
            					}
            					set(
            						current,
            						"destination",
            						lv_destination_3_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.Destination");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaqmac.g:128:3: ( (lv_plageHoraire_4_0= rulePlageHoraire ) )
            // InternalTaqmac.g:129:4: (lv_plageHoraire_4_0= rulePlageHoraire )
            {
            // InternalTaqmac.g:129:4: (lv_plageHoraire_4_0= rulePlageHoraire )
            // InternalTaqmac.g:130:5: lv_plageHoraire_4_0= rulePlageHoraire
            {

            					newCompositeNode(grammarAccess.getItineraireAccess().getPlageHorairePlageHoraireParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_plageHoraire_4_0=rulePlageHoraire();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItineraireRule());
            					}
            					set(
            						current,
            						"plageHoraire",
            						lv_plageHoraire_4_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.PlageHoraire");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getItineraireAccess().getTransportKeyword_5());
            		
            // InternalTaqmac.g:151:3: ( (lv_modesTransport_6_0= ruleModeTransport ) )
            // InternalTaqmac.g:152:4: (lv_modesTransport_6_0= ruleModeTransport )
            {
            // InternalTaqmac.g:152:4: (lv_modesTransport_6_0= ruleModeTransport )
            // InternalTaqmac.g:153:5: lv_modesTransport_6_0= ruleModeTransport
            {

            					newCompositeNode(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_modesTransport_6_0=ruleModeTransport();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItineraireRule());
            					}
            					add(
            						current,
            						"modesTransport",
            						lv_modesTransport_6_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.ModeTransport");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaqmac.g:170:3: (otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTaqmac.g:171:4: otherlv_7= ',' ( (lv_modesTransport_8_0= ruleModeTransport ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getItineraireAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalTaqmac.g:175:4: ( (lv_modesTransport_8_0= ruleModeTransport ) )
            	    // InternalTaqmac.g:176:5: (lv_modesTransport_8_0= ruleModeTransport )
            	    {
            	    // InternalTaqmac.g:176:5: (lv_modesTransport_8_0= ruleModeTransport )
            	    // InternalTaqmac.g:177:6: lv_modesTransport_8_0= ruleModeTransport
            	    {

            	    						newCompositeNode(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_modesTransport_8_0=ruleModeTransport();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getItineraireRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modesTransport",
            	    							lv_modesTransport_8_0,
            	    							"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.ModeTransport");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getItineraireAccess().getAffichageKeyword_8());
            		
            // InternalTaqmac.g:199:3: ( (lv_modesAffichage_10_0= ruleModeAffichage ) )
            // InternalTaqmac.g:200:4: (lv_modesAffichage_10_0= ruleModeAffichage )
            {
            // InternalTaqmac.g:200:4: (lv_modesAffichage_10_0= ruleModeAffichage )
            // InternalTaqmac.g:201:5: lv_modesAffichage_10_0= ruleModeAffichage
            {

            					newCompositeNode(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_10);
            lv_modesAffichage_10_0=ruleModeAffichage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getItineraireRule());
            					}
            					add(
            						current,
            						"modesAffichage",
            						lv_modesAffichage_10_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.ModeAffichage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalTaqmac.g:218:3: (otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTaqmac.g:219:4: otherlv_11= ',' ( (lv_modesAffichage_12_0= ruleModeAffichage ) )
            	    {
            	    otherlv_11=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_11, grammarAccess.getItineraireAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalTaqmac.g:223:4: ( (lv_modesAffichage_12_0= ruleModeAffichage ) )
            	    // InternalTaqmac.g:224:5: (lv_modesAffichage_12_0= ruleModeAffichage )
            	    {
            	    // InternalTaqmac.g:224:5: (lv_modesAffichage_12_0= ruleModeAffichage )
            	    // InternalTaqmac.g:225:6: lv_modesAffichage_12_0= ruleModeAffichage
            	    {

            	    						newCompositeNode(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_modesAffichage_12_0=ruleModeAffichage();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getItineraireRule());
            	    						}
            	    						add(
            	    							current,
            	    							"modesAffichage",
            	    							lv_modesAffichage_12_0,
            	    							"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.ModeAffichage");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItineraire"


    // $ANTLR start "entryRuleDestination"
    // InternalTaqmac.g:247:1: entryRuleDestination returns [EObject current=null] : iv_ruleDestination= ruleDestination EOF ;
    public final EObject entryRuleDestination() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDestination = null;


        try {
            // InternalTaqmac.g:247:52: (iv_ruleDestination= ruleDestination EOF )
            // InternalTaqmac.g:248:2: iv_ruleDestination= ruleDestination EOF
            {
             newCompositeNode(grammarAccess.getDestinationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDestination=ruleDestination();

            state._fsp--;

             current =iv_ruleDestination; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDestination"


    // $ANTLR start "ruleDestination"
    // InternalTaqmac.g:254:1: ruleDestination returns [EObject current=null] : ( () otherlv_1= 'adresse' ( (lv_adresse_2_0= ruleEString ) ) ) ;
    public final EObject ruleDestination() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_adresse_2_0 = null;



        	enterRule();

        try {
            // InternalTaqmac.g:260:2: ( ( () otherlv_1= 'adresse' ( (lv_adresse_2_0= ruleEString ) ) ) )
            // InternalTaqmac.g:261:2: ( () otherlv_1= 'adresse' ( (lv_adresse_2_0= ruleEString ) ) )
            {
            // InternalTaqmac.g:261:2: ( () otherlv_1= 'adresse' ( (lv_adresse_2_0= ruleEString ) ) )
            // InternalTaqmac.g:262:3: () otherlv_1= 'adresse' ( (lv_adresse_2_0= ruleEString ) )
            {
            // InternalTaqmac.g:262:3: ()
            // InternalTaqmac.g:263:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDestinationAccess().getDestinationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDestinationAccess().getAdresseKeyword_1());
            		
            // InternalTaqmac.g:273:3: ( (lv_adresse_2_0= ruleEString ) )
            // InternalTaqmac.g:274:4: (lv_adresse_2_0= ruleEString )
            {
            // InternalTaqmac.g:274:4: (lv_adresse_2_0= ruleEString )
            // InternalTaqmac.g:275:5: lv_adresse_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDestinationAccess().getAdresseEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_adresse_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDestinationRule());
            					}
            					set(
            						current,
            						"adresse",
            						lv_adresse_2_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDestination"


    // $ANTLR start "entryRulePlageHoraire"
    // InternalTaqmac.g:296:1: entryRulePlageHoraire returns [EObject current=null] : iv_rulePlageHoraire= rulePlageHoraire EOF ;
    public final EObject entryRulePlageHoraire() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlageHoraire = null;


        try {
            // InternalTaqmac.g:296:53: (iv_rulePlageHoraire= rulePlageHoraire EOF )
            // InternalTaqmac.g:297:2: iv_rulePlageHoraire= rulePlageHoraire EOF
            {
             newCompositeNode(grammarAccess.getPlageHoraireRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlageHoraire=rulePlageHoraire();

            state._fsp--;

             current =iv_rulePlageHoraire; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlageHoraire"


    // $ANTLR start "rulePlageHoraire"
    // InternalTaqmac.g:303:1: rulePlageHoraire returns [EObject current=null] : ( () otherlv_1= 'horaires' otherlv_2= 'debut' ( (lv_debut_3_0= ruleEString ) ) otherlv_4= 'fin' ( (lv_fin_5_0= ruleEString ) ) ) ;
    public final EObject rulePlageHoraire() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_debut_3_0 = null;

        AntlrDatatypeRuleToken lv_fin_5_0 = null;



        	enterRule();

        try {
            // InternalTaqmac.g:309:2: ( ( () otherlv_1= 'horaires' otherlv_2= 'debut' ( (lv_debut_3_0= ruleEString ) ) otherlv_4= 'fin' ( (lv_fin_5_0= ruleEString ) ) ) )
            // InternalTaqmac.g:310:2: ( () otherlv_1= 'horaires' otherlv_2= 'debut' ( (lv_debut_3_0= ruleEString ) ) otherlv_4= 'fin' ( (lv_fin_5_0= ruleEString ) ) )
            {
            // InternalTaqmac.g:310:2: ( () otherlv_1= 'horaires' otherlv_2= 'debut' ( (lv_debut_3_0= ruleEString ) ) otherlv_4= 'fin' ( (lv_fin_5_0= ruleEString ) ) )
            // InternalTaqmac.g:311:3: () otherlv_1= 'horaires' otherlv_2= 'debut' ( (lv_debut_3_0= ruleEString ) ) otherlv_4= 'fin' ( (lv_fin_5_0= ruleEString ) )
            {
            // InternalTaqmac.g:311:3: ()
            // InternalTaqmac.g:312:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPlageHoraireAccess().getPlageHoraireAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPlageHoraireAccess().getHorairesKeyword_1());
            		
            otherlv_2=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPlageHoraireAccess().getDebutKeyword_2());
            		
            // InternalTaqmac.g:326:3: ( (lv_debut_3_0= ruleEString ) )
            // InternalTaqmac.g:327:4: (lv_debut_3_0= ruleEString )
            {
            // InternalTaqmac.g:327:4: (lv_debut_3_0= ruleEString )
            // InternalTaqmac.g:328:5: lv_debut_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlageHoraireAccess().getDebutEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_debut_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlageHoraireRule());
            					}
            					set(
            						current,
            						"debut",
            						lv_debut_3_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPlageHoraireAccess().getFinKeyword_4());
            		
            // InternalTaqmac.g:349:3: ( (lv_fin_5_0= ruleEString ) )
            // InternalTaqmac.g:350:4: (lv_fin_5_0= ruleEString )
            {
            // InternalTaqmac.g:350:4: (lv_fin_5_0= ruleEString )
            // InternalTaqmac.g:351:5: lv_fin_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPlageHoraireAccess().getFinEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_fin_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPlageHoraireRule());
            					}
            					set(
            						current,
            						"fin",
            						lv_fin_5_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlageHoraire"


    // $ANTLR start "entryRuleModeTransport"
    // InternalTaqmac.g:372:1: entryRuleModeTransport returns [EObject current=null] : iv_ruleModeTransport= ruleModeTransport EOF ;
    public final EObject entryRuleModeTransport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeTransport = null;


        try {
            // InternalTaqmac.g:372:54: (iv_ruleModeTransport= ruleModeTransport EOF )
            // InternalTaqmac.g:373:2: iv_ruleModeTransport= ruleModeTransport EOF
            {
             newCompositeNode(grammarAccess.getModeTransportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeTransport=ruleModeTransport();

            state._fsp--;

             current =iv_ruleModeTransport; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeTransport"


    // $ANTLR start "ruleModeTransport"
    // InternalTaqmac.g:379:1: ruleModeTransport returns [EObject current=null] : ( () ( (lv_type_1_0= RULE_TYPETRANSPORT ) ) ) ;
    public final EObject ruleModeTransport() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalTaqmac.g:385:2: ( ( () ( (lv_type_1_0= RULE_TYPETRANSPORT ) ) ) )
            // InternalTaqmac.g:386:2: ( () ( (lv_type_1_0= RULE_TYPETRANSPORT ) ) )
            {
            // InternalTaqmac.g:386:2: ( () ( (lv_type_1_0= RULE_TYPETRANSPORT ) ) )
            // InternalTaqmac.g:387:3: () ( (lv_type_1_0= RULE_TYPETRANSPORT ) )
            {
            // InternalTaqmac.g:387:3: ()
            // InternalTaqmac.g:388:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModeTransportAccess().getModeTransportAction_0(),
            					current);
            			

            }

            // InternalTaqmac.g:394:3: ( (lv_type_1_0= RULE_TYPETRANSPORT ) )
            // InternalTaqmac.g:395:4: (lv_type_1_0= RULE_TYPETRANSPORT )
            {
            // InternalTaqmac.g:395:4: (lv_type_1_0= RULE_TYPETRANSPORT )
            // InternalTaqmac.g:396:5: lv_type_1_0= RULE_TYPETRANSPORT
            {
            lv_type_1_0=(Token)match(input,RULE_TYPETRANSPORT,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getModeTransportAccess().getTypeTypeTransportTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeTransportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.typeTransport");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeTransport"


    // $ANTLR start "entryRuleModeAffichage"
    // InternalTaqmac.g:416:1: entryRuleModeAffichage returns [EObject current=null] : iv_ruleModeAffichage= ruleModeAffichage EOF ;
    public final EObject entryRuleModeAffichage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModeAffichage = null;


        try {
            // InternalTaqmac.g:416:54: (iv_ruleModeAffichage= ruleModeAffichage EOF )
            // InternalTaqmac.g:417:2: iv_ruleModeAffichage= ruleModeAffichage EOF
            {
             newCompositeNode(grammarAccess.getModeAffichageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModeAffichage=ruleModeAffichage();

            state._fsp--;

             current =iv_ruleModeAffichage; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModeAffichage"


    // $ANTLR start "ruleModeAffichage"
    // InternalTaqmac.g:423:1: ruleModeAffichage returns [EObject current=null] : ( () ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) ) ) ;
    public final EObject ruleModeAffichage() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalTaqmac.g:429:2: ( ( () ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) ) ) )
            // InternalTaqmac.g:430:2: ( () ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) ) )
            {
            // InternalTaqmac.g:430:2: ( () ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) ) )
            // InternalTaqmac.g:431:3: () ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) )
            {
            // InternalTaqmac.g:431:3: ()
            // InternalTaqmac.g:432:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModeAffichageAccess().getModeAffichageAction_0(),
            					current);
            			

            }

            // InternalTaqmac.g:438:3: ( (lv_type_1_0= RULE_TYPEAFFICHAGE ) )
            // InternalTaqmac.g:439:4: (lv_type_1_0= RULE_TYPEAFFICHAGE )
            {
            // InternalTaqmac.g:439:4: (lv_type_1_0= RULE_TYPEAFFICHAGE )
            // InternalTaqmac.g:440:5: lv_type_1_0= RULE_TYPEAFFICHAGE
            {
            lv_type_1_0=(Token)match(input,RULE_TYPEAFFICHAGE,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getModeAffichageAccess().getTypeTypeAffichageTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModeAffichageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"fr.ut2j.m1ice.pdc.taqmac.dsl.Taqmac.typeAffichage");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModeAffichage"


    // $ANTLR start "entryRuleEString"
    // InternalTaqmac.g:460:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalTaqmac.g:460:47: (iv_ruleEString= ruleEString EOF )
            // InternalTaqmac.g:461:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalTaqmac.g:467:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalTaqmac.g:473:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalTaqmac.g:474:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalTaqmac.g:474:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaqmac.g:475:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalTaqmac.g:483:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});

}