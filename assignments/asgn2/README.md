# Assignment 2

## Overview

A key problem  that often arises in software projects
is integrating software components built for different tiers of the application, such
as a mobile application and its backend supporting cloud services. This assignment
will expose you to the complexities and challenges of building a multi-tiered application
and integrating software components across the tiers.

For this assignment, you will write a requirement spec for a small piece of software.
You will also create a set of evaluation rubrics to assess an implementation of your
spec. Your spec will be assigned to another team in the class and your evaluation rubrics
will be applied by other teams to the implementing team's final product. You will be graded
on the clarity, quality, and other criteria of your spec. You will also be graded on the
quality of your implementation of another team's spec that you will be assigned and how 
well you deal with any requirements ambiguities.

## Assignment Components

__To be completed at Team Meeting 1 (by the end of class)__

__30min__   
   
We will brainstorm ideas for software applications that would be helpful to
other students or residents of Nashville. You are free to propose continued development of
a prior application as an idea. Your application ideas must provide some form of useful
functionality. However, a minimum viable product (MVP) for each application must fit 
within a 3-week development scope for a team of 8-10 of your fellow students. The
development will be conducted over a series of 1-week sprints similar to before.  
The implementing teams can choose to use Java, Javascript, or Swift for the development. 
The application must provide a mobile and/or web-based user interface. 

Brainstorming process:

1. You will have 2min to write down 2 ideas on the list of ideas given to you (write
    your name next to each of your ideas)
2. You will have 1min to add a "+1" next to each idea that you like
3. Pass your list of ideas to the person to your right and repeat 1-2
4. After 5 passes, each person will tally the points of the ideas on their sheet and
   report the top 2 ideas to put on the board. 
5. As a class, we will vote on the 3 ideas that we will implement
6. Each person should write down their preference for each project with their
   first project being their most desirable to work on and the third project being
   the least desirable to work on.

__10min__

Team formation:

1. Each person can choose to be an Android mobile developer, an iOS mobile developer, a 
   web developer, or a back-end developer.
2. Each project will have a group of mobile or web and backend developers allocated to
   it based on staffing needs and preferences expressed.
3. The original creator of each idea will be assigned to that project and will be the
   product owner.

__30min__

1. As a team, you should build a list of user stories for your project.

2. Once your list of user stories is complete, each team should vote and order the 
   stories into a backlog for development. 
   
3. Before the next class, translate your user stories into GitHub markdown and
   place them into your team's repository as a README.md file. You are free to choose 
   whatever repository structure you would like.
   

__To be completed at Team Meeting 2 (by the end of class)__

Note: The Whammy will be roaming the Git repositories for this assignment. You should
prioritize building a well-written and well-tested code base over lots of features.

4. During Team Meeting 2, you must design and commit to a development process. At
   a minimum, you should address the following questions:
   
   - What tools (e.g., IDEs, etc.) will you use?
   - How do you intend to get your entire team bootstrapped on your chosen development
     platform?
   - What will your Git branching strategy be? How will you name, review, and merge
     branches?
   - What frameworks will you use to write tests for each tier of your application? How
     will you ensure that code is tested properly before it makes its way into the main
     development branches and gets touched by the Whammy? What is your policy for
     creating tests...1 JUnit Test Case class per Java class with lots of individual
     test methods?
   - How will you track the completion of user stories and be able to report an overall
     picture of your development progress at each class?
   - How and when will your team communicate? Will you use GroupMe, Slack, HipChat, or
     another platform?
   - How will you reasonably scope and execute on the work so that the development process
     isn't as stressful as last time? 
   - How will you document the usage of your application so that it can be beta tested
     by other students at the end of each build cycle?
   - How are you going to balance the reality of "college software development" with the 
     requirement to build high quality software on-time for this project? What will your
     team members commit to to ensure consistent, incremental, and conscientious development
     and engagement from each team member?
   - What are the riskiest elements of this project? What assumptions is your team making
     that will have the most impact if they are incorrect? How will you approach the
     project in a way that mitigates the risk of these elements and assumptions?
     
5. As you discuss the questions above, you should document your development plans and
   ideas in your project's GitHub markdown README.md file where you have your user 
   stories. 
   
6. Your team must decide upon the HTTP API that is going to be used to communicate between
   your mobile or web tier and your backend. You should write this API down under an
   HTTP API section of your README file and use a format, such as:
   
   __POST__ /foo
   
   Parameters:
      - A JSON request body representing a foo object. Example: {"id":1, "foo":"asdf"}
      
   Response:
      - 201 if successful with an empty body
      - 400 if there is an error in the request or request JSON
      - 500 if there is a server error
      
   You should walk through each user story and try to make sure that the API that you
   describe will support each of them. Before the next class, your team must document
   your API using Swagger. The Swagger api documentation should be placed into your
   repo under an "api-docs" folder. You should be prepared to demo loading your api
   into the Swagger UI at the start of the next class (http://petstore.swagger.wordnik.com/).   
   
7. Your team must implement a suite of JUnit tests to perform integration testing on the
    API. Your tests should thoroughly cover every API endpoint. You are free to reuse
    the infrastructure that is part of the mobilecloud template project to build your
    backend and setup these tests. If you use this project, you should consider integrating
    the SpringMVC Swagger library to automatically generate your Swagger documentation
    based on your Spring application (https://github.com/martypitt/swagger-springmvc).

__To be completed before Team Meeting 5 (start now)__

9. Implement the your team's spec. You are free to use any opensource libraries that you 
   would like.  
   
   You are free to test as much or as little as you want. However, the Whammy will be
   running wild during the development process and has new tricks up his sleeve...
     
__To be completed at Team Meeting 3 (by the end of class)__

11. During the Team Meeting 3 class, your team must jointly resolve any issues in the
   development process. Please use the time in this class effectively to see where your
   team is, fix issues that people are having with the development platform, and to
   get everyone on the same page.
   
12. Your team must demo your API test suite and Swagger API documentation.

__To be completed at Team Meeting 4 (by the end of class)__

13. During the "code review" class, your team must code review another team's
    project. Each issue or improvement that you identify should be submitted as
    a Git issue in the other team's repo.

__To be completed at Team Meeting 5__

14. Your sprint must be complete before this class. 

15. During Team Meeting 5, we will have sprint retrospective and discuss what can 
    be improved for the next development cycle.
    
## Assignment Grading

The spec, code artifacts that you produce, peer assessments, and class participation
will be used to determine each student's grade. Each team member
may or may not receive the same grade. The grades for each student will be roughly
broken down as follows:

0. Development process quality as demonstrated by starting early / contributing
   consistently and responding appropriately to issues - 20%
1. Specification / Evaluation Quality - 25%
2. Implementation / Project Management Quality - 55%

Individual contributions will heavily influence each team member's grade. Team members
that do not demonstrably contribute or allow other team members to do the bulk of the
work will have commensurate points deducted from their assignment grade. All assignment
components will be scaled based on the overall contribution of each individual, regardless
of the success or failure of the team (e.g., team members that do not contribute even 
when the implementation, etc. is highly successful will not receive satisfactory grades).
