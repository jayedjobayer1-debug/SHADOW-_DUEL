package com.shadowduel.shadowduel;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 private WebView webView;
 @Override public void onCreate(Bundle b){super.onCreate(b);requestWindowFeature(Window.FEATURE_NO_TITLE);getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);getWindow().getDecorView().setSystemUiVisibility(5894|1024|512|4096);webView=new WebView(this);setContentView(webView);WebSettings s=webView.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setMediaPlaybackRequiresUserGesture(true);webView.setWebViewClient(new WebViewClient());webView.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(webView!=null&&webView.canGoBack())webView.goBack();else super.onBackPressed();}
}
