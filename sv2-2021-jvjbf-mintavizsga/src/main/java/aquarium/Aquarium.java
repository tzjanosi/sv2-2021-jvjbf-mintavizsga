package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishList=new ArrayList<>();
    public static final int CAPACITY=20;
    private static final int NECESSARY_VOLUME=5;

    public void addFish(Fish fish){
        if(!isSpace()){
            throw new IllegalStateException("Can not add fish because there is no more space.");
        }
        fishList.add(fish);
    }

    private boolean isSpace() {
        return fishList.size()<CAPACITY/NECESSARY_VOLUME;
    }
    public void feed(){
        for(Fish fish:fishList){
            fish.feed();
        }
    }

    public void removeFish(int maxWeight){
        for(int i=0; i<fishList.size();i++){
            if(fishList.get(i).getWeight()>maxWeight){
                fishList.remove(i);
            }
        }
    }
    public List<String> getStatus(){
        List<String> statusList=new ArrayList<>();
        for(Fish fish:fishList){
            statusList.add(fish.getStatus());
        }
        return statusList;
    }

    public int getNumberOfFishWithMemoryLoss(){
        int fishCountWithMemoryProblem=0;
        for(Fish fish:fishList){
            if(fish.hasMemoryLoss()){
                fishCountWithMemoryProblem++;
            }
        }
        return fishCountWithMemoryProblem;
    }
    public boolean isThereFishWithGivenColor(String color){
        for(Fish fish:fishList){
            if(color.equals(fish.getColor())){
                return true;
            }
        }
        return false;
    }
    public Fish getSmallestFish(){
        if (fishList.isEmpty()) {
            throw new IllegalStateException("Empty fishList!");
        }
        Fish smallestFish=fishList.get(0);
        int minWeight=smallestFish.getWeight();
        for(int i=1; i<fishList.size();i++){
            if(fishList.get(i).getWeight()<minWeight){
                smallestFish=fishList.get(i);
                minWeight=smallestFish.getWeight();
            }
        }
        return smallestFish;
    }
}
