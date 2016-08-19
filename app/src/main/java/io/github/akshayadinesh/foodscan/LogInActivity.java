package io.github.akshayadinesh.foodscan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void scanQRClick(View view) {
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);
    }

//    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        if (requestCode == 0) {
//            if (resultCode == RESULT_OK) {
//                Toast.makeText(this,"Success!",Toast.LENGTH_LONG).show();
//                Intent intent1 = new Intent(this, HomePageActivity.class);
//                startActivity(intent1);
//            } else if (resultCode == RESULT_CANCELED) {
//                Intent intent1 = new Intent(this, HomePageActivity.class);
//                startActivity(intent1);
//            }
//        }
//    }
}
