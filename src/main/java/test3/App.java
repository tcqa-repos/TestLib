package test3;

import org.jetbrains.teamcity.capitolio.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        Host host = new LocalHost();
        Host host2 = new WindowsRemoteHost();
    }
}
