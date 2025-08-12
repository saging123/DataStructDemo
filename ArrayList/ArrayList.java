
public class ArrayList {
    private static int initialSize = 5;
    private static int multiplier = 2;
    private int currIndex;
    private int currBucketSize;
    private String[] bucket;

    // Constructor
    public ArrayList(){
        this.currIndex = 0;
        this.currBucketSize = initialSize;
        this.bucket = new String[initialSize];
    }
    public void add(String item){
        // if no space left, expand the bucket
        if(this.currIndex > this.currBucketSize -1){
            this.resize(this.currBucketSize * multiplier );
        }
        this.bucket[this.currIndex] = item;
        this.currIndex++; // this.currIndex = this.currIndex + 1
    }
    public void resize(int newLength){
        // Create new empty array such that larger than previous
        String[] newBucket = new String[newLength];
        //copy items 
        for (int i = 0; i < this.currBucketSize; i++) {
            newBucket[i] = this.bucket[i]; // transfer items from existing to new
        }
        // update the new Bucket Size
        this.currBucketSize = newLength;
        // point the new bucket as the main bucket
        this.bucket = newBucket;

    }
    // for printing
    public String getStringItems(){
        String buildString = "";
        for (int i = 0; i < this.currBucketSize; i++) {
            //Index[0]: item1
            buildString += "Index ["+ i+ "]: " + this.bucket[i] + "\n";
        }
        return buildString;
    }

}
