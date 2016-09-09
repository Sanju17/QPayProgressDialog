package np.com.qpay.crashreportdemoapp;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * Created by Owner on 9/9/2016.
 */
public class QPayProgressDialog extends Dialog {
    private Context context;
    private Dialog dialog;

    public QPayProgressDialog(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public void init(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View v = inflater.inflate(R.layout.progresslayout, null);

        builder.setView(v);
        builder.setCancelable(false);
        dialog = builder.create();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        float density = context.getResources().getDisplayMetrics().density;
        lp.width = (int) (420 * density);
        lp.height = (int) (400 * density);
        Window window = dialog.getWindow();
        window.setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        window.setGravity(Gravity.CENTER);
        dialog.getWindow().setAttributes(lp);
    }

    public void show(){
        if(dialog != null) {
            dialog.show();
        }
    }

    public void dismiss(){
        if(dialog != null) {
            dialog.dismiss();
        }
    }


}
