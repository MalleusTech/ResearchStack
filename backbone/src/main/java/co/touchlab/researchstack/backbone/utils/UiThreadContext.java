package co.touchlab.researchstack.backbone.utils;
import android.os.Looper;

/**
 * Created by kgalligan on 11/26/15.
 */
public class UiThreadContext
{
    /**
     * Checks if you're in the UI thread.
     */
    public static void assertUiThread()
    {
        if(! isInUiThread())
        {
            throw new RuntimeException("This call must be in UI thread");
        }
    }

    public static boolean isInUiThread()
    {
        Thread uiThread = Looper.getMainLooper().getThread();
        Thread currentThread = Thread.currentThread();

        return uiThread == currentThread;
    }

    /**
     * Checks if you're not in the UI thread.
     */
    public static void assertBackgroundThread()
    {
        if(isInUiThread())
        {
            throw new RuntimeException("This call must be in background thread");
        }
    }
}