package com.microservices.demo.twitter.to.kafka.service.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "twitter-to-kafka-service")
public class TwitterToKafkaServiceConfigData {
    public List<String> getTwitterKeywords() {
		return twitterKeywords;
	}
	public void setTwitterKeywords(List<String> twitterKeywords) {
		this.twitterKeywords = twitterKeywords;
	}
	public String getWelcomeMessage() {
		return welcomeMessage;
	}
	public void setWelcomeMessage(String welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	private List<String> twitterKeywords;
    @Override
	public String toString() {
		return "TwitterToKafkaServiceConfigData [twitterKeywords=" + twitterKeywords + ", welcomeMessage="
				+ welcomeMessage + "]";
	}
	private String welcomeMessage;
}
