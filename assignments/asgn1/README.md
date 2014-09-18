# Assignment 1

## Overview

A key problem  that often arises in software projects
is that the requirements for the project are not communicated clearly or that the 
development team makes incorrect assumptions about the requirements. This assignment
will teach you to both write a clear requirement description for a piece of software
and to ask questions when the requirements are ambiguous.

For this assignment, you will write a requirement spec for a small piece of software.
You will also create a set of evaluation rubrics to assess an implementation of your
spec. Your spec will be assigned to another team in the class and your evaluation rubrics
will be applied by other teams to the implementing team's final product. You will be graded
on the clarity, quality, and other criteria of your spec. You will also be graded on the
quality of your implementation of another team's spec that you will be assigned and how 
well you deal with any requirements ambiguities.

## Assignment Components

__To be completed at Team Meeting 1 (by the end of class)__

0. You will be assigned to a team. Your team should create an asgnX folder (where X is this
   assignment number) in its GitHub repo and have the following folders within asgnX:
   - /asgnX/assignment_spec
   - /asgnX/assigned_project
   - /asgnX/assigned_project/spec
   - /asgnX/assigned_project/code
   - /asgnX/reviewed_projects/
   
1. Your team should choose an idea for a software application that would be helpful to
   other students or residents of Nashville. I encourage you to use one or more datasets
   from https://data.nashville.gov/. Your application must provide some form of useful
   functionality. However, a minimum viable product (MVP) for the application must fit 
   within a 1-week development scope for a team of 4-5 of your fellow students. You will 
   be graded on how well you scope the application. All applications must be written in 
   Java. It will be possible to propose extensions to the MVP in future development 
   cycles but your spec __must lead to a complete MVP within 1-week__.

   After you have your application idea ready and a basic list of the MVP functionality, 
   you must present your application to one of the instructors before proceeding.

