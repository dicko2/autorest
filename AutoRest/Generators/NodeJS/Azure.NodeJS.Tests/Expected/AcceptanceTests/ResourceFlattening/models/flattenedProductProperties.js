/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the FlattenedProductProperties class.
 * @constructor
 */
function FlattenedProductProperties() { }

/**
 * Validate the payload against the FlattenedProductProperties schema
 *
 * @param {JSON} payload
 *
 */
FlattenedProductProperties.prototype.validate = function (payload) {
  if (!payload) {
    throw new Error('FlattenedProductProperties cannot be null.');
  }
  if (payload['pname'] !== null && payload['pname'] !== undefined && typeof payload['pname'].valueOf() !== 'string') {
    throw new Error('payload[\'pname\'] must be of type string.');
  }

  if (payload['type'] !== null && payload['type'] !== undefined && typeof payload['type'].valueOf() !== 'string') {
    throw new Error('payload[\'type\'] must be of type string.');
  }

  if (payload['provisioningStateValues'] !== null && payload['provisioningStateValues'] !== undefined && typeof payload['provisioningStateValues'].valueOf() !== 'string') {
    throw new Error('payload[\'provisioningStateValues\'] must be of type string.');
  }

  if (payload['provisioningState'] !== null && payload['provisioningState'] !== undefined && typeof payload['provisioningState'].valueOf() !== 'string') {
    throw new Error('payload[\'provisioningState\'] must be of type string.');
  }
};

/**
 * Deserialize the instance to FlattenedProductProperties schema
 *
 * @param {JSON} instance
 *
 */
FlattenedProductProperties.prototype.deserialize = function (instance) {
  return instance;
};

module.exports = new FlattenedProductProperties();