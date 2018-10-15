package mccauley.ian.basketballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Basketball extends AppCompatActivity {

    int pointsOne=0;
    int pointsTwo=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);
    }

    public void threePointer(View view){
        String thing= view.getTag().toString();
        int x= Integer.parseInt(thing);
        if(x==1){
            pointsOne+=3;
            TextView points= (TextView) findViewById(R.id.pointsOne);
            points.setText(""+pointsOne);
        }
        if(x==2){
            pointsTwo+=3;
            TextView points= (TextView) findViewById(R.id.pointsTwo);
            points.setText(""+pointsTwo);
        }
    }

    public void twoPointer(View view) {
        String thing= view.getTag().toString();
        int x= Integer.parseInt(thing);
        if (x == 1) {
            pointsOne += 2;
            TextView points = (TextView) findViewById(R.id.pointsOne);
            points.setText("" + pointsOne);
        }
        if (x == 2) {
            pointsTwo += 2;
            TextView points = (TextView) findViewById(R.id.pointsTwo);
            points.setText("" + pointsTwo);
        }
    }

    public void freethrow(View view) {
        String thing= view.getTag().toString();
        int x= Integer.parseInt(thing);
        if (x == 1) {
            pointsOne ++;
            TextView points = (TextView) findViewById(R.id.pointsOne);
            points.setText("" + pointsOne);
        }
        if (x == 2) {
            pointsTwo ++;
            TextView points = (TextView) findViewById(R.id.pointsTwo);
            points.setText("" + pointsTwo);
        }
    }
}
