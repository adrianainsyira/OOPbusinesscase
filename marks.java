ublic class Marks {
    // Section A: marks
    private float marks[];
    private int numdata;

    public Marks(int numdata){
    createData(numdata);
    
        
    }
    // Section B: operation
    public void createData(int numdat) {
        marks = new float[numdat];   // an array
        for (int i=0; i<numdat; i++) {
            marks[i] =  0;
        }
        numdata = numdat;
    }

    public float calcAvg() {
        float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
        }
        float avg = sum / numdata;
        return avg;
    }

    public void setMark(int mark, int index) throws Exception{
        if (mark < 0) {
            //System.out.println("error");
            throw new Exception("Mark is incorrect");
        }
        this.marks[index]=mark;
    }
    public float getMark(int index) {
        return marks[index];
    }
}
