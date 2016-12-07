package comjosim74.github.buckytutorial18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button josimButton = (Button) findViewById(R.id.button);
        josimButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        TextView textView = (TextView)findViewById(R.id.textView);
                        textView.setText("Good Jobs Hoss");
                    }
                }
        );

        josimButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView textView=(TextView)findViewById(R.id.textView);
                        textView.setText("Button holding practice");
                        return false;
                    }
                }
        );


    }
}
