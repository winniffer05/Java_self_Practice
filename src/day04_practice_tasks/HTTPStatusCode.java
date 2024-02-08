package day04_practice_tasks;

import javax.management.MBeanAttributeInfo;

public class HTTPStatusCode {
/*
13. Create a class named HttpStatusCode. HTTP is the protocol that governs communications between
Web servers and web clients. Part of the protocol includes a status code returned by the server to
inform the browser of its most recent page request status.

		Here are some of the codes and their meanings:

			200, OK
			201, Created
			202, Accepted
			301, Moved Permanently
			303, See Other
			304, Not Modified
			307, Temporary Redirect
			400, Bad Request
			401, Unauthorized
			403, Forbidden
			404, Not Found
			410, Gone
			500, Internal Server Error
			503, Service Unavailable

	Given an integer variable named statusCode, write a switch that prints out the appropriate label
	from the above list based on the status.

			Example:
				   if status code = 200

			Output:
				   OK
 */

    public static void main(String[] args) {

        int statusCode = 202;

        String results= " ";


        switch (statusCode){

            case 200:
                results = "ok";
                break;
            case 201:
                results = "Created";
                break;
            case 202:
                results = "Accepted";
                break;
            case 301:
                results= "Moved Permanently";
                break;
            case 303:
                results = "See Other";
                break;
            case 304:
              results = "Not Modified";
              break;

            case 307:
                results = "Temporary Redirect";
                break;
            case 400:
              results ="Bad Request";
              break;
            case 401:
             results = " Unauthorized";
             break;
            case 403:
              results = "Forbidden";
              break;
            case 404:
             results = "  Not Found";
             break;
            case  410:
             results = "Gone";
             break;
            case 500:
              results = " Internal Server Error";
              break;
            case 503:
            results = "Service Unavailable";
            break;

        }


        System.out.println(results);
    }

}
