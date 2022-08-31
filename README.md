# alert-bot
AlertBot is a small personal learning project to experiment and learn various technologies.

Right now the concept is still quite vague, but I have a few ideas to start with, listed below.


## General Concept

Alert-Bot is going to be a simple Discord bot that focuses on providing "alerts" or more generally, messaging, from the bot, using a simple REST API.
I might expand functionality more, but the idea is to easily integrate Discord as a channel for message-passing out of a system. You could for example use it to keep a high-level log of events, or to notify a user in a timely manner when needed, or anything else really.


## Microservice architecture

It's a bit overkill, but as an opportunity to learn I'm going to be deploying this as a service (perhaps in a personal Kubernetes cluster), and I'll try to implement CI/CD as well.


## Other stuff

- I want to use Spring Boot for this project, and will likely integrate several projects from the Spring ecosystem.
- I wrote a discord bot several years back using Javacord that worked decently, so I'm re-using Javacord.
