# xp4dev-self-healing

Com a app em execução:

## Actuator
```
$ curl -X GET http://localhost:8080/actuator | jq .

{
  "_links": {
    "self": {
      "href": "http://localhost:8080/actuator",
      "templated": false
    },
    "health-path": {
      "href": "http://localhost:8080/actuator/health/{*path}",
      "templated": true
    },
    "health": {
      "href": "http://localhost:8080/actuator/health",
      "templated": false
    },
    "shutdown": {
      "href": "http://localhost:8080/actuator/shutdown",
      "templated": false
    }
  }
}
```

## Shutdown
```
$ curl -X POST http://localhost:8080/actuator/shutdown | jq .

{
  "message": "Shutting down, bye..."
}
```

## Probes
```
$ curl -X GET http://localhost:8080/actuator/health | jq .

{
  "status": "UP",
  "components": {
    "diskSpace": {
      "status": "UP",
      "details": {
        "total": 250685575168,
        "free": 69531279360,
        "threshold": 10485760,
        "path": "/Users/italovendrameto/desenv/work/github/xp4dev-self-healing/.",
        "exists": true
      }
    },
    "livenessState": {
      "status": "UP"
    },
    "ping": {
      "status": "UP"
    },
    "readinessState": {
      "status": "UP"
    }
  }
}
```
```
$ curl -X GET http://localhost:8080/actuator/health/livenessState | jq .

{
  "status": "UP"
}
```
```
curl -X GET http://localhost:8080/actuator/health/readinessState | jq .

{
  "status": "UP"
}
```
