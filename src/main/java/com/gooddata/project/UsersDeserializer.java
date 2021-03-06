/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.project;

import com.gooddata.collections.PageableListDeserializer;
import com.gooddata.collections.Paging;

import java.util.List;
import java.util.Map;

class UsersDeserializer extends PageableListDeserializer<Users, User> {

    protected UsersDeserializer() {
        super(User.class, "users");
    }

    @Override
    protected Users createList(final List<User> items, final Paging paging, final Map<String, String> links) {
        return new Users(items, paging);
    }
}
