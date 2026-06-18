class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> r = new ArrayList<>();

        if (matrix.length == 0) return r;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // 1. left → right (top row)
            for (int i = left; i <= right; i++)
                r.add(matrix[top][i]);
            top++;

            // 2. top → bottom (right column)
            for (int i = top; i <= bottom; i++)
                r.add(matrix[i][right]);
            right--;

            // 3. right → left (bottom row)
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    r.add(matrix[bottom][i]);
                bottom--;
            }

            // 4. bottom → top (left column)
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    r.add(matrix[i][left]);
                left++;
            }
        }
        return r;
    }
}


/*class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> r=new ArrayList<>();
        int top=0,bottom=matrix.length-1;
        int left=0,right=matrix[0].length-1;
        int i;
        while(top<=bottom && left<=right)
        {

//1.left-->right
            for(i=left;i<=right;i++)
            r.add(matrix[top][i]);


//2.top-->bottom
            top++;

            for(i=top;i<=bottom;i++)
            r.add(matrix[i][right]);

            right--;


//3.right-->left
            if(left<=right)
            {
                for(int j=right;j>=left;j--)
                r.add(matrix[bottom][j]);

                bottom--;
            }
//4. bottom-->top
            if(top<=bottom)
            {
                for(int j=bottom;j>=top;j--)
                    r.add(matrix[j][left]);

                left++;
            }
        }
        return r;
    }
}
*/