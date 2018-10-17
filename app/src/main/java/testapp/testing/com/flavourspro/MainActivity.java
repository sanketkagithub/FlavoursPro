package testapp.testing.com.flavourspro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import testpaid.testing.com.flavourspro.R;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       /* if (BuildConfig.BASE_MAIN_URL.equals("http://www.givmebikeFree.com"))
        {*/
            setContentView(R.layout.activity_main);

       /* }else if (BuildConfig.BASE_MAIN_URL.equals("http://www.givmebikePaid.com"))
        {
            setContentView(R.layout.activity_mainpaid);

        }*/



    }
}
