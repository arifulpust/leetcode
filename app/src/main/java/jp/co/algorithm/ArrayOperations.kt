package jp.co.algorithm

class ArrayOperations() {
    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            // print

         //   2Dimension LeetCode_118_Pascal_Triangle
         //   2Dimension LeetCode_566_Reshape_the_Matrix
         //   2Dimension LeetCode_74_Search_2D_Matrix
        }

        fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {


            var tempRow:Int=0
            var tempCollumn:Int=0
            var row=mat.size
            var collumn:Int=0
            if(row>0)
                collumn=mat[0].size

            if((row*collumn)==(r*c))
            {
                val reshape = Array(r) { IntArray(c) }
                for(index1 in 0..r-1)
                {
                    for(index2 in 0..c-1)
                    {
                        reshape[index1][index2]=mat[tempRow][tempCollumn++]
                        if(tempCollumn==collumn)
                        {
                            tempCollumn=0
                            tempRow++
                        }

                    }
                }

                return reshape
            }
            else {
                return mat
            }



        }
    }
}