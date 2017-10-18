package com.mycompany.shortestpathchessboardtest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.shortestpathchessboard.ShortestPathChessboardControls;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author tsakalis
 */
public class ShortestPathChessboardControlsTest {

    public ShortestPathChessboardControlsTest() {
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
     * Test of createChessBoardPane method, of class
     * ShortestPathChessboardControls.
     */
    @Test
    public void testCreateChessBoardPane() {
        System.out.println("createChessBoardPane");
        ShortestPathChessboardControls instance = new ShortestPathChessboardControls();
        instance.createChessBoardPane();
    }

    /**
     * Test of createInputPane method, of class ShortestPathChessboardControls.
     */
    @Test
    public void testCreateInputPane() {
        System.out.println("createInputPane");
        ShortestPathChessboardControls instance = new ShortestPathChessboardControls();
        instance.createInputPane();
    }
}
