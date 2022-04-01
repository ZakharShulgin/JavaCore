public class Node {
    private String commandName1;
    private int score1;
    private String commandName2;
    private int score2;
    private Node leftChild;
    private Node rightChild;

    public Node() {
        this.commandName1 = "";
        this.commandName2 = "";
        this.score1 = 0;
        this.score2 = 0;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void printNode() {
        System.out.println(commandName1 + ": " + score1);
        System.out.println(commandName2 + ": " + score2);
    }

    public String getWinner() {
        if (this.score1 > this.score2) {
            return this.commandName1;
        }
        return this.commandName2;
    }

    public void setValue(final String CommandName1, final String CommandName2, final int Score1, final int Score2) {
        this.commandName1 = CommandName1;
        this.commandName2 = CommandName2;
        this.score1 = Score1;
        this.score2 = Score2;
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
