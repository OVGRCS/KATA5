package kata5;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author Omaro Vega
 */
public class KATA5 {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
        
        Class.forName("org.sqlite.JDBC");
        Connection conecta = DriverManager.getConnection("jdbc:sqlite:KATA5.DB");
        Statement state = conecta.createStatement();
        
        String query = "SELECT * FROM PEOPLE";
        ResultSet resultado = state.executeQuery(query);
        
        
        ArrayList<String> listMail = new ArrayList<>();
        while(resultado.next()){
            listMail.add(resultado.getString("NAME"));
        }
         //= MailList.read(name);
        Histogram<String> histogram = MainHistogramBuilder.build(listMail);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
}