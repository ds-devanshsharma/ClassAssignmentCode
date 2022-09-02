package Test_02_Oct.DAOBook;
import Test_02_Oct.ConnectionMaker.ConnectionProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static Test_02_Oct.ConnectionMaker.ConnectionProvider.*;
public class DAOBookImplementation implements DAOBook{
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    BookPojo bookPojo ;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    @Override
    public void insertData() throws SQLException, IOException {
        takeInput();
        preparedStatement =connection.prepareStatement("INSERT INTO BOOK_SYSTEM values(?,?,?,?,?)");
        preparedStatement.setInt(1,bookPojo.getId());
        preparedStatement.setString(2,bookPojo.getName());
        preparedStatement.setString(3,bookPojo.getPublisher());
        preparedStatement.setFloat(4,bookPojo.getPrice());
        preparedStatement.setString(5, bookPojo.getAuthor());

        if(preparedStatement.executeUpdate()>0 ) System.out.println("Record ADded succesfully ");
        else System.out.println("SOMETHING WENT WRONG ");
    }
     void takeInput() throws IOException {
        bookPojo = new BookPojo();
        System.out.println("Enter BOOK-ID : ");bookPojo.setId(Integer.parseInt(reader.readLine()));
        System.out.println("Enter BOOk-name :");bookPojo.setName(reader.readLine());
         System.out.println("Enter Book-publisher :");bookPojo.setPublisher(reader.readLine());
         System.out.println("Enter BOOK-Price :");bookPojo.setPrice(Float.parseFloat(reader.readLine()));
         System.out.println("Enter Book_Author :");bookPojo.setAuthor(reader.readLine());
    }

    @Override
    public void showData() throws SQLException {

        preparedStatement =connection.prepareStatement("SELECT * FROM BOOK_SYSTEM  ",
                ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
        resultSet =preparedStatement.executeQuery();
        if(resultSet.next()){
            resultSet.beforeFirst();
            printer(resultSet);
        }else{
            System.out.println("Record not found !!");
        }
        System.out.println();
    }
    void printer (ResultSet resultSet) throws SQLException {
        while(resultSet.next()){
            System.out.printf("%10d %10s%10s%10f%10s",resultSet.getInt(1),resultSet.getString(2),
                    resultSet.getString(3),resultSet.getFloat(4),resultSet.getString(5));
        }
    }

    @Override
    public void updateData() throws SQLException, IOException {
        System.out.println("Enter BOOk-ID :");
        int bookID = Integer.parseInt(reader.readLine());
        preparedStatement = connection.prepareStatement("UPDATE BOOK_SYSTEM SET NAME = ? WHERE ID = ?");
        System.out.println("ENTER BOOK NAME :");
        preparedStatement.setString(1,reader.readLine());
        preparedStatement.setInt(2,bookID);
        if(preparedStatement.executeUpdate()>0) System.out.println("RECORD UPDATED SUCCESSFULLY !!");
        else System.out.println("RECORD NOT FOUND ");
    }

    @Override
    public void deleteData() throws IOException, SQLException {
        System.out.println("Enter BOOk-ID :");
        int bookID = Integer.parseInt(reader.readLine());
        preparedStatement = connection.prepareStatement("Delete from BOOK_SYSTEM WHERE ID = ?");
        preparedStatement.setInt(1,bookID);
        if(preparedStatement.executeUpdate()>0) System.out.println("RECORD DELETED SUCCESSFULLY !!");
        else System.out.println("RECORD NOT FOUND ");

    }

    @Override
    public void showBasedOnSorting() throws SQLException, IOException {
        preparedStatement = connection.prepareStatement("SELECT * FROM BOOK_SYSTEM ");
        resultSet = preparedStatement.executeQuery();
        List<BookPojo>  result = dbToList(resultSet);
        System.out.println("Enter 1 to view SortedDataByID :\n" +
                "Enter 2 to View SortedDataByPublisher :");
        switch (Integer.parseInt(reader.readLine())){
            case 1 :
                List<BookPojo> reverse =result.stream().sorted(Comparator.comparing(item-> item.id))
                        .collect(Collectors.toList());
                Collections.reverse(reverse);
                System.out.println(reverse);
                break;
            case 2 :
                result.stream().sorted(Comparator.comparing(item-> item.publisher))
                        .forEach(System.out::println);
                break;
        }

    }
    public void lastCase() throws SQLException {
        preparedStatement = connection.prepareStatement("SELECT PUBLISHER, AUTHOR, NAME FROM BOOK_SYSTEM ORDER BY PUBLISHER");
       resultSet= preparedStatement.executeQuery();
        printer(resultSet);
    }
    List<BookPojo> dbToList(ResultSet resultSet) throws SQLException {
        List<BookPojo> list =null ;
        while(resultSet.next()){
            list.add(new BookPojo(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),
                    resultSet.getFloat(4),resultSet.getString(5)));
        }
        return list ;
    }
}
