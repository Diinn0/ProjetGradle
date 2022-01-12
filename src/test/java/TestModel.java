import org.junit.Assert;
import org.junit.Test;
import projetgradle.model.Model;

public class TestModel {

    @Test
    public void testGetMessage()
    {
        Model model = new Model();
        String m = model.getMessage();
        Assert.assertNotNull(m);
        Assert.assertEquals(m, "Hello World !");
    }

}
