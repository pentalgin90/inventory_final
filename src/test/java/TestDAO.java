import by.htp.inventory.dao.MonitorDAO;
import by.htp.inventory.dao.impl.MonitorDAOImpl;
import by.htp.inventory.entity.Monitor;
import by.htp.inventory.repositories.MonitorRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class TestDAO {

    @Test
    public void testConnection() {
        MonitorRepository monitorRepository = null;
        long id = 2;
        Monitor monitor = monitorRepository.getOne(id);
        System.out.println(monitor);
    }
}