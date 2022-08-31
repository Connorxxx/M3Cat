package com.connor.m3cat.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GithubModel(
    @SerialName("incomplete_results")
    var incompleteResults: Boolean,
    var items: List<Item>,
    @SerialName("total_count")
    var totalCount: Int
) {
    @Serializable
    data class Item(
        @SerialName("allow_forking")
        var allowForking: Boolean,
        @SerialName("archive_url")
        var archiveUrl: String,
        var archived: Boolean,
        @SerialName("assignees_url")
        var assigneesUrl: String,
        @SerialName("blobs_url")
        var blobsUrl: String,
        @SerialName("branches_url")
        var branchesUrl: String,
        @SerialName("clone_url")
        var cloneUrl: String,
        @SerialName("collaborators_url")
        var collaboratorsUrl: String,
        @SerialName("comments_url")
        var commentsUrl: String,
        @SerialName("commits_url")
        var commitsUrl: String,
        @SerialName("compare_url")
        var compareUrl: String,
        @SerialName("contents_url")
        var contentsUrl: String,
        @SerialName("contributors_url")
        var contributorsUrl: String,
        @SerialName("created_at")
        var createdAt: String,
        @SerialName("default_branch")
        var defaultBranch: String,
        @SerialName("deployments_url")
        var deploymentsUrl: String,
        var description: String,
        var disabled: Boolean,
        @SerialName("downloads_url")
        var downloadsUrl: String,
        @SerialName("events_url")
        var eventsUrl: String,
        var fork: Boolean,
        var forks: Int,
        @SerialName("forks_count")
        var forksCount: Int,
        @SerialName("forks_url")
        var forksUrl: String,
        @SerialName("full_name")
        var fullName: String,
        @SerialName("git_commits_url")
        var gitCommitsUrl: String,
        @SerialName("git_refs_url")
        var gitRefsUrl: String,
        @SerialName("git_tags_url")
        var gitTagsUrl: String,
        @SerialName("git_url")
        var gitUrl: String,
        @SerialName("has_downloads")
        var hasDownloads: Boolean,
        @SerialName("has_issues")
        var hasIssues: Boolean,
        @SerialName("has_pages")
        var hasPages: Boolean,
        @SerialName("has_projects")
        var hasProjects: Boolean,
        @SerialName("has_wiki")
        var hasWiki: Boolean,
        var homepage: String?,
        @SerialName("hooks_url")
        var hooksUrl: String,
        @SerialName("html_url")
        var htmlUrl: String,
        var id: Int,
        @SerialName("is_template")
        var isTemplate: Boolean,
        @SerialName("issue_comment_url")
        var issueCommentUrl: String,
        @SerialName("issue_events_url")
        var issueEventsUrl: String,
        @SerialName("issues_url")
        var issuesUrl: String,
        @SerialName("keys_url")
        var keysUrl: String,
        @SerialName("labels_url")
        var labelsUrl: String,
        var language: String?,
        @SerialName("languages_url")
        var languagesUrl: String,
        var license: License,
        @SerialName("merges_url")
        var mergesUrl: String,
        @SerialName("milestones_url")
        var milestonesUrl: String,
        var name: String,
        @SerialName("node_id")
        var nodeId: String,
        @SerialName("notifications_url")
        var notificationsUrl: String,
        @SerialName("open_issues")
        var openIssues: Int,
        @SerialName("open_issues_count")
        var openIssuesCount: Int,
        var owner: Owner,
        var `private`: Boolean,
        @SerialName("pulls_url")
        var pullsUrl: String,
        @SerialName("pushed_at")
        var pushedAt: String,
        @SerialName("releases_url")
        var releasesUrl: String,
        var score: Double,
        var size: Int,
        @SerialName("ssh_url")
        var sshUrl: String,
        @SerialName("stargazers_count")
        var stargazersCount: Int,
        @SerialName("stargazers_url")
        var stargazersUrl: String,
        @SerialName("statuses_url")
        var statusesUrl: String,
        @SerialName("subscribers_url")
        var subscribersUrl: String,
        @SerialName("subscription_url")
        var subscriptionUrl: String,
        @SerialName("svn_url")
        var svnUrl: String,
        @SerialName("tags_url")
        var tagsUrl: String,
        @SerialName("teams_url")
        var teamsUrl: String,
        var topics: List<String>,
        @SerialName("trees_url")
        var treesUrl: String,
        @SerialName("updated_at")
        var updatedAt: String,
        var url: String,
        var visibility: String,
        var watchers: Int,
        @SerialName("watchers_count")
        var watchersCount: Int,
        @SerialName("web_commit_signoff_required")
        var webCommitSignoffRequired: Boolean
    ) {
        @Serializable
        data class License(
            var key: String,
            var name: String,
            @SerialName("node_id")
            var nodeId: String,
            @SerialName("spdx_id")
            var spdxId: String,
            var url: String
        )

        @Serializable
        data class Owner(
            @SerialName("avatar_url")
            var avatarUrl: String,
            @SerialName("events_url")
            var eventsUrl: String,
            @SerialName("followers_url")
            var followersUrl: String,
            @SerialName("following_url")
            var followingUrl: String,
            @SerialName("gists_url")
            var gistsUrl: String,
            @SerialName("gravatar_id")
            var gravatarId: String,
            @SerialName("html_url")
            var htmlUrl: String,
            var id: Int,
            var login: String,
            @SerialName("node_id")
            var nodeId: String,
            @SerialName("organizations_url")
            var organizationsUrl: String,
            @SerialName("received_events_url")
            var receivedEventsUrl: String,
            @SerialName("repos_url")
            var reposUrl: String,
            @SerialName("site_admin")
            var siteAdmin: Boolean,
            @SerialName("starred_url")
            var starredUrl: String,
            @SerialName("subscriptions_url")
            var subscriptionsUrl: String,
            var type: String,
            var url: String
        )
    }
}