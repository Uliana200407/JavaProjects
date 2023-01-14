package ua.andreieva.uliana.springboot.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Objects;

@Repository
public class MainRepository {
    private ArrayList <ArrayList<String>> data = new ArrayList<> ();

    public ArrayList<String> getNormalCompilation(){
        ArrayList<String> normalCompilation = new ArrayList <> ();
        for( ArrayList < String > element : data){
            int elementInt = Integer.parseInt ( element.get ( 2 ) );
            if (elementInt < 1000){
                normalCompilation.add ( element.get ( 3 ));
            }
        }
        return normalCompilation;
    }
    public ArrayList<String> getLongCompilation(){
        ArrayList<String> longCompilation = new ArrayList <> ();
        for( ArrayList < String > element : data){
            int elementInt = Integer.parseInt ( element.get ( 2 ) );
            if (elementInt >= 1000){
                longCompilation.add ( element.get ( 3 ));
            }
        }
        return longCompilation;
    }
    public ArrayList<String> getSuccessResults(){
        ArrayList<String> successRecords = new ArrayList <> ();
        for( ArrayList < String > element : data){
            if (Objects.equals ( element.get ( 3 ), "success" )){

                successRecords.add ( element.get ( 3 ));
            }
        }
        return successRecords;
    }
    public ArrayList<String> getFailedResults(){
        ArrayList<String> failedRecords = new ArrayList <> ();
        for( ArrayList < String > element : data){
            if (!Objects.equals ( element.get ( 3 ), "success" )){

                failedRecords.add ( element.get ( 3 ));
            }
        }
        return failedRecords;
    }
    public ArrayList<String> getRecordedData(){
        ArrayList<String> records = new ArrayList <> ();
        for( ArrayList < String > element : data){
            records.add ( element.get ( 0 ));
        }
        return records;
    }

    public void AddData(String project,String timestamp,String compilationTime,String result){

        ArrayList<String> newData = new ArrayList <> ();
        newData.add ( project );
        newData.add ( timestamp );
        newData.add ( compilationTime );
        newData.add ( result );
        data.add ( newData);
    }
    public String getData(){
        String string = "";
        for(ArrayList <String> dataElement: data){
            for( String Element: dataElement ){
                string += Element + " ";
            }
            string += "\n";

        }
        return string;
    }

}
