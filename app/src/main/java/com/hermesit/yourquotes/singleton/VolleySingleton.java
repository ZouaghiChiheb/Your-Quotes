package com.hermesit.yourquotes.singleton;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.hermesit.yourquotes.application.MyApplication;

/**
 * Created by Chiheb on 06/08/2016.
 */
public class VolleySingleton {

    private static VolleySingleton sInstance = null;
    private RequestQueue requestQueue;

    private VolleySingleton() {
        requestQueue = Volley.newRequestQueue(MyApplication.getAppContext());
    }

    public static VolleySingleton getInstance() {
        if (sInstance == null) {
            sInstance = new VolleySingleton();
        }
        return sInstance;
    }

    public RequestQueue getRequestQueue() {
        return requestQueue;
    }
}
