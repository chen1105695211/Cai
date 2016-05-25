package chongzou.my_okhttp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        Toast.makeText(ThreeActivity.this, "这是添加", Toast.LENGTH_SHORT).show();
        Toast.makeText(ThreeActivity.this, "这是", Toast.LENGTH_SHORT).show();
        Toast.makeText(ThreeActivity.this, "这是添", Toast.LENGTH_SHORT).show();
        Toast.makeText(ThreeActivity.this, "这是添", Toast.LENGTH_SHORT).show();
        Toast.makeText(ThreeActivity.this, "这是添123", Toast.LENGTH_SHORT).show();
        Toast.makeText(ThreeActivity.this, "这是添123", Toast.LENGTH_SHORT).show();

    }
}
