import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        CityList cityList = new CityList();
        List<City> cities = cityList.getCities();

        for (City city : cities) {
            System.out.println(city.getCityName());
        }

        CityList cityList2 = new CityList();
        List<City> cities2 = cityList.getCities();

        for (City city : cities2) {
            System.out.println(city.getCityName());
        }*/

        CityListSingleton cityListSingleton = CityListSingleton.getInstance();
        List<City> cities = cityListSingleton.getCities();

        for (City city : cities) {
            System.out.println(city.getCityName());
        }

        CityListSingleton cityListSingleton2 = CityListSingleton.getInstance();
        List<City> cities2 = cityListSingleton2.getCities();

        for (City city : cities2) {
            System.out.println(city.getCityName());
        }

    }
}