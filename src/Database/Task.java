package Database;

import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.LinkedList;

public class Task {
    private String taskID = null;
    private String taskName = null;
    private Date startDate = null;
    private Date endDate = null;
    private Task predecessor = null;
    private Task successor = null;
    private String description = null;
    private String status = null;
    private LinkedList<Task> subTasks = null;

    private String taskname;

    public String getTaskname() {
        return this.taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Task getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(Task t) {
        this.predecessor = t;
    }

    public Task getSuccessor() {
        return this.successor;
    }

    public void setSuccessor(Task successor) {
        this.successor = successor;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LinkedList<Task> getSubTasks() {
        return this.subTasks;
    }

    public void setSubTasks(LinkedList<Task> subTasks) {
        this.subTasks = subTasks;
    }

    public long getDurationInSecs(){

        return calcDuration();
    }

    private void genTaskID(){


    }

    //Database.Task Duration Calculation
    private long calcDuration(){

        long diff = ChronoUnit.SECONDS.between(startDate.toInstant(), endDate.toInstant()); //Difference in seconds


        return diff;
    }

    public boolean check(){

        if(this.startDate == null || this.endDate == null || this.predecessor == null || this.successor == null || this.description == null ||
                this.status == null || this.subTasks == null){
            return false;
        }
        else {
            return true;
        }
    }


}