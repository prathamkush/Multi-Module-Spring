## Multi-module maven project
    ->  Make project as maven-POM

    ->  Add different modules to the root project by creating new project -> module -> New Module

    ->  Make it under the same GroupId and BuildSystem(maven) 
        & change the ArtifactId to name of the new module you want to give.

    ->  Make the number of required modules

    ->  Add <packaging> as jar to every module for easy maintainability.

    ->  To access classes of module A in B, inject module A as a dependency in module B,
        by adding dependency in pom.xml of module B. This injection follows transitivity.
    
    ->  Under any module, create @SpringBootApplicatin class and use @ComponentScan
        @EntityScan, @EnableJpaRepositories or similar annotations (with basepackages = "com.packageToLook.*") 
        for accessing components and entities outside this (@SpringBootApplication) module or package.
        Mention the required appliction.properties acc. to database and server under resources package
        of the same module
    
    ->  Run the @SpringBootApplication class.