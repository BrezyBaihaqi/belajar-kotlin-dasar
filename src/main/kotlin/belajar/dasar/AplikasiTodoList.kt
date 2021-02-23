package belajar.dasar

class AplikasiTodoList {
    var model = arrayOfNulls<String>(10)

    fun main() {
    }

    fun showTodoList() {
        for (i in model.indices) {
            var todo: String? = model[i]
            var no = i + 1

            if (todo != null)
                println("${no}.${todo}")
        }
    }

    fun addTodoList() {
    }

    fun removeTodoList() {
    }
}