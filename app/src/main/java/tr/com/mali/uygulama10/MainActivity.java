package tr.com.mali.uygulama10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textmesaj ;
    Button askerates;
    Button tankates;
    public asker asker;
    public tankci tankci;
    String mesaj = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textmesaj = findViewById(R.id.textViewMesaj);
        askerates = findViewById(R.id.buttonAsker);
        tankates = findViewById(R.id.buttonTankci);
        asker = new asker();
        tankci = new tankci();

        askerates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = asker.atesEt();
                textmesaj.setText(mesaj);
            }
        });
        tankates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mesaj = tankci.atesEt();
                textmesaj.setText(mesaj);
            }
        });


    }
}