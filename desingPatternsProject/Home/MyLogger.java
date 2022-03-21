package Home;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyLogger {

    static MyLogger _instance = null;
    String fileName = "c:\\data\\Actions.csv";

    private PrintWriter userActions = null;

    public MyLogger(){
        System.out.println("Constructor logger");
    }

    public static MyLogger getInstance(){
        if(_instance == null){
            System.out.println("new logger");
            _instance = new MyLogger();
        }
        return _instance;
    }

    public void initLogger() throws IOException {
        System.out.println("initializing CSV...");
        userActions = new PrintWriter(new File(fileName));
        StringBuilder sb = new StringBuilder();
        sb.append("Name,");
        sb.append("LastName,");
        sb.append("Date,");
        sb.append("Remarks,");
        sb.append("Insurance");
        sb.append("\n");

        userActions.write(sb.toString());
        userActions.close();
    }

    public void insertAction(String name,String lastName,String date,String remarks,String type) throws IOException{
        FileWriter writer = new FileWriter(fileName,true);
        StringBuilder sb = new StringBuilder();
        sb.append(name+",");
        sb.append(lastName+",");
        sb.append(date+",");
        sb.append(remarks+",");
        sb.append(type);
        sb.append("\n");
        writer.write(sb.toString());
        writer.close();
    }




}
