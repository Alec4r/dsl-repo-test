job('test-job-1') {
    steps {
        shell($/
            echo "running"
        )
    }
}

job('test-job-2') {
    steps {
        shell($/
            echo "running"
        )
    }
}
