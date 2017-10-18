/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shortestpathchessboard;

import java.util.LinkedList;

/**
 *
 * @author tsakalis
 */
public class NodesList extends LinkedList<ArrayPos>{
    
    private boolean ListVisited= false;
    
    public NodesList()
    {
        this.ListVisited = false;        
    }

    public boolean isListVisited() {
        return ListVisited;
    }

    public void setListVisited(boolean isListVisited) {
        this.ListVisited = isListVisited;
    }
    
}
