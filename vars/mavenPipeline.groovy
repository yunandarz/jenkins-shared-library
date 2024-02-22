def call() {
    pipeline {
        agent any
        stages {
            stage("Maven clean") {
                steps {
                    script {
                        maven(["clean"]) 
                    }
                }
            }
            stage("Maven compile") {
                steps {
                    script {
                        maven(["compile"])  
                    }
                }
            }
            stage("Maven test") {
                steps {
                    script {
                        maven(["test"])  
                    }
                }
            }
        }
    }
}