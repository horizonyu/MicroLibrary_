// Generated code from Butter Knife. Do not modify!
package cn.horizon.library.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final cn.horizon.library.activity.MainActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624069, "field 'etUsername'");
    target.etUsername = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624070, "field 'etPassword'");
    target.etPassword = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624071, "field 'btGo' and method 'onClick'");
    target.btGo = (android.widget.Button) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624068, "field 'cv'");
    target.cv = (android.support.v7.widget.CardView) view;
    view = finder.findRequiredView(source, 2131624072, "field 'fab' and method 'onClick'");
    target.fab = (android.support.design.widget.FloatingActionButton) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  public static void reset(cn.horizon.library.activity.MainActivity target) {
    target.etUsername = null;
    target.etPassword = null;
    target.btGo = null;
    target.cv = null;
    target.fab = null;
  }
}
