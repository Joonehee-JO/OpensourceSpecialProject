/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2017038076 조준희
 * 작성일 : 2022.04.01
 *프로그램 설명 : 버튼을 클릭하면 이미지가 10도씩 회전하는 프로그램
 ************************************************/

package cbnu.opensourceproject.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Integer Rot_X = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn = (Button)findViewById(R.id.button);
        ImageView img = (ImageView)findViewById(R.id.imageView);
        
        //버튼을 눌렀을 때 이미지가 10도씩 회전하는 리스너 이벤트
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Rot_X += 10;
                img.setRotation(Rot_X);
            }
        });
    }
}