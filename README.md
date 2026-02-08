# splunk-java-learn-v1
splunk java poc


documentation link
https://dev.splunk.com/enterprise/docs/devtools/java/logging-java/howtouseloggingjava/enableloghttpjava/

https://help.splunk.com/en/data-management/collect-http-event-data/use-hec-in-splunk-enterprise/set-up-and-use-http-event-collector-in-splunk-web#:~:text=Send%20data%20to%20HTTP%20Event,raw%20endpoint%20for%20raw%20events


to test connection to splunk
curl -k "https://localhost:8088/services/collector/event" \
-H "Authorization: Splunk 14d7802d-3949-4ea2-b06b-389da97cf035" \
-d '{"event": "Hello, world! This is a test event.", "sourcetype": "manual"}'

