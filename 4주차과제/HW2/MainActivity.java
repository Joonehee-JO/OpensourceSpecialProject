/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2017038076 조준희
 * 작성일 : 2022.04.01
 *프로그램 설명 : 에디트텍스트에 키가 눌릴때마다 글자가 toast메시지로 나오는 프로그램
 ************************************************/
package cbnu.opensourceproject.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.editText);

        edittext.addTextChangedListener(new TextWatcher() {
            //입력전 변화가 있을 때
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            //입력난에 변화가 있을 때
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String str = edittext.getText().toString();
                Toast.makeText(getApplicationContext(),str,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}