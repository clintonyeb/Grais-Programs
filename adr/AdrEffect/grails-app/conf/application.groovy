grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.clinton.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.clinton.UserRole'
grails.plugin.springsecurity.authority.className = 'com.clinton.Role'
grails.plugin.springsecurity.rest.token.storage.useGorm = true
grails.plugin.springsecurity.rest.token.storage.gorm.tokenDomainClassName = 'com.clinton.AuthenticationToken'
grails.plugin.springsecurity.rest.token.validation.useBearerToken = false
grails.plugin.springsecurity.rest.token.validation.headerName = 'X-Auth-Token'
grails.plugin.springsecurity.rest.token.validation.enableAnonymousAccess = true

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/api/logout', access: ['isAuthenticated()']],
        [pattern: '/dbconsole/**', access: ['permitAll']]
]

grails.plugin.springsecurity.filterChain.chainMap = [
        [pattern: '/assets/**', filters: 'none'],
        [pattern: '/**/js/**', filters: 'none'],
        [pattern: '/**/css/**', filters: 'none'],
        [pattern: '/**/images/**', filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/api/guests/**', filters: 'anonymousAuthenticationFilter,restTokenValidationFilter,restExceptionTranslationFilter,filterInvocationInterceptor'],
        [pattern: '/api/**', filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'],
        [pattern: '/**', filters: 'JOINED_FILTERS,-restTokenValidationFilter,-restExceptionTranslationFilter']
]

//Mail Configuration
asasynchronous.mail.default.max.attempts.count = 3
asynchronous.mail.persistence.provider = 'hibernate5'
asynchronous.mail.useFlushOnSave = true

grails.mail.default.from = "clinton@tinglingcode.com"

grails {
    mail {
        host = "smtp.tinglingcode.com"
        port = 465
        username = "clinton@tinglingcode.com"
        password = "holyspirit33"
        props = [
                 "mail.smtp.socketFactory.port":"465",
                 "mail.smtp.socketFactory.class":"javax.net.ssl.SSLSocketFactory",
                 "mail.smtp.socketFactory.fallback":"true"]
    }
}





