package Test_02_Oct.DAOBook;

import java.io.IOException;
import java.sql.SQLException;

public interface DAOBook {
    void insertData() throws SQLException, IOException;
    void showData() throws SQLException;
    void updateData() throws SQLException, IOException;
    void deleteData() throws IOException, SQLException;
    void showBasedOnSorting() throws SQLException, IOException;
}
