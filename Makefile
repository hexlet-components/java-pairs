test:
	./gradlew test

lint:
	./gradlew checkstyleMain checkstyleTest

report:
	./gradlew jacocoTestReport

check-deps:
	./gradlew dependencyUpdates -Drevision=release
