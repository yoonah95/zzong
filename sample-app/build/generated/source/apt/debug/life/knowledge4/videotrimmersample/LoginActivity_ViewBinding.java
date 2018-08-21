// Generated code from Butter Knife. Do not modify!
package life.knowledge4.videotrimmersample;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view2131165221;

  private View view2131165223;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.editText = Utils.findRequiredViewAsType(source, R.id.editText, "field 'editText'", EditText.class);
    target.textView = Utils.findRequiredViewAsType(source, R.id.textView, "field 'textView'", TextView.class);
    target.editText2 = Utils.findRequiredViewAsType(source, R.id.editText2, "field 'editText2'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn, "method 'btn_Click'");
    view2131165221 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btn_Click();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn2, "method 'btn2_Click'");
    view2131165223 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btn2_Click();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.editText = null;
    target.textView = null;
    target.editText2 = null;

    view2131165221.setOnClickListener(null);
    view2131165221 = null;
    view2131165223.setOnClickListener(null);
    view2131165223 = null;
  }
}
