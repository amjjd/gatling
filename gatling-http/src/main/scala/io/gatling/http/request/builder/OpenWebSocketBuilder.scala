package io.gatling.http.request.builder

import io.gatling.http.action.OpenWebSocketActionBuilder
import io.gatling.http.util.{ RequestLogger, WebSocketClient }
import io.gatling.core.session.Expression

object OpenWebSocketBuilder {
	def apply(actionName: Expression[String], attributeName: String, url: Expression[String], webSocketClient: WebSocketClient, requestLogger: RequestLogger) = {
		new OpenWebSocketBuilder(HttpAttributes(actionName, "GET", url), attributeName, webSocketClient, requestLogger)
	}
}

class OpenWebSocketBuilder(httpAttributes: HttpAttributes, val attributeName: String, val webSocketClient: WebSocketClient, val requestLogger: RequestLogger) extends AbstractHttpRequestBuilder[OpenWebSocketBuilder](httpAttributes) {
	private[http] def newInstance(httpAttributes: HttpAttributes) = new OpenWebSocketBuilder(httpAttributes, attributeName, webSocketClient, requestLogger)
}
