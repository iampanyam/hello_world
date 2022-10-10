def call(Map config = [:]) {
    sh "echo Hey Hello ${config.name}. Today is ${config.dayOfWeek}."
    sh "echo Hey Hello ${config.name} time is ${config.time}.  Today is ${config.todaydate}."
}
