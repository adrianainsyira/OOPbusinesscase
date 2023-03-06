ublic class SchoolList{
    
    //data section
    
    private School schools[] = new School[10];
    private int currnum;
    
    //operations 
    
    public void addSchool(School sc){
        
        schools[currnum]= sc;
        currnum++;
        
    }
    
}
