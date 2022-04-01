public class Node {
    private String CommandName1;
    private int Score1;
    private String CommandName2;
    private int Score2;
    private Node leftChild;
    private Node rightChild;

    public Node() {
        this.CommandName1 = "";
        this.CommandName2 = "";
        this.Score1 = 0;
        this.Score2 = 0;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void printNode() {
        System.out.println(CommandName1 + ": " + Score1);
        System.out.println(CommandName2 + ": " + Score2);
    }

    public String getWinner() {
        if (this.Score1 > this.Score2) {
            return this.CommandName1;
        }
        return this.CommandName2;
    }

    public void setValue(final String CommandName1, final String CommandName2, final int Score1, final int Score2) {
        this.CommandName1 = CommandName1;
        this.CommandName2 = CommandName2;
        this.Score1 = Score1;
        this.Score2 = Score2;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public void getLeftChild(final Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(final Node rightChild) {
        this.rightChild = rightChild;
    }

    /*@Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", leftChild=" + leftChild +
                ", rightChild=" + rightChild +
                '}';
    }*/
}
