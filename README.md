#### This spring boot application provides crud apis which gives the job vacancy information and the microservice is connected to the mongo Db cloud called atlas.

Currently it has two apis only
1) One post api - using which you can create job lIsting information
2) one get api thta fetches all job listing data.

`http://localhost:8080/posts (Get api)`
`http://localhost:8080/post  (Post api)`

<!-- Add copy button and code block -->
<div>
    <!-- Copy button -->
    <button class="btn" data-clipboard-target="#code-snippet"></button>
</div>

#### Payload for post api for adding new job Post is below:
<pre><code id="code-snippet">{
    "_id":18,
    "desc":"We are looking for Next JS Developer",
    "exp":"1 yr",
    "profile":"Web Developer",
    "techs":["HTML","CSS","Next Js","JavaScript"]
}
</code></pre>

