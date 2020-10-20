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
public class CharLimit {
    private int chars;

    public CharLimit(int chars) {
        this.chars = chars;
    }

    public int getChars() {
        return chars;
    }

    public void setChars(int chars) {
        this.chars = chars;
    }
    
    public boolean isLegal(int number) {
        String num = Integer.toString(number);
        
        return num.length() == chars;
    }
}
