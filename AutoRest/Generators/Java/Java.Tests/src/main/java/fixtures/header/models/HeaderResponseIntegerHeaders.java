/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;


/**
 * Defines headers for responseInteger operation.
 */
public class HeaderResponseIntegerHeaders {
    /**
     * response with header value "value": 1 or -2.
     */
    private Integer value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public Integer getValue() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     */
    public void setValue(Integer value) {
        this.value = value;
    }

}