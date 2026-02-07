# splunk-java-learn-v1
splunk java poc


documentation link
https://dev.splunk.com/enterprise/docs/devtools/java/logging-java/howtouseloggingjava/enableloghttpjava/



to test connection to splunk
curl -k "https://localhost:8088/services/collector/event" \
-H "Authorization: Splunk 14d7802d-3949-4ea2-b06b-389da97cf035" \
-d '{"event": "Hello, world! This is a test event.", "sourcetype": "manual"}'

