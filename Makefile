test:
	./gradlew test

lint:
	./gradlew spotlessCheck

lint-fix:
	./gradlew spotlessApply

report:
	./gradlew jacocoTestReport

check-deps:
	./gradlew dependencyUpdates -Drevision=release
