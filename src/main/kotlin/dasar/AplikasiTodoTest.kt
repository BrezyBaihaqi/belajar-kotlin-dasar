var model = arrayOfNulls<String>(10)

fun main() {
    testAddTodoList()
}

fun showTodoList() {
    for (i in model.indices) {
        val todoList = model[i]
        val no = i + 1

        if (todoList != null)
            println("$no. $todoList")
    }
}

fun testShowTodoList() {
    model[0] = "Belajar Kotlin Dasar"
    model[1] = "Studi Kasus Kotlin Dasar"
    showTodoList()
}

fun addTodoList(todoList: String) {
    var isFull = true
    for (i in model.indices) {
        if (model[i] == null) {
            isFull = false
            break
        }
    }

    if (isFull) {
        val temp = model
        model = arrayOfNulls(model.size * 2)

        val i = 0
        while (i in temp.indices) {
            model[i] = temp[i]
        }
    }

    for (i in model.indices) {
        if (model[i] == null) {
            model[i] = todoList
            break
        }
    }
}

fun testAddTodoList() {
    for (i in 0..24) {
        addTodoList("contoh todo ke-$i")
    }

    showTodoList()
}

fun removeTodoList() {
}