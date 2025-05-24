import org.accessok.create.B_FactoryMethod.ConcreteProduct;
import org.accessok.create.B_FactoryMethod.Product;
import org.accessok.create.B_FactoryMethod.SimpleFactory;
import org.junit.Test;

public class CreateSimpleFactoryTest {
    @Test
    public void CreateSimpleFactory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product= simpleFactory.createProduct();
        product.use();
    }
}
