/**
 * Created by k1763829 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }
    public void sleep(){
        if(energy >= 12){
            print("Woops" + this.getName() + "is not that sleepy");}
             else {
            energy += 8;
            happiness -= 5;
            fullness -= 5;

            if (energy > 15) { energy= 15;}

            print("*Yawn*, that was a good nap");

        }
    }

    public void eat(){
        if(fullness >= 12){
            print("Woops" + this.getName() + "is already full");}
        else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;

            if (fullness > 15) {fullness = 15;}
            print("Yum" + this.getName() + "really enjoyed that!");
            }
        }

    public void play(){

            happiness += 8;
            energy -= 6;
            fullness -= 4;

        if (happiness > 15){happiness = 15;}
       print ("This was so much fun! Let's do it again!");
    }

    public String checkStatus(){
        String status = " ";
        if(happiness <= 0 || energy <= 0 || fullness <= 0){
            print("oh no" + this.getName() + " has died. You are a terrible owner");
            System.exit(status:0);
        }

        if (happiness <= 6) {
            status += "Oh, " + this.getName() + "is feeling sad!\n";
        }
        if(energy <= 6){
            status += "Hmm, " + this.getName() + "is really tired!\n";
        }
        if(fullness <= 6){
            status += "Woops, " + this.getName() + "is super hungry!\n";
        }


        return status;
    }

    public String getName() {
        return name;
    }

    public void print(String s){
        System.out.println(s);
    }
}
