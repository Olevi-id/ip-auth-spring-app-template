Olevi Spring Boot Application Template
======================================

This is an application template to start developing web applications that use Olevi Identity Provider for authentication and authorisation. The template enables developer to start new application in minutes.

The template is based on [Spring Boot](https://spring.io/projects/spring-boot) development framework written in Java. It is created using [Spring Initializr](https://start.spring.io/), which among Spring Boot and Olevi makes it possible to get started fast.

[Olevi](https://www.olevi.fi) is an [Identity Provider](https://en.wikipedia.org/wiki/Identity_provider) (IdP) implementation based on [Shibboleth](https://www.shibboleth.net) open source software. IdPs outsource authentication processes to a purpose built architectural component. IdPs implement authentication protocols that connect applications and other components that rely on authentication to IdPs.

Latest addition to widely known authentication protocols is [OpenId Connect](https://openid.net/developers/specs/) (OIDC). [SAML](http://saml.xml.org/saml-specifications) is a bit more mature and still widely used. Olevi support both of these. This application template is readily wired to connect to Olevi using OIDC.

In addition to authentication Olevi assists application developer with authorisation. Olevi [Groups](https://doc.olevi.fi/pages/h-mgmForms/0-management-interface/#olevi-groups) feature makes it possible for application developer to outsource also authorisation decisions to Olevi.

Groups feature implements self-service processes where applicatioon maintainers can create groups to Olevi and base authorisation in their applications based on group memberships. Read more from documentation using the link above.

## Start Developing

To start your application development, take this template, modify it to your needs and start implementing your features.

    git clone https://github.com/Olevi-id/ip-auth-spring-app-template.git

### Initialise Your Own

If you want to start from scratch, you can use Spring Initializr with same settings that we initiated this template using [this link](https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.5&packaging=jar&jvmVersion=17&groupId=fi.olevi.am&artifactId=spring-app-template&name=spring-app-template&description=Spring%20Boot%20Application%20Template%20for%20Olevi%20Integration&packageName=fi.olevi.am.spring-app-template&dependencies=devtools,lombok,web,thymeleaf,security,oauth2-client).

### Olevi subscription

To connect your application to Olevi you need _clientId_ and _clientSecret_ that your application will use to authenticate itself to Olevi. You need Olevi Identifier and Subscription to register your application. By registering Olevi Identifier and applying for an subscription you enter to an agreement with Olevi that you comply with and follow agreement terms.

#### Olevi terms and conditions

Although Olevi has been around many years, we don't yet have detailed terms for the SaaS instance. Most Olevi customers have their own Olevi instances. Currently we will express SaaS instance terms here.

By registering a subscription with Olevi you agree to:

1. Follow and agree to [Olevi Privacy Policy](https://www.olevi.fi/tietosuoja.html)
2. Comply with GDPR and local laws
    * In order to use Olevi you comply with 1) and 2) even if you were private person although GDPR and privacy laws do not apply to private persons
3. Your use of Olevi is limited to [European Economic Area](https://en.wikipedia.org/wiki/European_Economic_Area) (EEA)
    * Services you connect to Olevi will process personal data only inside EEA
    * You or your services will not release personal data outside EEA
4. Obey the law
5. Be good
6. Don't do bad things

### Register Olevi Identifier

1. Browse to [Olevi Management Interface](https://test-idp.olevi.fi/mgmforms/?lang=en)
2. Make sure you accept the terms above
3. Click: "Register Olevi Identity"
4. Verify your personal details and fill in your displayname

### Apply for Olevi Subscription

Once your Olevi Identifier has been registered, you can apply for a subscription on [Olevi Management Interface](https://test-idp.olevi.fi/mgmforms/?lang=en). It is required that our sales representative validates and accepts your subscription before it is put to force. If there is something out of the ordinary, we will contact you with our questions.

Olevi sends transactional notifications only for authentication validations. We like piece and calm, so that is why we will not receive immediate notification of your subscription application. We will check in to look for new applications every now and then.

If you want to expedite your subscription validation, you can contact Olevi by sending us a message on Olevi [web pages](https://www.olevi.fi). You can find and contact Olevi also on LinkedIn.

If you are planning on starting development with Olevi, we suggest in applying subscription in early phases of your planning. This way you don't neet to wait for your subscription to be accepted once you start actual code writing. It is free ([as in free beer](https://opensource.stackexchange.com/questions/620/what-is-the-difference-between-free-as-in-beer-and-free-as-in-speech)) of charge to request and use development subscriptions on Olevi Test-IdP.

### Register Your Client

In OIDC the clients relying on authentication need to be registered on the IdP for authentication processes to stay safe. As a result of registration you will get a _clientId_ and _clientSecret_ that you will set to your application template's configuration in _application.yml_ file.

Please keep your secret only to yourself. It will be displayed to you only once. If your loose you client details, don't worry. Just disable your client and create a new one. Only actively enabled client registrations count against your subscriptions' allowance.

While registering your client, you will need to register your client's _redirect_uri_. It is of following form when using this application template. Please add all redirect_uris you think you will need. This means that if you plan on publishing your application in the internet, add all hostnames you will use.

    http://localhost:8080/login/oauth2/code/default

If you can't imagine all hostanems you will need going forward, don't worry. You can always register new clients and disable old ones. Only actively enabled clients count against your subscriptions' allowance. Disabled clients will be removed automatically from Olevi after cooling period.

### Start Coding

Now you are good to go. Do modifications and create your own features. Once you are ready or if you just like to see how it functions initially, do:

    mvn clean spring-boot:run

And browse to: http://localhost:8080/

### Authorisation Group

This template is initially set to require Group `appTmplSpring` for admin pages access. You don't even see the link in your browser to admin pages on running template if you dont belong to that group.

If you want to request access to our demonstration group, use [this link](https://test-idp.olevi.fi/mgmforms/ctrl/groups/groupAccessRequest/appTmplSpring) to request membership to the group. We will add you in the group once we note your request.

You don't need to resort to this. You can create as many groups you desire on Olevi Management interface.

## Feedback and improvements

We would very much like to here your comments and suggestions. Currrently this template is only the initial first attempt to show how easy it is to start coding your own application. We would like to add new examples of your more demanding needs and requirements to help also others to get up to speed in writing Java code.

Contact Olevi on social media channels or through [Olevi](https://www.olevi.fi) web pages.

We are still short in staff, so we appreciate your help very greatly. It would be great if you can be so kind to ammend your feedback with Pull Requests to this repository. This way your findings can be incorporated to template's code more swiftly in comparison to if we were to try to find time to do additions ourselves. After all, our focus is in developing Olevi and bringing improvements and new features to Olevi for you to enjoy.