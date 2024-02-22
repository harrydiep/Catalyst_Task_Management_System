package CritPath;

import java.util.*;

public class CriticalPath {

    /*public CritPath.CriticalPath(LinkedList<Database.Task> pathObjects){
        //check that all objects have the necessary fields filled in
        //e.g. start, finish, successor, predecessor
        //then calc critical path

        /*for (Database.Task myTask : pathObjects){
            myTask.check();
        }*/

    /*

        int check;
        check = 0;

        for (int i=0; i<pathObjects.size(); i++){
            Database.Task t = pathObjects.get(i);
            if(t.check() == true){
                System.out.println("True");
                check += 1;
            }
        }


        if(pathObjects.size() == check){
            System.out.println("All Tasks have correct fields populated!");

            //Call the method to calc crit path here
        }
        else {
            System.out.println("Some fields not populated!!!");
            //send error message
        }




    private void forwardPass(LinkedList<Database.Task> taskList){
        for (Database.Task t : taskList){

        }

        //calc early start and finish for each activity
        //calc total project duration
    }
        private Database.Task earlyStart(Database.Task task) {
        //max ef value from predecessors
        Database.Task maxEf = null;
        for (int i=0; i<task.getPredecessor().size(); i++){
            if(maxEf == null){
                maxEf = task.getPredecessor().get(0);
            }
            //find max ef value out of predecessors
            if (task.getPredecessor().get(i).getEndDate().before( maxEf.getEndDate())){
                maxEf = task.getPredecessor().get(i);
            };
        }
        return maxEf;
        //returns task with the max finish date
    }

    private Date earlyFinish(Database.Task t) {
        //early start + duration
        Calendar cal = Calendar.getInstance();
        cal.setTime(earlyStart(t).getEndDate());
        cal.add(Calendar.SECOND, (int) t.getDurationInSecs());

        Date eFDate = cal.getTime();

        return eFDate;

    }

    private void freeSlack(Database.Task t){
        //days the activity can be delayed without delaying successive activities


    }

    private void totalSlack(){
        //total number of days the activity can be delayed at max
    }

*/
}

