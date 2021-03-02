package unipiloto.edu.co.mymessenger;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                onSendMessage(v);
            }
        });


    }
    public void onSendMessage(View view){
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        EditText input = findViewById(R.id.editTextTextPersonName);
        String messageText = input.getText().toString();
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}