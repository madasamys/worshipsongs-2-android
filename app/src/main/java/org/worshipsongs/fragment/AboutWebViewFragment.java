package org.worshipsongs.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import org.worshipsongs.worship.R;

/**
 * @Author : Madasamy
 * @Version : 1.0.0
 */
public class AboutWebViewFragment extends Fragment
{
    private static final String ABOUT_FILE_PATH = "file:///android_asset/about.html";
    private WebView webView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.about_webview_activity, container, false);
        webView = (WebView) rootView.findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(ABOUT_FILE_PATH);
        return rootView;
    }
}
