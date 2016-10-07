hello freemarker

<#--<#assign security=JspTaglibs["http://www.springframework.org/security/tags"] />-->
<#--<#assign security=JspTaglibs["/META-INF/security.tld"] />-->
<#--<#assign sec=JspTaglibs["http://www.springframework.org/security/tags"] />-->

<#--<@sec.authorize access="hasRole('ROLE_USER')">-->
<#--Hello USER-->
<#--</@sec.authorize>-->

<#--<@sec.authorize access="hasRole('ROLE_ADMIN')">-->
<#--Hello ADMIN-->
<#--</@sec.authorize>-->

<#if user??>
Hi ${user.username}, How are you?

    <#if user.authorities?seq_contains("ROLE_USER")>
    <h1>USER ++</h1>
    </#if>

    <#if user.authorities?seq_contains("ROLE_ADMIN")>
    <h1>ADMIN ++</h1>
    </#if>

</#if>