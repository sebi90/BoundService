package sebi.boundservice;

import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/**
 * Created by Sebi on 06.06.15.
 */
public class CounterImpl extends Counter.Stub{
    private int counter;
    public synchronized int increment() throws RemoteException
    {
        Log.d(this.getClass().getName(),"Begin " +  String.valueOf(this.counter));
        //teil g
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        counter++;
        Log.d(this.getClass().getName(), "END " + String.valueOf(this.counter));

        return counter;
    }
    public synchronized int reset() throws RemoteException
    {
        counter = 0;
        return counter;
    }
}
