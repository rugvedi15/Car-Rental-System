class Trie {
    private TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.getChildren().computeIfAbsent(ch, c -> new TrieNode());
            node = node.getChildren().get(ch);
        }
        node.setEndOfWord(true);
    }

    public TrieNode searchNode(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.getChildren().containsKey(ch)) {
                return null;
            }
            node = node.getChildren().get(ch);
        }
        return node;
    }
}
