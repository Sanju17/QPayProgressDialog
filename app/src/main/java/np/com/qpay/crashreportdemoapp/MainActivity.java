package np.com.qpay.crashreportdemoapp;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QPayProgressDialog qPayProgressDialog = new QPayProgressDialog(this);
        qPayProgressDialog.show();
    }
}
