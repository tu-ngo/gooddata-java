/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata;

import com.gooddata.authentication.LoginPasswordAuthentication;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static net.jadler.Jadler.closeJadler;
import static net.jadler.Jadler.initJadler;
import static net.jadler.Jadler.port;

public abstract class AbstractGoodDataIT {

    protected static final ObjectMapper MAPPER = new ObjectMapper();
    protected GoodData gd;

    @BeforeMethod
    public void commonSetUp() {
        initJadler().that().respondsWithDefaultContentType("application/json");
        gd = new GoodData(
                new GoodDataEndpoint("localhost", port(), "http"),
                new LoginPasswordAuthentication("sdk@gooddata.com", "sdk"),
                new GoodDataSettings()
        );
    }

    @AfterMethod
    public void tearDown() {
        closeJadler();
    }
}
