push-image:
	docker build . -t lucasnicolas/log-output
	docker push lucasnicolas/log-output

run-image:
	docker build . -t lucasnicolas/log-output
	docker container run -p 9999:9999 lucasnicolas/log-output