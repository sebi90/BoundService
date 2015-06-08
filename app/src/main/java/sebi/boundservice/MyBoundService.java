package sebi.boundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/**
 * Created by Sebi on 06.06.15.
 */
public class MyBoundService extends Service {

    private static int instanceCounter = 0;
    private int number;
    public MyBoundService()
    {
        instanceCounter++;
        number = instanceCounter;
    }
    public void onCreate()
    {
        Log.d(this.getClass().getName(), "onCreate (" + number + ")");
    }
    public IBinder onBind(Intent intent)
    {
        Log.d(this.getClass().getName(), "onBind (" + number + ")");
        return new CounterImpl();
    }
    // => gebundener Service
    public void onDestroy()
    {
        Log.d(this.getClass().getName(), "onDestroy (" + number + ")");
    }
}
