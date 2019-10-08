package e.vatsalkesarwani.forsightlab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class page_standard extends AppCompatActivity {


    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.standard);

        button= (Button) findViewById(R.id.nxt3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(page_standard.this,constant.class);
                startActivity(intent);
            }
        });

    }
}
