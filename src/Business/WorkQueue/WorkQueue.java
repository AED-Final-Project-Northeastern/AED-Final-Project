/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author Kabir
 */
public class WorkQueue {
     
    private ArrayList<WorkRequest> workRequestList;

    //WorkQueue Constructor:
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    //ArrayList for getWorkRequestList:
    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}
