def call(Map config){

    if(config.type == "maven"){
        mavenPipeline();
    } else {
        pipeline {
        agent any
        stages {
            stage("Unknown Pipeline") {
                steps {
                    script {
                        echo("unsported pipeline")
                    }
                }
            }
        }
    }
    }
}