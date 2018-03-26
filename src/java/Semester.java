public class Semester {
    private String daysTaken;
    private int numDaysTaken;
    private int semNum;

    public Semester(int semNum) {
        this.semNum = semNum;
        numDaysTaken = 0;
        daysTaken = new String("");
    }

    public boolean add(Course c) {

        daysTaken.concat(String.valueOf(c.getDayTaken()));
        numDaysTaken++;
        return false;
    }
    public boolean isNumDaysValid() {
        if(semNum % 3 == 0) {
            if(numDaysTaken > 3) {
                return false;
            }
        }
        if((semNum + 1) % 3 == 0) {
            if(numDaysTaken > 3) {
                return false;
            }
        }
        if((semNum + 2) % 3 == 0) {
            if(numDaysTaken > 2) {
                return false;
            }
        }
        return true;
    }

}