
/** This class calculates the time difference  */

package worldclock;

public class Sydney extends User {
     /**
      The Constructor determines the number of parameters used in the program 
     */
Sydney(int user_country1, double time1, int other_country1) {
      user_country=user_country1;     // Hold the city number of the user
      time=time1;                     // Hold the time 
      other_country=other_country1;   // Number of city
    }
// This makkah method calculates the time difference
    public void makkah(){
     time=time+8;
      yourTime(time); 
}
// This dubai method calculates the time difference
    public void dubai(){
     time=time+7;
     yourTime(time); 
} 
}