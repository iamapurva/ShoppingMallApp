package apurva.shoppingmallcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    CheckBox c1,c2,c3,c4,c5;
    Button b1;
    TextView tx;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=(CheckBox)findViewById(R.id.rice);
        c2=(CheckBox)findViewById(R.id.chocolate);
        c3=(CheckBox)findViewById(R.id.vicks);
        c4=(CheckBox)findViewById(R.id.clothes);
        c5=(CheckBox)findViewById(R.id.toys);
        b1=(Button)findViewById(R.id.payment);
        tx=(TextView)findViewById(R.id.tx);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int totalbill=0;
                if(c1.isChecked())
                {
                    totalbill+=35;
                }
                if(c2.isChecked())
                {
                    totalbill+=30;
                }
                if(c3.isChecked())
                {
                    totalbill+=5;
                }
                if(c4.isChecked())
                {
                    totalbill+=250;
                }
                if(c5.isChecked())
                {
                    totalbill+=100;
                }
                tx.setText("Your bill: "+totalbill);
                Toast.makeText(getApplicationContext(), "Your total bill is " +totalbill, Toast.LENGTH_LONG).show();
            }
        });
    }
}
