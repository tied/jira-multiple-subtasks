---
layout: default
title: Changelog
---

This changelog helps developers and users to keep track of new features, fixes and improvements for Multiple Subtasks for Jira.
Click on the version in the following list to see all changes since the previous version.

* Table of Contents
{:toc}

### [Unreleased]

* feat: prepare application for Data Center compatibility tests
* feat: allow to close the dialog even with missing or invalid license
* chore: adjust dependency versions to versions defined by Jira 9.3.0
* docs: update Marketplace URL in online documentation
* docs: improve developer documentation for all Java classes

### [22.10.0] - 2022-10-09

**Multiple Subtasks for Jira is born!**

* chore: initial commit
* docs: add changelog to future online documentation
* chore: remove unused auto-generated classes
* feat: create first draft for the create subtask popup dialog
* chore: remove duplicate junit dependency and use latest amps version
* feat: create subtasks with summary for every line of the provided string
* chore: add markers in code where further implementation is required
* chore: cleanup code and remove debug logging from action
* refactor: format service class according to code style
* feat: render button to start dialog under default create subtask dialog
* feat: improve internationalization and layout in create dialog
* feat: do only render button for issues that are no subtasks
* chore: organize imports and remove unused imports
* feat: only render button for issues in projects with subtasks configured
* chore: rename service implementation for subtasks creation
* feat: separate syntax parsing and subtask creation (#21)
* feat: use google splitter to interpret textual subtask representation (#22)
* docs: add documentation to format exception
* feat: catch errors during task creation and display error details
* feat: inherit priority for new subtask from parent issue
* docs: add documentation to subtask request
* feat: improve parsing and accept colons in subtask summary
* chore: update supported Jira versions and dependency versions
* chore: update Maven profiles using template from Scrum Poker for Jira
* chore: replace deprecated JUnit assertions by Hamcrest assertions
* feat: use provided priority or else fall back to priority of parent issue
* i18n: change label for multiple subtasks dialog
* feat: display input string and potential input errors after submit
* feat: support explicit input for issue type of the created subtasks
* chore: remove link to Travis CI
* feat: support explicit input for assignee of the created subtasks
* feat: support explicit input for reporter of the created subtasks
* feat: support explicit input for description of the created subtasks
* feat: improve dialog layout
* feat: allow to reset the form after successfully creating subtasks
* chore: cleanup versioning and readme
* feat: hints only display when input element is visible
* feat: correctly style close button on dialog
* chore: extract constants in code
* docs: add documentation of currently supported syntax
* feat: support explicit input for labels of the created subtasks
* feat: support explicit input for components of the created subtasks
* feat: components can be inherited from parent issue
* feat: labels can be inherited from parent issue
* feat: description can be a multi-line description
* feat: assign subtask to current user or inherit from parent issue
* test: add tests for condition checks to render dialog
* feat: reject unknown attributes for subtasks
* feat: improve compatibility with Jira 9.0.0
* feat: include xsrf check for form submission (#31)
* feat: ensure compatibility with Jira 8.x and 9.x
* test: use GitHub actions for continuous integration
* docs: add table of content to syntax page
* feat: enable licensing for plugin
* docs: provide initial version of the documentation pages
* docs: update readme and reference documentation
* feat: allow managing and using user defined subtask templates
* feat: provide app logo (#4)
* docs: add documentation to manage subtasks
* feat: support Jira 9.3.0 and enterprise versions 8.20.13 and 8.13.26
* feat: reload page after subtasks are created and dialog is closed (#30)
* feat: check for valid license in subtask dialog (#6)
* feat: restrict the maximum length of a template to 4000 characters

[Unreleased]: https://github.com/codescape/jira-multiple-subtasks/compare/22.10.0...HEAD
[22.10.0]: https://github.com/codescape/jira-multiple-subtasks/tree/22.10.0
