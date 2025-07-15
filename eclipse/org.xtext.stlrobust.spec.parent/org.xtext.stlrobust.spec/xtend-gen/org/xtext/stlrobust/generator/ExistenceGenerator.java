package org.xtext.stlrobust.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.xtext.stlrobust.spec.AfterScope;
import org.xtext.stlrobust.spec.AfterUntilScope;
import org.xtext.stlrobust.spec.BeforeScope;
import org.xtext.stlrobust.spec.BetweenScope;
import org.xtext.stlrobust.spec.Existence;
import org.xtext.stlrobust.spec.GlobalScope;
import org.xtext.stlrobust.spec.Pattern;
import org.xtext.stlrobust.spec.Scope;
import org.xtext.stlrobust.spec.Specification;

@SuppressWarnings("all")
public class ExistenceGenerator extends SpecGenerator {
  public static Object generate(final Specification spec) {
    Scope _scope = spec.getScope();
    boolean _matched = false;
    Scope _scope_1 = spec.getScope();
    if ((_scope_1 instanceof GlobalScope)) {
      _matched=true;
      return ExistenceGenerator.genGlobalScope(spec);
    }
    if (!_matched) {
      Scope _scope_2 = spec.getScope();
      if ((_scope_2 instanceof BeforeScope)) {
        _matched=true;
        return ExistenceGenerator.genBeforeScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_3 = spec.getScope();
      if ((_scope_3 instanceof AfterScope)) {
        _matched=true;
        return ExistenceGenerator.genAfterScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_4 = spec.getScope();
      if ((_scope_4 instanceof BetweenScope)) {
        _matched=true;
        return ExistenceGenerator.genBetweenScope(spec);
      }
    }
    if (!_matched) {
      Scope _scope_5 = spec.getScope();
      if ((_scope_5 instanceof AfterUntilScope)) {
        _matched=true;
        return ExistenceGenerator.genAfterUntilScope(spec);
      }
    }
    return "Unknown scope.";
  }

  public static String genGlobalScope(final Specification spec) {
    Pattern _pattern = spec.getPattern();
    Existence pattern = ((Existence) _pattern);
    String p = SpecGenerator.expression(pattern.getP());
    String time = SpecGenerator.time(pattern.getTime());
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("eventually");
    _builder.append(time);
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
