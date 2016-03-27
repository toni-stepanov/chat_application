import org.junit.Test;

public class TestDriver {

    @Test
    public void before() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("org.postgresql.Driver");
        System.out.println(aClass.getCanonicalName());
    }

}


