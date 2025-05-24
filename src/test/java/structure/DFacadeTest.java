package structure;

import org.accessok.structure.DFacade.Facade;
import org.junit.Test;

public class DFacadeTest {
    @Test
    public void Facadetest() {
        Facade facade = new Facade();
        facade.performOperations();
    }
}
