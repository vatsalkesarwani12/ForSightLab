package e.vatsalkesarwani.forsightlab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button enter = findViewById(R.id.go);
        enter.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View v) {
                                         Toast.makeText(MainActivity.this, "Welcome To Forsight Lab", Toast.LENGTH_LONG).show();
                                         Intent intent = new Intent(MainActivity.this, front_page.class);
                                         startActivity(intent);

                                     }
                                 }
        );
    }
}
