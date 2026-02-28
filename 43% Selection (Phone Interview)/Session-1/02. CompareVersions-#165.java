class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");        
        int i = 0;
        while(i<v1.length && i<v2.length){
            int a = Integer.parseInt(v1[i]);
            int b = Integer.parseInt(v2[i]);
            if(a>b) return 1;
            else if(b>a) return -1;        
            i++;
        }
        while(i<v1.length) if(Integer.parseInt(v1[i++]) > 0) return 1;
        while(i<v2.length) if(Integer.parseInt(v2[i++]) > 0) return -1;
        return 0;
    }
}
