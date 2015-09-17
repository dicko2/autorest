/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.http;

import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.client.Response;
import fixtures.http.models.Error;
import retrofit.http.HEAD;
import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Body;
import retrofit.http.PATCH;
import retrofit.http.POST;
import com.microsoft.rest.DELETE;

/**
 * An instance of this class provides access to all the operations defined
 * in HttpClientFailure.
 */
public interface HttpClientFailure {
    /**
     * The interface defining all the services for HttpClientFailure to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HttpClientFailureService {
        @HEAD("/http/failure/client/400")
        Response head400() throws ServiceException;

        @HEAD("/http/failure/client/400")
        void head400Async(ServiceResponseCallback cb);

        @GET("/http/failure/client/400")
        Response get400() throws ServiceException;

        @GET("/http/failure/client/400")
        void get400Async(ServiceResponseCallback cb);

        @PUT("/http/failure/client/400")
        Response put400(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/failure/client/400")
        void put400Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/failure/client/400")
        Response patch400(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/failure/client/400")
        void patch400Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/failure/client/400")
        Response post400(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/failure/client/400")
        void post400Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/failure/client/400")
        Response delete400(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/failure/client/400")
        void delete400Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/failure/client/401")
        Response head401() throws ServiceException;

        @HEAD("/http/failure/client/401")
        void head401Async(ServiceResponseCallback cb);

        @GET("/http/failure/client/402")
        Response get402() throws ServiceException;

        @GET("/http/failure/client/402")
        void get402Async(ServiceResponseCallback cb);

        @GET("/http/failure/client/403")
        Response get403() throws ServiceException;

        @GET("/http/failure/client/403")
        void get403Async(ServiceResponseCallback cb);

        @PUT("/http/failure/client/404")
        Response put404(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/failure/client/404")
        void put404Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/failure/client/405")
        Response patch405(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/failure/client/405")
        void patch405Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/failure/client/406")
        Response post406(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/failure/client/406")
        void post406Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @DELETE("/http/failure/client/407")
        Response delete407(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/failure/client/407")
        void delete407Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PUT("/http/failure/client/409")
        Response put409(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/failure/client/409")
        void put409Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/failure/client/410")
        Response head410() throws ServiceException;

        @HEAD("/http/failure/client/410")
        void head410Async(ServiceResponseCallback cb);

        @GET("/http/failure/client/411")
        Response get411() throws ServiceException;

        @GET("/http/failure/client/411")
        void get411Async(ServiceResponseCallback cb);

        @GET("/http/failure/client/412")
        Response get412() throws ServiceException;

        @GET("/http/failure/client/412")
        void get412Async(ServiceResponseCallback cb);

        @PUT("/http/failure/client/413")
        Response put413(@Body Boolean booleanValue) throws ServiceException;

        @PUT("/http/failure/client/413")
        void put413Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @PATCH("/http/failure/client/414")
        Response patch414(@Body Boolean booleanValue) throws ServiceException;

        @PATCH("/http/failure/client/414")
        void patch414Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @POST("/http/failure/client/415")
        Response post415(@Body Boolean booleanValue) throws ServiceException;

        @POST("/http/failure/client/415")
        void post415Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @GET("/http/failure/client/416")
        Response get416() throws ServiceException;

        @GET("/http/failure/client/416")
        void get416Async(ServiceResponseCallback cb);

        @DELETE("/http/failure/client/417")
        Response delete417(@Body Boolean booleanValue) throws ServiceException;

        @DELETE("/http/failure/client/417")
        void delete417Async(@Body Boolean booleanValue, ServiceResponseCallback cb);

        @HEAD("/http/failure/client/429")
        Response head429() throws ServiceException;

        @HEAD("/http/failure/client/429")
        void head429Async(ServiceResponseCallback cb);

    }
    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head400() throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head400Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get400() throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get400Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete400(Boolean booleanValue) throws ServiceException;

    /**
     * Return 400 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete400Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 401 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head401() throws ServiceException;

    /**
     * Return 401 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head401Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 402 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get402() throws ServiceException;

    /**
     * Return 402 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get402Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 403 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get403() throws ServiceException;

    /**
     * Return 403 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get403Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 404 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put404(Boolean booleanValue) throws ServiceException;

    /**
     * Return 404 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put404Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 405 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch405(Boolean booleanValue) throws ServiceException;

    /**
     * Return 405 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch405Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 406 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post406(Boolean booleanValue) throws ServiceException;

    /**
     * Return 406 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post406Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 407 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete407(Boolean booleanValue) throws ServiceException;

    /**
     * Return 407 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete407Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 409 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put409(Boolean booleanValue) throws ServiceException;

    /**
     * Return 409 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put409Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 410 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head410() throws ServiceException;

    /**
     * Return 410 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head410Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 411 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get411() throws ServiceException;

    /**
     * Return 411 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get411Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 412 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get412() throws ServiceException;

    /**
     * Return 412 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get412Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 413 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error put413(Boolean booleanValue) throws ServiceException;

    /**
     * Return 413 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void put413Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 414 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error patch414(Boolean booleanValue) throws ServiceException;

    /**
     * Return 414 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void patch414Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 415 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error post415(Boolean booleanValue) throws ServiceException;

    /**
     * Return 415 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void post415Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 416 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error get416() throws ServiceException;

    /**
     * Return 416 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void get416Async(final ServiceCallback<Error> serviceCallback);

    /**
     * Return 417 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error delete417(Boolean booleanValue) throws ServiceException;

    /**
     * Return 417 status code - should be represented in the client as an error
     *
     * @param booleanValue Simple boolean value true
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void delete417Async(Boolean booleanValue, final ServiceCallback<Error> serviceCallback);

    /**
     * Return 429 status code - should be represented in the client as an error
     *
     * @return the Error object if successful.
     * @throws ServiceException the exception wrapped in ServiceException if failed.
     */
    Error head429() throws ServiceException;

    /**
     * Return 429 status code - should be represented in the client as an error
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     */
    void head429Async(final ServiceCallback<Error> serviceCallback);

}