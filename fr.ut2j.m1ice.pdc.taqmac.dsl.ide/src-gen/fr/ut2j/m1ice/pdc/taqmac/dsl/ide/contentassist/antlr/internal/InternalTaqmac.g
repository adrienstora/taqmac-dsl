/*
 * generated by Xtext 2.14.0
 */
grammar InternalTaqmac;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package fr.ut2j.m1ice.pdc.taqmac.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleItineraire
entryRuleItineraire
:
{ before(grammarAccess.getItineraireRule()); }
	 ruleItineraire
{ after(grammarAccess.getItineraireRule()); } 
	 EOF 
;

// Rule Itineraire
ruleItineraire 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getItineraireAccess().getGroup()); }
		(rule__Itineraire__Group__0)
		{ after(grammarAccess.getItineraireAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDestination
entryRuleDestination
:
{ before(grammarAccess.getDestinationRule()); }
	 ruleDestination
{ after(grammarAccess.getDestinationRule()); } 
	 EOF 
;

// Rule Destination
ruleDestination 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDestinationAccess().getGroup()); }
		(rule__Destination__Group__0)
		{ after(grammarAccess.getDestinationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlageHoraire
entryRulePlageHoraire
:
{ before(grammarAccess.getPlageHoraireRule()); }
	 rulePlageHoraire
{ after(grammarAccess.getPlageHoraireRule()); } 
	 EOF 
;

// Rule PlageHoraire
rulePlageHoraire 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlageHoraireAccess().getGroup()); }
		(rule__PlageHoraire__Group__0)
		{ after(grammarAccess.getPlageHoraireAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModeTransport
entryRuleModeTransport
:
{ before(grammarAccess.getModeTransportRule()); }
	 ruleModeTransport
{ after(grammarAccess.getModeTransportRule()); } 
	 EOF 
;

// Rule ModeTransport
ruleModeTransport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModeTransportAccess().getGroup()); }
		(rule__ModeTransport__Group__0)
		{ after(grammarAccess.getModeTransportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModeAffichage
entryRuleModeAffichage
:
{ before(grammarAccess.getModeAffichageRule()); }
	 ruleModeAffichage
{ after(grammarAccess.getModeAffichageRule()); } 
	 EOF 
;

// Rule ModeAffichage
ruleModeAffichage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModeAffichageAccess().getGroup()); }
		(rule__ModeAffichage__Group__0)
		{ after(grammarAccess.getModeAffichageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEString
entryRuleEString
:
{ before(grammarAccess.getEStringRule()); }
	 ruleEString
{ after(grammarAccess.getEStringRule()); } 
	 EOF 
;

// Rule EString
ruleEString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEStringAccess().getAlternatives()); }
		(rule__EString__Alternatives)
		{ after(grammarAccess.getEStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
		RULE_ID
		{ after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__0__Impl
	rule__Itineraire__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getItineraireAction_0()); }
	()
	{ after(grammarAccess.getItineraireAccess().getItineraireAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__1__Impl
	rule__Itineraire__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getItineraireKeyword_1()); }
	'Itineraire'
	{ after(grammarAccess.getItineraireAccess().getItineraireKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__2__Impl
	rule__Itineraire__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getEntrepriseAssignment_2()); }
	(rule__Itineraire__EntrepriseAssignment_2)
	{ after(grammarAccess.getItineraireAccess().getEntrepriseAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__3__Impl
	rule__Itineraire__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getDestinationAssignment_3()); }
	(rule__Itineraire__DestinationAssignment_3)
	{ after(grammarAccess.getItineraireAccess().getDestinationAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__4__Impl
	rule__Itineraire__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getPlageHoraireAssignment_4()); }
	(rule__Itineraire__PlageHoraireAssignment_4)
	{ after(grammarAccess.getItineraireAccess().getPlageHoraireAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__5__Impl
	rule__Itineraire__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getTransportKeyword_5()); }
	'transport'
	{ after(grammarAccess.getItineraireAccess().getTransportKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__6__Impl
	rule__Itineraire__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getModesTransportAssignment_6()); }
	(rule__Itineraire__ModesTransportAssignment_6)
	{ after(grammarAccess.getItineraireAccess().getModesTransportAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__7__Impl
	rule__Itineraire__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getGroup_7()); }
	(rule__Itineraire__Group_7__0)*
	{ after(grammarAccess.getItineraireAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__8__Impl
	rule__Itineraire__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getAffichageKeyword_8()); }
	'affichage'
	{ after(grammarAccess.getItineraireAccess().getAffichageKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__9__Impl
	rule__Itineraire__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getModesAffichageAssignment_9()); }
	(rule__Itineraire__ModesAffichageAssignment_9)
	{ after(grammarAccess.getItineraireAccess().getModesAffichageAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getGroup_10()); }
	(rule__Itineraire__Group_10__0)*
	{ after(grammarAccess.getItineraireAccess().getGroup_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Itineraire__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group_7__0__Impl
	rule__Itineraire__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getItineraireAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getModesTransportAssignment_7_1()); }
	(rule__Itineraire__ModesTransportAssignment_7_1)
	{ after(grammarAccess.getItineraireAccess().getModesTransportAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Itineraire__Group_10__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group_10__0__Impl
	rule__Itineraire__Group_10__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_10__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getCommaKeyword_10_0()); }
	','
	{ after(grammarAccess.getItineraireAccess().getCommaKeyword_10_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_10__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Itineraire__Group_10__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__Group_10__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getItineraireAccess().getModesAffichageAssignment_10_1()); }
	(rule__Itineraire__ModesAffichageAssignment_10_1)
	{ after(grammarAccess.getItineraireAccess().getModesAffichageAssignment_10_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Destination__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__0__Impl
	rule__Destination__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getDestinationAction_0()); }
	()
	{ after(grammarAccess.getDestinationAccess().getDestinationAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__1__Impl
	rule__Destination__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getAdresseKeyword_1()); }
	'adresse'
	{ after(grammarAccess.getDestinationAccess().getAdresseKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Destination__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDestinationAccess().getAdresseAssignment_2()); }
	(rule__Destination__AdresseAssignment_2)
	{ after(grammarAccess.getDestinationAccess().getAdresseAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlageHoraire__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__0__Impl
	rule__PlageHoraire__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getPlageHoraireAction_0()); }
	()
	{ after(grammarAccess.getPlageHoraireAccess().getPlageHoraireAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__1__Impl
	rule__PlageHoraire__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getHorairesKeyword_1()); }
	'horaires'
	{ after(grammarAccess.getPlageHoraireAccess().getHorairesKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__2__Impl
	rule__PlageHoraire__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getDebutKeyword_2()); }
	'debut'
	{ after(grammarAccess.getPlageHoraireAccess().getDebutKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__3__Impl
	rule__PlageHoraire__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getDebutAssignment_3()); }
	(rule__PlageHoraire__DebutAssignment_3)
	{ after(grammarAccess.getPlageHoraireAccess().getDebutAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__4__Impl
	rule__PlageHoraire__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getFinKeyword_4()); }
	'fin'
	{ after(grammarAccess.getPlageHoraireAccess().getFinKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlageHoraire__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlageHoraireAccess().getFinAssignment_5()); }
	(rule__PlageHoraire__FinAssignment_5)
	{ after(grammarAccess.getPlageHoraireAccess().getFinAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModeTransport__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModeTransport__Group__0__Impl
	rule__ModeTransport__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeTransport__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModeTransportAccess().getModeTransportAction_0()); }
	()
	{ after(grammarAccess.getModeTransportAccess().getModeTransportAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeTransport__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModeTransport__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeTransport__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModeTransportAccess().getTypeAssignment_1()); }
	(rule__ModeTransport__TypeAssignment_1)
	{ after(grammarAccess.getModeTransportAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModeAffichage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModeAffichage__Group__0__Impl
	rule__ModeAffichage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeAffichage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModeAffichageAccess().getModeAffichageAction_0()); }
	()
	{ after(grammarAccess.getModeAffichageAccess().getModeAffichageAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeAffichage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModeAffichage__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeAffichage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModeAffichageAccess().getTypeAssignment_1()); }
	(rule__ModeAffichage__TypeAssignment_1)
	{ after(grammarAccess.getModeAffichageAccess().getTypeAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Itineraire__EntrepriseAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getEntrepriseEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getItineraireAccess().getEntrepriseEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__DestinationAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getDestinationDestinationParserRuleCall_3_0()); }
		ruleDestination
		{ after(grammarAccess.getItineraireAccess().getDestinationDestinationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__PlageHoraireAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getPlageHorairePlageHoraireParserRuleCall_4_0()); }
		rulePlageHoraire
		{ after(grammarAccess.getItineraireAccess().getPlageHorairePlageHoraireParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__ModesTransportAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_6_0()); }
		ruleModeTransport
		{ after(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__ModesTransportAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_7_1_0()); }
		ruleModeTransport
		{ after(grammarAccess.getItineraireAccess().getModesTransportModeTransportParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__ModesAffichageAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_9_0()); }
		ruleModeAffichage
		{ after(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Itineraire__ModesAffichageAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_10_1_0()); }
		ruleModeAffichage
		{ after(grammarAccess.getItineraireAccess().getModesAffichageModeAffichageParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Destination__AdresseAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDestinationAccess().getAdresseEStringParserRuleCall_2_0()); }
		ruleEString
		{ after(grammarAccess.getDestinationAccess().getAdresseEStringParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__DebutAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlageHoraireAccess().getDebutEStringParserRuleCall_3_0()); }
		ruleEString
		{ after(grammarAccess.getPlageHoraireAccess().getDebutEStringParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlageHoraire__FinAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlageHoraireAccess().getFinEStringParserRuleCall_5_0()); }
		ruleEString
		{ after(grammarAccess.getPlageHoraireAccess().getFinEStringParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeTransport__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModeTransportAccess().getTypeTypeTransportTerminalRuleCall_1_0()); }
		RULE_TYPETRANSPORT
		{ after(grammarAccess.getModeTransportAccess().getTypeTypeTransportTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModeAffichage__TypeAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModeAffichageAccess().getTypeTypeAffichageTerminalRuleCall_1_0()); }
		RULE_TYPEAFFICHAGE
		{ after(grammarAccess.getModeAffichageAccess().getTypeTypeAffichageTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_TYPETRANSPORT : ('Tisseo'|'Voiture'|'Pieton'|'Velo');

RULE_TYPEAFFICHAGE : ('Carte'|'Texte');

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
