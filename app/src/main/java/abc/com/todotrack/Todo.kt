package abc.com.todotrack


data class Todo(
        var title:String,
        var category: String,
        val ischecked: Boolean =false
)

