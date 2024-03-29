// 812. Largest Triangle Area
class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans=0;
        for (int i=0; i<points.length; i++){
            for (int j=i+1; j<points.length; j++){
                for(int z=j+1; z<points.length; z++){
                    ans=Math.max(ans, area(points[i], points[j], points[z]));
                }
            }
        }
        return ans;
    }
    
    private double area(int[] a, int[] b, int[] c){
        return 0.5*Math.abs(a[0]*b[1]+b[0]*c[1]+c[0]*a[1]-a[1]*b[0]-b[1]*c[0]-c[1]*a[0]);
    }
}
