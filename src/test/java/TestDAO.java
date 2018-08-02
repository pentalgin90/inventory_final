import by.htp.inventory.config.AppConfig;
import by.htp.inventory.dao.impl.EquipmentDAOImpl;
import by.htp.inventory.entity.Monitor;
import org.junit.Ignore;
import org.junit.Test;

import javax.sql.DataSource;

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
