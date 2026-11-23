package com.example.ui.state

enum class ReadmeViewMode {
    RENDERED,
    RAW_SOURCE
}

data class FirstTimeUiState(
    val repositorySlug: String = "PUPPET581/first-time",
    val rawReadmeContent: String = "# first-time",
    val renderedTitle: String = "first-time",
    val viewMode: ReadmeViewMode = ReadmeViewMode.RENDERED
)
