## Spring Actuator

-	Monitoring Tool
-	Gather metrics
- Help understand trafiic

**library is that we can get production grade tools without having to actually implement these features ourselves.**

_Gives operational information about running the applciation and interaction with it. Uses http endpoints and jmx beans_

**org.springframework.boot.spring-boot-starter-actuator**

Endpoints - 
1.	/health 
2.	/info
3.	/metrics
4.	/trace

EP properties - id, sensitive(true/false) , enabled(true/false) 

`endpoints.beans.id=springbeans
endpoints.beans.sensitive=false
endpoints.beans.enabled=true`

This health information is collected from all the beans implementing the **[HealthIndicator interface** configured in our application context.

Some information returned by HealthIndicator is sensitive in nature – but we can configure endpoints.health.sensitive=false to expose more detailed information like disk space, messaging broker connectivity, custom checks etc.


----------------------------------------------------------------------------------------------------------------------------------------

You can use the [editor on GitHub](https://github.com/deepavc/springactuator/edit/master/README.md) to maintain and preview the content for your website in Markdown files.

Whenever you commit to this repository, GitHub Pages will run [Jekyll](https://jekyllrb.com/) to rebuild the pages in your site, from the content in your Markdown files.

### Markdown

Markdown is a lightweight and easy-to-use syntax for styling your writing. It includes conventions for

```markdown
Syntax highlighted code block

# Header 1
## Header 2
### Header 3

- Bulleted
- List

1. Numbered
2. List

**Bold** and _Italic_ and `Code` text

[Link](url) and ![Image](src)
```

For more details see [GitHub Flavored Markdown](https://guides.github.com/features/mastering-markdown/).

### Jekyll Themes

Your Pages site will use the layout and styles from the Jekyll theme you have selected in your [repository settings](https://github.com/deepavc/springactuator/settings). The name of this theme is saved in the Jekyll `_config.yml` configuration file.

### Support or Contact

Having trouble with Pages? Check out our [documentation](https://help.github.com/categories/github-pages-basics/) or [contact support](https://github.com/contact) and we’ll help you sort it out.
