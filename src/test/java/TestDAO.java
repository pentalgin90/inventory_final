import by.htp.inventory.entity.Monitor;
import org.junit.Test;

public class TestDAO {
    @Test
    public void testDAO(){
        EquipmentDAOImpl edi = new EquipmentDAOImpl();
        long id = 2;
        Monitor monitor = edi.findMonitor(id);
        if(monitor != null){
            System.out.println(true);
        }
        System.out.println(monitor.toString());
    }
    /*@Test
    public void testConnection(){
        AppConfig appConfig = new AppConfig();
        System.out.println(appConfig.sessionFactory().toString());

    }*/

}
