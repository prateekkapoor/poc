import java.net.InetSocketAddress;
import java.nio.file.Path;
import com.sun.net.httpserver.SimpleFileServer;
import com.sun.net.httpserver.SimpleFileServer.OutputLevel;

public class JavaWebServer {
    private static final Integer PORT = 9000;
    private static final String INDEX_PATH = "/home/kapoorpr/priya/Simple-Web-Server";
    public static void main(String[] args) {
        OutputLevel outputLevel = OutputLevel.VERBOSE;
        // creating java 18 SimpleFileServer
        var webServer = SimpleFileServer.createFileServer(
                new InetSocketAddress(PORT),
                Path.of(INDEX_PATH),
                outputLevel);
        // starting java 18 SimpleFileServer
        webServer.start();
    }
}
