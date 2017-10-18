/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shortestpathchessboardtest;

import com.mycompany.shortestpathchessboard.NodesList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author makis
 */
public class NodesListTest {
    
    public NodesListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isIsListVisited method, of class NodesList.
     */
    @Test
    public void testIsListVisited() {
        System.out.println("isIsListVisited");
        
        NodesList instance = new NodesList();
        boolean expResult = false;
        boolean result = instance.isListVisited();
        assertEquals(expResult, result);
      
    }

   
    /**
     * Test of setListVisited method, of class NodesList.
     */
    @Test
    public void testSetListVisited() {
        System.out.println("setListVisited");
        boolean listVisited = true;
        NodesList instance = new NodesList();
        instance.setListVisited(listVisited);
        
        boolean expResult = true;
        boolean result = instance.isListVisited();
        assertEquals(expResult, result);
       
    }
    
}
