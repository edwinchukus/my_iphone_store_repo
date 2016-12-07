package loops;

/**
 * Created by dotcom on 06/12/16.
 */
public class NetworkRunner {

    public static void main(String args []){
        PhoneNetworkProviders np = new PhoneNetworkProviders();

        String providerName  = np.getMyNetworkProvider(10);
        System.out.println(providerName);
    }
}
