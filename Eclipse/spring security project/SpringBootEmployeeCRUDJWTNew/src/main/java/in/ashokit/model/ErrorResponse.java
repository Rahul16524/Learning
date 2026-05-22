package in.ashokit.model;

import java.time.Instant;

public class ErrorResponse {
    private int status;
    private String message;
    private Instant timestamp;
    private String requestUri;
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Instant getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ErrorResponse [status=" + status + ", message=" + message + ", timestamp=" + timestamp + ", requestUri="
				+ requestUri + "]";
	}
	public ErrorResponse(int status, String message, Instant timestamp, String requestUri) {
		super();
		this.status = status;
		this.message = message;
		this.timestamp = timestamp;
		this.requestUri = requestUri;
	}
	public String getRequestUri() {
		return requestUri;
	}
	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}

}