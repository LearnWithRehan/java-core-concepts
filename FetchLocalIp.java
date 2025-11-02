import java.net.InetAddress;
import java.net.UnknownHostException;

public class FetchLocalIp {
    public static void main(String[] args)  {
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local.getHostAddress());
        }catch (Exception UnknownHostException){
            System.out.println("This ip not valid");

        }

    }
}
