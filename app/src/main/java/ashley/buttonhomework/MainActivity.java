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

    public void submit(View view) {
        Intent intent = new Intent(this, ResumeActivity.class);

        //EditText, RadioGroups are declared.
        EditText nameField = (EditText) findViewById(R.id.nameField);
        String name =  nameField.getText().toString();

        RadioGroup gradGroup = (RadioGroup) findViewById(R.id.gradGroup);
        int selectedGrad = gradGroup.getCheckedRadioButtonId();
        RadioButton gradRB = (RadioButton) findViewById(selectedGrad);
        String gradYear = gradRB.getText().toString();

        RadioGroup majors = (RadioGroup) findViewById(R.id.majorGroup);
        int selectedMajor = majors.getCheckedRadioButtonId();
        RadioButton mjrRB = (RadioButton) findViewById(selectedMajor);
        String major = mjrRB.getText().toString();

        EditText miscInfo = (EditText) findViewById(R.id.otherInfo);
        String information = miscInfo.getText().toString();

        intent.putExtra("User Name", name);
        intent.putExtra("Graduation Year", gradYear);
        intent.putExtra("Major", major);
        intent.putExtra("Other Info", information);

        startActivity(intent);
    }
}
