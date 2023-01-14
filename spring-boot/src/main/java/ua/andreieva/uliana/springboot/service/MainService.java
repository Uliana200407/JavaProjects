package ua.andreieva.uliana.springboot.service;

import org.springframework.stereotype.Service;
import ua.andreieva.uliana.springboot.repository.MainRepository;

import java.util.ArrayList;

@Service
public class MainService {

    MainRepository object = new MainRepository ();
    public void putData(String project,String timestamp,String compilationTime,String result ){

        object.AddData ( project, timestamp, compilationTime, result );
    }
    public String getData(){
        return object.getData ();
    }
    public ArrayList <String> getRecords(){
        return object.getRecordedData ();
    }
    public ArrayList <String> getFailedRecords(){
        return object.getFailedResults ();
    }
    public ArrayList <String> getSuccessRecords(){
        return object.getSuccessResults ();
    }
    public ArrayList <String> getLongCompilation(){
        return object.getLongCompilation ();
    }
    public ArrayList <String> getNormalCompilation(){
        return object.getNormalCompilation ();
    }
}
