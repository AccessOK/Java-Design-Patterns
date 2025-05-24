package structure;

import org.accessok.structure.CAdapter.RunnableAdapter;
import org.accessok.structure.CAdapter.Task;
import org.junit.Test;

import java.util.concurrent.Callable;

public class CAdapterTest {
    @Test
    public void taskTest() {
        Callable<Integer> task = new Task(88);
        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();
    }
}