2. Write a requirements specification in GitHub markdown for your chosen application. The requirements must 
   include a 2-3 paragraph overview description (e.g., "An application that will automatically
   return three random things to do this weekend based on park permits") and include a
   detailed set of user stories. For each user story, provide an expected time to complete
   it in hours (e.g., 0.5 hours). Your initial draft of the specification should be 
   completed by the end of the time allotted and checked into your GitHub repository 
   under the /asgnX/assignment_spec folder as spec.md. Your specification should
   include the names of each author (only include people present in class when you created
   the specification). The following are helpful resources on writing good user stories:
   - https://help.rallydev.com/writing-great-user-story
   - http://www.mountaingoatsoftware.com/agile/user-stories
   
   You are free to include whatever information you deem helpful in your specification,
   including links to libraries that could be useful, documentation on key concepts,
   tutorials, etc.
   
   An example of a complete specification is available from: 
   https://github.com/cs27x/cs278_2014/blob/master/assignments/asgn1/Example.md

   After you create your list of user stories, you must present your user stories to one 
   of the instructors before proceeding.
   
3. Write a set of evaluation rubrics for assessing the quality of the implementation 
   produced for your assignment. Each rubric should provide a simple test plan for
   determining if one or more of the user stories are properly satisfied. You should
   include the evaluation rubric in your spec. The rubrics should use proper GitHub 
   markdown formatting.
   
   - (Z points) - User Story - Description of how to apply rubric 
   
    For examples, see: 
    https://github.com/cs27x/cs278_2014/blob/master/assignments/asgn1/Example.md
	
	You are also free to add other criteria to the grading, such as the use of consistent
	formatting, naming, Java best practices, etc. However, you must define these things
	in a way that can be evaluated.
	
	An example of a complete evaluation rubric is available from: 
    https://github.com/cs27x/cs278_2014/blob/master/assignments/asgn1/Example.md

   After you create your evaluation rubrics, you must present your rubrics to one 
   of the instructors to receive credit for the spec.

__To be completed at Team Meeting 2 (by the end of class)__

4. During Team Meeting 2, you must review every other team's spec and
   evaluation rubrics. You should fill out a specification evaluation for each spec
   that your team reviews: https://docs.google.com/forms/d/1GeNlEvDGzIX2vTAnokMDuWJg7XZNXZQHMjQ-b7zx764/viewform?usp=send_form
   
   You have 30min (or 6min per spec) to complete the two reviews. 
     
5. After you have been assigned another team's spec to implement, download their spec
   and evaluation pdfs from their GitHub repo and place them into your repo's 
   /asgnX/assigned_project/spec folder. 
   
   You have 45min to review the spec that your team will be implementing, clarify any
   descriptions with the other team, request requirement changes, and begin planning
   your development approach/workload. 
   
6. You must select a team leader for the assignment. The team leader is not allowed to
   contribute any code and must not have been a team leader on a previous assignment.
   The team leader is responsible for the following:
   - The team leader has ultimate authority to decide any questions from the other team
     implementing your spec about how a feature should/should not work
   - The team leader is responsible for the forward progress and schedule of the team
     and will be graded on their effectiveness in ensuring that the team delivers its
     specifications and implementation on time
   - The team leader is responsible for encouraging fairness in the development workloads
   - The team leader must keep daily track of the progress and the issues of the project
     by filling out the Daily Project Progress form __each day__:
     https://docs.google.com/forms/d/1tKmQ67V2NgqYTtYwqjqxm427MgiPQOu0bJFFTg8FHwU/viewform?usp=send_form
   - The team leader must proactively track all issues submitted on GitHub (discussed
     below) and track how they are handled
   - If an issue is not handled and the team leader cannot devise an appropriate workaround,
     the team leader is responsible for escalating the issue to the instructor
   - The team leader is responsible for ensuring that key questions regarding the specification
     receive answers from the team leader of the team that produced the specification
   - The team leader is responsible for ensuring that the implementation is meeting the
     expectations of the team that produced the specification
   - The team leader is responsible for preparing and presenting a summary of the development
     process at the end of the assignment
   
7. You are free to clarify any requirements with the other team. During Team Meeting 2
   class (and ONLY during this class), you are free to request requirement or scope
   changes to the spec. You must get at least two other groups that reviewed the spec 
   -- not the group that created the spec -- to agree that your requested changes are
   appropriate and to get these teams to submit the requirements change justification form with all fields
   completed and at least a 1-paragraph justification:
   https://docs.google.com/forms/d/1XYvo4XReuxM_GS7NvI03YIiUGzOK7rca_2emZlCrHOI/viewform?usp=send_form
   If the form is not completed correctly by at least 2 other teams by the end of class
   (e.g., submissions with missing 1-paragraph justifications do not count), the requirement 
   change will not be allowed.

8. If the spec that you created has any requirement changes accepted, you must modify your
   spec to account for them, check the new spec into your repository, and notify the 
   implementing team that the updated spec is available. You must CC the instructor and
   the TA when you send the notification email. The changes must be completed, committed,
   and sent to the development team within 24hrs.

__To be completed before Team Meeting 4 (start as soon as your get your specification)__

9. Implement the other team's spec and commit the code beneath the /asgnX/assigned_project/code
   folder. You are free to use any opensource libraries that you would like.  
   
   You must provide a JUnit TestCase class for __each__ class in your implementation. The
   only exception to this rule is classes that are solely data modeling classes and consist
   entirely of a series of member variables and getters/setters with __no other logic__.
   If you override the equals() method and have custom logic, that is sufficient code to
   require producing a test. In general, every class in your implementation must have an
   associated JUnit TestCase class with test methods that cover the execution and possible
   usage of every public method/constructor in the class.  
   
   All development must occur in feature branches. The master branch must compile and pass
   all tests at all times. The instructor will periodically checkout the master branches
   for each project and check if they meet this requirement. Each time a master branch does not
   compile or fails at least one test, 5pts will be deducted from the overall grade for
   the team. You are strongly encouraged to use a "dev" branch that feature branches are
   merged into and a "master" branch that you only merge code into when you are 100% sure
   that it works. At the end of the development cycle, only code in the master branch will
   be graded.
   
   All projects must use Gradle as their build system. Each project should be importable
   into Eclipse as a Gradle project and only use dependencies that are specified in the
   build.gradle file. If you are developing for Android, you should use Android Studio,
   which is based on Gradle.
   
   __Graduate Students__ must use a tool, such as JaCoCo, to produce an automated code
   coverage report of their team's project. If there are multiple graduate students on a 
   team, each student must generate a separate code coverage report. These reports should
   be saved as PDFs and checked into /asgnX/assigned_project/coverage/.
     
10. When team members discover issues with other team members' code (or critical code that
    is needed has not been committed), a team member should submit a new issue in the
    team's GitHub repository and the issue should be assigned to the team member who
    is responsible for that code. 10% of each team member's grade will be based on how
    timely they respond to issues that are assigned to them and resolve the issue through
    code commits or demonstrate through a positive and logical discussion that the issue 
    is not a problem and should be closed. No derogative or arrogant issue descriptions
    or comments should be posted (these types of comments will impact grading).
    
    The team leader is responsible for ensuring that issues are resolved.
    If a team member's development becomes blocked for more than 48hrs, they have
    submitted an issue regarding the blocking problem, and the team member responsible for
    the change has not responded or has not provided the promised code changes, the team
    leader should notify the instructor and provide a link to the issue that has not been 
    fixed. The instructor will provide the appropriate remediation steps and list any 
    grading adjustments that will be made. However, the team leader must make a good
    faith effort to resolve the issue, adapt workloads, change design, or otherwise 
    resolve the issue without escalation before notifying the instructor.
    
    For example, assume that one team member reports an issue that another team member's
    code does not have a trivial to implement method (e.g., getter/setter) needed by 
    another team member's code. A good faith effort to resolve this issue would be to
    simply suggest that the reporting team member add the required method and close the
    issue. 
    
    If the issue is more significant, such as missing functionality requiring an hour or
    more of work, the team leader should first attempt to get the responsible team member
    to prioritize and complete the fixes to resolve the issue. If the team member does not
    respond or commit the fixes in a timely manner, the team leader could document the
    failure to resolve the issue and simply ask another team member if they can help complete it. The
    documented issue will be used by the instructor to make grading adjustments.
    
    If the issue is critical and represents a large component of the project and threatens
    the success of the overall team, the team leader should repeatedly attempt to have the
    responsible party resolve the issue. If the issue is not resolved in a timely fashion,
    the team leader should immediately report the problem to the instructor who will provide
    a course of action and make necessary grading adjustments.
     
