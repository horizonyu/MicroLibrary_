// Generated code from Butter Knife. Do not modify!
package cn.horizon.library.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class RegisterActivity$$ViewInjector {
  public static void inject(Finder finder, final cn.horizon.library.activity.RegisterActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624072, "field 'fab'");
    target.fab = (android.support.design.widget.FloatingActionButton) view;
    view = finder.findRequiredView(source, 2131624076, "field 'cvAdd'");
    target.cvAdd = (android.support.v7.widget.CardView) view;
  }

  public static void reset(cn.horizon.library.activity.RegisterActivity target) {
    target.fab = null;
    target.cvAdd = null;
  }
}
