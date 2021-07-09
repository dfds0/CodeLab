'use strict'

function Todo(id, content, isDone) {
  this.id = id;
  this.content = content;
  this.isDone = isDone;
};

function TodoController() {
  this.todoList = [];
  this.id = 1;
  this.ENTER_KEY = 13;
  this.todoInput = document.getElementById('newTodo');
  this.todoListView = document.getElementById('todoListView');
};

TodoController.prototype = {

  getTodoFromLocalstorage: function (key) {
    var todoList = JSON.parse(localStorage.getItem(key)) || [];
    return todoList;
  },

  setTodoLocalstorage: function (key) {
    localStorage.setItem('todoList', JSON.stringify(key));
  },

  handleTodoItem: function (value) {
    this.isDone = false;
    var mainArray = todoController.getTodoFromLocalstorage('todoList');
    this.id = todoController.idLargestOfLocal(mainArray) + 1;
    var todoItem = new Todo(this.id, value, this.isDone);
    return todoItem;
  },

  idLargestOfLocal: function (mainArray) {
    var lengthArr = mainArray.length;

    if (lengthArr !== 0) {
      return mainArray[lengthArr - 1].id;
    } else {
      return 0;
    }
  },

  addNewTodo: function (todo, list) {
    list.push(todo);
    todoController.setTodoLocalstorage(list);
    return todo;
  },

  setAttributes: function (element, attrs) {
    for (var key in attrs) {
      element.setAttribute(key, attrs[key]);
    }
  },

  checkboxView: function (todoId) {
    var inpCheckbox = document.createElement('input');
    this.setAttributes(inpCheckbox, { type: 'checkbox', class: 'itemList', id: todoId });

    inpCheckbox.addEventListener('click', function (e) {
      var list = todoController.getTodoFromLocalstorage('todoList');
      var id = e.target.getAttribute('id');
      for (var i = 0; i < list.length; i++) {
        if (list[i].id == id) {
          list[i].isDone = e.target.checked;
        }
      }

      todoController.setTodoLocalstorage(list);
    });

    return inpCheckbox;
  },

  createLableView: function (todo) {
    var lbContent = document.createElement('label');
    this.setAttributes(lbContent, { value: todo.content, class: 'labelContent ' });
    lbContent.innerHTML = todo.content;

    return lbContent;
  },

  initTodoITem: function (todo) {
    var item = document.createElement('li');
    item.setAttribute('class', 'todoItem');

    return item;
  },

  todoView: function (todo) {
    var item = this.initTodoITem(todo);
    var inpCheckbox = this.checkboxView(todo.id),
      lbContent = this.createLableView(todo);

    item.appendChild(inpCheckbox);
    item.appendChild(lbContent);

    document.querySelector('#todoListView').appendChild(item);

    return item;
  },

  events: function () {
    todoController.todoInput.onkeyup = function (event) {
      if (event.which == todoController.ENTER_KEY || event.keyCode == todoController.ENTER_KEY) {
        var todoList = todoController.getTodoFromLocalstorage('todoList');
        var todoItem = todoController.handleTodoItem(todoController.todoInput.value);
        var todo = todoController.addNewTodo(todoItem, todoList);
        todoController.todoView(todo);
        todoController.todoInput.value = '';
      }
    };

    var clearButton = document.getElementById('btnClear');
    clearButton.addEventListener('click', function () {
      var list = todoController.getTodoFromLocalstorage('todoList');
      todoController.clearCompleted(list);
      todoController.setTodoLocalstorage(list);
      todoController.renderTodo();
    });
  },

  clearCompleted: function (list) {
    while (list.find(({ isDone }) => isDone)) {
      list.splice(list.indexOf(list.find(({ isDone }) => isDone)), 1);
    }
  },

  renderTodo: function () {
    var list = todoController.getTodoFromLocalstorage('todoList');
    todoController.removeElement();
    for (var i = 0; i < list.length; i++) {
      var element = todoController.todoView(list[i]);
      if (list[i].isDone) {
        element.classList.add('checked');
      }
    }
  },

  removeElement: function () {
    var todoListView = document.getElementById('todoListView');
    while (todoListView.hasChildNodes()) {
      todoListView.removeChild(todoListView.firstChild);
    }

  },
};

function changeClass(elem) {
  var a = document.getElementsByTagName('a');
  for (var i = 0; i < a.length; i++) {
    a[i].classList.remove('selected');
  };

  elem.classList.add('selected');
};

var todoController = new TodoController();
var todo = new Todo();
todoController.events();
todoController.renderTodo();