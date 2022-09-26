# 4th Semester Android Project. SU Calculator.
An App for Danish students. The SU Calculator is to help keep track of a student earnings so that they can earn as much as possible without suffering from paying their SU back. Paying SU back could occur if a student had made more money than The Danish students' Grants and Loans Scheme permits. The app is to do the calculations and shows how much the student may still earn until the end of the fiscal year.

## Functional Requirements / User Stories
### High-priority
- [ ] As a student, I want to be able to see the list of The Danish students' Grants and Loans Scheme principles and the fundamental formulas used in the app so that I can assure myself that all the presented results reflect the currently applicable Danish rules. 
- [ ] As a student, I want to be able to set the number of months where I am taking my education and their monthly allowance, gap-semester months, paid internship or inactive in studies, months before the education started / after it is finished so that the app can perform the necessary calculations[^1].
- [ ] As a student, I want to be able to add a paycheck record to the system so that the app can perform the necessary calculations[^1]. The following fields must be included: a period that is covered by the paycheck ("from" and "to" date), income before tax deduction (Brutto), amount of taxed feriepenge (feriepenge may or may not be taxed immediately along with the paycheck - depending on an employer's politics), deducted AM-Bidrag (8%) of both income and feriepenge.
- [ ] As a student, I want to be presented with the results of the necessary calculations[^1], additionally divided into monthly and weekly, so that I know how much money I can make before exceeding my allowance.
- [ ] As a student, I want to be able to create an account in the system and export all ma data, so that there will be a backup in the cloud in case where I lose my device or would like to import the data into another device.[^3]
### Medium-priority
- [ ] As a student I want to be able to quickly convert the result calculations[^1] into another currency with a currancy converter. ([^2]
- [ ] As a student, I want to be able to enter my hourly wage(s) and expected workload (in hours or days) per week or month and be presented with the estimation of how much I may still earn in the fiscal year[^1] before I exceed the allowance so that I can make a precise financial plan. The hourly wage shall take into consideration the following additional income that comes along with it: feriepenge, fritvalgskonto, and other bonuses that are considered as income by SKAT
### Low-priority
- [ ] As a student, I want to be able to enter a rate of supplement for parents and the number of my children under 18 years old so that it is included in the calculations[^1].
- [ ] As a student, I want to be able to enter a rate of deduction for handicaps and the number of months where I get a handicap supplement so that it is included in the calculations[^1].



[^1]: Necessary calculations show how much the student may still earn until the end of the fiscal year.
[^2]: This feature could require ussage of w web service, e.g. REST, and would cover one of the android course's requirements.
[^3]: This feature will help to cover the course's requirement of using firebase, thought it will require involving GDPR rules being considered.

The currently applicable rules can be found on: [https://www.su.dk/su/su-betingelser/saa-meget-maa-du-tjene-fribeloeb/]
