/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Mario
 */

public class MatrixRecord {
    
    Matrix states[];
    int actualState = 0;
    int step = 0;
    int lastState = 0;
    
    
    public MatrixRecord(int step) {
    
        this.states = new Matrix[step];
        this.step = step;
        
    }
    
    
    public void saveState(Matrix obj) {
        cleanBreakBranch();
        
        this.states[this.actualState % step] = obj;
        this.actualState = step + ((this.actualState + 1) % step);
        this.lastState = this.actualState;
    }
    
    public Matrix getNextState() {
        
        if (this.lastState == this.actualState) return null;
        
        Matrix state = states[this.actualState % step];
        
        this.actualState++;
        return state;
    }
    
    
    public Matrix getPreviousState() {
        
        if (this.lastState == this.actualState - 1 ||
            this.states[(this.actualState - 2) % step] == null) return null;
        this.actualState--;
        Matrix state = states[(this.actualState - 1) % step];
        
        return state;
    }
    
    private void cleanBreakBranch() {
        
        int lastState = this.lastState % step; 
        int actualState = this.actualState % step;
        
        
        while(lastState != actualState) {
            states[actualState] = null;
            actualState = (actualState + 1) % step;
        
        }
    }
    
}
