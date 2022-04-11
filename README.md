# api-quotes-wizeline
### Environment
```
Java 11
```
this project has two endpoints 

```
http://localhost:8080/greeting
```
### response
Hello, World.

## The second endpoint 
is an endpoint that return a quote for every day

```
http://localhost:8080/quote
```

### response

```
{
    "quote": {
        "text": "Incredible change happens in your life when you decide to take control of what you do have power over instead of craving control over what you don't.",
        "author": "Steve Maraboli"
    }
}
```

this change every day.


this project use api https://zenquotes.io/api/today