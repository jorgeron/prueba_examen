package es.app;

/**
 * Hello world!
 *
 */
import org.apache.log4j.*; 


public class App 
{
	static Logger log=Logger.getLogger(App.class); 

    public static void main( String[] args )
    {
    	log.info("Returning 1");
        System.out.println( "Hello World!" );
    }
}
