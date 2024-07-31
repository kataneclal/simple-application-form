 package gpk.andrew.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterButtonClick (View view) {

        //Defining layout components
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText editTxtFirstName = findViewById(R.id.editTxtFirstName);
        EditText editTxtLastName = findViewById(R.id.editTxtLastName);
        EditText editTxtEmail = findViewById(R.id.editTxtEmail);

        //Aligning EditText input to TextViews' output
        txtFirstName.setText("First name: " + editTxtFirstName.getText().toString());
        txtLastName.setText("Last name: " + editTxtLastName.getText().toString());
        txtEmail.setText("E-mail: " + editTxtEmail.getText().toString());
    }
}