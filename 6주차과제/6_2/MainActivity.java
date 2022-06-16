/* **********************************************
 * 프로그램명 :  activity-main.xml
 * 작성자 : 2017038076 조준희
 * 작성일 : 2022.04.13
 *프로그램 설명 : url을 입력하면 웹브라우저가 나오는 프로그램
 ************************************************/
package cbnu.opensourceproject.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editUrl;
    Button btnGo, btnBack;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editUrl = (EditText)findViewById(R.id.edtUrl);
        btnGo = (Button)findViewById(R.id.btnGo);
        btnBack = (Button)findViewById(R.id.btnBack);
        web = (WebView)findViewById(R.id.webView1);

        web.setWebViewClient(new CookWebViewClient());

        WebSettings webSet = web.getSettings();
        webSet.setBuiltInZoomControls(true);
        webSet.setJavaScriptEnabled(true);
        btnGo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                web.loadUrl(editUrl.getText().toString());
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                web.goBack();
            }
        });
    }

    class CookWebViewClient extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }
}