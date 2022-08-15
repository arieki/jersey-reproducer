## Description

This is simple API that reproducer issue https://github.com/eclipse-ee4j/jersey/issues/5125.

The issue found running against Payara 6 version [6.2022.1.Alpha4.RC2](https://github.com/payara/Payara/tree/payara-server-6.2022.1.Alpha4.RC2)

War file included to make thing a bit easier

### Endpoint

`/api/entity`


## Assertion

Here is the expectation of the response

Expected:
```json
{"name": "this is simple entity"}
```

Actual:
```json
{}
```