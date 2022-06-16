/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2017038076 조준희
 * 작성일 : 2022.03.26
 * 프로그램 설명 : 라디오버튼을 통한 간단한 이미지 변경과 url입력 후 버튼을 눌러 홈페이지 열기를 할 수 있는 프로그램
 ************************************************/

package cbnu.opensourceproject.opensourceproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit;
    Button btn,btn2;
    RadioGroup group;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit = (EditText)findViewById(R.id.editTextTextPersonName);
        btn = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        group = (RadioGroup)findViewById(R.id.radiogroup);
        img = (ImageView)findViewById(R.id.imageView);

        btnlistener listener = new btnlistener();
        btnlistener2 listener2 = new btnlistener2();

        btn.setOnClickListener(listener);
        btn2.setOnClickListener(listener2);

        RadioListener Rlistener = new RadioListener();
        group.setOnCheckedChangeListener(Rlistener);
    }
    //글자 나타내기를 클릭하면 발생하는 이벤트리스너
    class btnlistener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            String str = edit.getText().toString();
            Toast.makeText(getApplicationContext(),str,
                    Toast.LENGTH_SHORT).show();
        }
    }
    //홈페이지 열기를 클릭하면 발생하는 이벤트리스너
    class btnlistener2 implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            String str = edit.getText().toString();
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(str));
            startActivity(i);
        }
    }
    //라디오버튼이 바뀌면 이미지를 변경시켜주는 이벤트리스너
    class RadioListener implements RadioGroup.OnCheckedChangeListener{
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            switch(i){
                case R.id.radioButton :
                    img.setImageResource(R.drawable.img1);
                    break;
                case R.id.radioButton2 :
                    img.setImageResource(R.drawable.img2);
                    break;
            }
        }
    }
}