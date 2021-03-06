package ashley.buttonhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumeActivity extends AppCompatActivity {
    private TextView name;
    private TextView graduYear;
    private TextView personsMajor;
    private TextView niceInfo;


    /** When this activity is created, it takes the intent from the MainActivity class,
     * and puts that information in the widgets on the new activity screen
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        //Initializes the textviews.
        name = (TextView) findViewById(R.id.nameText);
        graduYear = (TextView) findViewById(R.id.graduationText);
        personsMajor = (TextView) findViewById(R.id.majorText);
        niceInfo = (TextView) findViewById(R.id.miscText);

        //Intent from MainActivity class is received:
        name.setText(getIntent().getStringExtra("User Name"));
        String graduationMsg = "Class of " + getIntent().getStringExtra("Graduation Year");
        graduYear.setText(graduationMsg);
        String majorMsg = getIntent().getStringExtra("Major") + " major";
        personsMajor.setText(majorMsg);
        String niceInfoMsg = "Other Fantastic things about me: " + getIntent().getStringExtra("Other Info");
        niceInfo.setText(niceInfoMsg);
    }

}
