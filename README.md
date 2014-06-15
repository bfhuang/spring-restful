This is a small demo of spring restful, which contains three modules. The jaxb module is used to
generate the source code from xsd files. The restful module is use to provide the service to
get person info. The person client module is to call the restful service by webServiceTemplate

How to use this project

1.Clone this project
2.Go to the root project, and run 'gradle idea'(If you did not use Intellij IDE, please change the
    spring-web-service/build.gradle.  Change the "apply plugin: 'idea'" to "apply plugin: 'eclipse'"
    .And the run 'gradle eclipse')
3.Run 'gradle :jaxb:generateSource' to generate java source code from xsd files
4.Run 'gradle :restful:jettyRun' to start the service
5.Run the main method in the personClient module to call the restful service by webServiceTemplat