package structure;

import org.accessok.structure.AProxy.Proxy;
import org.junit.Test;

public class AProxyTest {
    @Test
    public void ProxyTest(){
        Proxy proxy = new Proxy();
        proxy.doSomething();
    }
}
