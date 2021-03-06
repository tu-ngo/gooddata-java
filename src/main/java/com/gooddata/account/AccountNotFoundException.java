/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.account;

import com.gooddata.GoodDataException;
import com.gooddata.GoodDataRestException;

/**
 * Account doesn't exist.
 */
public class AccountNotFoundException extends GoodDataException {

    private final String accountUri;

    public AccountNotFoundException(String uri, GoodDataRestException cause) {
        super("Account " + uri + " was not found", cause);
        this.accountUri = uri;
    }

    public String getAccountUri() {
        return accountUri;
    }
}