__To be completed at Team Meeting 3 (by the end of class)__

11. During the Team Meeting 3 class, your team must jointly resolve any issues in the
   development process. You must also review the current progress of one other team that
   you will be assigned and fill in the incremental progress report on that team: 
   https://docs.google.com/forms/d/1XhtF5rPNZKXsYkk51hCKxYDBH1Ru3rJWBLuFlJOUSNY/viewform?usp=send_form

__To be completed at Team Meeting 4 (by the end of class)__

12. During the "implementation evaluation" class, your team must evaluate the implementations
   of three other teams on a spec that you did not create. For each evaluation, you should
   obtain the spec and evaluation criteria from GitHub, review the implementation, and
   then fill out the implementation evaluation form: 
   https://docs.google.com/forms/d/1Wq-6JWAz8SdTZQ82zUfMPJxSCTXErh4quR8GR36HfOk/viewform?usp=send_form    

13. For each team, your team must evaluate the
   teamwork and individual contributions of the team members on both their spec and implementation.
   For each team member, you must fill out the contribution assessment form provided to you.
   
14. During the "teamwork and contribution evaluation" class, you must evaluate your own
    personal performance on the spec and implementation using the form provided to you.
    
## Assignment Grading

The spec, code artifacts that you produce, peer assessments, class participation, and 
contribution assessments will be used to determine each student's grade. Each team member
may or may not receive the same grade. The grades for each student will be roughly
broken down as follows:

0. Development process quality as demonstrated by starting early / contributing
   consistently and responding appropriately to issues in GitHub - 20%
1. Specification / Evaluation Quality - 25%
2. Quality of Feedback Provided to Other Teams - 30%
3. Implementation / Project Management Quality - 25%

Individual contributions will heavily influence each team member's grade. Team members
that do not demonstrably contribute or allow other team members to do the bulk of the
work will have commensurate points deducted from their assignment grade. All assignment
components will be scaled based on the overall contribution of each individual, regardless
of the success or failure of the team (e.g., team members that do not contribute even 
when the implementation, etc. is highly successful will not receive satisfactory grades).

All assignment components must be turned in on time. There will be a 20% penalty for each
hour that a group is late in turning in an assignment component.
