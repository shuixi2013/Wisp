package com.rj.wisp.core;

/**
 * 作者：志文 on 2015/12/25 0025 10:37
 * 邮箱：594485991@qq.com
 */
public class Commons {
    private static final String TAG = Commons.class.getName();

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String CHARSET = "charset";
    public static final String HTTP_HEAD = "httpHead";
    public static final String Content_Length = "Content-Length";
    public static final String User_Agent = "User-Agent";
    public static final String File_Path = "File-Path";//非标准http头,用于下载attachment
    public static final String NOT_FOUND = "404 Not Found";
    public static final byte CR = '\r';
    public static final byte LF = '\n';
    public static final byte[] CRLF_BYTE = {CR, LF};
    public static final byte[] CRLF2_BYTE = {CR, LF, CR, LF};
    public static final String CRLF_STR = "\r\n";
    public static final String CRLF2_STR = "\r\n\r\n";

    public static final int ATTACHMENT_DOWN_SUCC = 1;
    public static final int ATTACHMENT_DOWN_CACHE = 2;
    public static final int ATTACHMENT_DOWN_COMPLETE = 3;
    public static final int ATTACHMENT_DOWN_FAIL = 4;


    public static final String Url = "Url";
    public static final String IsHome = "IsHome";
    public static final String WebView = "WebView";
    public static final String WebViewTransport = "WebViewTransport";
    public static final String RightFragmentListener = "RightFragmentListener";
    public static final String ShowFullScreen = "ShowFullScreen";
    public static final String SetWebClientflg = "SetWebClientflg";
    public static final String PopHomePageUrl = "PopHomePageUrl";

}
