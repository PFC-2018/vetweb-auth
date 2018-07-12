var endpoint = new WebSocket("ws://localhost:8080/vetweb/endpoint/auth");

endpoint.onopen = function () {
	endpoint.send("MESSAGE");
}

endpoint.onmessage = function (message) {
	var mappings = message.data;
	alert(mappings);
}

endpoint.onerror = function (error) {
	alert(error);
}

endpoint.onclose = function (close) {
	alert(close.code);
}