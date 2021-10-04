# hello-world
My first repository on Github.
https://github.com/Java-Techie-jt/springboot-aws-lambda
https://docs.google.com/document/d/1meBo7QAQ0Dqa0Rasb4bT6UpOypLSMd8IikSpiHRaP5U/edit?usp=sharing
https://docs.google.com/document/d/1AYit9BSGhsKFurrsQdpzoP8ZnHxcIywS/edit

app2

<div id="app-2">
  <span v-bind:title="message">
    Hover your mouse over me for a few seconds
    to see my dynamically bound title!
  </span>
</div>

var app2 = new Vue({
  el: '#app-2',
  data: {
    message: 'You loaded this page on ' + new Date().toLocaleString()
  }
})

app3

<div id="app-3">
  <span v-if="seen">Now you see me</span>
</div>


var app3 = new Vue({
  el: '#app-3',
  data: {
    seen: true
  }
})

app4

<div id="app-4">
  <ol>
    <li v-for="todo in todos">
      {{ todo.text }}
    </li>
  </ol>
</div>
var app4 = new Vue({
  el: '#app-4',
  data: {
    todos: [
      { text: 'Learn JavaScript' },
      { text: 'Learn Vue' },
      { text: 'Build something awesome' }
    ]
  }
})
