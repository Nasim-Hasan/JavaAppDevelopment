import org.apache.log4j.Logger;
import java.io.*;
import java.sql.SQLException;

public class Main {

    /* Get the class name to be printed on */
    static Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws IOException,SQLException {

        log.debug("Hello this is a debug message");
        log.info("Hello this is an info message");
        log.info("logger class : " + log.getClass());
    }
}