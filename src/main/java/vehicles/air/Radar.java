package vehicles.air;

public class Radar{

    boolean foundUFO;


    public Radar(boolean foundUFO) {
        this.foundUFO = foundUFO;
    }

    public boolean isFoundUFO() {
        return this.foundUFO;
    }

    public void setFoundUFO(boolean foundUFO) {
        this.foundUFO = foundUFO;
    }
// take this
    public String radarStatus(){
        if(this.foundUFO){
            return "Radar found UFOs";

        }else {
            return "Radar found no UFO";
        }
    }
}
