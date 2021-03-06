/**
 * Copyright (C) 2004-2016, GoodData(R) Corporation. All rights reserved.
 * This source code is licensed under the BSD-style license found in the
 * LICENSE.txt file in the root directory of this source tree.
 */
package com.gooddata.md.report;

import org.springframework.util.StringUtils;

import static com.gooddata.util.Validate.notNull;
import static java.lang.String.format;

/**
 * Represents type of Total for {@link AttributeInGrid}
 */
public enum Total {
    SUM,
    AVG,
    MAX,
    MIN,
    NAT,
    MED;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public static Total of(String total) {
        notNull(total, "total");
        try {
            return Total.valueOf(total.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new UnsupportedOperationException(
                    format("Unknown value for Grid's total: \"%s\", supported values are: [%s]",
                            total, StringUtils.arrayToCommaDelimitedString(Total.values())),
                    e);
        }
    }
}
