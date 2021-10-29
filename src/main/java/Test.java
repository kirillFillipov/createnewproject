import ru.sapteh.dao.impl.Dao;
import ru.sapteh.dao.impl.modelDaoIml;
import ru.sapteh.model.model;
import ru.sapteh.utils.Connector;

import java.sql.Connection;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException {
        Connection connection = Connector.getInstance();
        Dao<model,Integer> autoDao =new modelDaoIml(connection);
        model auto1 =new model(1,"LADA","Sedan","benzin");
        System.out.println(autoDao.findById(1));
        System.out.println(autoDao.findAll());
        autoDao.save(auto1);
        autoDao.deleteById(5);
    }
}
