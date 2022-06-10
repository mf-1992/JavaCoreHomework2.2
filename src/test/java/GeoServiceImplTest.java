import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class GeoServiceImplTest {
    @Test
    void testGetLocationByIP() {
        GeoService geoService = new GeoServiceImpl();
        Location expected = new Location("Moscow", Country.RUSSIA, "Lenina", 15);
        Location location = geoService.byIp("172.");
        Assertions.assertEquals(expected.getCountry(), location.getCountry());
    }
}
