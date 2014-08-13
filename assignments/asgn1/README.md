# Assignment 1

## Overview

Writing clear requirements and dealing with ambiguous requirements is a challenging
component of software engineering. A key problem that often arises in software projects
is that the requirements for the project are not communicated clearly or that the 
development team makes incorrect assumptions about the requirements. This assignment
will teach you to both write a clear requirement description for a piece of software
and to ask questions when the requirements are ambiguous.

For this assignment, you will be writing a requirement spec for a small piece of software.
You will also be creating a set of evaluation rubrics to assess an implementation of your
spec. Your spec will be assigned to another team in the class and your evaluation rubrics
will be applied by other teams to the implementing team's final product. You will be graded
on the clarity, quality, and other criteria of your spec. You will also be graded on the
quality of your implementation of the spec that you are assigned and how well you deal
with any requirements ambiguities.

## Assignment Components

0. You will be assigned to a team. Your team should create an asgnX folder (where X is this
   assignment number) in its GitHub repo and have the following folders within asgnX:
   - /asgnX/assignment_spec
   - /asgnX/assigned_project
   - /asgnX/assigned_project/spec
   - /asgnX/assigned_project/code
   - /asgnX/reviewed_projects/
   
1. Your team should choose an idea for a software application that uses one or more datasets
   from https://data.nashville.gov/. Your application must provide some form of useful
   functionality. However, the application must fit within a 1-week development scope for
   a team of 4-5 of your fellow students. You will be graded on how well you scope the
   application.

2. Write a requirements specification for your chosen application. The requirements must 
   include a 2-3 paragraph overview description (e.g., "An application that will automatically
   return three random things to do this weekend based on park permits") and include a
   detailed set of user stories. For each user story, provide an expected time to complete
   it in hours (e.g., 0.5 hours). Your initial draft of the specification should be 
   completed by the end of the time allotted and checked into your GitHub repository 
   under the /asgnX/assignment_spec folder as spec.pdf. Your specification should
   include the names of each author (only include people present in class when you created
   the specification). The following are helpful resources on writing good user stories:
   - https://help.rallydev.com/writing-great-user-story
   - http://www.mountaingoatsoftware.com/agile/user-stories
   
3. Write a set of evaluation rubrics for assessing the quality of the implementation 
   produced for your assignment. Each rubric should provide a simple test plan for
   determining if one or more of the user stories are properly satisfied. You should
   commit the evaluation rubric under /asgnX/assignment_spec/evaluation.pdf within the
   time allotted. 
   - (Z points) - User Story - Description of how to apply rubric 
   
   Examples:
   - (10 points) - User Story #23, As a Vanderbilt Student, I would like to see a
     random list of things to do around Nashville so that I can do something new each
     weekend - When the application is 
     invoked from the command line in 10 repeated trials, the output should not 
     include the same suggested things to do each time. The code should be inspected
     to ensure that a random number is being used to drive the selection of things
     to do. 
   - (10 points) - User Story #43, As a Vanderbilt Student, I would like to be able to
     download  a new list of Nashville events from data.nashville.gov so that I don't run 
     out of things to do or miss newly announced events - The user should be able to export,
     the list of special event permits from https://data.nashville.gov/Environment/Parks-Special-Events-Permits-Data-2014-/vygj-v677
     and provide the exported file as a parameter to the application. When invoked the
     application should choose events from this list.

4. During the "client negotiation" class, you must review two other team's specs and
   evaluation rubrics. You should fill out a specification evaluation for each spec
   that your team reviews: https://docs.google.com/forms/d/1GeNlEvDGzIX2vTAnokMDuWJg7XZNXZQHMjQ-b7zx764/viewform?usp=send_form
     
5. After you have been assigned another team's spec to implement, download their spec
   and evaluation pdfs from their GitHub repo and place them into your repo's 
   /asgnX/assigned_project/spec folder. 
   
6. You are free to clarify any requirements with the other team. During the "client negotiation"
   class (and ONLY during this class), you are free to request requirement or scope
   changes to the spec. You must get at least two other groups that reviewed the spec 
   -- not the group that created the spec -- to agree that your requested changes are
   appropriate and to submit the requirements change justification form with all fields
   completed and at least a 1-paragraph justification:
   https://docs.google.com/forms/d/1XYvo4XReuxM_GS7NvI03YIiUGzOK7rca_2emZlCrHOI/viewform?usp=send_form
   If the form is not completed correctly by at least 2 other teams (e.g., submissions with missing 1-paragraph
   justifications do not count), the requirement change will not be allowed.

7. If the spec that you created has any requirement changes accepted, you must modify your
   spec to account for them, check the new spec into your repository, and notify the 
   implementing team that the updated spec is available. You must CC the instructor and
   the TA when you send the notification email.

8. Implement the other team's spec and commit the code beneath the /asgnX/assigned_project/code
   folder. You are free to use any opensource libraries that you would like.

9. During the "implementation evaluation" class, your team must evaluate the implementations
   of three other teams on a spec that you did not create. For each evaluation, you should
   obtain the spec and evaluation criteria from GitHub, review the implementation, and
   then fill out the implementation evaluation form: 
   https://docs.google.com/forms/d/1Wq-6JWAz8SdTZQ82zUfMPJxSCTXErh4quR8GR36HfOk/viewform?usp=send_form    

10. During the "teamwork and contribution evaluation" class, your team must evaluate the
   teamwork and individual contributions of three other teams on both their spec and implementation.
   For each team, you must fill out the contribution assessment form provided to you.
   
11. During the "teamwork and contribution evaluation" class, you must evaluate your own
    personal performance on the spec and implementation using the form provided to you.
    
## Assignment Grading

The spec, code artifacts that you produce, peer assessments, class participation, and 
contribution assessments will be used to determine each student's grade. Each team member
may or may not receive the same grade. The grades for each student will be roughly
broken down as follows:

1. Specification / Evaluation Quality - 35%
2. Quality of Feedback Provided to Other Teams - 30%
3. Implementation Quality - 35%

Individual contributions will heavily influence each team member's grade. Team members
that do not demonstrably contribute or allow other team members to do the bulk of the
work will have commensurate points deducted from their assignment grade.

All assignments must be completed to pass the course. If an assignment is skipped, it
will result in an overall failing grade for the course -- regardless of the performance
on other assignments. 