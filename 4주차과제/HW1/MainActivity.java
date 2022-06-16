/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2017038076 조준희
 * 작성일 : 2022.04.01
 *프로그램 설명 : 체크박스를 선택할 때마다 버튼의 속성이 바뀌는 프로그램
 ************************************************/
package cbnu.opensourceproject.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox check1, check2, check3;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check1 = (CheckBox)findViewById(R.id.checkBox3);
        check2 = (CheckBox)findViewById(R.id.checkBox4);
        check3 = (CheckBox)findViewById(R.id.checkBox5);
        btn = (Button)findViewById(R.id.button);

        CheckBoxListener checkLi = new CheckBoxListener();
        CheckBoxListener2 checkLi2 = new CheckBoxListener2();
        CheckBoxListener3 checkLi3 = new CheckBoxListener3();

        check1.setOnCheckedChangeListener(checkLi);
        check2.setOnCheckedChangeListener(checkLi2);
        check3.setOnCheckedChangeListener(checkLi3);
    }
    //Enable이 눌렸을 때
    class CheckBoxListener implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b) {
                btn.setEnabled(true);
            }
            else{
                btn.setEnabled(false);
            }
        }
    }
    //Clickable이 눌렸을 때
    class CheckBoxListener2 implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b)
                btn.setClickable(true);
            else
                btn.setClickable(false);
        }
    }
    //45도 회전이 눌렸을 때
    class CheckBoxListener3 implements CompoundButton.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            if (b)
                btn.setRotation(45);
            else
                btn.setRotation(0);
        }
    }
}