import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CityList {

    public List<City> getCities() throws InterruptedException {

        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(now);

        System.out.println("Getting cities... Please wait...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }


        System.out.println(date);


        List<City> cities = new ArrayList<>();

        cities.add(new City("Kırklareli"));
        cities.add(new City("Ankara"));
        cities.add(new City("İstanbul"));

        return cities;

    }

}
