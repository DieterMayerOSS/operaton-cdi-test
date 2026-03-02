# operaton CDI test



## How to use this test

Clone the repo.

Build with mvn clean install.

Deploy to WildFly 38.

Test 1: Use the main branch (no structure XML) -> Deployment fails.

Test 2: Enable jboss-deployment-structure.xml -> Deployment succeeds, "BINGO!" message appears at /check.
