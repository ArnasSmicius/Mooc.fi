import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Arnas on 2017.02.27.
 */
public class VehicleRegister {
    private Map<RegistrationPlate, String> owners;

    public VehicleRegister(Map<RegistrationPlate, String> owners){
        this.owners = owners;
    }

    public VehicleRegister(){
        this(new HashMap<>());
    }

    public boolean add(RegistrationPlate plate, String owner){
        if (owners.containsKey(plate)){
            return false;
        }
        else {
            owners.put(plate, owner);
            return true;
        }
    }

    public String get(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            return owners.get(plate);
        }
        else {
            return null;
        }
    }

    public boolean delete(RegistrationPlate plate){
        if (owners.containsKey(plate)){
            owners.remove(plate);
            return true;
        }
        else {
            return false;
        }
    }

    public void printRegistrationPlates(){
        for (RegistrationPlate plate : owners.keySet()){
            System.out.println(plate);
        }
    }

    public void printOwners(){
        ArrayList<String> writtenOwners = new ArrayList<>();
        for (String owner : owners.values()){
            if (!writtenOwners.contains(owner)){
                System.out.println(owner);
                writtenOwners.add(owner);
            }
        }
    }
}
