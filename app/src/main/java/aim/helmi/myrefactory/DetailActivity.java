package aim.helmi.myrefactory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView nama, email, address, phone;

    public static final String EXTRA = "helmi";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        nama = findViewById(R.id.name);
        email= findViewById(R.id.email);
        phone = findViewById(R.id.phone);



        User user = getIntent().getParcelableExtra(EXTRA);
        nama.setText(user.getName());
    }
}
