package my.test;

import net.petrikainulainen.mavenpropertiesfiltering.HelloWorldApp;
import org.junit.Test;

import java.io.IOException;

public class MyTest {

    @Test
    public void test() throws IOException {
        HelloWorldApp.writeSomething();
        HelloWorldApp.printCurrentProperty();
    }
}
