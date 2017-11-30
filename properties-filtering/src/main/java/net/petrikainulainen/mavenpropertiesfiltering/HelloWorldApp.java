package net.petrikainulainen.mavenpropertiesfiltering;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class HelloWorldApp
{
    private static Logger LOGGER = Logger.getLogger(HelloWorldApp.class);

    public static void writeSomething() {
        LOGGER.info("something");
    }

    public void loadProperty() throws IOException {
        Properties otherProperties = new Properties();
        otherProperties.load(this.getClass().getResourceAsStream("log4j.properties"));
        String otherProp = System.getProperty("log4j.appender.R.File");
        System.out.println("system property: " + otherProp);
    }

    public static void printCurrentProperty() throws IOException {
        Properties localProperties = new Properties();
        InputStream input =  new FileInputStream("src/main/resources/log4j.properties");
        // load a properties file
        localProperties.load(input);

        String curProp = localProperties.getProperty("log4j.appender.R.File");
        System.out.println("local property: " + curProp);

        String otherProp = System.getProperty("log4j.appender.R.File");
        System.out.println("system property: " + otherProp);


    }

    public static void main( String[] args ) throws IOException {

        LOGGER.info("Hello World!");
        new HelloWorldApp().loadProperty();
    }
}
