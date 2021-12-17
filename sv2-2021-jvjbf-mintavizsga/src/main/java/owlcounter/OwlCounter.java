package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owlList=new ArrayList<>();
    private List<OwlInCounties> owlInCountiesList=new ArrayList<>();

    public void readFromFile(Path path){
        try {
            owlList= Files.readAllLines(path);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
        fillOwlInCountiesList();
    }

    private void fillOwlInCountiesList(){
        if (owlList.isEmpty()) {
            throw new IllegalArgumentException("Empty owlList!");
        }
        for(String owl:owlList){
            owlInCountiesList.add(createOwlInCountiesFromString(owl));
        }
    }

    private OwlInCounties createOwlInCountiesFromString(String input){
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Empty input string!");
        }
        String[] inputAsArray=input.split("=");
        return new OwlInCounties(inputAsArray[0],Integer.parseInt(inputAsArray[1]));
    }

    public int getNumberOfOwls(String county){
        for(OwlInCounties record:owlInCountiesList){
            if(county.equals(record.getName())){
                return record.getCountOfOwls();
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }
    public int getNumberOfAllOwls(){
        int totalNumberOfOwls=0;
        for(OwlInCounties record:owlInCountiesList){
            totalNumberOfOwls+=record.getCountOfOwls();
        }
        return totalNumberOfOwls;
    }
}
