package com.OOPs;
class Cricket{
    String playerName;
    int Matches;
    float average;
    float strikeRate;

    Cricket(String playerName,int Matches,float average,float strikeRate){
        this.playerName = playerName;
        this.Matches = Matches;
        this.average = average;
        this.strikeRate = strikeRate;
        System.out.println("Player => " + playerName + " played " + Matches + " Matches " + "averages " + average + " with a Strike rate of " + strikeRate);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Cricket cric = new Cricket("Rohit sharma",250,50.25f,150);
    }
}
