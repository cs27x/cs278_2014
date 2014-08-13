# Assignment 1 Example

## Overview

Every weekend in Nashville, 100,000s of people get bored because they don't know what to
do. Nashville, however, has free events in its public parks every weekend that are listed
on https://data.nashville.gov/Environment/Parks-Special-Events-Permits-Data-2014-/vygj-v677.
Most people don't bother looking through the list of special event park permits and never
know about these events.

For this assignment, you will create and application to help all of these bored people
find something to do. Your application will automatically download the list of special
event permits from data.nashville.gov's JSON feed: http://data.nashville.gov/resource/vygj-v677.json
and then display 3 random things. 

## User Stories

0. As a resident of Nashville, I would like to be able to find 3 events in Nashville
   parks and information about them so that I don't get bored.
   
1. As a resident of Nashville, I would like to be able to ask for an additional 3
   random things to do if I don't like the first list of things so that I can find
   something that I like.
   
2. As someone with occasional engagements on the weekend, I would like to be able to
   find 3 random events on a specific date so that I can find things to do on a day
   that I have free time.
   
3. As someone who hates looking for a place to park, I would like to be able to only
   see 3 random events that will be easy to park at so I don't spend a lot of time
   driving around looking for parking. (This might be a user story that the development
   team asks for clarification on)
   
4. As someone who is into exercise, I would like to be able to see 3 random events that 
   involve some form of physical activity so that I can go to the event in place of my
   daily workout. (This might be a user story that the development team asks for 
   clarification on)
   
5. As an inexperienced computer user, I would like to be able to go to a website that
   shows me 3 random things to do on a specific date so that I don't have to download,
   install, and run any software. (This might be a story that the development team 
   negotiates based on the 1-week time constraint and their expertise)
   
6. As trip planner, I would like to be able to provide a series of dates and time blocks and
   receive a possible itinerary listing 3 random things that could be done in each
   day / time block so that I can create itineraries for Nashville tourists. 
   (This might be a story that the development team both clarifies and 
   negotiates based on the 1-week time constraint and their expertise)
   
7. As a student without a car, I would like to be able to only see events that are taking
   place at parks that are accessible via the bus system so that I can actually get to
   the event. 
   (This might be a story that the development team negotiates based on the 1-week time 
   constraint and their expertise)
   
8. As someone with kids, I would like to be able to only see events that are at parks that
   have playgrounds so that my kids don't get bored and need to go home.
   
9. As someone with kids, I would like to be able to only see events that are at parks that
   have restrooms so that I don't have to leave to take my kids to the bathroom.
   
10. As someone with a dog, I would like to be able to only see events that are at parks that
   have dog parks so that I can take my dog with me.
   
## Possibly Helpful Technical Information

1. If you are unfamiliar with the Javascript Object Notation format that data.nashville.gov
   can provide data in, you can read this tutorial:
   http://www.copterlabs.com/blog/json-what-it-is-how-it-works-how-to-use-it/

2. These datasets may be helpful for implementing this application:
  - A list of the special event permits for Nashville parks: http://data.nashville.gov/resource/vygj-v677.json
  - A list of the public parks in Nashville and their facilities: http://data.nashville.gov/resource/n37w-5mq8.json
  - A list of the bus stops in Nashville http://data.nashville.gov/resource/869d-gy6r.json 
  
3. If you include the Apache Commons IOUtils in your project (http://commons.apache.org/proper/commons-io/), 
   you can download data from a URL as follows:
   
```java
URL url = new URL("http://data.nashville.gov/resource/n37w-5mq8.json");
String contents = IOUtils.toString(url.openStream());
```

4. You can use the Jackson library to convert JSON Strings into Java Objects as 
   described in their 1-minute tutorial: https://github.com/FasterXML/jackson-databind/
   



