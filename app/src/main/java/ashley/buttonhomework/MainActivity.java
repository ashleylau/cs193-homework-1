package ashley.buttonhomework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Runs when the submit button is clicked; this method takes all the information from this activity
        and passes it to the resume activity.
     */
    public void submit(View view) {
        //EditText, RadioGroups are declared.
        EditText nameField = (EditText) findViewById(R.id.nameField);
        String name =  nameField.getText().toString();

        //RadioGroup for the graduation year is declared. The selected graduation year
        //is gotten and that button's text is received.
        RadioGroup gradGroup = (RadioGroup) findViewById(R.id.gradGroup);
        int selectedGrad = gradGroup.getCheckedRadioButtonId();
        RadioButton gradRB = (RadioButton) findViewById(selectedGrad);
        String gradYear = gradRB.getText().toString();

        //RadioGroup for the major is declared. The selected major
        //is gotten and that button's text is received.
        RadioGroup majors = (RadioGroup) findViewById(R.id.majorGroup);
        int selectedMajor = majors.getCheckedRadioButtonId();
        RadioButton mjrRB = (RadioButton) findViewById(selectedMajor);
        String major = mjrRB.getText().toString();

        EditText miscInfo = (EditText) findViewById(R.id.otherInfo);
        String information = miscInfo.getText().toString();


        //The information is passed into the ResumeActivity class, to be used to set the information
        //in the other class, to the information received in the main activity class.
        Intent intent = new Intent(this, ResumeActivity.class);
        intent.putExtra("User Name", name);
        intent.putExtra("Graduation Year", gradYear);
        intent.putExtra("Major", major);
        intent.putExtra("Other Info", information);

        startActivity(intent);
    }
}
