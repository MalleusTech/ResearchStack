package co.touchlab.researchstack.common.storage.file;
/**
 * Callback for data access.  This will change a lot soon.
 *
 * Created by kgalligan on 11/25/15.
 */
public interface FileAccessListener
{
    /**
     * Data access is ready.  You should be able to read/write directly now.
     */
    void dataReady();

    /**
     * Data access has failed permanently for this session.  Either close the app or re-init data
     * access.  Assume this is an auth issue, or the user cancelled the data access flow.  May
     * distinguish those in the future, but for now you're just done.
     */
    void dataAccessError();
}