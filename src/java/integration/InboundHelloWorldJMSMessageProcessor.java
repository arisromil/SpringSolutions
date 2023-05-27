package integration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import java.util.Map;

public class InboundHelloWorldJMSMessageProcessor {
	
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@ServiceActivator
	public void handleIncomingJmsMessage(Message<Map<String, Object>> inboundJmsMessage) {
		var payload = inboundJmsMessage.getPayload();
		logger.info("Received: {}", payload);
	}

}
