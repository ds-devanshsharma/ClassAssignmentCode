package Test_02_Oct;

import Test_02_Oct.ConnectionMaker.ConnectionProvider;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

public class BookSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to BookSystem :");
        try {
               ConnectionProvider.connectionProvider();
               while (true) {
                   new BooKMenu().bookMenu();
               }
       }catch (SQLException | IOException e ){
           System.out.println(e.getMessage());
       }
    }
}
