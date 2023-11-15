fun main() {
    var arr = arrayOf("mi","samsung","vivo","apple")

//    println(arr[0])

    // iterating through arr
    for (x in arr){
        println(x)
    }

    if ("mi" in arr){
        println("element exists")
    }
    else{
        println("element did not exists")
    }

    println("size of arr is" + arr.size)
}