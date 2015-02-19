/* 
 * @(#)RegistrationController.java Feb 19, 2015
 * Title:         Assignment
 * Description:   UTMS Assignment
 * 
 * Copyright 2013 ValueLabs. All rights reserved.
 * ValueLabs PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.vl.utms.assigment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This controller receives all the requests related to User Registration, collaborates with User Service to fulfill 
 * the requests and returns responses. 
 *
 * @author Praveen Babu Puram
 * @version $Revision: 1.0$ $Date:Feb 19, 2015 11:42:08 AM$
 */

@RestController
public class RegistrationController {
	@RequestMapping("/name")
    public String getName() {
		return "{\"name\":\"Registered User Name\"}";
    }
}
