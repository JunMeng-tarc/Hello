package my.edu.taruc.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMessage; // TextView = Class
                                        // textViewMessage = instance
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate = main function
        super.onCreate(savedInstanceState);
        //Show UI
        //R = special calss for resource
        //layout = folder
        setContentView(R.layout.activity_main);

        textViewMessage = findViewById(R.id.textViewMessage);



    }

    public void click (View view){
        textViewMessage.setText("Hello I'm Jacker, I luv Steven");
    }
}
