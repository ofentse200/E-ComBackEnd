/*
 * Application.java
 * Main entry point for E-Commerce Backend Application
 * Author: [Team Lead Name] ([Student Number])
 * Date: 23 March 2026
 */

package com.ecommerce;


import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

/**
 * Main Application class - Entry point for the E-Commerce Backend system
 * 
 * This application implements Domain Driven Design (DDD) principles with:
 * - Domain entities using Builder Pattern
 * - Factory pattern for object creation
 * - Repository pattern for data persistence
 * 
 * @author Team Lead
 * @version 1.0.0
 */
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("===========================================");
        logger.info("E-Commerce Backend Application Starting...");
        logger.info("===========================================");
        
        logger.info("Application initialized successfully");
        logger.info("Ready to process business logic");
        
        logger.info("===========================================");
    }
}
