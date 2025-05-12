import org.accessok.structural.Adapter.RunnableAdapter;
import org.accessok.structural.Adapter.Task;
import org.junit.Test;

import java.util.concurrent.Callable;

public class AdapterTest {
    @Test
    public void taskTest() {
        Callable<Integer> task = new Task(88);
        Thread thread = new Thread(new RunnableAdapter(task));
        thread.start();
    }
}
