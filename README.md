Protocol Buffers vs JSON
===================================================

This project contains a REST service which returns data in JSON format and the second service which data in Google Protocol Buffers format,

You can find more information about Protocol Buffers heere:
https://developers.google.com/protocol-buffers/

Both the services are returning same data so that we can compare their performances (response time and response size).

I have added two Jmeter JMX scripts here: https://github.com/jainrish/ProtoBufVSJson/tree/master/scripts/jmx 

These jmx script sends 1000 concurrent requests to each of the services.
The results can be found here: https://github.com/jainrish/ProtoBufVSJson/tree/master/results

Summary of the results:
-----------------------------------

|  Service Response Type | Average Response Time | Average Response Size |
|------------------------|-----------------------|-----------------------|
| JSON                   | 720 ms                | 139284 bytes          |
| Protobuf               | 140 ms                | 39241 bytes           |

The results show that on average, protobuf is **5** times as fast as JSON response and the resposne size is upto **3.5** times smaller than JSON response.