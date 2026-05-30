
            }else{
                ans.get(ans.size()-1)[1]=Math.max(ans.get(ans.size()-1)[1],it[1]);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        Solution obj=new Solution();
        int[][] ans=obj.merge(intervals);

        System.out.print("[");
        for(int i=0;i<ans.length;i++){
            System.out.print(Arrays.toString(ans[i]));
            if(i<ans.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
