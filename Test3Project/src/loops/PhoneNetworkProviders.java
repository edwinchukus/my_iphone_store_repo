package loops;

/**
 * Created by dotcom on 06/12/16.
 */
public class PhoneNetworkProviders {


    private String[] providers;

    public PhoneNetworkProviders() {
        providers = new String[11];
        providers[0] = "O2";
        providers[1] = "EE";
        providers[2] = "BT";
        providers[3] = "Virgin";
        providers[4] = "Lebara";
        providers[5] = "Vodafone";
        providers[6] = "Tesco";
        providers[7] = "Giffgaff";
        providers[8] = "Now";
        providers[9] = "Three";
    }


    public PhoneNetworkProviders(String[] providers) {
        this.providers = providers;
    }

    public String getMyNetworkProvider(int staffId){
        int newStaffId = staffId -1;
        for(String provider : providers){
            if(providers[newStaffId] == provider) {
              return provider;
            }
        }
        return null;
    }
}
