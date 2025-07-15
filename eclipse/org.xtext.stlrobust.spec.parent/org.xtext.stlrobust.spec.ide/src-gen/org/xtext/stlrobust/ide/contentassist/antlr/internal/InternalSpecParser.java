package org.xtext.stlrobust.ide.contentassist.antlr.internal;

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
import org.xtext.stlrobust.services.SpecGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpecParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'a'", "'>'", "'>='", "'='", "'<'", "'<='", "'ms'", "'s'", "'min'", "'signal'", "'from'", "'specification'", "':'", "'scope'", "'pattern'", "'Globally'", "'Before'", "'After'", "'Between'", "'and'", "'until'", "'Universality:'", "'Absence:'", "'Existence:'", "'MinimumDuration:'", "'MaximumDuration:'", "'Recurrence:'", "'Precedence:'", "'Until:'", "'Response:'", "'ResponseInvariance:'", "'it-is-always-the-case-that'", "'holds'", "'It-is-never-the-case-that'", "'Eventually'", "'if'", "'then-in-response'", "'eventually holds'", "'.'", "'within'", "'after'", "'between'", "'-'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSpecParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpecParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpecParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpec.g"; }


    	private SpecGrammarAccess grammarAccess;

    	public void setGrammarAccess(SpecGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalSpec.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalSpec.g:54:1: ( ruleModel EOF )
            // InternalSpec.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSpec.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalSpec.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalSpec.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalSpec.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalSpec.g:69:3: ( rule__Model__Group__0 )
            // InternalSpec.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSignal"
    // InternalSpec.g:78:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // InternalSpec.g:79:1: ( ruleSignal EOF )
            // InternalSpec.g:80:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_1);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // InternalSpec.g:87:1: ruleSignal : ( ( rule__Signal__Group__0 ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:91:2: ( ( ( rule__Signal__Group__0 ) ) )
            // InternalSpec.g:92:2: ( ( rule__Signal__Group__0 ) )
            {
            // InternalSpec.g:92:2: ( ( rule__Signal__Group__0 ) )
            // InternalSpec.g:93:3: ( rule__Signal__Group__0 )
            {
             before(grammarAccess.getSignalAccess().getGroup()); 
            // InternalSpec.g:94:3: ( rule__Signal__Group__0 )
            // InternalSpec.g:94:4: rule__Signal__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getGroup()); 

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleSpecification"
    // InternalSpec.g:103:1: entryRuleSpecification : ruleSpecification EOF ;
    public final void entryRuleSpecification() throws RecognitionException {
        try {
            // InternalSpec.g:104:1: ( ruleSpecification EOF )
            // InternalSpec.g:105:1: ruleSpecification EOF
            {
             before(grammarAccess.getSpecificationRule()); 
            pushFollow(FOLLOW_1);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getSpecificationRule()); 
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
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalSpec.g:112:1: ruleSpecification : ( ( rule__Specification__Group__0 ) ) ;
    public final void ruleSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:116:2: ( ( ( rule__Specification__Group__0 ) ) )
            // InternalSpec.g:117:2: ( ( rule__Specification__Group__0 ) )
            {
            // InternalSpec.g:117:2: ( ( rule__Specification__Group__0 ) )
            // InternalSpec.g:118:3: ( rule__Specification__Group__0 )
            {
             before(grammarAccess.getSpecificationAccess().getGroup()); 
            // InternalSpec.g:119:3: ( rule__Specification__Group__0 )
            // InternalSpec.g:119:4: rule__Specification__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getGroup()); 

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
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRuleScope"
    // InternalSpec.g:128:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalSpec.g:129:1: ( ruleScope EOF )
            // InternalSpec.g:130:1: ruleScope EOF
            {
             before(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getScopeRule()); 
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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalSpec.g:137:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:141:2: ( ( ( rule__Scope__Alternatives ) ) )
            // InternalSpec.g:142:2: ( ( rule__Scope__Alternatives ) )
            {
            // InternalSpec.g:142:2: ( ( rule__Scope__Alternatives ) )
            // InternalSpec.g:143:3: ( rule__Scope__Alternatives )
            {
             before(grammarAccess.getScopeAccess().getAlternatives()); 
            // InternalSpec.g:144:3: ( rule__Scope__Alternatives )
            // InternalSpec.g:144:4: rule__Scope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRulePattern"
    // InternalSpec.g:153:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalSpec.g:154:1: ( rulePattern EOF )
            // InternalSpec.g:155:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalSpec.g:162:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:166:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalSpec.g:167:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalSpec.g:167:2: ( ( rule__Pattern__Alternatives ) )
            // InternalSpec.g:168:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalSpec.g:169:3: ( rule__Pattern__Alternatives )
            // InternalSpec.g:169:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleUniversality"
    // InternalSpec.g:178:1: entryRuleUniversality : ruleUniversality EOF ;
    public final void entryRuleUniversality() throws RecognitionException {
        try {
            // InternalSpec.g:179:1: ( ruleUniversality EOF )
            // InternalSpec.g:180:1: ruleUniversality EOF
            {
             before(grammarAccess.getUniversalityRule()); 
            pushFollow(FOLLOW_1);
            ruleUniversality();

            state._fsp--;

             after(grammarAccess.getUniversalityRule()); 
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
    // $ANTLR end "entryRuleUniversality"


    // $ANTLR start "ruleUniversality"
    // InternalSpec.g:187:1: ruleUniversality : ( ( rule__Universality__Group__0 ) ) ;
    public final void ruleUniversality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:191:2: ( ( ( rule__Universality__Group__0 ) ) )
            // InternalSpec.g:192:2: ( ( rule__Universality__Group__0 ) )
            {
            // InternalSpec.g:192:2: ( ( rule__Universality__Group__0 ) )
            // InternalSpec.g:193:3: ( rule__Universality__Group__0 )
            {
             before(grammarAccess.getUniversalityAccess().getGroup()); 
            // InternalSpec.g:194:3: ( rule__Universality__Group__0 )
            // InternalSpec.g:194:4: rule__Universality__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Universality__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUniversalityAccess().getGroup()); 

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
    // $ANTLR end "ruleUniversality"


    // $ANTLR start "entryRuleAbsence"
    // InternalSpec.g:203:1: entryRuleAbsence : ruleAbsence EOF ;
    public final void entryRuleAbsence() throws RecognitionException {
        try {
            // InternalSpec.g:204:1: ( ruleAbsence EOF )
            // InternalSpec.g:205:1: ruleAbsence EOF
            {
             before(grammarAccess.getAbsenceRule()); 
            pushFollow(FOLLOW_1);
            ruleAbsence();

            state._fsp--;

             after(grammarAccess.getAbsenceRule()); 
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
    // $ANTLR end "entryRuleAbsence"


    // $ANTLR start "ruleAbsence"
    // InternalSpec.g:212:1: ruleAbsence : ( ( rule__Absence__Group__0 ) ) ;
    public final void ruleAbsence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:216:2: ( ( ( rule__Absence__Group__0 ) ) )
            // InternalSpec.g:217:2: ( ( rule__Absence__Group__0 ) )
            {
            // InternalSpec.g:217:2: ( ( rule__Absence__Group__0 ) )
            // InternalSpec.g:218:3: ( rule__Absence__Group__0 )
            {
             before(grammarAccess.getAbsenceAccess().getGroup()); 
            // InternalSpec.g:219:3: ( rule__Absence__Group__0 )
            // InternalSpec.g:219:4: rule__Absence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Absence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAbsenceAccess().getGroup()); 

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
    // $ANTLR end "ruleAbsence"


    // $ANTLR start "entryRuleExistence"
    // InternalSpec.g:228:1: entryRuleExistence : ruleExistence EOF ;
    public final void entryRuleExistence() throws RecognitionException {
        try {
            // InternalSpec.g:229:1: ( ruleExistence EOF )
            // InternalSpec.g:230:1: ruleExistence EOF
            {
             before(grammarAccess.getExistenceRule()); 
            pushFollow(FOLLOW_1);
            ruleExistence();

            state._fsp--;

             after(grammarAccess.getExistenceRule()); 
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
    // $ANTLR end "entryRuleExistence"


    // $ANTLR start "ruleExistence"
    // InternalSpec.g:237:1: ruleExistence : ( ( rule__Existence__Group__0 ) ) ;
    public final void ruleExistence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:241:2: ( ( ( rule__Existence__Group__0 ) ) )
            // InternalSpec.g:242:2: ( ( rule__Existence__Group__0 ) )
            {
            // InternalSpec.g:242:2: ( ( rule__Existence__Group__0 ) )
            // InternalSpec.g:243:3: ( rule__Existence__Group__0 )
            {
             before(grammarAccess.getExistenceAccess().getGroup()); 
            // InternalSpec.g:244:3: ( rule__Existence__Group__0 )
            // InternalSpec.g:244:4: rule__Existence__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Existence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExistenceAccess().getGroup()); 

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
    // $ANTLR end "ruleExistence"


    // $ANTLR start "entryRuleMinimumDuration"
    // InternalSpec.g:253:1: entryRuleMinimumDuration : ruleMinimumDuration EOF ;
    public final void entryRuleMinimumDuration() throws RecognitionException {
        try {
            // InternalSpec.g:254:1: ( ruleMinimumDuration EOF )
            // InternalSpec.g:255:1: ruleMinimumDuration EOF
            {
             before(grammarAccess.getMinimumDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleMinimumDuration();

            state._fsp--;

             after(grammarAccess.getMinimumDurationRule()); 
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
    // $ANTLR end "entryRuleMinimumDuration"


    // $ANTLR start "ruleMinimumDuration"
    // InternalSpec.g:262:1: ruleMinimumDuration : ( 'a' ) ;
    public final void ruleMinimumDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:266:2: ( ( 'a' ) )
            // InternalSpec.g:267:2: ( 'a' )
            {
            // InternalSpec.g:267:2: ( 'a' )
            // InternalSpec.g:268:3: 'a'
            {
             before(grammarAccess.getMinimumDurationAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMinimumDurationAccess().getAKeyword()); 

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
    // $ANTLR end "ruleMinimumDuration"


    // $ANTLR start "entryRuleMaximumDuration"
    // InternalSpec.g:278:1: entryRuleMaximumDuration : ruleMaximumDuration EOF ;
    public final void entryRuleMaximumDuration() throws RecognitionException {
        try {
            // InternalSpec.g:279:1: ( ruleMaximumDuration EOF )
            // InternalSpec.g:280:1: ruleMaximumDuration EOF
            {
             before(grammarAccess.getMaximumDurationRule()); 
            pushFollow(FOLLOW_1);
            ruleMaximumDuration();

            state._fsp--;

             after(grammarAccess.getMaximumDurationRule()); 
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
    // $ANTLR end "entryRuleMaximumDuration"


    // $ANTLR start "ruleMaximumDuration"
    // InternalSpec.g:287:1: ruleMaximumDuration : ( 'a' ) ;
    public final void ruleMaximumDuration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:291:2: ( ( 'a' ) )
            // InternalSpec.g:292:2: ( 'a' )
            {
            // InternalSpec.g:292:2: ( 'a' )
            // InternalSpec.g:293:3: 'a'
            {
             before(grammarAccess.getMaximumDurationAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMaximumDurationAccess().getAKeyword()); 

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
    // $ANTLR end "ruleMaximumDuration"


    // $ANTLR start "entryRuleRecurrence"
    // InternalSpec.g:303:1: entryRuleRecurrence : ruleRecurrence EOF ;
    public final void entryRuleRecurrence() throws RecognitionException {
        try {
            // InternalSpec.g:304:1: ( ruleRecurrence EOF )
            // InternalSpec.g:305:1: ruleRecurrence EOF
            {
             before(grammarAccess.getRecurrenceRule()); 
            pushFollow(FOLLOW_1);
            ruleRecurrence();

            state._fsp--;

             after(grammarAccess.getRecurrenceRule()); 
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
    // $ANTLR end "entryRuleRecurrence"


    // $ANTLR start "ruleRecurrence"
    // InternalSpec.g:312:1: ruleRecurrence : ( 'a' ) ;
    public final void ruleRecurrence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:316:2: ( ( 'a' ) )
            // InternalSpec.g:317:2: ( 'a' )
            {
            // InternalSpec.g:317:2: ( 'a' )
            // InternalSpec.g:318:3: 'a'
            {
             before(grammarAccess.getRecurrenceAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRecurrenceAccess().getAKeyword()); 

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
    // $ANTLR end "ruleRecurrence"


    // $ANTLR start "entryRulePrecedence"
    // InternalSpec.g:328:1: entryRulePrecedence : rulePrecedence EOF ;
    public final void entryRulePrecedence() throws RecognitionException {
        try {
            // InternalSpec.g:329:1: ( rulePrecedence EOF )
            // InternalSpec.g:330:1: rulePrecedence EOF
            {
             before(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_1);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getPrecedenceRule()); 
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
    // $ANTLR end "entryRulePrecedence"


    // $ANTLR start "rulePrecedence"
    // InternalSpec.g:337:1: rulePrecedence : ( 'a' ) ;
    public final void rulePrecedence() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:341:2: ( ( 'a' ) )
            // InternalSpec.g:342:2: ( 'a' )
            {
            // InternalSpec.g:342:2: ( 'a' )
            // InternalSpec.g:343:3: 'a'
            {
             before(grammarAccess.getPrecedenceAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPrecedenceAccess().getAKeyword()); 

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
    // $ANTLR end "rulePrecedence"


    // $ANTLR start "entryRuleUntil"
    // InternalSpec.g:353:1: entryRuleUntil : ruleUntil EOF ;
    public final void entryRuleUntil() throws RecognitionException {
        try {
            // InternalSpec.g:354:1: ( ruleUntil EOF )
            // InternalSpec.g:355:1: ruleUntil EOF
            {
             before(grammarAccess.getUntilRule()); 
            pushFollow(FOLLOW_1);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getUntilRule()); 
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
    // $ANTLR end "entryRuleUntil"


    // $ANTLR start "ruleUntil"
    // InternalSpec.g:362:1: ruleUntil : ( 'a' ) ;
    public final void ruleUntil() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:366:2: ( ( 'a' ) )
            // InternalSpec.g:367:2: ( 'a' )
            {
            // InternalSpec.g:367:2: ( 'a' )
            // InternalSpec.g:368:3: 'a'
            {
             before(grammarAccess.getUntilAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUntilAccess().getAKeyword()); 

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
    // $ANTLR end "ruleUntil"


    // $ANTLR start "entryRuleResponse"
    // InternalSpec.g:378:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalSpec.g:379:1: ( ruleResponse EOF )
            // InternalSpec.g:380:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
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
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalSpec.g:387:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:391:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalSpec.g:392:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalSpec.g:392:2: ( ( rule__Response__Group__0 ) )
            // InternalSpec.g:393:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalSpec.g:394:3: ( rule__Response__Group__0 )
            // InternalSpec.g:394:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

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
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleResponseInvariance"
    // InternalSpec.g:403:1: entryRuleResponseInvariance : ruleResponseInvariance EOF ;
    public final void entryRuleResponseInvariance() throws RecognitionException {
        try {
            // InternalSpec.g:404:1: ( ruleResponseInvariance EOF )
            // InternalSpec.g:405:1: ruleResponseInvariance EOF
            {
             before(grammarAccess.getResponseInvarianceRule()); 
            pushFollow(FOLLOW_1);
            ruleResponseInvariance();

            state._fsp--;

             after(grammarAccess.getResponseInvarianceRule()); 
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
    // $ANTLR end "entryRuleResponseInvariance"


    // $ANTLR start "ruleResponseInvariance"
    // InternalSpec.g:412:1: ruleResponseInvariance : ( 'a' ) ;
    public final void ruleResponseInvariance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:416:2: ( ( 'a' ) )
            // InternalSpec.g:417:2: ( 'a' )
            {
            // InternalSpec.g:417:2: ( 'a' )
            // InternalSpec.g:418:3: 'a'
            {
             before(grammarAccess.getResponseInvarianceAccess().getAKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getResponseInvarianceAccess().getAKeyword()); 

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
    // $ANTLR end "ruleResponseInvariance"


    // $ANTLR start "entryRuleNumber"
    // InternalSpec.g:428:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalSpec.g:429:1: ( ruleNumber EOF )
            // InternalSpec.g:430:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalSpec.g:437:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:441:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalSpec.g:442:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalSpec.g:442:2: ( ( rule__Number__Group__0 ) )
            // InternalSpec.g:443:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalSpec.g:444:3: ( rule__Number__Group__0 )
            // InternalSpec.g:444:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleExpression"
    // InternalSpec.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalSpec.g:454:1: ( ruleExpression EOF )
            // InternalSpec.g:455:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalSpec.g:462:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:466:2: ( ( ( rule__Expression__Group__0 ) ) )
            // InternalSpec.g:467:2: ( ( rule__Expression__Group__0 ) )
            {
            // InternalSpec.g:467:2: ( ( rule__Expression__Group__0 ) )
            // InternalSpec.g:468:3: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // InternalSpec.g:469:3: ( rule__Expression__Group__0 )
            // InternalSpec.g:469:4: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleTime"
    // InternalSpec.g:478:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalSpec.g:479:1: ( ruleTime EOF )
            // InternalSpec.g:480:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalSpec.g:487:1: ruleTime : ( ( rule__Time__Alternatives ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:491:2: ( ( ( rule__Time__Alternatives ) ) )
            // InternalSpec.g:492:2: ( ( rule__Time__Alternatives ) )
            {
            // InternalSpec.g:492:2: ( ( rule__Time__Alternatives ) )
            // InternalSpec.g:493:3: ( rule__Time__Alternatives )
            {
             before(grammarAccess.getTimeAccess().getAlternatives()); 
            // InternalSpec.g:494:3: ( rule__Time__Alternatives )
            // InternalSpec.g:494:4: rule__Time__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Time__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "entryRuleUpperTimeBound"
    // InternalSpec.g:503:1: entryRuleUpperTimeBound : ruleUpperTimeBound EOF ;
    public final void entryRuleUpperTimeBound() throws RecognitionException {
        try {
            // InternalSpec.g:504:1: ( ruleUpperTimeBound EOF )
            // InternalSpec.g:505:1: ruleUpperTimeBound EOF
            {
             before(grammarAccess.getUpperTimeBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperTimeBound();

            state._fsp--;

             after(grammarAccess.getUpperTimeBoundRule()); 
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
    // $ANTLR end "entryRuleUpperTimeBound"


    // $ANTLR start "ruleUpperTimeBound"
    // InternalSpec.g:512:1: ruleUpperTimeBound : ( ( rule__UpperTimeBound__Group__0 ) ) ;
    public final void ruleUpperTimeBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:516:2: ( ( ( rule__UpperTimeBound__Group__0 ) ) )
            // InternalSpec.g:517:2: ( ( rule__UpperTimeBound__Group__0 ) )
            {
            // InternalSpec.g:517:2: ( ( rule__UpperTimeBound__Group__0 ) )
            // InternalSpec.g:518:3: ( rule__UpperTimeBound__Group__0 )
            {
             before(grammarAccess.getUpperTimeBoundAccess().getGroup()); 
            // InternalSpec.g:519:3: ( rule__UpperTimeBound__Group__0 )
            // InternalSpec.g:519:4: rule__UpperTimeBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperTimeBoundAccess().getGroup()); 

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
    // $ANTLR end "ruleUpperTimeBound"


    // $ANTLR start "entryRuleLowerTimeBound"
    // InternalSpec.g:528:1: entryRuleLowerTimeBound : ruleLowerTimeBound EOF ;
    public final void entryRuleLowerTimeBound() throws RecognitionException {
        try {
            // InternalSpec.g:529:1: ( ruleLowerTimeBound EOF )
            // InternalSpec.g:530:1: ruleLowerTimeBound EOF
            {
             before(grammarAccess.getLowerTimeBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleLowerTimeBound();

            state._fsp--;

             after(grammarAccess.getLowerTimeBoundRule()); 
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
    // $ANTLR end "entryRuleLowerTimeBound"


    // $ANTLR start "ruleLowerTimeBound"
    // InternalSpec.g:537:1: ruleLowerTimeBound : ( ( rule__LowerTimeBound__Group__0 ) ) ;
    public final void ruleLowerTimeBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:541:2: ( ( ( rule__LowerTimeBound__Group__0 ) ) )
            // InternalSpec.g:542:2: ( ( rule__LowerTimeBound__Group__0 ) )
            {
            // InternalSpec.g:542:2: ( ( rule__LowerTimeBound__Group__0 ) )
            // InternalSpec.g:543:3: ( rule__LowerTimeBound__Group__0 )
            {
             before(grammarAccess.getLowerTimeBoundAccess().getGroup()); 
            // InternalSpec.g:544:3: ( rule__LowerTimeBound__Group__0 )
            // InternalSpec.g:544:4: rule__LowerTimeBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowerTimeBoundAccess().getGroup()); 

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
    // $ANTLR end "ruleLowerTimeBound"


    // $ANTLR start "entryRuleInterval"
    // InternalSpec.g:553:1: entryRuleInterval : ruleInterval EOF ;
    public final void entryRuleInterval() throws RecognitionException {
        try {
            // InternalSpec.g:554:1: ( ruleInterval EOF )
            // InternalSpec.g:555:1: ruleInterval EOF
            {
             before(grammarAccess.getIntervalRule()); 
            pushFollow(FOLLOW_1);
            ruleInterval();

            state._fsp--;

             after(grammarAccess.getIntervalRule()); 
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
    // $ANTLR end "entryRuleInterval"


    // $ANTLR start "ruleInterval"
    // InternalSpec.g:562:1: ruleInterval : ( ( rule__Interval__Group__0 ) ) ;
    public final void ruleInterval() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:566:2: ( ( ( rule__Interval__Group__0 ) ) )
            // InternalSpec.g:567:2: ( ( rule__Interval__Group__0 ) )
            {
            // InternalSpec.g:567:2: ( ( rule__Interval__Group__0 ) )
            // InternalSpec.g:568:3: ( rule__Interval__Group__0 )
            {
             before(grammarAccess.getIntervalAccess().getGroup()); 
            // InternalSpec.g:569:3: ( rule__Interval__Group__0 )
            // InternalSpec.g:569:4: rule__Interval__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getGroup()); 

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
    // $ANTLR end "ruleInterval"


    // $ANTLR start "entryRuleTimeUnit"
    // InternalSpec.g:578:1: entryRuleTimeUnit : ruleTimeUnit EOF ;
    public final void entryRuleTimeUnit() throws RecognitionException {
        try {
            // InternalSpec.g:579:1: ( ruleTimeUnit EOF )
            // InternalSpec.g:580:1: ruleTimeUnit EOF
            {
             before(grammarAccess.getTimeUnitRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeUnitRule()); 
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
    // $ANTLR end "entryRuleTimeUnit"


    // $ANTLR start "ruleTimeUnit"
    // InternalSpec.g:587:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:591:2: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalSpec.g:592:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalSpec.g:592:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalSpec.g:593:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalSpec.g:594:3: ( rule__TimeUnit__Alternatives )
            // InternalSpec.g:594:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Scope__Alternatives"
    // InternalSpec.g:602:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:606:1: ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) )
            int alt1=5;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalSpec.g:607:2: ( ( rule__Scope__Group_0__0 ) )
                    {
                    // InternalSpec.g:607:2: ( ( rule__Scope__Group_0__0 ) )
                    // InternalSpec.g:608:3: ( rule__Scope__Group_0__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_0()); 
                    // InternalSpec.g:609:3: ( rule__Scope__Group_0__0 )
                    // InternalSpec.g:609:4: rule__Scope__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:613:2: ( ( rule__Scope__Group_1__0 ) )
                    {
                    // InternalSpec.g:613:2: ( ( rule__Scope__Group_1__0 ) )
                    // InternalSpec.g:614:3: ( rule__Scope__Group_1__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_1()); 
                    // InternalSpec.g:615:3: ( rule__Scope__Group_1__0 )
                    // InternalSpec.g:615:4: rule__Scope__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:619:2: ( ( rule__Scope__Group_2__0 ) )
                    {
                    // InternalSpec.g:619:2: ( ( rule__Scope__Group_2__0 ) )
                    // InternalSpec.g:620:3: ( rule__Scope__Group_2__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_2()); 
                    // InternalSpec.g:621:3: ( rule__Scope__Group_2__0 )
                    // InternalSpec.g:621:4: rule__Scope__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:625:2: ( ( rule__Scope__Group_3__0 ) )
                    {
                    // InternalSpec.g:625:2: ( ( rule__Scope__Group_3__0 ) )
                    // InternalSpec.g:626:3: ( rule__Scope__Group_3__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_3()); 
                    // InternalSpec.g:627:3: ( rule__Scope__Group_3__0 )
                    // InternalSpec.g:627:4: rule__Scope__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:631:2: ( ( rule__Scope__Group_4__0 ) )
                    {
                    // InternalSpec.g:631:2: ( ( rule__Scope__Group_4__0 ) )
                    // InternalSpec.g:632:3: ( rule__Scope__Group_4__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_4()); 
                    // InternalSpec.g:633:3: ( rule__Scope__Group_4__0 )
                    // InternalSpec.g:633:4: rule__Scope__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Scope__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalSpec.g:641:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) | ( ( rule__Pattern__Group_5__0 ) ) | ( ( rule__Pattern__Group_6__0 ) ) | ( ( rule__Pattern__Group_7__0 ) ) | ( ( rule__Pattern__Group_8__0 ) ) | ( ( rule__Pattern__Group_9__0 ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:645:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) | ( ( rule__Pattern__Group_5__0 ) ) | ( ( rule__Pattern__Group_6__0 ) ) | ( ( rule__Pattern__Group_7__0 ) ) | ( ( rule__Pattern__Group_8__0 ) ) | ( ( rule__Pattern__Group_9__0 ) ) )
            int alt2=10;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 34:
                {
                alt2=3;
                }
                break;
            case 35:
                {
                alt2=4;
                }
                break;
            case 36:
                {
                alt2=5;
                }
                break;
            case 37:
                {
                alt2=6;
                }
                break;
            case 38:
                {
                alt2=7;
                }
                break;
            case 39:
                {
                alt2=8;
                }
                break;
            case 40:
                {
                alt2=9;
                }
                break;
            case 41:
                {
                alt2=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalSpec.g:646:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalSpec.g:646:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalSpec.g:647:3: ( rule__Pattern__Group_0__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_0()); 
                    // InternalSpec.g:648:3: ( rule__Pattern__Group_0__0 )
                    // InternalSpec.g:648:4: rule__Pattern__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:652:2: ( ( rule__Pattern__Group_1__0 ) )
                    {
                    // InternalSpec.g:652:2: ( ( rule__Pattern__Group_1__0 ) )
                    // InternalSpec.g:653:3: ( rule__Pattern__Group_1__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_1()); 
                    // InternalSpec.g:654:3: ( rule__Pattern__Group_1__0 )
                    // InternalSpec.g:654:4: rule__Pattern__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:658:2: ( ( rule__Pattern__Group_2__0 ) )
                    {
                    // InternalSpec.g:658:2: ( ( rule__Pattern__Group_2__0 ) )
                    // InternalSpec.g:659:3: ( rule__Pattern__Group_2__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_2()); 
                    // InternalSpec.g:660:3: ( rule__Pattern__Group_2__0 )
                    // InternalSpec.g:660:4: rule__Pattern__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:664:2: ( ( rule__Pattern__Group_3__0 ) )
                    {
                    // InternalSpec.g:664:2: ( ( rule__Pattern__Group_3__0 ) )
                    // InternalSpec.g:665:3: ( rule__Pattern__Group_3__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_3()); 
                    // InternalSpec.g:666:3: ( rule__Pattern__Group_3__0 )
                    // InternalSpec.g:666:4: rule__Pattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:670:2: ( ( rule__Pattern__Group_4__0 ) )
                    {
                    // InternalSpec.g:670:2: ( ( rule__Pattern__Group_4__0 ) )
                    // InternalSpec.g:671:3: ( rule__Pattern__Group_4__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_4()); 
                    // InternalSpec.g:672:3: ( rule__Pattern__Group_4__0 )
                    // InternalSpec.g:672:4: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSpec.g:676:2: ( ( rule__Pattern__Group_5__0 ) )
                    {
                    // InternalSpec.g:676:2: ( ( rule__Pattern__Group_5__0 ) )
                    // InternalSpec.g:677:3: ( rule__Pattern__Group_5__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_5()); 
                    // InternalSpec.g:678:3: ( rule__Pattern__Group_5__0 )
                    // InternalSpec.g:678:4: rule__Pattern__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSpec.g:682:2: ( ( rule__Pattern__Group_6__0 ) )
                    {
                    // InternalSpec.g:682:2: ( ( rule__Pattern__Group_6__0 ) )
                    // InternalSpec.g:683:3: ( rule__Pattern__Group_6__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_6()); 
                    // InternalSpec.g:684:3: ( rule__Pattern__Group_6__0 )
                    // InternalSpec.g:684:4: rule__Pattern__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_6__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSpec.g:688:2: ( ( rule__Pattern__Group_7__0 ) )
                    {
                    // InternalSpec.g:688:2: ( ( rule__Pattern__Group_7__0 ) )
                    // InternalSpec.g:689:3: ( rule__Pattern__Group_7__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_7()); 
                    // InternalSpec.g:690:3: ( rule__Pattern__Group_7__0 )
                    // InternalSpec.g:690:4: rule__Pattern__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_7__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSpec.g:694:2: ( ( rule__Pattern__Group_8__0 ) )
                    {
                    // InternalSpec.g:694:2: ( ( rule__Pattern__Group_8__0 ) )
                    // InternalSpec.g:695:3: ( rule__Pattern__Group_8__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_8()); 
                    // InternalSpec.g:696:3: ( rule__Pattern__Group_8__0 )
                    // InternalSpec.g:696:4: rule__Pattern__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_8__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSpec.g:700:2: ( ( rule__Pattern__Group_9__0 ) )
                    {
                    // InternalSpec.g:700:2: ( ( rule__Pattern__Group_9__0 ) )
                    // InternalSpec.g:701:3: ( rule__Pattern__Group_9__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_9()); 
                    // InternalSpec.g:702:3: ( rule__Pattern__Group_9__0 )
                    // InternalSpec.g:702:4: rule__Pattern__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_9__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives_0"
    // InternalSpec.g:710:1: rule__Expression__Alternatives_0 : ( ( ( rule__Expression__S1Assignment_0_0 ) ) | ( ( rule__Expression__F1Assignment_0_1 ) ) );
    public final void rule__Expression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:714:1: ( ( ( rule__Expression__S1Assignment_0_0 ) ) | ( ( rule__Expression__F1Assignment_0_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_INT||LA3_0==53) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSpec.g:715:2: ( ( rule__Expression__S1Assignment_0_0 ) )
                    {
                    // InternalSpec.g:715:2: ( ( rule__Expression__S1Assignment_0_0 ) )
                    // InternalSpec.g:716:3: ( rule__Expression__S1Assignment_0_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getS1Assignment_0_0()); 
                    // InternalSpec.g:717:3: ( rule__Expression__S1Assignment_0_0 )
                    // InternalSpec.g:717:4: rule__Expression__S1Assignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__S1Assignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getS1Assignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:721:2: ( ( rule__Expression__F1Assignment_0_1 ) )
                    {
                    // InternalSpec.g:721:2: ( ( rule__Expression__F1Assignment_0_1 ) )
                    // InternalSpec.g:722:3: ( rule__Expression__F1Assignment_0_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getF1Assignment_0_1()); 
                    // InternalSpec.g:723:3: ( rule__Expression__F1Assignment_0_1 )
                    // InternalSpec.g:723:4: rule__Expression__F1Assignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__F1Assignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getF1Assignment_0_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives_0"


    // $ANTLR start "rule__Expression__OperatorAlternatives_1_0"
    // InternalSpec.g:731:1: rule__Expression__OperatorAlternatives_1_0 : ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<' ) | ( '<=' ) );
    public final void rule__Expression__OperatorAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:735:1: ( ( '>' ) | ( '>=' ) | ( '=' ) | ( '<' ) | ( '<=' ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalSpec.g:736:2: ( '>' )
                    {
                    // InternalSpec.g:736:2: ( '>' )
                    // InternalSpec.g:737:3: '>'
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorGreaterThanSignKeyword_1_0_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getOperatorGreaterThanSignKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:742:2: ( '>=' )
                    {
                    // InternalSpec.g:742:2: ( '>=' )
                    // InternalSpec.g:743:3: '>='
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getOperatorGreaterThanSignEqualsSignKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:748:2: ( '=' )
                    {
                    // InternalSpec.g:748:2: ( '=' )
                    // InternalSpec.g:749:3: '='
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorEqualsSignKeyword_1_0_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getOperatorEqualsSignKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSpec.g:754:2: ( '<' )
                    {
                    // InternalSpec.g:754:2: ( '<' )
                    // InternalSpec.g:755:3: '<'
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorLessThanSignKeyword_1_0_3()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getOperatorLessThanSignKeyword_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSpec.g:760:2: ( '<=' )
                    {
                    // InternalSpec.g:760:2: ( '<=' )
                    // InternalSpec.g:761:3: '<='
                    {
                     before(grammarAccess.getExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_4()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getExpressionAccess().getOperatorLessThanSignEqualsSignKeyword_1_0_4()); 

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
    // $ANTLR end "rule__Expression__OperatorAlternatives_1_0"


    // $ANTLR start "rule__Expression__Alternatives_2"
    // InternalSpec.g:770:1: rule__Expression__Alternatives_2 : ( ( ( rule__Expression__S2Assignment_2_0 ) ) | ( ( rule__Expression__F2Assignment_2_1 ) ) );
    public final void rule__Expression__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:774:1: ( ( ( rule__Expression__S2Assignment_2_0 ) ) | ( ( rule__Expression__F2Assignment_2_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_INT||LA5_0==53) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpec.g:775:2: ( ( rule__Expression__S2Assignment_2_0 ) )
                    {
                    // InternalSpec.g:775:2: ( ( rule__Expression__S2Assignment_2_0 ) )
                    // InternalSpec.g:776:3: ( rule__Expression__S2Assignment_2_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getS2Assignment_2_0()); 
                    // InternalSpec.g:777:3: ( rule__Expression__S2Assignment_2_0 )
                    // InternalSpec.g:777:4: rule__Expression__S2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__S2Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getS2Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:781:2: ( ( rule__Expression__F2Assignment_2_1 ) )
                    {
                    // InternalSpec.g:781:2: ( ( rule__Expression__F2Assignment_2_1 ) )
                    // InternalSpec.g:782:3: ( rule__Expression__F2Assignment_2_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getF2Assignment_2_1()); 
                    // InternalSpec.g:783:3: ( rule__Expression__F2Assignment_2_1 )
                    // InternalSpec.g:783:4: rule__Expression__F2Assignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__F2Assignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getF2Assignment_2_1()); 

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
    // $ANTLR end "rule__Expression__Alternatives_2"


    // $ANTLR start "rule__Time__Alternatives"
    // InternalSpec.g:791:1: rule__Time__Alternatives : ( ( ruleUpperTimeBound ) | ( ruleLowerTimeBound ) | ( ruleInterval ) );
    public final void rule__Time__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:795:1: ( ( ruleUpperTimeBound ) | ( ruleLowerTimeBound ) | ( ruleInterval ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt6=1;
                }
                break;
            case 51:
                {
                alt6=2;
                }
                break;
            case 52:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSpec.g:796:2: ( ruleUpperTimeBound )
                    {
                    // InternalSpec.g:796:2: ( ruleUpperTimeBound )
                    // InternalSpec.g:797:3: ruleUpperTimeBound
                    {
                     before(grammarAccess.getTimeAccess().getUpperTimeBoundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperTimeBound();

                    state._fsp--;

                     after(grammarAccess.getTimeAccess().getUpperTimeBoundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:802:2: ( ruleLowerTimeBound )
                    {
                    // InternalSpec.g:802:2: ( ruleLowerTimeBound )
                    // InternalSpec.g:803:3: ruleLowerTimeBound
                    {
                     before(grammarAccess.getTimeAccess().getLowerTimeBoundParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLowerTimeBound();

                    state._fsp--;

                     after(grammarAccess.getTimeAccess().getLowerTimeBoundParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:808:2: ( ruleInterval )
                    {
                    // InternalSpec.g:808:2: ( ruleInterval )
                    // InternalSpec.g:809:3: ruleInterval
                    {
                     before(grammarAccess.getTimeAccess().getIntervalParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInterval();

                    state._fsp--;

                     after(grammarAccess.getTimeAccess().getIntervalParserRuleCall_2()); 

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
    // $ANTLR end "rule__Time__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalSpec.g:818:1: rule__TimeUnit__Alternatives : ( ( 'ms' ) | ( 's' ) | ( 'min' ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:822:1: ( ( 'ms' ) | ( 's' ) | ( 'min' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 19:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSpec.g:823:2: ( 'ms' )
                    {
                    // InternalSpec.g:823:2: ( 'ms' )
                    // InternalSpec.g:824:3: 'ms'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSpec.g:829:2: ( 's' )
                    {
                    // InternalSpec.g:829:2: ( 's' )
                    // InternalSpec.g:830:3: 's'
                    {
                     before(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getSKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSpec.g:835:2: ( 'min' )
                    {
                    // InternalSpec.g:835:2: ( 'min' )
                    // InternalSpec.g:836:3: 'min'
                    {
                     before(grammarAccess.getTimeUnitAccess().getMinKeyword_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getTimeUnitAccess().getMinKeyword_2()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalSpec.g:845:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:849:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalSpec.g:850:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalSpec.g:857:1: rule__Model__Group__0__Impl : ( ( rule__Model__SignalsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:861:1: ( ( ( rule__Model__SignalsAssignment_0 )* ) )
            // InternalSpec.g:862:1: ( ( rule__Model__SignalsAssignment_0 )* )
            {
            // InternalSpec.g:862:1: ( ( rule__Model__SignalsAssignment_0 )* )
            // InternalSpec.g:863:2: ( rule__Model__SignalsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSignalsAssignment_0()); 
            // InternalSpec.g:864:2: ( rule__Model__SignalsAssignment_0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSpec.g:864:3: rule__Model__SignalsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__SignalsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSignalsAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalSpec.g:872:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:876:1: ( rule__Model__Group__1__Impl )
            // InternalSpec.g:877:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalSpec.g:883:1: rule__Model__Group__1__Impl : ( ( rule__Model__SpecificationsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:887:1: ( ( ( rule__Model__SpecificationsAssignment_1 )* ) )
            // InternalSpec.g:888:1: ( ( rule__Model__SpecificationsAssignment_1 )* )
            {
            // InternalSpec.g:888:1: ( ( rule__Model__SpecificationsAssignment_1 )* )
            // InternalSpec.g:889:2: ( rule__Model__SpecificationsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSpecificationsAssignment_1()); 
            // InternalSpec.g:890:2: ( rule__Model__SpecificationsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==22) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalSpec.g:890:3: rule__Model__SpecificationsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__SpecificationsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpecificationsAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__0"
    // InternalSpec.g:899:1: rule__Signal__Group__0 : rule__Signal__Group__0__Impl rule__Signal__Group__1 ;
    public final void rule__Signal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:903:1: ( rule__Signal__Group__0__Impl rule__Signal__Group__1 )
            // InternalSpec.g:904:2: rule__Signal__Group__0__Impl rule__Signal__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Signal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__1();

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
    // $ANTLR end "rule__Signal__Group__0"


    // $ANTLR start "rule__Signal__Group__0__Impl"
    // InternalSpec.g:911:1: rule__Signal__Group__0__Impl : ( 'signal' ) ;
    public final void rule__Signal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:915:1: ( ( 'signal' ) )
            // InternalSpec.g:916:1: ( 'signal' )
            {
            // InternalSpec.g:916:1: ( 'signal' )
            // InternalSpec.g:917:2: 'signal'
            {
             before(grammarAccess.getSignalAccess().getSignalKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getSignalKeyword_0()); 

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
    // $ANTLR end "rule__Signal__Group__0__Impl"


    // $ANTLR start "rule__Signal__Group__1"
    // InternalSpec.g:926:1: rule__Signal__Group__1 : rule__Signal__Group__1__Impl rule__Signal__Group__2 ;
    public final void rule__Signal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:930:1: ( rule__Signal__Group__1__Impl rule__Signal__Group__2 )
            // InternalSpec.g:931:2: rule__Signal__Group__1__Impl rule__Signal__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Signal__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__2();

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
    // $ANTLR end "rule__Signal__Group__1"


    // $ANTLR start "rule__Signal__Group__1__Impl"
    // InternalSpec.g:938:1: rule__Signal__Group__1__Impl : ( ( rule__Signal__NameAssignment_1 ) ) ;
    public final void rule__Signal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:942:1: ( ( ( rule__Signal__NameAssignment_1 ) ) )
            // InternalSpec.g:943:1: ( ( rule__Signal__NameAssignment_1 ) )
            {
            // InternalSpec.g:943:1: ( ( rule__Signal__NameAssignment_1 ) )
            // InternalSpec.g:944:2: ( rule__Signal__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAccess().getNameAssignment_1()); 
            // InternalSpec.g:945:2: ( rule__Signal__NameAssignment_1 )
            // InternalSpec.g:945:3: rule__Signal__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Signal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Signal__Group__1__Impl"


    // $ANTLR start "rule__Signal__Group__2"
    // InternalSpec.g:953:1: rule__Signal__Group__2 : rule__Signal__Group__2__Impl rule__Signal__Group__3 ;
    public final void rule__Signal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:957:1: ( rule__Signal__Group__2__Impl rule__Signal__Group__3 )
            // InternalSpec.g:958:2: rule__Signal__Group__2__Impl rule__Signal__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Signal__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Signal__Group__3();

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
    // $ANTLR end "rule__Signal__Group__2"


    // $ANTLR start "rule__Signal__Group__2__Impl"
    // InternalSpec.g:965:1: rule__Signal__Group__2__Impl : ( 'from' ) ;
    public final void rule__Signal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:969:1: ( ( 'from' ) )
            // InternalSpec.g:970:1: ( 'from' )
            {
            // InternalSpec.g:970:1: ( 'from' )
            // InternalSpec.g:971:2: 'from'
            {
             before(grammarAccess.getSignalAccess().getFromKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Signal__Group__2__Impl"


    // $ANTLR start "rule__Signal__Group__3"
    // InternalSpec.g:980:1: rule__Signal__Group__3 : rule__Signal__Group__3__Impl ;
    public final void rule__Signal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:984:1: ( rule__Signal__Group__3__Impl )
            // InternalSpec.g:985:2: rule__Signal__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Signal__Group__3__Impl();

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
    // $ANTLR end "rule__Signal__Group__3"


    // $ANTLR start "rule__Signal__Group__3__Impl"
    // InternalSpec.g:991:1: rule__Signal__Group__3__Impl : ( ( rule__Signal__QueueNameAssignment_3 ) ) ;
    public final void rule__Signal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:995:1: ( ( ( rule__Signal__QueueNameAssignment_3 ) ) )
            // InternalSpec.g:996:1: ( ( rule__Signal__QueueNameAssignment_3 ) )
            {
            // InternalSpec.g:996:1: ( ( rule__Signal__QueueNameAssignment_3 ) )
            // InternalSpec.g:997:2: ( rule__Signal__QueueNameAssignment_3 )
            {
             before(grammarAccess.getSignalAccess().getQueueNameAssignment_3()); 
            // InternalSpec.g:998:2: ( rule__Signal__QueueNameAssignment_3 )
            // InternalSpec.g:998:3: rule__Signal__QueueNameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Signal__QueueNameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getQueueNameAssignment_3()); 

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
    // $ANTLR end "rule__Signal__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__0"
    // InternalSpec.g:1007:1: rule__Specification__Group__0 : rule__Specification__Group__0__Impl rule__Specification__Group__1 ;
    public final void rule__Specification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1011:1: ( rule__Specification__Group__0__Impl rule__Specification__Group__1 )
            // InternalSpec.g:1012:2: rule__Specification__Group__0__Impl rule__Specification__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Specification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__1();

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
    // $ANTLR end "rule__Specification__Group__0"


    // $ANTLR start "rule__Specification__Group__0__Impl"
    // InternalSpec.g:1019:1: rule__Specification__Group__0__Impl : ( 'specification' ) ;
    public final void rule__Specification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1023:1: ( ( 'specification' ) )
            // InternalSpec.g:1024:1: ( 'specification' )
            {
            // InternalSpec.g:1024:1: ( 'specification' )
            // InternalSpec.g:1025:2: 'specification'
            {
             before(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getSpecificationKeyword_0()); 

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
    // $ANTLR end "rule__Specification__Group__0__Impl"


    // $ANTLR start "rule__Specification__Group__1"
    // InternalSpec.g:1034:1: rule__Specification__Group__1 : rule__Specification__Group__1__Impl rule__Specification__Group__2 ;
    public final void rule__Specification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1038:1: ( rule__Specification__Group__1__Impl rule__Specification__Group__2 )
            // InternalSpec.g:1039:2: rule__Specification__Group__1__Impl rule__Specification__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Specification__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__2();

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
    // $ANTLR end "rule__Specification__Group__1"


    // $ANTLR start "rule__Specification__Group__1__Impl"
    // InternalSpec.g:1046:1: rule__Specification__Group__1__Impl : ( ( rule__Specification__NameAssignment_1 ) ) ;
    public final void rule__Specification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1050:1: ( ( ( rule__Specification__NameAssignment_1 ) ) )
            // InternalSpec.g:1051:1: ( ( rule__Specification__NameAssignment_1 ) )
            {
            // InternalSpec.g:1051:1: ( ( rule__Specification__NameAssignment_1 ) )
            // InternalSpec.g:1052:2: ( rule__Specification__NameAssignment_1 )
            {
             before(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 
            // InternalSpec.g:1053:2: ( rule__Specification__NameAssignment_1 )
            // InternalSpec.g:1053:3: rule__Specification__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Specification__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Specification__Group__1__Impl"


    // $ANTLR start "rule__Specification__Group__2"
    // InternalSpec.g:1061:1: rule__Specification__Group__2 : rule__Specification__Group__2__Impl rule__Specification__Group__3 ;
    public final void rule__Specification__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1065:1: ( rule__Specification__Group__2__Impl rule__Specification__Group__3 )
            // InternalSpec.g:1066:2: rule__Specification__Group__2__Impl rule__Specification__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Specification__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__3();

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
    // $ANTLR end "rule__Specification__Group__2"


    // $ANTLR start "rule__Specification__Group__2__Impl"
    // InternalSpec.g:1073:1: rule__Specification__Group__2__Impl : ( ':' ) ;
    public final void rule__Specification__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1077:1: ( ( ':' ) )
            // InternalSpec.g:1078:1: ( ':' )
            {
            // InternalSpec.g:1078:1: ( ':' )
            // InternalSpec.g:1079:2: ':'
            {
             before(grammarAccess.getSpecificationAccess().getColonKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Specification__Group__2__Impl"


    // $ANTLR start "rule__Specification__Group__3"
    // InternalSpec.g:1088:1: rule__Specification__Group__3 : rule__Specification__Group__3__Impl rule__Specification__Group__4 ;
    public final void rule__Specification__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1092:1: ( rule__Specification__Group__3__Impl rule__Specification__Group__4 )
            // InternalSpec.g:1093:2: rule__Specification__Group__3__Impl rule__Specification__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Specification__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__4();

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
    // $ANTLR end "rule__Specification__Group__3"


    // $ANTLR start "rule__Specification__Group__3__Impl"
    // InternalSpec.g:1100:1: rule__Specification__Group__3__Impl : ( 'scope' ) ;
    public final void rule__Specification__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1104:1: ( ( 'scope' ) )
            // InternalSpec.g:1105:1: ( 'scope' )
            {
            // InternalSpec.g:1105:1: ( 'scope' )
            // InternalSpec.g:1106:2: 'scope'
            {
             before(grammarAccess.getSpecificationAccess().getScopeKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getScopeKeyword_3()); 

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
    // $ANTLR end "rule__Specification__Group__3__Impl"


    // $ANTLR start "rule__Specification__Group__4"
    // InternalSpec.g:1115:1: rule__Specification__Group__4 : rule__Specification__Group__4__Impl rule__Specification__Group__5 ;
    public final void rule__Specification__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1119:1: ( rule__Specification__Group__4__Impl rule__Specification__Group__5 )
            // InternalSpec.g:1120:2: rule__Specification__Group__4__Impl rule__Specification__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Specification__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__5();

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
    // $ANTLR end "rule__Specification__Group__4"


    // $ANTLR start "rule__Specification__Group__4__Impl"
    // InternalSpec.g:1127:1: rule__Specification__Group__4__Impl : ( ( rule__Specification__ScopeAssignment_4 ) ) ;
    public final void rule__Specification__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1131:1: ( ( ( rule__Specification__ScopeAssignment_4 ) ) )
            // InternalSpec.g:1132:1: ( ( rule__Specification__ScopeAssignment_4 ) )
            {
            // InternalSpec.g:1132:1: ( ( rule__Specification__ScopeAssignment_4 ) )
            // InternalSpec.g:1133:2: ( rule__Specification__ScopeAssignment_4 )
            {
             before(grammarAccess.getSpecificationAccess().getScopeAssignment_4()); 
            // InternalSpec.g:1134:2: ( rule__Specification__ScopeAssignment_4 )
            // InternalSpec.g:1134:3: rule__Specification__ScopeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Specification__ScopeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getScopeAssignment_4()); 

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
    // $ANTLR end "rule__Specification__Group__4__Impl"


    // $ANTLR start "rule__Specification__Group__5"
    // InternalSpec.g:1142:1: rule__Specification__Group__5 : rule__Specification__Group__5__Impl rule__Specification__Group__6 ;
    public final void rule__Specification__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1146:1: ( rule__Specification__Group__5__Impl rule__Specification__Group__6 )
            // InternalSpec.g:1147:2: rule__Specification__Group__5__Impl rule__Specification__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Specification__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Specification__Group__6();

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
    // $ANTLR end "rule__Specification__Group__5"


    // $ANTLR start "rule__Specification__Group__5__Impl"
    // InternalSpec.g:1154:1: rule__Specification__Group__5__Impl : ( 'pattern' ) ;
    public final void rule__Specification__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1158:1: ( ( 'pattern' ) )
            // InternalSpec.g:1159:1: ( 'pattern' )
            {
            // InternalSpec.g:1159:1: ( 'pattern' )
            // InternalSpec.g:1160:2: 'pattern'
            {
             before(grammarAccess.getSpecificationAccess().getPatternKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getPatternKeyword_5()); 

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
    // $ANTLR end "rule__Specification__Group__5__Impl"


    // $ANTLR start "rule__Specification__Group__6"
    // InternalSpec.g:1169:1: rule__Specification__Group__6 : rule__Specification__Group__6__Impl ;
    public final void rule__Specification__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1173:1: ( rule__Specification__Group__6__Impl )
            // InternalSpec.g:1174:2: rule__Specification__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Specification__Group__6__Impl();

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
    // $ANTLR end "rule__Specification__Group__6"


    // $ANTLR start "rule__Specification__Group__6__Impl"
    // InternalSpec.g:1180:1: rule__Specification__Group__6__Impl : ( ( rule__Specification__PatternAssignment_6 ) ) ;
    public final void rule__Specification__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1184:1: ( ( ( rule__Specification__PatternAssignment_6 ) ) )
            // InternalSpec.g:1185:1: ( ( rule__Specification__PatternAssignment_6 ) )
            {
            // InternalSpec.g:1185:1: ( ( rule__Specification__PatternAssignment_6 ) )
            // InternalSpec.g:1186:2: ( rule__Specification__PatternAssignment_6 )
            {
             before(grammarAccess.getSpecificationAccess().getPatternAssignment_6()); 
            // InternalSpec.g:1187:2: ( rule__Specification__PatternAssignment_6 )
            // InternalSpec.g:1187:3: rule__Specification__PatternAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Specification__PatternAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getSpecificationAccess().getPatternAssignment_6()); 

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
    // $ANTLR end "rule__Specification__Group__6__Impl"


    // $ANTLR start "rule__Scope__Group_0__0"
    // InternalSpec.g:1196:1: rule__Scope__Group_0__0 : rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 ;
    public final void rule__Scope__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1200:1: ( rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 )
            // InternalSpec.g:1201:2: rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__Scope__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1();

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
    // $ANTLR end "rule__Scope__Group_0__0"


    // $ANTLR start "rule__Scope__Group_0__0__Impl"
    // InternalSpec.g:1208:1: rule__Scope__Group_0__0__Impl : ( () ) ;
    public final void rule__Scope__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1212:1: ( ( () ) )
            // InternalSpec.g:1213:1: ( () )
            {
            // InternalSpec.g:1213:1: ( () )
            // InternalSpec.g:1214:2: ()
            {
             before(grammarAccess.getScopeAccess().getGlobalScopeAction_0_0()); 
            // InternalSpec.g:1215:2: ()
            // InternalSpec.g:1215:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getGlobalScopeAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_0__0__Impl"


    // $ANTLR start "rule__Scope__Group_0__1"
    // InternalSpec.g:1223:1: rule__Scope__Group_0__1 : rule__Scope__Group_0__1__Impl ;
    public final void rule__Scope__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1227:1: ( rule__Scope__Group_0__1__Impl )
            // InternalSpec.g:1228:2: rule__Scope__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1__Impl();

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
    // $ANTLR end "rule__Scope__Group_0__1"


    // $ANTLR start "rule__Scope__Group_0__1__Impl"
    // InternalSpec.g:1234:1: rule__Scope__Group_0__1__Impl : ( 'Globally' ) ;
    public final void rule__Scope__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1238:1: ( ( 'Globally' ) )
            // InternalSpec.g:1239:1: ( 'Globally' )
            {
            // InternalSpec.g:1239:1: ( 'Globally' )
            // InternalSpec.g:1240:2: 'Globally'
            {
             before(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 

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
    // $ANTLR end "rule__Scope__Group_0__1__Impl"


    // $ANTLR start "rule__Scope__Group_1__0"
    // InternalSpec.g:1250:1: rule__Scope__Group_1__0 : rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 ;
    public final void rule__Scope__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1254:1: ( rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 )
            // InternalSpec.g:1255:2: rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__Scope__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__1();

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
    // $ANTLR end "rule__Scope__Group_1__0"


    // $ANTLR start "rule__Scope__Group_1__0__Impl"
    // InternalSpec.g:1262:1: rule__Scope__Group_1__0__Impl : ( () ) ;
    public final void rule__Scope__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1266:1: ( ( () ) )
            // InternalSpec.g:1267:1: ( () )
            {
            // InternalSpec.g:1267:1: ( () )
            // InternalSpec.g:1268:2: ()
            {
             before(grammarAccess.getScopeAccess().getBeforeScopeAction_1_0()); 
            // InternalSpec.g:1269:2: ()
            // InternalSpec.g:1269:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getBeforeScopeAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__0__Impl"


    // $ANTLR start "rule__Scope__Group_1__1"
    // InternalSpec.g:1277:1: rule__Scope__Group_1__1 : rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 ;
    public final void rule__Scope__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1281:1: ( rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 )
            // InternalSpec.g:1282:2: rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2();

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
    // $ANTLR end "rule__Scope__Group_1__1"


    // $ANTLR start "rule__Scope__Group_1__1__Impl"
    // InternalSpec.g:1289:1: rule__Scope__Group_1__1__Impl : ( 'Before' ) ;
    public final void rule__Scope__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1293:1: ( ( 'Before' ) )
            // InternalSpec.g:1294:1: ( 'Before' )
            {
            // InternalSpec.g:1294:1: ( 'Before' )
            // InternalSpec.g:1295:2: 'Before'
            {
             before(grammarAccess.getScopeAccess().getBeforeKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getBeforeKeyword_1_1()); 

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
    // $ANTLR end "rule__Scope__Group_1__1__Impl"


    // $ANTLR start "rule__Scope__Group_1__2"
    // InternalSpec.g:1304:1: rule__Scope__Group_1__2 : rule__Scope__Group_1__2__Impl ;
    public final void rule__Scope__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1308:1: ( rule__Scope__Group_1__2__Impl )
            // InternalSpec.g:1309:2: rule__Scope__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2__Impl();

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
    // $ANTLR end "rule__Scope__Group_1__2"


    // $ANTLR start "rule__Scope__Group_1__2__Impl"
    // InternalSpec.g:1315:1: rule__Scope__Group_1__2__Impl : ( ( rule__Scope__RAssignment_1_2 ) ) ;
    public final void rule__Scope__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1319:1: ( ( ( rule__Scope__RAssignment_1_2 ) ) )
            // InternalSpec.g:1320:1: ( ( rule__Scope__RAssignment_1_2 ) )
            {
            // InternalSpec.g:1320:1: ( ( rule__Scope__RAssignment_1_2 ) )
            // InternalSpec.g:1321:2: ( rule__Scope__RAssignment_1_2 )
            {
             before(grammarAccess.getScopeAccess().getRAssignment_1_2()); 
            // InternalSpec.g:1322:2: ( rule__Scope__RAssignment_1_2 )
            // InternalSpec.g:1322:3: rule__Scope__RAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__RAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getRAssignment_1_2()); 

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
    // $ANTLR end "rule__Scope__Group_1__2__Impl"


    // $ANTLR start "rule__Scope__Group_2__0"
    // InternalSpec.g:1331:1: rule__Scope__Group_2__0 : rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 ;
    public final void rule__Scope__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1335:1: ( rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 )
            // InternalSpec.g:1336:2: rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__Scope__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__1();

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
    // $ANTLR end "rule__Scope__Group_2__0"


    // $ANTLR start "rule__Scope__Group_2__0__Impl"
    // InternalSpec.g:1343:1: rule__Scope__Group_2__0__Impl : ( () ) ;
    public final void rule__Scope__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1347:1: ( ( () ) )
            // InternalSpec.g:1348:1: ( () )
            {
            // InternalSpec.g:1348:1: ( () )
            // InternalSpec.g:1349:2: ()
            {
             before(grammarAccess.getScopeAccess().getAfterScopeAction_2_0()); 
            // InternalSpec.g:1350:2: ()
            // InternalSpec.g:1350:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getAfterScopeAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__0__Impl"


    // $ANTLR start "rule__Scope__Group_2__1"
    // InternalSpec.g:1358:1: rule__Scope__Group_2__1 : rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 ;
    public final void rule__Scope__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1362:1: ( rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 )
            // InternalSpec.g:1363:2: rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2();

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
    // $ANTLR end "rule__Scope__Group_2__1"


    // $ANTLR start "rule__Scope__Group_2__1__Impl"
    // InternalSpec.g:1370:1: rule__Scope__Group_2__1__Impl : ( 'After' ) ;
    public final void rule__Scope__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1374:1: ( ( 'After' ) )
            // InternalSpec.g:1375:1: ( 'After' )
            {
            // InternalSpec.g:1375:1: ( 'After' )
            // InternalSpec.g:1376:2: 'After'
            {
             before(grammarAccess.getScopeAccess().getAfterKeyword_2_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAfterKeyword_2_1()); 

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
    // $ANTLR end "rule__Scope__Group_2__1__Impl"


    // $ANTLR start "rule__Scope__Group_2__2"
    // InternalSpec.g:1385:1: rule__Scope__Group_2__2 : rule__Scope__Group_2__2__Impl ;
    public final void rule__Scope__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1389:1: ( rule__Scope__Group_2__2__Impl )
            // InternalSpec.g:1390:2: rule__Scope__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2__Impl();

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
    // $ANTLR end "rule__Scope__Group_2__2"


    // $ANTLR start "rule__Scope__Group_2__2__Impl"
    // InternalSpec.g:1396:1: rule__Scope__Group_2__2__Impl : ( ( rule__Scope__QAssignment_2_2 ) ) ;
    public final void rule__Scope__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1400:1: ( ( ( rule__Scope__QAssignment_2_2 ) ) )
            // InternalSpec.g:1401:1: ( ( rule__Scope__QAssignment_2_2 ) )
            {
            // InternalSpec.g:1401:1: ( ( rule__Scope__QAssignment_2_2 ) )
            // InternalSpec.g:1402:2: ( rule__Scope__QAssignment_2_2 )
            {
             before(grammarAccess.getScopeAccess().getQAssignment_2_2()); 
            // InternalSpec.g:1403:2: ( rule__Scope__QAssignment_2_2 )
            // InternalSpec.g:1403:3: rule__Scope__QAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__QAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getQAssignment_2_2()); 

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
    // $ANTLR end "rule__Scope__Group_2__2__Impl"


    // $ANTLR start "rule__Scope__Group_3__0"
    // InternalSpec.g:1412:1: rule__Scope__Group_3__0 : rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 ;
    public final void rule__Scope__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1416:1: ( rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 )
            // InternalSpec.g:1417:2: rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1
            {
            pushFollow(FOLLOW_18);
            rule__Scope__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__1();

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
    // $ANTLR end "rule__Scope__Group_3__0"


    // $ANTLR start "rule__Scope__Group_3__0__Impl"
    // InternalSpec.g:1424:1: rule__Scope__Group_3__0__Impl : ( () ) ;
    public final void rule__Scope__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1428:1: ( ( () ) )
            // InternalSpec.g:1429:1: ( () )
            {
            // InternalSpec.g:1429:1: ( () )
            // InternalSpec.g:1430:2: ()
            {
             before(grammarAccess.getScopeAccess().getBetweenScopeAction_3_0()); 
            // InternalSpec.g:1431:2: ()
            // InternalSpec.g:1431:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getBetweenScopeAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__0__Impl"


    // $ANTLR start "rule__Scope__Group_3__1"
    // InternalSpec.g:1439:1: rule__Scope__Group_3__1 : rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 ;
    public final void rule__Scope__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1443:1: ( rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 )
            // InternalSpec.g:1444:2: rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__2();

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
    // $ANTLR end "rule__Scope__Group_3__1"


    // $ANTLR start "rule__Scope__Group_3__1__Impl"
    // InternalSpec.g:1451:1: rule__Scope__Group_3__1__Impl : ( 'Between' ) ;
    public final void rule__Scope__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1455:1: ( ( 'Between' ) )
            // InternalSpec.g:1456:1: ( 'Between' )
            {
            // InternalSpec.g:1456:1: ( 'Between' )
            // InternalSpec.g:1457:2: 'Between'
            {
             before(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 

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
    // $ANTLR end "rule__Scope__Group_3__1__Impl"


    // $ANTLR start "rule__Scope__Group_3__2"
    // InternalSpec.g:1466:1: rule__Scope__Group_3__2 : rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 ;
    public final void rule__Scope__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1470:1: ( rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 )
            // InternalSpec.g:1471:2: rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__Scope__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__3();

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
    // $ANTLR end "rule__Scope__Group_3__2"


    // $ANTLR start "rule__Scope__Group_3__2__Impl"
    // InternalSpec.g:1478:1: rule__Scope__Group_3__2__Impl : ( ( rule__Scope__QAssignment_3_2 ) ) ;
    public final void rule__Scope__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1482:1: ( ( ( rule__Scope__QAssignment_3_2 ) ) )
            // InternalSpec.g:1483:1: ( ( rule__Scope__QAssignment_3_2 ) )
            {
            // InternalSpec.g:1483:1: ( ( rule__Scope__QAssignment_3_2 ) )
            // InternalSpec.g:1484:2: ( rule__Scope__QAssignment_3_2 )
            {
             before(grammarAccess.getScopeAccess().getQAssignment_3_2()); 
            // InternalSpec.g:1485:2: ( rule__Scope__QAssignment_3_2 )
            // InternalSpec.g:1485:3: rule__Scope__QAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__QAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getQAssignment_3_2()); 

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
    // $ANTLR end "rule__Scope__Group_3__2__Impl"


    // $ANTLR start "rule__Scope__Group_3__3"
    // InternalSpec.g:1493:1: rule__Scope__Group_3__3 : rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 ;
    public final void rule__Scope__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1497:1: ( rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 )
            // InternalSpec.g:1498:2: rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4();

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
    // $ANTLR end "rule__Scope__Group_3__3"


    // $ANTLR start "rule__Scope__Group_3__3__Impl"
    // InternalSpec.g:1505:1: rule__Scope__Group_3__3__Impl : ( 'and' ) ;
    public final void rule__Scope__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1509:1: ( ( 'and' ) )
            // InternalSpec.g:1510:1: ( 'and' )
            {
            // InternalSpec.g:1510:1: ( 'and' )
            // InternalSpec.g:1511:2: 'and'
            {
             before(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 

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
    // $ANTLR end "rule__Scope__Group_3__3__Impl"


    // $ANTLR start "rule__Scope__Group_3__4"
    // InternalSpec.g:1520:1: rule__Scope__Group_3__4 : rule__Scope__Group_3__4__Impl ;
    public final void rule__Scope__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1524:1: ( rule__Scope__Group_3__4__Impl )
            // InternalSpec.g:1525:2: rule__Scope__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4__Impl();

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
    // $ANTLR end "rule__Scope__Group_3__4"


    // $ANTLR start "rule__Scope__Group_3__4__Impl"
    // InternalSpec.g:1531:1: rule__Scope__Group_3__4__Impl : ( ( rule__Scope__RAssignment_3_4 ) ) ;
    public final void rule__Scope__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1535:1: ( ( ( rule__Scope__RAssignment_3_4 ) ) )
            // InternalSpec.g:1536:1: ( ( rule__Scope__RAssignment_3_4 ) )
            {
            // InternalSpec.g:1536:1: ( ( rule__Scope__RAssignment_3_4 ) )
            // InternalSpec.g:1537:2: ( rule__Scope__RAssignment_3_4 )
            {
             before(grammarAccess.getScopeAccess().getRAssignment_3_4()); 
            // InternalSpec.g:1538:2: ( rule__Scope__RAssignment_3_4 )
            // InternalSpec.g:1538:3: rule__Scope__RAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__RAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getRAssignment_3_4()); 

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
    // $ANTLR end "rule__Scope__Group_3__4__Impl"


    // $ANTLR start "rule__Scope__Group_4__0"
    // InternalSpec.g:1547:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1551:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalSpec.g:1552:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Scope__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__1();

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
    // $ANTLR end "rule__Scope__Group_4__0"


    // $ANTLR start "rule__Scope__Group_4__0__Impl"
    // InternalSpec.g:1559:1: rule__Scope__Group_4__0__Impl : ( () ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1563:1: ( ( () ) )
            // InternalSpec.g:1564:1: ( () )
            {
            // InternalSpec.g:1564:1: ( () )
            // InternalSpec.g:1565:2: ()
            {
             before(grammarAccess.getScopeAccess().getAfterUntilScopeAction_4_0()); 
            // InternalSpec.g:1566:2: ()
            // InternalSpec.g:1566:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getAfterUntilScopeAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__0__Impl"


    // $ANTLR start "rule__Scope__Group_4__1"
    // InternalSpec.g:1574:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1578:1: ( rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 )
            // InternalSpec.g:1579:2: rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__2();

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
    // $ANTLR end "rule__Scope__Group_4__1"


    // $ANTLR start "rule__Scope__Group_4__1__Impl"
    // InternalSpec.g:1586:1: rule__Scope__Group_4__1__Impl : ( 'After' ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1590:1: ( ( 'After' ) )
            // InternalSpec.g:1591:1: ( 'After' )
            {
            // InternalSpec.g:1591:1: ( 'After' )
            // InternalSpec.g:1592:2: 'After'
            {
             before(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 

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
    // $ANTLR end "rule__Scope__Group_4__1__Impl"


    // $ANTLR start "rule__Scope__Group_4__2"
    // InternalSpec.g:1601:1: rule__Scope__Group_4__2 : rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 ;
    public final void rule__Scope__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1605:1: ( rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 )
            // InternalSpec.g:1606:2: rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3
            {
            pushFollow(FOLLOW_20);
            rule__Scope__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__3();

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
    // $ANTLR end "rule__Scope__Group_4__2"


    // $ANTLR start "rule__Scope__Group_4__2__Impl"
    // InternalSpec.g:1613:1: rule__Scope__Group_4__2__Impl : ( ( rule__Scope__QAssignment_4_2 ) ) ;
    public final void rule__Scope__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1617:1: ( ( ( rule__Scope__QAssignment_4_2 ) ) )
            // InternalSpec.g:1618:1: ( ( rule__Scope__QAssignment_4_2 ) )
            {
            // InternalSpec.g:1618:1: ( ( rule__Scope__QAssignment_4_2 ) )
            // InternalSpec.g:1619:2: ( rule__Scope__QAssignment_4_2 )
            {
             before(grammarAccess.getScopeAccess().getQAssignment_4_2()); 
            // InternalSpec.g:1620:2: ( rule__Scope__QAssignment_4_2 )
            // InternalSpec.g:1620:3: rule__Scope__QAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__QAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getQAssignment_4_2()); 

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
    // $ANTLR end "rule__Scope__Group_4__2__Impl"


    // $ANTLR start "rule__Scope__Group_4__3"
    // InternalSpec.g:1628:1: rule__Scope__Group_4__3 : rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 ;
    public final void rule__Scope__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1632:1: ( rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 )
            // InternalSpec.g:1633:2: rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4
            {
            pushFollow(FOLLOW_16);
            rule__Scope__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4();

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
    // $ANTLR end "rule__Scope__Group_4__3"


    // $ANTLR start "rule__Scope__Group_4__3__Impl"
    // InternalSpec.g:1640:1: rule__Scope__Group_4__3__Impl : ( 'until' ) ;
    public final void rule__Scope__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1644:1: ( ( 'until' ) )
            // InternalSpec.g:1645:1: ( 'until' )
            {
            // InternalSpec.g:1645:1: ( 'until' )
            // InternalSpec.g:1646:2: 'until'
            {
             before(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 

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
    // $ANTLR end "rule__Scope__Group_4__3__Impl"


    // $ANTLR start "rule__Scope__Group_4__4"
    // InternalSpec.g:1655:1: rule__Scope__Group_4__4 : rule__Scope__Group_4__4__Impl ;
    public final void rule__Scope__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1659:1: ( rule__Scope__Group_4__4__Impl )
            // InternalSpec.g:1660:2: rule__Scope__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4__Impl();

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
    // $ANTLR end "rule__Scope__Group_4__4"


    // $ANTLR start "rule__Scope__Group_4__4__Impl"
    // InternalSpec.g:1666:1: rule__Scope__Group_4__4__Impl : ( ( rule__Scope__RAssignment_4_4 ) ) ;
    public final void rule__Scope__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1670:1: ( ( ( rule__Scope__RAssignment_4_4 ) ) )
            // InternalSpec.g:1671:1: ( ( rule__Scope__RAssignment_4_4 ) )
            {
            // InternalSpec.g:1671:1: ( ( rule__Scope__RAssignment_4_4 ) )
            // InternalSpec.g:1672:2: ( rule__Scope__RAssignment_4_4 )
            {
             before(grammarAccess.getScopeAccess().getRAssignment_4_4()); 
            // InternalSpec.g:1673:2: ( rule__Scope__RAssignment_4_4 )
            // InternalSpec.g:1673:3: rule__Scope__RAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__RAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getRAssignment_4_4()); 

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
    // $ANTLR end "rule__Scope__Group_4__4__Impl"


    // $ANTLR start "rule__Pattern__Group_0__0"
    // InternalSpec.g:1682:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1686:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalSpec.g:1687:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
            {
            pushFollow(FOLLOW_21);
            rule__Pattern__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1();

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
    // $ANTLR end "rule__Pattern__Group_0__0"


    // $ANTLR start "rule__Pattern__Group_0__0__Impl"
    // InternalSpec.g:1694:1: rule__Pattern__Group_0__0__Impl : ( 'Universality:' ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1698:1: ( ( 'Universality:' ) )
            // InternalSpec.g:1699:1: ( 'Universality:' )
            {
            // InternalSpec.g:1699:1: ( 'Universality:' )
            // InternalSpec.g:1700:2: 'Universality:'
            {
             before(grammarAccess.getPatternAccess().getUniversalityKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getUniversalityKeyword_0_0()); 

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
    // $ANTLR end "rule__Pattern__Group_0__0__Impl"


    // $ANTLR start "rule__Pattern__Group_0__1"
    // InternalSpec.g:1709:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1713:1: ( rule__Pattern__Group_0__1__Impl )
            // InternalSpec.g:1714:2: rule__Pattern__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_0__1"


    // $ANTLR start "rule__Pattern__Group_0__1__Impl"
    // InternalSpec.g:1720:1: rule__Pattern__Group_0__1__Impl : ( ruleUniversality ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1724:1: ( ( ruleUniversality ) )
            // InternalSpec.g:1725:1: ( ruleUniversality )
            {
            // InternalSpec.g:1725:1: ( ruleUniversality )
            // InternalSpec.g:1726:2: ruleUniversality
            {
             before(grammarAccess.getPatternAccess().getUniversalityParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleUniversality();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getUniversalityParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Pattern__Group_0__1__Impl"


    // $ANTLR start "rule__Pattern__Group_1__0"
    // InternalSpec.g:1736:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1740:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalSpec.g:1741:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
            {
            pushFollow(FOLLOW_22);
            rule__Pattern__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1();

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
    // $ANTLR end "rule__Pattern__Group_1__0"


    // $ANTLR start "rule__Pattern__Group_1__0__Impl"
    // InternalSpec.g:1748:1: rule__Pattern__Group_1__0__Impl : ( 'Absence:' ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1752:1: ( ( 'Absence:' ) )
            // InternalSpec.g:1753:1: ( 'Absence:' )
            {
            // InternalSpec.g:1753:1: ( 'Absence:' )
            // InternalSpec.g:1754:2: 'Absence:'
            {
             before(grammarAccess.getPatternAccess().getAbsenceKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getAbsenceKeyword_1_0()); 

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
    // $ANTLR end "rule__Pattern__Group_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_1__1"
    // InternalSpec.g:1763:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1767:1: ( rule__Pattern__Group_1__1__Impl )
            // InternalSpec.g:1768:2: rule__Pattern__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_1__1"


    // $ANTLR start "rule__Pattern__Group_1__1__Impl"
    // InternalSpec.g:1774:1: rule__Pattern__Group_1__1__Impl : ( ruleAbsence ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1778:1: ( ( ruleAbsence ) )
            // InternalSpec.g:1779:1: ( ruleAbsence )
            {
            // InternalSpec.g:1779:1: ( ruleAbsence )
            // InternalSpec.g:1780:2: ruleAbsence
            {
             before(grammarAccess.getPatternAccess().getAbsenceParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleAbsence();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getAbsenceParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Pattern__Group_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalSpec.g:1790:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1794:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalSpec.g:1795:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

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
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // InternalSpec.g:1802:1: rule__Pattern__Group_2__0__Impl : ( 'Existence:' ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1806:1: ( ( 'Existence:' ) )
            // InternalSpec.g:1807:1: ( 'Existence:' )
            {
            // InternalSpec.g:1807:1: ( 'Existence:' )
            // InternalSpec.g:1808:2: 'Existence:'
            {
             before(grammarAccess.getPatternAccess().getExistenceKeyword_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getExistenceKeyword_2_0()); 

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
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // InternalSpec.g:1817:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1821:1: ( rule__Pattern__Group_2__1__Impl )
            // InternalSpec.g:1822:2: rule__Pattern__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // InternalSpec.g:1828:1: rule__Pattern__Group_2__1__Impl : ( ruleExistence ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1832:1: ( ( ruleExistence ) )
            // InternalSpec.g:1833:1: ( ruleExistence )
            {
            // InternalSpec.g:1833:1: ( ruleExistence )
            // InternalSpec.g:1834:2: ruleExistence
            {
             before(grammarAccess.getPatternAccess().getExistenceParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExistence();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getExistenceParserRuleCall_2_1()); 

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
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_3__0"
    // InternalSpec.g:1844:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1848:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalSpec.g:1849:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1();

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
    // $ANTLR end "rule__Pattern__Group_3__0"


    // $ANTLR start "rule__Pattern__Group_3__0__Impl"
    // InternalSpec.g:1856:1: rule__Pattern__Group_3__0__Impl : ( 'MinimumDuration:' ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1860:1: ( ( 'MinimumDuration:' ) )
            // InternalSpec.g:1861:1: ( 'MinimumDuration:' )
            {
            // InternalSpec.g:1861:1: ( 'MinimumDuration:' )
            // InternalSpec.g:1862:2: 'MinimumDuration:'
            {
             before(grammarAccess.getPatternAccess().getMinimumDurationKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getMinimumDurationKeyword_3_0()); 

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
    // $ANTLR end "rule__Pattern__Group_3__0__Impl"


    // $ANTLR start "rule__Pattern__Group_3__1"
    // InternalSpec.g:1871:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1875:1: ( rule__Pattern__Group_3__1__Impl )
            // InternalSpec.g:1876:2: rule__Pattern__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_3__1"


    // $ANTLR start "rule__Pattern__Group_3__1__Impl"
    // InternalSpec.g:1882:1: rule__Pattern__Group_3__1__Impl : ( ruleMinimumDuration ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1886:1: ( ( ruleMinimumDuration ) )
            // InternalSpec.g:1887:1: ( ruleMinimumDuration )
            {
            // InternalSpec.g:1887:1: ( ruleMinimumDuration )
            // InternalSpec.g:1888:2: ruleMinimumDuration
            {
             before(grammarAccess.getPatternAccess().getMinimumDurationParserRuleCall_3_1()); 
            pushFollow(FOLLOW_2);
            ruleMinimumDuration();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getMinimumDurationParserRuleCall_3_1()); 

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
    // $ANTLR end "rule__Pattern__Group_3__1__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalSpec.g:1898:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1902:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalSpec.g:1903:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

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
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalSpec.g:1910:1: rule__Pattern__Group_4__0__Impl : ( 'MaximumDuration:' ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1914:1: ( ( 'MaximumDuration:' ) )
            // InternalSpec.g:1915:1: ( 'MaximumDuration:' )
            {
            // InternalSpec.g:1915:1: ( 'MaximumDuration:' )
            // InternalSpec.g:1916:2: 'MaximumDuration:'
            {
             before(grammarAccess.getPatternAccess().getMaximumDurationKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getMaximumDurationKeyword_4_0()); 

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
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalSpec.g:1925:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1929:1: ( rule__Pattern__Group_4__1__Impl )
            // InternalSpec.g:1930:2: rule__Pattern__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalSpec.g:1936:1: rule__Pattern__Group_4__1__Impl : ( ruleMaximumDuration ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1940:1: ( ( ruleMaximumDuration ) )
            // InternalSpec.g:1941:1: ( ruleMaximumDuration )
            {
            // InternalSpec.g:1941:1: ( ruleMaximumDuration )
            // InternalSpec.g:1942:2: ruleMaximumDuration
            {
             before(grammarAccess.getPatternAccess().getMaximumDurationParserRuleCall_4_1()); 
            pushFollow(FOLLOW_2);
            ruleMaximumDuration();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getMaximumDurationParserRuleCall_4_1()); 

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
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Pattern__Group_5__0"
    // InternalSpec.g:1952:1: rule__Pattern__Group_5__0 : rule__Pattern__Group_5__0__Impl rule__Pattern__Group_5__1 ;
    public final void rule__Pattern__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1956:1: ( rule__Pattern__Group_5__0__Impl rule__Pattern__Group_5__1 )
            // InternalSpec.g:1957:2: rule__Pattern__Group_5__0__Impl rule__Pattern__Group_5__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_5__1();

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
    // $ANTLR end "rule__Pattern__Group_5__0"


    // $ANTLR start "rule__Pattern__Group_5__0__Impl"
    // InternalSpec.g:1964:1: rule__Pattern__Group_5__0__Impl : ( 'Recurrence:' ) ;
    public final void rule__Pattern__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1968:1: ( ( 'Recurrence:' ) )
            // InternalSpec.g:1969:1: ( 'Recurrence:' )
            {
            // InternalSpec.g:1969:1: ( 'Recurrence:' )
            // InternalSpec.g:1970:2: 'Recurrence:'
            {
             before(grammarAccess.getPatternAccess().getRecurrenceKeyword_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRecurrenceKeyword_5_0()); 

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
    // $ANTLR end "rule__Pattern__Group_5__0__Impl"


    // $ANTLR start "rule__Pattern__Group_5__1"
    // InternalSpec.g:1979:1: rule__Pattern__Group_5__1 : rule__Pattern__Group_5__1__Impl ;
    public final void rule__Pattern__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1983:1: ( rule__Pattern__Group_5__1__Impl )
            // InternalSpec.g:1984:2: rule__Pattern__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_5__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_5__1"


    // $ANTLR start "rule__Pattern__Group_5__1__Impl"
    // InternalSpec.g:1990:1: rule__Pattern__Group_5__1__Impl : ( ruleRecurrence ) ;
    public final void rule__Pattern__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:1994:1: ( ( ruleRecurrence ) )
            // InternalSpec.g:1995:1: ( ruleRecurrence )
            {
            // InternalSpec.g:1995:1: ( ruleRecurrence )
            // InternalSpec.g:1996:2: ruleRecurrence
            {
             before(grammarAccess.getPatternAccess().getRecurrenceParserRuleCall_5_1()); 
            pushFollow(FOLLOW_2);
            ruleRecurrence();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getRecurrenceParserRuleCall_5_1()); 

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
    // $ANTLR end "rule__Pattern__Group_5__1__Impl"


    // $ANTLR start "rule__Pattern__Group_6__0"
    // InternalSpec.g:2006:1: rule__Pattern__Group_6__0 : rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1 ;
    public final void rule__Pattern__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2010:1: ( rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1 )
            // InternalSpec.g:2011:2: rule__Pattern__Group_6__0__Impl rule__Pattern__Group_6__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_6__1();

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
    // $ANTLR end "rule__Pattern__Group_6__0"


    // $ANTLR start "rule__Pattern__Group_6__0__Impl"
    // InternalSpec.g:2018:1: rule__Pattern__Group_6__0__Impl : ( 'Precedence:' ) ;
    public final void rule__Pattern__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2022:1: ( ( 'Precedence:' ) )
            // InternalSpec.g:2023:1: ( 'Precedence:' )
            {
            // InternalSpec.g:2023:1: ( 'Precedence:' )
            // InternalSpec.g:2024:2: 'Precedence:'
            {
             before(grammarAccess.getPatternAccess().getPrecedenceKeyword_6_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPrecedenceKeyword_6_0()); 

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
    // $ANTLR end "rule__Pattern__Group_6__0__Impl"


    // $ANTLR start "rule__Pattern__Group_6__1"
    // InternalSpec.g:2033:1: rule__Pattern__Group_6__1 : rule__Pattern__Group_6__1__Impl ;
    public final void rule__Pattern__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2037:1: ( rule__Pattern__Group_6__1__Impl )
            // InternalSpec.g:2038:2: rule__Pattern__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_6__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_6__1"


    // $ANTLR start "rule__Pattern__Group_6__1__Impl"
    // InternalSpec.g:2044:1: rule__Pattern__Group_6__1__Impl : ( rulePrecedence ) ;
    public final void rule__Pattern__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2048:1: ( ( rulePrecedence ) )
            // InternalSpec.g:2049:1: ( rulePrecedence )
            {
            // InternalSpec.g:2049:1: ( rulePrecedence )
            // InternalSpec.g:2050:2: rulePrecedence
            {
             before(grammarAccess.getPatternAccess().getPrecedenceParserRuleCall_6_1()); 
            pushFollow(FOLLOW_2);
            rulePrecedence();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getPrecedenceParserRuleCall_6_1()); 

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
    // $ANTLR end "rule__Pattern__Group_6__1__Impl"


    // $ANTLR start "rule__Pattern__Group_7__0"
    // InternalSpec.g:2060:1: rule__Pattern__Group_7__0 : rule__Pattern__Group_7__0__Impl rule__Pattern__Group_7__1 ;
    public final void rule__Pattern__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2064:1: ( rule__Pattern__Group_7__0__Impl rule__Pattern__Group_7__1 )
            // InternalSpec.g:2065:2: rule__Pattern__Group_7__0__Impl rule__Pattern__Group_7__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_7__1();

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
    // $ANTLR end "rule__Pattern__Group_7__0"


    // $ANTLR start "rule__Pattern__Group_7__0__Impl"
    // InternalSpec.g:2072:1: rule__Pattern__Group_7__0__Impl : ( 'Until:' ) ;
    public final void rule__Pattern__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2076:1: ( ( 'Until:' ) )
            // InternalSpec.g:2077:1: ( 'Until:' )
            {
            // InternalSpec.g:2077:1: ( 'Until:' )
            // InternalSpec.g:2078:2: 'Until:'
            {
             before(grammarAccess.getPatternAccess().getUntilKeyword_7_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getUntilKeyword_7_0()); 

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
    // $ANTLR end "rule__Pattern__Group_7__0__Impl"


    // $ANTLR start "rule__Pattern__Group_7__1"
    // InternalSpec.g:2087:1: rule__Pattern__Group_7__1 : rule__Pattern__Group_7__1__Impl ;
    public final void rule__Pattern__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2091:1: ( rule__Pattern__Group_7__1__Impl )
            // InternalSpec.g:2092:2: rule__Pattern__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_7__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_7__1"


    // $ANTLR start "rule__Pattern__Group_7__1__Impl"
    // InternalSpec.g:2098:1: rule__Pattern__Group_7__1__Impl : ( ruleUntil ) ;
    public final void rule__Pattern__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2102:1: ( ( ruleUntil ) )
            // InternalSpec.g:2103:1: ( ruleUntil )
            {
            // InternalSpec.g:2103:1: ( ruleUntil )
            // InternalSpec.g:2104:2: ruleUntil
            {
             before(grammarAccess.getPatternAccess().getUntilParserRuleCall_7_1()); 
            pushFollow(FOLLOW_2);
            ruleUntil();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getUntilParserRuleCall_7_1()); 

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
    // $ANTLR end "rule__Pattern__Group_7__1__Impl"


    // $ANTLR start "rule__Pattern__Group_8__0"
    // InternalSpec.g:2114:1: rule__Pattern__Group_8__0 : rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 ;
    public final void rule__Pattern__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2118:1: ( rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1 )
            // InternalSpec.g:2119:2: rule__Pattern__Group_8__0__Impl rule__Pattern__Group_8__1
            {
            pushFollow(FOLLOW_25);
            rule__Pattern__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_8__1();

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
    // $ANTLR end "rule__Pattern__Group_8__0"


    // $ANTLR start "rule__Pattern__Group_8__0__Impl"
    // InternalSpec.g:2126:1: rule__Pattern__Group_8__0__Impl : ( 'Response:' ) ;
    public final void rule__Pattern__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2130:1: ( ( 'Response:' ) )
            // InternalSpec.g:2131:1: ( 'Response:' )
            {
            // InternalSpec.g:2131:1: ( 'Response:' )
            // InternalSpec.g:2132:2: 'Response:'
            {
             before(grammarAccess.getPatternAccess().getResponseKeyword_8_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getResponseKeyword_8_0()); 

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
    // $ANTLR end "rule__Pattern__Group_8__0__Impl"


    // $ANTLR start "rule__Pattern__Group_8__1"
    // InternalSpec.g:2141:1: rule__Pattern__Group_8__1 : rule__Pattern__Group_8__1__Impl ;
    public final void rule__Pattern__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2145:1: ( rule__Pattern__Group_8__1__Impl )
            // InternalSpec.g:2146:2: rule__Pattern__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_8__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_8__1"


    // $ANTLR start "rule__Pattern__Group_8__1__Impl"
    // InternalSpec.g:2152:1: rule__Pattern__Group_8__1__Impl : ( ruleResponse ) ;
    public final void rule__Pattern__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2156:1: ( ( ruleResponse ) )
            // InternalSpec.g:2157:1: ( ruleResponse )
            {
            // InternalSpec.g:2157:1: ( ruleResponse )
            // InternalSpec.g:2158:2: ruleResponse
            {
             before(grammarAccess.getPatternAccess().getResponseParserRuleCall_8_1()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getResponseParserRuleCall_8_1()); 

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
    // $ANTLR end "rule__Pattern__Group_8__1__Impl"


    // $ANTLR start "rule__Pattern__Group_9__0"
    // InternalSpec.g:2168:1: rule__Pattern__Group_9__0 : rule__Pattern__Group_9__0__Impl rule__Pattern__Group_9__1 ;
    public final void rule__Pattern__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2172:1: ( rule__Pattern__Group_9__0__Impl rule__Pattern__Group_9__1 )
            // InternalSpec.g:2173:2: rule__Pattern__Group_9__0__Impl rule__Pattern__Group_9__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_9__1();

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
    // $ANTLR end "rule__Pattern__Group_9__0"


    // $ANTLR start "rule__Pattern__Group_9__0__Impl"
    // InternalSpec.g:2180:1: rule__Pattern__Group_9__0__Impl : ( 'ResponseInvariance:' ) ;
    public final void rule__Pattern__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2184:1: ( ( 'ResponseInvariance:' ) )
            // InternalSpec.g:2185:1: ( 'ResponseInvariance:' )
            {
            // InternalSpec.g:2185:1: ( 'ResponseInvariance:' )
            // InternalSpec.g:2186:2: 'ResponseInvariance:'
            {
             before(grammarAccess.getPatternAccess().getResponseInvarianceKeyword_9_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getResponseInvarianceKeyword_9_0()); 

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
    // $ANTLR end "rule__Pattern__Group_9__0__Impl"


    // $ANTLR start "rule__Pattern__Group_9__1"
    // InternalSpec.g:2195:1: rule__Pattern__Group_9__1 : rule__Pattern__Group_9__1__Impl ;
    public final void rule__Pattern__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2199:1: ( rule__Pattern__Group_9__1__Impl )
            // InternalSpec.g:2200:2: rule__Pattern__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_9__1__Impl();

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
    // $ANTLR end "rule__Pattern__Group_9__1"


    // $ANTLR start "rule__Pattern__Group_9__1__Impl"
    // InternalSpec.g:2206:1: rule__Pattern__Group_9__1__Impl : ( ruleResponseInvariance ) ;
    public final void rule__Pattern__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2210:1: ( ( ruleResponseInvariance ) )
            // InternalSpec.g:2211:1: ( ruleResponseInvariance )
            {
            // InternalSpec.g:2211:1: ( ruleResponseInvariance )
            // InternalSpec.g:2212:2: ruleResponseInvariance
            {
             before(grammarAccess.getPatternAccess().getResponseInvarianceParserRuleCall_9_1()); 
            pushFollow(FOLLOW_2);
            ruleResponseInvariance();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getResponseInvarianceParserRuleCall_9_1()); 

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
    // $ANTLR end "rule__Pattern__Group_9__1__Impl"


    // $ANTLR start "rule__Universality__Group__0"
    // InternalSpec.g:2222:1: rule__Universality__Group__0 : rule__Universality__Group__0__Impl rule__Universality__Group__1 ;
    public final void rule__Universality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2226:1: ( rule__Universality__Group__0__Impl rule__Universality__Group__1 )
            // InternalSpec.g:2227:2: rule__Universality__Group__0__Impl rule__Universality__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Universality__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Universality__Group__1();

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
    // $ANTLR end "rule__Universality__Group__0"


    // $ANTLR start "rule__Universality__Group__0__Impl"
    // InternalSpec.g:2234:1: rule__Universality__Group__0__Impl : ( 'it-is-always-the-case-that' ) ;
    public final void rule__Universality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2238:1: ( ( 'it-is-always-the-case-that' ) )
            // InternalSpec.g:2239:1: ( 'it-is-always-the-case-that' )
            {
            // InternalSpec.g:2239:1: ( 'it-is-always-the-case-that' )
            // InternalSpec.g:2240:2: 'it-is-always-the-case-that'
            {
             before(grammarAccess.getUniversalityAccess().getItIsAlwaysTheCaseThatKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getUniversalityAccess().getItIsAlwaysTheCaseThatKeyword_0()); 

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
    // $ANTLR end "rule__Universality__Group__0__Impl"


    // $ANTLR start "rule__Universality__Group__1"
    // InternalSpec.g:2249:1: rule__Universality__Group__1 : rule__Universality__Group__1__Impl rule__Universality__Group__2 ;
    public final void rule__Universality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2253:1: ( rule__Universality__Group__1__Impl rule__Universality__Group__2 )
            // InternalSpec.g:2254:2: rule__Universality__Group__1__Impl rule__Universality__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Universality__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Universality__Group__2();

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
    // $ANTLR end "rule__Universality__Group__1"


    // $ANTLR start "rule__Universality__Group__1__Impl"
    // InternalSpec.g:2261:1: rule__Universality__Group__1__Impl : ( ( rule__Universality__PAssignment_1 ) ) ;
    public final void rule__Universality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2265:1: ( ( ( rule__Universality__PAssignment_1 ) ) )
            // InternalSpec.g:2266:1: ( ( rule__Universality__PAssignment_1 ) )
            {
            // InternalSpec.g:2266:1: ( ( rule__Universality__PAssignment_1 ) )
            // InternalSpec.g:2267:2: ( rule__Universality__PAssignment_1 )
            {
             before(grammarAccess.getUniversalityAccess().getPAssignment_1()); 
            // InternalSpec.g:2268:2: ( rule__Universality__PAssignment_1 )
            // InternalSpec.g:2268:3: rule__Universality__PAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Universality__PAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUniversalityAccess().getPAssignment_1()); 

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
    // $ANTLR end "rule__Universality__Group__1__Impl"


    // $ANTLR start "rule__Universality__Group__2"
    // InternalSpec.g:2276:1: rule__Universality__Group__2 : rule__Universality__Group__2__Impl ;
    public final void rule__Universality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2280:1: ( rule__Universality__Group__2__Impl )
            // InternalSpec.g:2281:2: rule__Universality__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Universality__Group__2__Impl();

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
    // $ANTLR end "rule__Universality__Group__2"


    // $ANTLR start "rule__Universality__Group__2__Impl"
    // InternalSpec.g:2287:1: rule__Universality__Group__2__Impl : ( ( 'holds' )? ) ;
    public final void rule__Universality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2291:1: ( ( ( 'holds' )? ) )
            // InternalSpec.g:2292:1: ( ( 'holds' )? )
            {
            // InternalSpec.g:2292:1: ( ( 'holds' )? )
            // InternalSpec.g:2293:2: ( 'holds' )?
            {
             before(grammarAccess.getUniversalityAccess().getHoldsKeyword_2()); 
            // InternalSpec.g:2294:2: ( 'holds' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==43) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpec.g:2294:3: 'holds'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getUniversalityAccess().getHoldsKeyword_2()); 

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
    // $ANTLR end "rule__Universality__Group__2__Impl"


    // $ANTLR start "rule__Absence__Group__0"
    // InternalSpec.g:2303:1: rule__Absence__Group__0 : rule__Absence__Group__0__Impl rule__Absence__Group__1 ;
    public final void rule__Absence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2307:1: ( rule__Absence__Group__0__Impl rule__Absence__Group__1 )
            // InternalSpec.g:2308:2: rule__Absence__Group__0__Impl rule__Absence__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Absence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absence__Group__1();

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
    // $ANTLR end "rule__Absence__Group__0"


    // $ANTLR start "rule__Absence__Group__0__Impl"
    // InternalSpec.g:2315:1: rule__Absence__Group__0__Impl : ( 'It-is-never-the-case-that' ) ;
    public final void rule__Absence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2319:1: ( ( 'It-is-never-the-case-that' ) )
            // InternalSpec.g:2320:1: ( 'It-is-never-the-case-that' )
            {
            // InternalSpec.g:2320:1: ( 'It-is-never-the-case-that' )
            // InternalSpec.g:2321:2: 'It-is-never-the-case-that'
            {
             before(grammarAccess.getAbsenceAccess().getItIsNeverTheCaseThatKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getAbsenceAccess().getItIsNeverTheCaseThatKeyword_0()); 

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
    // $ANTLR end "rule__Absence__Group__0__Impl"


    // $ANTLR start "rule__Absence__Group__1"
    // InternalSpec.g:2330:1: rule__Absence__Group__1 : rule__Absence__Group__1__Impl rule__Absence__Group__2 ;
    public final void rule__Absence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2334:1: ( rule__Absence__Group__1__Impl rule__Absence__Group__2 )
            // InternalSpec.g:2335:2: rule__Absence__Group__1__Impl rule__Absence__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Absence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Absence__Group__2();

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
    // $ANTLR end "rule__Absence__Group__1"


    // $ANTLR start "rule__Absence__Group__1__Impl"
    // InternalSpec.g:2342:1: rule__Absence__Group__1__Impl : ( ( rule__Absence__PAssignment_1 ) ) ;
    public final void rule__Absence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2346:1: ( ( ( rule__Absence__PAssignment_1 ) ) )
            // InternalSpec.g:2347:1: ( ( rule__Absence__PAssignment_1 ) )
            {
            // InternalSpec.g:2347:1: ( ( rule__Absence__PAssignment_1 ) )
            // InternalSpec.g:2348:2: ( rule__Absence__PAssignment_1 )
            {
             before(grammarAccess.getAbsenceAccess().getPAssignment_1()); 
            // InternalSpec.g:2349:2: ( rule__Absence__PAssignment_1 )
            // InternalSpec.g:2349:3: rule__Absence__PAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Absence__PAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAbsenceAccess().getPAssignment_1()); 

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
    // $ANTLR end "rule__Absence__Group__1__Impl"


    // $ANTLR start "rule__Absence__Group__2"
    // InternalSpec.g:2357:1: rule__Absence__Group__2 : rule__Absence__Group__2__Impl ;
    public final void rule__Absence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2361:1: ( rule__Absence__Group__2__Impl )
            // InternalSpec.g:2362:2: rule__Absence__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Absence__Group__2__Impl();

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
    // $ANTLR end "rule__Absence__Group__2"


    // $ANTLR start "rule__Absence__Group__2__Impl"
    // InternalSpec.g:2368:1: rule__Absence__Group__2__Impl : ( ( 'holds' )? ) ;
    public final void rule__Absence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2372:1: ( ( ( 'holds' )? ) )
            // InternalSpec.g:2373:1: ( ( 'holds' )? )
            {
            // InternalSpec.g:2373:1: ( ( 'holds' )? )
            // InternalSpec.g:2374:2: ( 'holds' )?
            {
             before(grammarAccess.getAbsenceAccess().getHoldsKeyword_2()); 
            // InternalSpec.g:2375:2: ( 'holds' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==43) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpec.g:2375:3: 'holds'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAbsenceAccess().getHoldsKeyword_2()); 

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
    // $ANTLR end "rule__Absence__Group__2__Impl"


    // $ANTLR start "rule__Existence__Group__0"
    // InternalSpec.g:2384:1: rule__Existence__Group__0 : rule__Existence__Group__0__Impl rule__Existence__Group__1 ;
    public final void rule__Existence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2388:1: ( rule__Existence__Group__0__Impl rule__Existence__Group__1 )
            // InternalSpec.g:2389:2: rule__Existence__Group__0__Impl rule__Existence__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Existence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Existence__Group__1();

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
    // $ANTLR end "rule__Existence__Group__0"


    // $ANTLR start "rule__Existence__Group__0__Impl"
    // InternalSpec.g:2396:1: rule__Existence__Group__0__Impl : ( 'Eventually' ) ;
    public final void rule__Existence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2400:1: ( ( 'Eventually' ) )
            // InternalSpec.g:2401:1: ( 'Eventually' )
            {
            // InternalSpec.g:2401:1: ( 'Eventually' )
            // InternalSpec.g:2402:2: 'Eventually'
            {
             before(grammarAccess.getExistenceAccess().getEventuallyKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getExistenceAccess().getEventuallyKeyword_0()); 

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
    // $ANTLR end "rule__Existence__Group__0__Impl"


    // $ANTLR start "rule__Existence__Group__1"
    // InternalSpec.g:2411:1: rule__Existence__Group__1 : rule__Existence__Group__1__Impl rule__Existence__Group__2 ;
    public final void rule__Existence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2415:1: ( rule__Existence__Group__1__Impl rule__Existence__Group__2 )
            // InternalSpec.g:2416:2: rule__Existence__Group__1__Impl rule__Existence__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__Existence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Existence__Group__2();

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
    // $ANTLR end "rule__Existence__Group__1"


    // $ANTLR start "rule__Existence__Group__1__Impl"
    // InternalSpec.g:2423:1: rule__Existence__Group__1__Impl : ( ( rule__Existence__PAssignment_1 ) ) ;
    public final void rule__Existence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2427:1: ( ( ( rule__Existence__PAssignment_1 ) ) )
            // InternalSpec.g:2428:1: ( ( rule__Existence__PAssignment_1 ) )
            {
            // InternalSpec.g:2428:1: ( ( rule__Existence__PAssignment_1 ) )
            // InternalSpec.g:2429:2: ( rule__Existence__PAssignment_1 )
            {
             before(grammarAccess.getExistenceAccess().getPAssignment_1()); 
            // InternalSpec.g:2430:2: ( rule__Existence__PAssignment_1 )
            // InternalSpec.g:2430:3: rule__Existence__PAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Existence__PAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExistenceAccess().getPAssignment_1()); 

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
    // $ANTLR end "rule__Existence__Group__1__Impl"


    // $ANTLR start "rule__Existence__Group__2"
    // InternalSpec.g:2438:1: rule__Existence__Group__2 : rule__Existence__Group__2__Impl rule__Existence__Group__3 ;
    public final void rule__Existence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2442:1: ( rule__Existence__Group__2__Impl rule__Existence__Group__3 )
            // InternalSpec.g:2443:2: rule__Existence__Group__2__Impl rule__Existence__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Existence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Existence__Group__3();

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
    // $ANTLR end "rule__Existence__Group__2"


    // $ANTLR start "rule__Existence__Group__2__Impl"
    // InternalSpec.g:2450:1: rule__Existence__Group__2__Impl : ( ( 'holds' )? ) ;
    public final void rule__Existence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2454:1: ( ( ( 'holds' )? ) )
            // InternalSpec.g:2455:1: ( ( 'holds' )? )
            {
            // InternalSpec.g:2455:1: ( ( 'holds' )? )
            // InternalSpec.g:2456:2: ( 'holds' )?
            {
             before(grammarAccess.getExistenceAccess().getHoldsKeyword_2()); 
            // InternalSpec.g:2457:2: ( 'holds' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==43) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpec.g:2457:3: 'holds'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExistenceAccess().getHoldsKeyword_2()); 

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
    // $ANTLR end "rule__Existence__Group__2__Impl"


    // $ANTLR start "rule__Existence__Group__3"
    // InternalSpec.g:2465:1: rule__Existence__Group__3 : rule__Existence__Group__3__Impl ;
    public final void rule__Existence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2469:1: ( rule__Existence__Group__3__Impl )
            // InternalSpec.g:2470:2: rule__Existence__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Existence__Group__3__Impl();

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
    // $ANTLR end "rule__Existence__Group__3"


    // $ANTLR start "rule__Existence__Group__3__Impl"
    // InternalSpec.g:2476:1: rule__Existence__Group__3__Impl : ( ( rule__Existence__TimeAssignment_3 ) ) ;
    public final void rule__Existence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2480:1: ( ( ( rule__Existence__TimeAssignment_3 ) ) )
            // InternalSpec.g:2481:1: ( ( rule__Existence__TimeAssignment_3 ) )
            {
            // InternalSpec.g:2481:1: ( ( rule__Existence__TimeAssignment_3 ) )
            // InternalSpec.g:2482:2: ( rule__Existence__TimeAssignment_3 )
            {
             before(grammarAccess.getExistenceAccess().getTimeAssignment_3()); 
            // InternalSpec.g:2483:2: ( rule__Existence__TimeAssignment_3 )
            // InternalSpec.g:2483:3: rule__Existence__TimeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Existence__TimeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExistenceAccess().getTimeAssignment_3()); 

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
    // $ANTLR end "rule__Existence__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalSpec.g:2492:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2496:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalSpec.g:2497:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

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
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalSpec.g:2504:1: rule__Response__Group__0__Impl : ( 'if' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2508:1: ( ( 'if' ) )
            // InternalSpec.g:2509:1: ( 'if' )
            {
            // InternalSpec.g:2509:1: ( 'if' )
            // InternalSpec.g:2510:2: 'if'
            {
             before(grammarAccess.getResponseAccess().getIfKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getIfKeyword_0()); 

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
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalSpec.g:2519:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2523:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalSpec.g:2524:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

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
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalSpec.g:2531:1: rule__Response__Group__1__Impl : ( ( rule__Response__PAssignment_1 ) ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2535:1: ( ( ( rule__Response__PAssignment_1 ) ) )
            // InternalSpec.g:2536:1: ( ( rule__Response__PAssignment_1 ) )
            {
            // InternalSpec.g:2536:1: ( ( rule__Response__PAssignment_1 ) )
            // InternalSpec.g:2537:2: ( rule__Response__PAssignment_1 )
            {
             before(grammarAccess.getResponseAccess().getPAssignment_1()); 
            // InternalSpec.g:2538:2: ( rule__Response__PAssignment_1 )
            // InternalSpec.g:2538:3: rule__Response__PAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Response__PAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getPAssignment_1()); 

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
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalSpec.g:2546:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2550:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalSpec.g:2551:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Response__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__3();

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
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalSpec.g:2558:1: rule__Response__Group__2__Impl : ( 'then-in-response' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2562:1: ( ( 'then-in-response' ) )
            // InternalSpec.g:2563:1: ( 'then-in-response' )
            {
            // InternalSpec.g:2563:1: ( 'then-in-response' )
            // InternalSpec.g:2564:2: 'then-in-response'
            {
             before(grammarAccess.getResponseAccess().getThenInResponseKeyword_2()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getThenInResponseKeyword_2()); 

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
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__3"
    // InternalSpec.g:2573:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2577:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalSpec.g:2578:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Response__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__4();

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
    // $ANTLR end "rule__Response__Group__3"


    // $ANTLR start "rule__Response__Group__3__Impl"
    // InternalSpec.g:2585:1: rule__Response__Group__3__Impl : ( ( rule__Response__SAssignment_3 ) ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2589:1: ( ( ( rule__Response__SAssignment_3 ) ) )
            // InternalSpec.g:2590:1: ( ( rule__Response__SAssignment_3 ) )
            {
            // InternalSpec.g:2590:1: ( ( rule__Response__SAssignment_3 ) )
            // InternalSpec.g:2591:2: ( rule__Response__SAssignment_3 )
            {
             before(grammarAccess.getResponseAccess().getSAssignment_3()); 
            // InternalSpec.g:2592:2: ( rule__Response__SAssignment_3 )
            // InternalSpec.g:2592:3: rule__Response__SAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Response__SAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getSAssignment_3()); 

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
    // $ANTLR end "rule__Response__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__4"
    // InternalSpec.g:2600:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2604:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalSpec.g:2605:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__Response__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__5();

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
    // $ANTLR end "rule__Response__Group__4"


    // $ANTLR start "rule__Response__Group__4__Impl"
    // InternalSpec.g:2612:1: rule__Response__Group__4__Impl : ( ( 'eventually holds' )? ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2616:1: ( ( ( 'eventually holds' )? ) )
            // InternalSpec.g:2617:1: ( ( 'eventually holds' )? )
            {
            // InternalSpec.g:2617:1: ( ( 'eventually holds' )? )
            // InternalSpec.g:2618:2: ( 'eventually holds' )?
            {
             before(grammarAccess.getResponseAccess().getEventuallyHoldsKeyword_4()); 
            // InternalSpec.g:2619:2: ( 'eventually holds' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==48) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSpec.g:2619:3: 'eventually holds'
                    {
                    match(input,48,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getEventuallyHoldsKeyword_4()); 

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
    // $ANTLR end "rule__Response__Group__4__Impl"


    // $ANTLR start "rule__Response__Group__5"
    // InternalSpec.g:2627:1: rule__Response__Group__5 : rule__Response__Group__5__Impl ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2631:1: ( rule__Response__Group__5__Impl )
            // InternalSpec.g:2632:2: rule__Response__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__5__Impl();

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
    // $ANTLR end "rule__Response__Group__5"


    // $ANTLR start "rule__Response__Group__5__Impl"
    // InternalSpec.g:2638:1: rule__Response__Group__5__Impl : ( ( rule__Response__TimeAssignment_5 ) ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2642:1: ( ( ( rule__Response__TimeAssignment_5 ) ) )
            // InternalSpec.g:2643:1: ( ( rule__Response__TimeAssignment_5 ) )
            {
            // InternalSpec.g:2643:1: ( ( rule__Response__TimeAssignment_5 ) )
            // InternalSpec.g:2644:2: ( rule__Response__TimeAssignment_5 )
            {
             before(grammarAccess.getResponseAccess().getTimeAssignment_5()); 
            // InternalSpec.g:2645:2: ( rule__Response__TimeAssignment_5 )
            // InternalSpec.g:2645:3: rule__Response__TimeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Response__TimeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getTimeAssignment_5()); 

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
    // $ANTLR end "rule__Response__Group__5__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalSpec.g:2654:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2658:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalSpec.g:2659:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalSpec.g:2666:1: rule__Number__Group__0__Impl : ( ( rule__Number__SignAssignment_0 )? ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2670:1: ( ( ( rule__Number__SignAssignment_0 )? ) )
            // InternalSpec.g:2671:1: ( ( rule__Number__SignAssignment_0 )? )
            {
            // InternalSpec.g:2671:1: ( ( rule__Number__SignAssignment_0 )? )
            // InternalSpec.g:2672:2: ( rule__Number__SignAssignment_0 )?
            {
             before(grammarAccess.getNumberAccess().getSignAssignment_0()); 
            // InternalSpec.g:2673:2: ( rule__Number__SignAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==53) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpec.g:2673:3: rule__Number__SignAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__SignAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getSignAssignment_0()); 

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
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalSpec.g:2681:1: rule__Number__Group__1 : rule__Number__Group__1__Impl rule__Number__Group__2 ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2685:1: ( rule__Number__Group__1__Impl rule__Number__Group__2 )
            // InternalSpec.g:2686:2: rule__Number__Group__1__Impl rule__Number__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__Number__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__2();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalSpec.g:2693:1: rule__Number__Group__1__Impl : ( ( rule__Number__IntValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2697:1: ( ( ( rule__Number__IntValueAssignment_1 ) ) )
            // InternalSpec.g:2698:1: ( ( rule__Number__IntValueAssignment_1 ) )
            {
            // InternalSpec.g:2698:1: ( ( rule__Number__IntValueAssignment_1 ) )
            // InternalSpec.g:2699:2: ( rule__Number__IntValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getIntValueAssignment_1()); 
            // InternalSpec.g:2700:2: ( rule__Number__IntValueAssignment_1 )
            // InternalSpec.g:2700:3: rule__Number__IntValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__IntValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getIntValueAssignment_1()); 

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
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__2"
    // InternalSpec.g:2708:1: rule__Number__Group__2 : rule__Number__Group__2__Impl ;
    public final void rule__Number__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2712:1: ( rule__Number__Group__2__Impl )
            // InternalSpec.g:2713:2: rule__Number__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__2__Impl();

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
    // $ANTLR end "rule__Number__Group__2"


    // $ANTLR start "rule__Number__Group__2__Impl"
    // InternalSpec.g:2719:1: rule__Number__Group__2__Impl : ( ( rule__Number__Group_2__0 )? ) ;
    public final void rule__Number__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2723:1: ( ( ( rule__Number__Group_2__0 )? ) )
            // InternalSpec.g:2724:1: ( ( rule__Number__Group_2__0 )? )
            {
            // InternalSpec.g:2724:1: ( ( rule__Number__Group_2__0 )? )
            // InternalSpec.g:2725:2: ( rule__Number__Group_2__0 )?
            {
             before(grammarAccess.getNumberAccess().getGroup_2()); 
            // InternalSpec.g:2726:2: ( rule__Number__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==49) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSpec.g:2726:3: rule__Number__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNumberAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Number__Group__2__Impl"


    // $ANTLR start "rule__Number__Group_2__0"
    // InternalSpec.g:2735:1: rule__Number__Group_2__0 : rule__Number__Group_2__0__Impl rule__Number__Group_2__1 ;
    public final void rule__Number__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2739:1: ( rule__Number__Group_2__0__Impl rule__Number__Group_2__1 )
            // InternalSpec.g:2740:2: rule__Number__Group_2__0__Impl rule__Number__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Number__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group_2__1();

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
    // $ANTLR end "rule__Number__Group_2__0"


    // $ANTLR start "rule__Number__Group_2__0__Impl"
    // InternalSpec.g:2747:1: rule__Number__Group_2__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2751:1: ( ( '.' ) )
            // InternalSpec.g:2752:1: ( '.' )
            {
            // InternalSpec.g:2752:1: ( '.' )
            // InternalSpec.g:2753:2: '.'
            {
             before(grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getFullStopKeyword_2_0()); 

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
    // $ANTLR end "rule__Number__Group_2__0__Impl"


    // $ANTLR start "rule__Number__Group_2__1"
    // InternalSpec.g:2762:1: rule__Number__Group_2__1 : rule__Number__Group_2__1__Impl ;
    public final void rule__Number__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2766:1: ( rule__Number__Group_2__1__Impl )
            // InternalSpec.g:2767:2: rule__Number__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_2__1__Impl();

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
    // $ANTLR end "rule__Number__Group_2__1"


    // $ANTLR start "rule__Number__Group_2__1__Impl"
    // InternalSpec.g:2773:1: rule__Number__Group_2__1__Impl : ( ( rule__Number__DecimalValueAssignment_2_1 ) ) ;
    public final void rule__Number__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2777:1: ( ( ( rule__Number__DecimalValueAssignment_2_1 ) ) )
            // InternalSpec.g:2778:1: ( ( rule__Number__DecimalValueAssignment_2_1 ) )
            {
            // InternalSpec.g:2778:1: ( ( rule__Number__DecimalValueAssignment_2_1 ) )
            // InternalSpec.g:2779:2: ( rule__Number__DecimalValueAssignment_2_1 )
            {
             before(grammarAccess.getNumberAccess().getDecimalValueAssignment_2_1()); 
            // InternalSpec.g:2780:2: ( rule__Number__DecimalValueAssignment_2_1 )
            // InternalSpec.g:2780:3: rule__Number__DecimalValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__DecimalValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getDecimalValueAssignment_2_1()); 

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
    // $ANTLR end "rule__Number__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group__0"
    // InternalSpec.g:2789:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2793:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // InternalSpec.g:2794:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__Expression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__1();

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
    // $ANTLR end "rule__Expression__Group__0"


    // $ANTLR start "rule__Expression__Group__0__Impl"
    // InternalSpec.g:2801:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__Alternatives_0 ) ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2805:1: ( ( ( rule__Expression__Alternatives_0 ) ) )
            // InternalSpec.g:2806:1: ( ( rule__Expression__Alternatives_0 ) )
            {
            // InternalSpec.g:2806:1: ( ( rule__Expression__Alternatives_0 ) )
            // InternalSpec.g:2807:2: ( rule__Expression__Alternatives_0 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_0()); 
            // InternalSpec.g:2808:2: ( rule__Expression__Alternatives_0 )
            // InternalSpec.g:2808:3: rule__Expression__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_0()); 

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
    // $ANTLR end "rule__Expression__Group__0__Impl"


    // $ANTLR start "rule__Expression__Group__1"
    // InternalSpec.g:2816:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2820:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // InternalSpec.g:2821:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Expression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group__2();

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
    // $ANTLR end "rule__Expression__Group__1"


    // $ANTLR start "rule__Expression__Group__1__Impl"
    // InternalSpec.g:2828:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__OperatorAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2832:1: ( ( ( rule__Expression__OperatorAssignment_1 ) ) )
            // InternalSpec.g:2833:1: ( ( rule__Expression__OperatorAssignment_1 ) )
            {
            // InternalSpec.g:2833:1: ( ( rule__Expression__OperatorAssignment_1 ) )
            // InternalSpec.g:2834:2: ( rule__Expression__OperatorAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAssignment_1()); 
            // InternalSpec.g:2835:2: ( rule__Expression__OperatorAssignment_1 )
            // InternalSpec.g:2835:3: rule__Expression__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Expression__Group__1__Impl"


    // $ANTLR start "rule__Expression__Group__2"
    // InternalSpec.g:2843:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2847:1: ( rule__Expression__Group__2__Impl )
            // InternalSpec.g:2848:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group__2__Impl();

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
    // $ANTLR end "rule__Expression__Group__2"


    // $ANTLR start "rule__Expression__Group__2__Impl"
    // InternalSpec.g:2854:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__Alternatives_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2858:1: ( ( ( rule__Expression__Alternatives_2 ) ) )
            // InternalSpec.g:2859:1: ( ( rule__Expression__Alternatives_2 ) )
            {
            // InternalSpec.g:2859:1: ( ( rule__Expression__Alternatives_2 ) )
            // InternalSpec.g:2860:2: ( rule__Expression__Alternatives_2 )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives_2()); 
            // InternalSpec.g:2861:2: ( rule__Expression__Alternatives_2 )
            // InternalSpec.g:2861:3: rule__Expression__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives_2()); 

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
    // $ANTLR end "rule__Expression__Group__2__Impl"


    // $ANTLR start "rule__UpperTimeBound__Group__0"
    // InternalSpec.g:2870:1: rule__UpperTimeBound__Group__0 : rule__UpperTimeBound__Group__0__Impl rule__UpperTimeBound__Group__1 ;
    public final void rule__UpperTimeBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2874:1: ( rule__UpperTimeBound__Group__0__Impl rule__UpperTimeBound__Group__1 )
            // InternalSpec.g:2875:2: rule__UpperTimeBound__Group__0__Impl rule__UpperTimeBound__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__UpperTimeBound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__Group__1();

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
    // $ANTLR end "rule__UpperTimeBound__Group__0"


    // $ANTLR start "rule__UpperTimeBound__Group__0__Impl"
    // InternalSpec.g:2882:1: rule__UpperTimeBound__Group__0__Impl : ( 'within' ) ;
    public final void rule__UpperTimeBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2886:1: ( ( 'within' ) )
            // InternalSpec.g:2887:1: ( 'within' )
            {
            // InternalSpec.g:2887:1: ( 'within' )
            // InternalSpec.g:2888:2: 'within'
            {
             before(grammarAccess.getUpperTimeBoundAccess().getWithinKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getUpperTimeBoundAccess().getWithinKeyword_0()); 

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
    // $ANTLR end "rule__UpperTimeBound__Group__0__Impl"


    // $ANTLR start "rule__UpperTimeBound__Group__1"
    // InternalSpec.g:2897:1: rule__UpperTimeBound__Group__1 : rule__UpperTimeBound__Group__1__Impl rule__UpperTimeBound__Group__2 ;
    public final void rule__UpperTimeBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2901:1: ( rule__UpperTimeBound__Group__1__Impl rule__UpperTimeBound__Group__2 )
            // InternalSpec.g:2902:2: rule__UpperTimeBound__Group__1__Impl rule__UpperTimeBound__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__UpperTimeBound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__Group__2();

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
    // $ANTLR end "rule__UpperTimeBound__Group__1"


    // $ANTLR start "rule__UpperTimeBound__Group__1__Impl"
    // InternalSpec.g:2909:1: rule__UpperTimeBound__Group__1__Impl : ( ( rule__UpperTimeBound__ValueAssignment_1 ) ) ;
    public final void rule__UpperTimeBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2913:1: ( ( ( rule__UpperTimeBound__ValueAssignment_1 ) ) )
            // InternalSpec.g:2914:1: ( ( rule__UpperTimeBound__ValueAssignment_1 ) )
            {
            // InternalSpec.g:2914:1: ( ( rule__UpperTimeBound__ValueAssignment_1 ) )
            // InternalSpec.g:2915:2: ( rule__UpperTimeBound__ValueAssignment_1 )
            {
             before(grammarAccess.getUpperTimeBoundAccess().getValueAssignment_1()); 
            // InternalSpec.g:2916:2: ( rule__UpperTimeBound__ValueAssignment_1 )
            // InternalSpec.g:2916:3: rule__UpperTimeBound__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperTimeBoundAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__UpperTimeBound__Group__1__Impl"


    // $ANTLR start "rule__UpperTimeBound__Group__2"
    // InternalSpec.g:2924:1: rule__UpperTimeBound__Group__2 : rule__UpperTimeBound__Group__2__Impl ;
    public final void rule__UpperTimeBound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2928:1: ( rule__UpperTimeBound__Group__2__Impl )
            // InternalSpec.g:2929:2: rule__UpperTimeBound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__Group__2__Impl();

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
    // $ANTLR end "rule__UpperTimeBound__Group__2"


    // $ANTLR start "rule__UpperTimeBound__Group__2__Impl"
    // InternalSpec.g:2935:1: rule__UpperTimeBound__Group__2__Impl : ( ( rule__UpperTimeBound__UnitAssignment_2 ) ) ;
    public final void rule__UpperTimeBound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2939:1: ( ( ( rule__UpperTimeBound__UnitAssignment_2 ) ) )
            // InternalSpec.g:2940:1: ( ( rule__UpperTimeBound__UnitAssignment_2 ) )
            {
            // InternalSpec.g:2940:1: ( ( rule__UpperTimeBound__UnitAssignment_2 ) )
            // InternalSpec.g:2941:2: ( rule__UpperTimeBound__UnitAssignment_2 )
            {
             before(grammarAccess.getUpperTimeBoundAccess().getUnitAssignment_2()); 
            // InternalSpec.g:2942:2: ( rule__UpperTimeBound__UnitAssignment_2 )
            // InternalSpec.g:2942:3: rule__UpperTimeBound__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__UpperTimeBound__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUpperTimeBoundAccess().getUnitAssignment_2()); 

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
    // $ANTLR end "rule__UpperTimeBound__Group__2__Impl"


    // $ANTLR start "rule__LowerTimeBound__Group__0"
    // InternalSpec.g:2951:1: rule__LowerTimeBound__Group__0 : rule__LowerTimeBound__Group__0__Impl rule__LowerTimeBound__Group__1 ;
    public final void rule__LowerTimeBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2955:1: ( rule__LowerTimeBound__Group__0__Impl rule__LowerTimeBound__Group__1 )
            // InternalSpec.g:2956:2: rule__LowerTimeBound__Group__0__Impl rule__LowerTimeBound__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__LowerTimeBound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__Group__1();

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
    // $ANTLR end "rule__LowerTimeBound__Group__0"


    // $ANTLR start "rule__LowerTimeBound__Group__0__Impl"
    // InternalSpec.g:2963:1: rule__LowerTimeBound__Group__0__Impl : ( 'after' ) ;
    public final void rule__LowerTimeBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2967:1: ( ( 'after' ) )
            // InternalSpec.g:2968:1: ( 'after' )
            {
            // InternalSpec.g:2968:1: ( 'after' )
            // InternalSpec.g:2969:2: 'after'
            {
             before(grammarAccess.getLowerTimeBoundAccess().getAfterKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getLowerTimeBoundAccess().getAfterKeyword_0()); 

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
    // $ANTLR end "rule__LowerTimeBound__Group__0__Impl"


    // $ANTLR start "rule__LowerTimeBound__Group__1"
    // InternalSpec.g:2978:1: rule__LowerTimeBound__Group__1 : rule__LowerTimeBound__Group__1__Impl rule__LowerTimeBound__Group__2 ;
    public final void rule__LowerTimeBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2982:1: ( rule__LowerTimeBound__Group__1__Impl rule__LowerTimeBound__Group__2 )
            // InternalSpec.g:2983:2: rule__LowerTimeBound__Group__1__Impl rule__LowerTimeBound__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__LowerTimeBound__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__Group__2();

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
    // $ANTLR end "rule__LowerTimeBound__Group__1"


    // $ANTLR start "rule__LowerTimeBound__Group__1__Impl"
    // InternalSpec.g:2990:1: rule__LowerTimeBound__Group__1__Impl : ( ( rule__LowerTimeBound__ValueAssignment_1 ) ) ;
    public final void rule__LowerTimeBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:2994:1: ( ( ( rule__LowerTimeBound__ValueAssignment_1 ) ) )
            // InternalSpec.g:2995:1: ( ( rule__LowerTimeBound__ValueAssignment_1 ) )
            {
            // InternalSpec.g:2995:1: ( ( rule__LowerTimeBound__ValueAssignment_1 ) )
            // InternalSpec.g:2996:2: ( rule__LowerTimeBound__ValueAssignment_1 )
            {
             before(grammarAccess.getLowerTimeBoundAccess().getValueAssignment_1()); 
            // InternalSpec.g:2997:2: ( rule__LowerTimeBound__ValueAssignment_1 )
            // InternalSpec.g:2997:3: rule__LowerTimeBound__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLowerTimeBoundAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__LowerTimeBound__Group__1__Impl"


    // $ANTLR start "rule__LowerTimeBound__Group__2"
    // InternalSpec.g:3005:1: rule__LowerTimeBound__Group__2 : rule__LowerTimeBound__Group__2__Impl ;
    public final void rule__LowerTimeBound__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3009:1: ( rule__LowerTimeBound__Group__2__Impl )
            // InternalSpec.g:3010:2: rule__LowerTimeBound__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__Group__2__Impl();

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
    // $ANTLR end "rule__LowerTimeBound__Group__2"


    // $ANTLR start "rule__LowerTimeBound__Group__2__Impl"
    // InternalSpec.g:3016:1: rule__LowerTimeBound__Group__2__Impl : ( ( rule__LowerTimeBound__UnitAssignment_2 ) ) ;
    public final void rule__LowerTimeBound__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3020:1: ( ( ( rule__LowerTimeBound__UnitAssignment_2 ) ) )
            // InternalSpec.g:3021:1: ( ( rule__LowerTimeBound__UnitAssignment_2 ) )
            {
            // InternalSpec.g:3021:1: ( ( rule__LowerTimeBound__UnitAssignment_2 ) )
            // InternalSpec.g:3022:2: ( rule__LowerTimeBound__UnitAssignment_2 )
            {
             before(grammarAccess.getLowerTimeBoundAccess().getUnitAssignment_2()); 
            // InternalSpec.g:3023:2: ( rule__LowerTimeBound__UnitAssignment_2 )
            // InternalSpec.g:3023:3: rule__LowerTimeBound__UnitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LowerTimeBound__UnitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLowerTimeBoundAccess().getUnitAssignment_2()); 

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
    // $ANTLR end "rule__LowerTimeBound__Group__2__Impl"


    // $ANTLR start "rule__Interval__Group__0"
    // InternalSpec.g:3032:1: rule__Interval__Group__0 : rule__Interval__Group__0__Impl rule__Interval__Group__1 ;
    public final void rule__Interval__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3036:1: ( rule__Interval__Group__0__Impl rule__Interval__Group__1 )
            // InternalSpec.g:3037:2: rule__Interval__Group__0__Impl rule__Interval__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Interval__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__1();

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
    // $ANTLR end "rule__Interval__Group__0"


    // $ANTLR start "rule__Interval__Group__0__Impl"
    // InternalSpec.g:3044:1: rule__Interval__Group__0__Impl : ( 'between' ) ;
    public final void rule__Interval__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3048:1: ( ( 'between' ) )
            // InternalSpec.g:3049:1: ( 'between' )
            {
            // InternalSpec.g:3049:1: ( 'between' )
            // InternalSpec.g:3050:2: 'between'
            {
             before(grammarAccess.getIntervalAccess().getBetweenKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getBetweenKeyword_0()); 

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
    // $ANTLR end "rule__Interval__Group__0__Impl"


    // $ANTLR start "rule__Interval__Group__1"
    // InternalSpec.g:3059:1: rule__Interval__Group__1 : rule__Interval__Group__1__Impl rule__Interval__Group__2 ;
    public final void rule__Interval__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3063:1: ( rule__Interval__Group__1__Impl rule__Interval__Group__2 )
            // InternalSpec.g:3064:2: rule__Interval__Group__1__Impl rule__Interval__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Interval__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__2();

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
    // $ANTLR end "rule__Interval__Group__1"


    // $ANTLR start "rule__Interval__Group__1__Impl"
    // InternalSpec.g:3071:1: rule__Interval__Group__1__Impl : ( ( rule__Interval__MinAssignment_1 ) ) ;
    public final void rule__Interval__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3075:1: ( ( ( rule__Interval__MinAssignment_1 ) ) )
            // InternalSpec.g:3076:1: ( ( rule__Interval__MinAssignment_1 ) )
            {
            // InternalSpec.g:3076:1: ( ( rule__Interval__MinAssignment_1 ) )
            // InternalSpec.g:3077:2: ( rule__Interval__MinAssignment_1 )
            {
             before(grammarAccess.getIntervalAccess().getMinAssignment_1()); 
            // InternalSpec.g:3078:2: ( rule__Interval__MinAssignment_1 )
            // InternalSpec.g:3078:3: rule__Interval__MinAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Interval__MinAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getMinAssignment_1()); 

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
    // $ANTLR end "rule__Interval__Group__1__Impl"


    // $ANTLR start "rule__Interval__Group__2"
    // InternalSpec.g:3086:1: rule__Interval__Group__2 : rule__Interval__Group__2__Impl rule__Interval__Group__3 ;
    public final void rule__Interval__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3090:1: ( rule__Interval__Group__2__Impl rule__Interval__Group__3 )
            // InternalSpec.g:3091:2: rule__Interval__Group__2__Impl rule__Interval__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__Interval__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__3();

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
    // $ANTLR end "rule__Interval__Group__2"


    // $ANTLR start "rule__Interval__Group__2__Impl"
    // InternalSpec.g:3098:1: rule__Interval__Group__2__Impl : ( 'and' ) ;
    public final void rule__Interval__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3102:1: ( ( 'and' ) )
            // InternalSpec.g:3103:1: ( 'and' )
            {
            // InternalSpec.g:3103:1: ( 'and' )
            // InternalSpec.g:3104:2: 'and'
            {
             before(grammarAccess.getIntervalAccess().getAndKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getAndKeyword_2()); 

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
    // $ANTLR end "rule__Interval__Group__2__Impl"


    // $ANTLR start "rule__Interval__Group__3"
    // InternalSpec.g:3113:1: rule__Interval__Group__3 : rule__Interval__Group__3__Impl rule__Interval__Group__4 ;
    public final void rule__Interval__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3117:1: ( rule__Interval__Group__3__Impl rule__Interval__Group__4 )
            // InternalSpec.g:3118:2: rule__Interval__Group__3__Impl rule__Interval__Group__4
            {
            pushFollow(FOLLOW_33);
            rule__Interval__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Interval__Group__4();

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
    // $ANTLR end "rule__Interval__Group__3"


    // $ANTLR start "rule__Interval__Group__3__Impl"
    // InternalSpec.g:3125:1: rule__Interval__Group__3__Impl : ( ( rule__Interval__MaxAssignment_3 ) ) ;
    public final void rule__Interval__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3129:1: ( ( ( rule__Interval__MaxAssignment_3 ) ) )
            // InternalSpec.g:3130:1: ( ( rule__Interval__MaxAssignment_3 ) )
            {
            // InternalSpec.g:3130:1: ( ( rule__Interval__MaxAssignment_3 ) )
            // InternalSpec.g:3131:2: ( rule__Interval__MaxAssignment_3 )
            {
             before(grammarAccess.getIntervalAccess().getMaxAssignment_3()); 
            // InternalSpec.g:3132:2: ( rule__Interval__MaxAssignment_3 )
            // InternalSpec.g:3132:3: rule__Interval__MaxAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Interval__MaxAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getMaxAssignment_3()); 

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
    // $ANTLR end "rule__Interval__Group__3__Impl"


    // $ANTLR start "rule__Interval__Group__4"
    // InternalSpec.g:3140:1: rule__Interval__Group__4 : rule__Interval__Group__4__Impl ;
    public final void rule__Interval__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3144:1: ( rule__Interval__Group__4__Impl )
            // InternalSpec.g:3145:2: rule__Interval__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Interval__Group__4__Impl();

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
    // $ANTLR end "rule__Interval__Group__4"


    // $ANTLR start "rule__Interval__Group__4__Impl"
    // InternalSpec.g:3151:1: rule__Interval__Group__4__Impl : ( ( rule__Interval__UnitAssignment_4 ) ) ;
    public final void rule__Interval__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3155:1: ( ( ( rule__Interval__UnitAssignment_4 ) ) )
            // InternalSpec.g:3156:1: ( ( rule__Interval__UnitAssignment_4 ) )
            {
            // InternalSpec.g:3156:1: ( ( rule__Interval__UnitAssignment_4 ) )
            // InternalSpec.g:3157:2: ( rule__Interval__UnitAssignment_4 )
            {
             before(grammarAccess.getIntervalAccess().getUnitAssignment_4()); 
            // InternalSpec.g:3158:2: ( rule__Interval__UnitAssignment_4 )
            // InternalSpec.g:3158:3: rule__Interval__UnitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Interval__UnitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getIntervalAccess().getUnitAssignment_4()); 

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
    // $ANTLR end "rule__Interval__Group__4__Impl"


    // $ANTLR start "rule__Model__SignalsAssignment_0"
    // InternalSpec.g:3167:1: rule__Model__SignalsAssignment_0 : ( ruleSignal ) ;
    public final void rule__Model__SignalsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3171:1: ( ( ruleSignal ) )
            // InternalSpec.g:3172:2: ( ruleSignal )
            {
            // InternalSpec.g:3172:2: ( ruleSignal )
            // InternalSpec.g:3173:3: ruleSignal
            {
             before(grammarAccess.getModelAccess().getSignalsSignalParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSignalsSignalParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Model__SignalsAssignment_0"


    // $ANTLR start "rule__Model__SpecificationsAssignment_1"
    // InternalSpec.g:3182:1: rule__Model__SpecificationsAssignment_1 : ( ruleSpecification ) ;
    public final void rule__Model__SpecificationsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3186:1: ( ( ruleSpecification ) )
            // InternalSpec.g:3187:2: ( ruleSpecification )
            {
            // InternalSpec.g:3187:2: ( ruleSpecification )
            // InternalSpec.g:3188:3: ruleSpecification
            {
             before(grammarAccess.getModelAccess().getSpecificationsSpecificationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSpecification();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecificationsSpecificationParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__SpecificationsAssignment_1"


    // $ANTLR start "rule__Signal__NameAssignment_1"
    // InternalSpec.g:3197:1: rule__Signal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3201:1: ( ( RULE_ID ) )
            // InternalSpec.g:3202:2: ( RULE_ID )
            {
            // InternalSpec.g:3202:2: ( RULE_ID )
            // InternalSpec.g:3203:3: RULE_ID
            {
             before(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Signal__NameAssignment_1"


    // $ANTLR start "rule__Signal__QueueNameAssignment_3"
    // InternalSpec.g:3212:1: rule__Signal__QueueNameAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Signal__QueueNameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3216:1: ( ( RULE_STRING ) )
            // InternalSpec.g:3217:2: ( RULE_STRING )
            {
            // InternalSpec.g:3217:2: ( RULE_STRING )
            // InternalSpec.g:3218:3: RULE_STRING
            {
             before(grammarAccess.getSignalAccess().getQueueNameSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSignalAccess().getQueueNameSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Signal__QueueNameAssignment_3"


    // $ANTLR start "rule__Specification__NameAssignment_1"
    // InternalSpec.g:3227:1: rule__Specification__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Specification__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3231:1: ( ( RULE_ID ) )
            // InternalSpec.g:3232:2: ( RULE_ID )
            {
            // InternalSpec.g:3232:2: ( RULE_ID )
            // InternalSpec.g:3233:3: RULE_ID
            {
             before(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Specification__NameAssignment_1"


    // $ANTLR start "rule__Specification__ScopeAssignment_4"
    // InternalSpec.g:3242:1: rule__Specification__ScopeAssignment_4 : ( ruleScope ) ;
    public final void rule__Specification__ScopeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3246:1: ( ( ruleScope ) )
            // InternalSpec.g:3247:2: ( ruleScope )
            {
            // InternalSpec.g:3247:2: ( ruleScope )
            // InternalSpec.g:3248:3: ruleScope
            {
             before(grammarAccess.getSpecificationAccess().getScopeScopeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getScopeScopeParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Specification__ScopeAssignment_4"


    // $ANTLR start "rule__Specification__PatternAssignment_6"
    // InternalSpec.g:3257:1: rule__Specification__PatternAssignment_6 : ( rulePattern ) ;
    public final void rule__Specification__PatternAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3261:1: ( ( rulePattern ) )
            // InternalSpec.g:3262:2: ( rulePattern )
            {
            // InternalSpec.g:3262:2: ( rulePattern )
            // InternalSpec.g:3263:3: rulePattern
            {
             before(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getSpecificationAccess().getPatternPatternParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Specification__PatternAssignment_6"


    // $ANTLR start "rule__Scope__RAssignment_1_2"
    // InternalSpec.g:3272:1: rule__Scope__RAssignment_1_2 : ( ruleExpression ) ;
    public final void rule__Scope__RAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3276:1: ( ( ruleExpression ) )
            // InternalSpec.g:3277:2: ( ruleExpression )
            {
            // InternalSpec.g:3277:2: ( ruleExpression )
            // InternalSpec.g:3278:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Scope__RAssignment_1_2"


    // $ANTLR start "rule__Scope__QAssignment_2_2"
    // InternalSpec.g:3287:1: rule__Scope__QAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__Scope__QAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3291:1: ( ( ruleExpression ) )
            // InternalSpec.g:3292:2: ( ruleExpression )
            {
            // InternalSpec.g:3292:2: ( ruleExpression )
            // InternalSpec.g:3293:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__Scope__QAssignment_2_2"


    // $ANTLR start "rule__Scope__QAssignment_3_2"
    // InternalSpec.g:3302:1: rule__Scope__QAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__Scope__QAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3306:1: ( ( ruleExpression ) )
            // InternalSpec.g:3307:2: ( ruleExpression )
            {
            // InternalSpec.g:3307:2: ( ruleExpression )
            // InternalSpec.g:3308:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__Scope__QAssignment_3_2"


    // $ANTLR start "rule__Scope__RAssignment_3_4"
    // InternalSpec.g:3317:1: rule__Scope__RAssignment_3_4 : ( ruleExpression ) ;
    public final void rule__Scope__RAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3321:1: ( ( ruleExpression ) )
            // InternalSpec.g:3322:2: ( ruleExpression )
            {
            // InternalSpec.g:3322:2: ( ruleExpression )
            // InternalSpec.g:3323:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_3_4_0()); 

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
    // $ANTLR end "rule__Scope__RAssignment_3_4"


    // $ANTLR start "rule__Scope__QAssignment_4_2"
    // InternalSpec.g:3332:1: rule__Scope__QAssignment_4_2 : ( ruleExpression ) ;
    public final void rule__Scope__QAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3336:1: ( ( ruleExpression ) )
            // InternalSpec.g:3337:2: ( ruleExpression )
            {
            // InternalSpec.g:3337:2: ( ruleExpression )
            // InternalSpec.g:3338:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getQExpressionParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Scope__QAssignment_4_2"


    // $ANTLR start "rule__Scope__RAssignment_4_4"
    // InternalSpec.g:3347:1: rule__Scope__RAssignment_4_4 : ( ruleExpression ) ;
    public final void rule__Scope__RAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3351:1: ( ( ruleExpression ) )
            // InternalSpec.g:3352:2: ( ruleExpression )
            {
            // InternalSpec.g:3352:2: ( ruleExpression )
            // InternalSpec.g:3353:3: ruleExpression
            {
             before(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getRExpressionParserRuleCall_4_4_0()); 

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
    // $ANTLR end "rule__Scope__RAssignment_4_4"


    // $ANTLR start "rule__Universality__PAssignment_1"
    // InternalSpec.g:3362:1: rule__Universality__PAssignment_1 : ( ruleExpression ) ;
    public final void rule__Universality__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3366:1: ( ( ruleExpression ) )
            // InternalSpec.g:3367:2: ( ruleExpression )
            {
            // InternalSpec.g:3367:2: ( ruleExpression )
            // InternalSpec.g:3368:3: ruleExpression
            {
             before(grammarAccess.getUniversalityAccess().getPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getUniversalityAccess().getPExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Universality__PAssignment_1"


    // $ANTLR start "rule__Absence__PAssignment_1"
    // InternalSpec.g:3377:1: rule__Absence__PAssignment_1 : ( ruleExpression ) ;
    public final void rule__Absence__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3381:1: ( ( ruleExpression ) )
            // InternalSpec.g:3382:2: ( ruleExpression )
            {
            // InternalSpec.g:3382:2: ( ruleExpression )
            // InternalSpec.g:3383:3: ruleExpression
            {
             before(grammarAccess.getAbsenceAccess().getPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getAbsenceAccess().getPExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Absence__PAssignment_1"


    // $ANTLR start "rule__Existence__PAssignment_1"
    // InternalSpec.g:3392:1: rule__Existence__PAssignment_1 : ( ruleExpression ) ;
    public final void rule__Existence__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3396:1: ( ( ruleExpression ) )
            // InternalSpec.g:3397:2: ( ruleExpression )
            {
            // InternalSpec.g:3397:2: ( ruleExpression )
            // InternalSpec.g:3398:3: ruleExpression
            {
             before(grammarAccess.getExistenceAccess().getPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExistenceAccess().getPExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Existence__PAssignment_1"


    // $ANTLR start "rule__Existence__TimeAssignment_3"
    // InternalSpec.g:3407:1: rule__Existence__TimeAssignment_3 : ( ruleTime ) ;
    public final void rule__Existence__TimeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3411:1: ( ( ruleTime ) )
            // InternalSpec.g:3412:2: ( ruleTime )
            {
            // InternalSpec.g:3412:2: ( ruleTime )
            // InternalSpec.g:3413:3: ruleTime
            {
             before(grammarAccess.getExistenceAccess().getTimeTimeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getExistenceAccess().getTimeTimeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Existence__TimeAssignment_3"


    // $ANTLR start "rule__Response__PAssignment_1"
    // InternalSpec.g:3422:1: rule__Response__PAssignment_1 : ( ruleExpression ) ;
    public final void rule__Response__PAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3426:1: ( ( ruleExpression ) )
            // InternalSpec.g:3427:2: ( ruleExpression )
            {
            // InternalSpec.g:3427:2: ( ruleExpression )
            // InternalSpec.g:3428:3: ruleExpression
            {
             before(grammarAccess.getResponseAccess().getPExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getPExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Response__PAssignment_1"


    // $ANTLR start "rule__Response__SAssignment_3"
    // InternalSpec.g:3437:1: rule__Response__SAssignment_3 : ( ruleExpression ) ;
    public final void rule__Response__SAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3441:1: ( ( ruleExpression ) )
            // InternalSpec.g:3442:2: ( ruleExpression )
            {
            // InternalSpec.g:3442:2: ( ruleExpression )
            // InternalSpec.g:3443:3: ruleExpression
            {
             before(grammarAccess.getResponseAccess().getSExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getSExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Response__SAssignment_3"


    // $ANTLR start "rule__Response__TimeAssignment_5"
    // InternalSpec.g:3452:1: rule__Response__TimeAssignment_5 : ( ruleTime ) ;
    public final void rule__Response__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3456:1: ( ( ruleTime ) )
            // InternalSpec.g:3457:2: ( ruleTime )
            {
            // InternalSpec.g:3457:2: ( ruleTime )
            // InternalSpec.g:3458:3: ruleTime
            {
             before(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTimeTimeParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Response__TimeAssignment_5"


    // $ANTLR start "rule__Number__SignAssignment_0"
    // InternalSpec.g:3467:1: rule__Number__SignAssignment_0 : ( ( '-' ) ) ;
    public final void rule__Number__SignAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3471:1: ( ( ( '-' ) ) )
            // InternalSpec.g:3472:2: ( ( '-' ) )
            {
            // InternalSpec.g:3472:2: ( ( '-' ) )
            // InternalSpec.g:3473:3: ( '-' )
            {
             before(grammarAccess.getNumberAccess().getSignHyphenMinusKeyword_0_0()); 
            // InternalSpec.g:3474:3: ( '-' )
            // InternalSpec.g:3475:4: '-'
            {
             before(grammarAccess.getNumberAccess().getSignHyphenMinusKeyword_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getSignHyphenMinusKeyword_0_0()); 

            }

             after(grammarAccess.getNumberAccess().getSignHyphenMinusKeyword_0_0()); 

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
    // $ANTLR end "rule__Number__SignAssignment_0"


    // $ANTLR start "rule__Number__IntValueAssignment_1"
    // InternalSpec.g:3486:1: rule__Number__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3490:1: ( ( RULE_INT ) )
            // InternalSpec.g:3491:2: ( RULE_INT )
            {
            // InternalSpec.g:3491:2: ( RULE_INT )
            // InternalSpec.g:3492:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getIntValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Number__IntValueAssignment_1"


    // $ANTLR start "rule__Number__DecimalValueAssignment_2_1"
    // InternalSpec.g:3501:1: rule__Number__DecimalValueAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__Number__DecimalValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3505:1: ( ( RULE_INT ) )
            // InternalSpec.g:3506:2: ( RULE_INT )
            {
            // InternalSpec.g:3506:2: ( RULE_INT )
            // InternalSpec.g:3507:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getDecimalValueINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getDecimalValueINTTerminalRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Number__DecimalValueAssignment_2_1"


    // $ANTLR start "rule__Expression__S1Assignment_0_0"
    // InternalSpec.g:3516:1: rule__Expression__S1Assignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__S1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3520:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:3521:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:3521:2: ( ( RULE_ID ) )
            // InternalSpec.g:3522:3: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getS1SignalCrossReference_0_0_0()); 
            // InternalSpec.g:3523:3: ( RULE_ID )
            // InternalSpec.g:3524:4: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getS1SignalIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getS1SignalIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getS1SignalCrossReference_0_0_0()); 

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
    // $ANTLR end "rule__Expression__S1Assignment_0_0"


    // $ANTLR start "rule__Expression__F1Assignment_0_1"
    // InternalSpec.g:3535:1: rule__Expression__F1Assignment_0_1 : ( ruleNumber ) ;
    public final void rule__Expression__F1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3539:1: ( ( ruleNumber ) )
            // InternalSpec.g:3540:2: ( ruleNumber )
            {
            // InternalSpec.g:3540:2: ( ruleNumber )
            // InternalSpec.g:3541:3: ruleNumber
            {
             before(grammarAccess.getExpressionAccess().getF1NumberParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getF1NumberParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Expression__F1Assignment_0_1"


    // $ANTLR start "rule__Expression__OperatorAssignment_1"
    // InternalSpec.g:3550:1: rule__Expression__OperatorAssignment_1 : ( ( rule__Expression__OperatorAlternatives_1_0 ) ) ;
    public final void rule__Expression__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3554:1: ( ( ( rule__Expression__OperatorAlternatives_1_0 ) ) )
            // InternalSpec.g:3555:2: ( ( rule__Expression__OperatorAlternatives_1_0 ) )
            {
            // InternalSpec.g:3555:2: ( ( rule__Expression__OperatorAlternatives_1_0 ) )
            // InternalSpec.g:3556:3: ( rule__Expression__OperatorAlternatives_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getOperatorAlternatives_1_0()); 
            // InternalSpec.g:3557:3: ( rule__Expression__OperatorAlternatives_1_0 )
            // InternalSpec.g:3557:4: rule__Expression__OperatorAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__OperatorAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getOperatorAlternatives_1_0()); 

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
    // $ANTLR end "rule__Expression__OperatorAssignment_1"


    // $ANTLR start "rule__Expression__S2Assignment_2_0"
    // InternalSpec.g:3565:1: rule__Expression__S2Assignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Expression__S2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3569:1: ( ( ( RULE_ID ) ) )
            // InternalSpec.g:3570:2: ( ( RULE_ID ) )
            {
            // InternalSpec.g:3570:2: ( ( RULE_ID ) )
            // InternalSpec.g:3571:3: ( RULE_ID )
            {
             before(grammarAccess.getExpressionAccess().getS2SignalCrossReference_2_0_0()); 
            // InternalSpec.g:3572:3: ( RULE_ID )
            // InternalSpec.g:3573:4: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getS2SignalIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getExpressionAccess().getS2SignalIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getExpressionAccess().getS2SignalCrossReference_2_0_0()); 

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
    // $ANTLR end "rule__Expression__S2Assignment_2_0"


    // $ANTLR start "rule__Expression__F2Assignment_2_1"
    // InternalSpec.g:3584:1: rule__Expression__F2Assignment_2_1 : ( ruleNumber ) ;
    public final void rule__Expression__F2Assignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3588:1: ( ( ruleNumber ) )
            // InternalSpec.g:3589:2: ( ruleNumber )
            {
            // InternalSpec.g:3589:2: ( ruleNumber )
            // InternalSpec.g:3590:3: ruleNumber
            {
             before(grammarAccess.getExpressionAccess().getF2NumberParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getF2NumberParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Expression__F2Assignment_2_1"


    // $ANTLR start "rule__UpperTimeBound__ValueAssignment_1"
    // InternalSpec.g:3599:1: rule__UpperTimeBound__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__UpperTimeBound__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3603:1: ( ( RULE_INT ) )
            // InternalSpec.g:3604:2: ( RULE_INT )
            {
            // InternalSpec.g:3604:2: ( RULE_INT )
            // InternalSpec.g:3605:3: RULE_INT
            {
             before(grammarAccess.getUpperTimeBoundAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpperTimeBoundAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__UpperTimeBound__ValueAssignment_1"


    // $ANTLR start "rule__UpperTimeBound__UnitAssignment_2"
    // InternalSpec.g:3614:1: rule__UpperTimeBound__UnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__UpperTimeBound__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3618:1: ( ( ruleTimeUnit ) )
            // InternalSpec.g:3619:2: ( ruleTimeUnit )
            {
            // InternalSpec.g:3619:2: ( ruleTimeUnit )
            // InternalSpec.g:3620:3: ruleTimeUnit
            {
             before(grammarAccess.getUpperTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getUpperTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__UpperTimeBound__UnitAssignment_2"


    // $ANTLR start "rule__LowerTimeBound__ValueAssignment_1"
    // InternalSpec.g:3629:1: rule__LowerTimeBound__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__LowerTimeBound__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3633:1: ( ( RULE_INT ) )
            // InternalSpec.g:3634:2: ( RULE_INT )
            {
            // InternalSpec.g:3634:2: ( RULE_INT )
            // InternalSpec.g:3635:3: RULE_INT
            {
             before(grammarAccess.getLowerTimeBoundAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLowerTimeBoundAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LowerTimeBound__ValueAssignment_1"


    // $ANTLR start "rule__LowerTimeBound__UnitAssignment_2"
    // InternalSpec.g:3644:1: rule__LowerTimeBound__UnitAssignment_2 : ( ruleTimeUnit ) ;
    public final void rule__LowerTimeBound__UnitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3648:1: ( ( ruleTimeUnit ) )
            // InternalSpec.g:3649:2: ( ruleTimeUnit )
            {
            // InternalSpec.g:3649:2: ( ruleTimeUnit )
            // InternalSpec.g:3650:3: ruleTimeUnit
            {
             before(grammarAccess.getLowerTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getLowerTimeBoundAccess().getUnitTimeUnitParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__LowerTimeBound__UnitAssignment_2"


    // $ANTLR start "rule__Interval__MinAssignment_1"
    // InternalSpec.g:3659:1: rule__Interval__MinAssignment_1 : ( RULE_INT ) ;
    public final void rule__Interval__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3663:1: ( ( RULE_INT ) )
            // InternalSpec.g:3664:2: ( RULE_INT )
            {
            // InternalSpec.g:3664:2: ( RULE_INT )
            // InternalSpec.g:3665:3: RULE_INT
            {
             before(grammarAccess.getIntervalAccess().getMinINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getMinINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Interval__MinAssignment_1"


    // $ANTLR start "rule__Interval__MaxAssignment_3"
    // InternalSpec.g:3674:1: rule__Interval__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Interval__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3678:1: ( ( RULE_INT ) )
            // InternalSpec.g:3679:2: ( RULE_INT )
            {
            // InternalSpec.g:3679:2: ( RULE_INT )
            // InternalSpec.g:3680:3: RULE_INT
            {
             before(grammarAccess.getIntervalAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntervalAccess().getMaxINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Interval__MaxAssignment_3"


    // $ANTLR start "rule__Interval__UnitAssignment_4"
    // InternalSpec.g:3689:1: rule__Interval__UnitAssignment_4 : ( ruleTimeUnit ) ;
    public final void rule__Interval__UnitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSpec.g:3693:1: ( ( ruleTimeUnit ) )
            // InternalSpec.g:3694:2: ( ruleTimeUnit )
            {
            // InternalSpec.g:3694:2: ( ruleTimeUnit )
            // InternalSpec.g:3695:3: ruleTimeUnit
            {
             before(grammarAccess.getIntervalAccess().getUnitTimeUnitParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getIntervalAccess().getUnitTimeUnitParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Interval__UnitAssignment_4"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\16\uffff\1\22\1\uffff\1\22\4\uffff\1\22";
    static final String dfa_3s = "\1\32\2\uffff\1\4\1\uffff\1\14\1\6\1\14\5\4\1\6\1\31\1\6\1\31\1\14\2\uffff\1\6\1\31";
    static final String dfa_4s = "\1\35\2\uffff\1\65\1\uffff\1\20\1\6\1\61\5\65\1\6\1\37\1\6\1\61\1\20\2\uffff\1\6\1\37";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\uffff\1\4\15\uffff\1\3\1\5\2\uffff";
    static final String dfa_6s = "\26\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\2\1\3\1\4",
            "",
            "",
            "\1\5\1\uffff\1\7\56\uffff\1\6",
            "",
            "\1\10\1\11\1\12\1\13\1\14",
            "\1\7",
            "\1\10\1\11\1\12\1\13\1\14\40\uffff\1\15",
            "\1\16\1\uffff\1\20\56\uffff\1\17",
            "\1\16\1\uffff\1\20\56\uffff\1\17",
            "\1\16\1\uffff\1\20\56\uffff\1\17",
            "\1\16\1\uffff\1\20\56\uffff\1\17",
            "\1\16\1\uffff\1\20\56\uffff\1\17",
            "\1\21",
            "\1\22\5\uffff\1\23",
            "\1\20",
            "\1\22\5\uffff\1\23\21\uffff\1\24",
            "\1\10\1\11\1\12\1\13\1\14",
            "",
            "",
            "\1\25",
            "\1\22\5\uffff\1\23"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "602:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000003C000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000003FF00000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0020000000000050L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x001C080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x001D080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000000000001F000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000000000E0000L});

}