package program.constants;

/**
 * Created by dotcom on 29/11/16.
 */





public class Weather {


    public enum Browsers {Chrome, Firefox, InternetExplorer, Safari, PhantomJs, Opera}

    public enum WeatherDegree{
        Hot,
        Cold,
        Outlook,
        Overcast,
        Snowy,
        Rainy
    }



    public void arrayMethod() throws Throwable {
        Thread.sleep(5000);

        Browsers[] browsers = new Browsers[6];
        browsers[0] = Browsers.Chrome;
        browsers[1] = Browsers.Firefox;
        browsers[2] = Browsers.InternetExplorer;
        browsers[3] = Browsers.Safari;
        browsers[4] = Browsers.Opera;
        browsers[5] = Browsers.PhantomJs;
        browsers[6] = Browsers.PhantomJs;

        for(Browsers browser : browsers){
            System.out.println(browser);
        }
    }

    public void getCountryWeather(WeatherDegree degree){
        if(degree == WeatherDegree.Cold){
            System.out.println("We are in the United Kingdom");
        }else if(degree == WeatherDegree.Hot){
            System.out.println("We are in the Cameroon");
        }else if(degree == WeatherDegree.Outlook){
            System.out.println("We are in the Ghana");
        }else if(degree == WeatherDegree.Rainy){
            System.out.println("We are in the South Africa");
        }else{
            System.out.println("We are in cameroon");
        }
    }



    public void findMyWeather(WeatherDegree weatherDegree){
        switch (weatherDegree){
            case Hot:
                System.out.println("This is Morocco");
                break;
            case Rainy:
                System.out.println("This is Cameroon");
                break;
            case Cold:
                System.out.println("This is England");
                break;
            case Snowy:
                System.out.println("This is Canada");
                break;
            case Overcast:
                System.out.println("This is Spain");
                break;
            default:
                System.out.println("This is not a country");
                break;
        }
    }




}
