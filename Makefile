test:
	./mvnw surefire:test

lint:
	./mvnw checkstyle:check

update:
	./mvnw versions:display-property-updates versions:update-properties

build:
	./mvnw clean package

install:
	./mvnw clean install
