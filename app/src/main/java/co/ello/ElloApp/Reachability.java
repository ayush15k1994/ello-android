package co.ello.ElloApp;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Reachability {

    private final static String TAG = Reachability.class.getSimpleName();

    public static boolean isNetworkConnected( Context context ) {
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();
        return (info != null);
    }
}
