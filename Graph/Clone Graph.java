// LeetCode 133 - Clone Graph

// Pattern: DFS + HashMap
// Approach:
// 1. Use a HashMap to store original node → cloned node mapping
// 2. If node already cloned, return from map
// 3. Create new node and recursively clone all neighbors
// 4. This prevents cycles and duplicate cloning

import java.util.*;
class Solution {
    public HashMap<Node ,Node>map=new HashMap<>();
    Node clonemap(Node node){
        if(node==null){
            return null;
        }
        if(map.containsKey(node)){
            return map.get(node);
        }
        Node clone =new Node(node.val);
        map.put(node,clone);
        for(Node neigh:node.neighbors){
            clone.neighbors.add(clonemap(neigh));
        }
        return clone;

    }
    public Node cloneGraph(Node node) {
        return clonemap(node);
    }
}
