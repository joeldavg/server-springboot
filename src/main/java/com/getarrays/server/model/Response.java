package com.getarrays.server.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

	private LocalDateTime timeStamp;
	private int statusCode;
	private HttpStatus status;
	private String reason;
	private String message;
	private String developerMessage;
	private Map<?, ?> data;
	
}
