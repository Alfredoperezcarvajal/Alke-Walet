package perez.alfredo.alkewalet2.model

data class AccountRequest (
    val creationDate : String,
    val money : Double,
    val isBlocked : Boolean,
    val userId : Int
)
