/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.flowlogix.arqsuite;

import static com.flowlogix.arqsuite.ContainerStartTest.payara;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lprimak
 */
class NumberOfDeploymentsTest {
    @AfterAll
    static void checkDeployments() {
        if (payara != null) {
            payara.stop();
        }
        assertEquals(1, Deployments.numOfDeployments, "Should only be one deployment");
    }

    @Test
    void dummy() {

    }
}
