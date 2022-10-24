# ArcaniumLogger

### Arcanium is a good Java logger, like Log4J
Example of arcanium:

```java
Logger logger = LogManager.createLogger("Arcanium");

public static void main(String[] args) {
	logger.info("Info test");
	logger.warn("Warn test");
	logger.debug("Debug test");
	logger.error("Error test");
}
```

The result should be:
![immagine](https://user-images.githubusercontent.com/93542339/197585786-f2ae3099-6d02-40b0-b1ae-99831c9ef084.png)

if you change `Logger logger = LogManager.createLogger("Arcanium");` with `Logger logger = LogManager.createLogger("My program");`

The result should be:
![immagine](https://user-images.githubusercontent.com/93542339/197586020-4d62e7a1-559d-43e0-b974-62df76a2122c.png)
