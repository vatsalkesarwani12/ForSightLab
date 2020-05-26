package e.vatsalkesarwani.forsightlab;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class page_graph extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_page);
        Button enter = findViewById(R.id.nxt1);
        enter.setOnClickListener(new View.OnClickListener()
                                 {
                                     @Override
                                     public void onClick(View v)
                                     {
                                         Toast.makeText(page_graph.this,"Standard Answers For Experiments",Toast.LENGTH_LONG).show();
                                         Intent intent = new Intent(page_graph.this,page_standard.class);
                                         startActivity(intent);

                                     }
                                 }
        );
    }

    public void gg1(View view)
    {
        displays("@drawable/graph1");
    }

    public void gg2(View view)
    {
        displays("@drawable/graph2");
    }


    public void gg3(View view)
    {
        displays("@drawable/graph3");
    }

    public void gg5(View view)
    {
        displays("@drawable/graph5");
    }

    public void gg7(View view)
    {
        displays("@drawable/graph7");
    }

    private void displays(String s1)
    {
        Toast.makeText(page_graph.this,"Scroll Down For Graph",Toast.LENGTH_LONG).show();
        ImageView gra= findViewById(R.id.pg1) ;
        int imageResource=getResources().getIdentifier(s1,null,this.getPackageName());
        gra.setImageResource(imageResource);
    }

}
