package org.xtext.stlrobust.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.stlrobust.spec.AfterScope;
import org.xtext.stlrobust.spec.AfterUntilScope;
import org.xtext.stlrobust.spec.BeforeScope;
import org.xtext.stlrobust.spec.BetweenScope;
import org.xtext.stlrobust.spec.GlobalScope;
import org.xtext.stlrobust.spec.Pattern;
import org.xtext.stlrobust.spec.Scope;
import org.xtext.stlrobust.spec.Specification;
import org.xtext.stlrobust.spec.Universality;

@SuppressWarnings("all")
public class UniversalityGenerator extends SpecGenerator {
  public static Object generate(final Specification spec) {
    Scope _scope = spec.getScope();
    boolean _matched = false;
    Scope _scope_1 = spec.getScope();
    if ((_scope_1 instanceof GlobalScope)) {
      _matched=true;
      return UniversalityGenerator.genGlobalScope(spec);
    }
    if (!_matched) {
      Scope _scope_2 = spec.getScope();
      if ((_scope_2 instanceof BeforeScope)) {
        _matched=true;
        return UniversalityGenerator.genBeforeScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_3 = spec.getScope();
      if ((_scope_3 instanceof AfterScope)) {
        _matched=true;
        return UniversalityGenerator.genAfterScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_4 = spec.getScope();
      if ((_scope_4 instanceof BetweenScope)) {
        _matched=true;
        return UniversalityGenerator.genBetweenScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_5 = spec.getScope();
      if ((_scope_5 instanceof AfterUntilScope)) {
        _matched=true;
        return UniversalityGenerator.genAfterUntilScope(spec);
      }
    }
    return "Unknown scope.";
  }

  public static String genGlobalScope(final Specification spec) {
    Pattern _pattern = spec.getPattern();
    Universality pattern = ((Universality) _pattern);
    String p = SpecGenerator.expression(pattern.getP());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("always[0,0]");
    _builder.append(p);
    return _builder.toString();
  }

  public static Object genBeforeScope(final Specification spec) {
    return null;
  }

  public static Object genAfterScope(final Specification spec) {
    return null;
  }

  public static String genBetweenScope(final Specification spec) {
    return "";
  }

  public static String genAfterUntilScope(final Specification spec) {
    return "";
  }
}
