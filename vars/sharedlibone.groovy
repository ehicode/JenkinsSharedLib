def call (String stageName) {
    
    if (stageName == "Build") {
        sh 'mvn package'
    } else if (stageName == "Deploy") {
        sh 'mvn deploy'
    } else {
        echo "Invalid stageName: ${stageName}"
        // You can add additional error handling logic here
    }
}
