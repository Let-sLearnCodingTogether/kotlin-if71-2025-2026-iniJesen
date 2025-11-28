package operatorOverloadingAndConvention

class Matrix(
    private val rows : Int,
    private val cols : Int
){
    private val data  = Array(rows){
        IntArray(cols)
    }

    operator fun get(i : Int, j : Int) : Int = data[i][j]
    operator fun set(i : Int, j : Int, value : Int) {
        data[i][j] = value
    }
}