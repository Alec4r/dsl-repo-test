listView('Utilities') {
    jobs {
        name('test-job-1')
    }
    columns {
        buildButton()
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
    }
}
