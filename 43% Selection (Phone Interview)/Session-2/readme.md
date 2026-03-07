# ✅ 1) Insert into Binary Search Tree

## 🔹 Two-Liner (Ultra-Dense)

* Traverse BST using ordering: if `val < root.val` go left, else go right until a null child is found.
* Insert new node at first valid null position while maintaining BST property.

---

## 🔹 Extra Pattern Insight (BST Navigation Pattern)

This is the **BST directional traversal pattern**:

```
val < node → go left
val > node → go right
```

You don't search entire tree — **BST ordering prunes half the search space** every step.

Interview twists:

* Iterative insertion
* Balanced BST insertion
* Deletion in BST (harder extension)

---

## 🔹 Detailed Understanding

### Logic

1. If tree empty → return new node.
2. Compare value with root.
3. Move to correct subtree.
4. Insert when a null child is found.

Your solution does:

* Recursively traverse until correct position.
* Manually attach node when `left/right == null`.

Cleaner canonical approach:

```java
if(root == null) return new TreeNode(val);

if(val < root.val)
    root.left = insertIntoBST(root.left, val);
else
    root.right = insertIntoBST(root.right, val);

return root;
```

This avoids explicit null checks.

### Complexity

* **Time:** O(H)

* **Worst:** O(N) (skewed tree)

* **Average:** O(log N)

* **Space:** O(H)

---

## 🔹 Things To Remember

* BST property must **always remain valid**.
* Never traverse both sides (wastes time).
* Always return root in recursion.
* Prefer `root.left = insert(...)` pattern.

---

# ✅ 2) Number of Students Unable to Eat Lunch

## 🔹 Two-Liner (Ultra-Dense)

* Count number of students preferring `0` and `1`.
* Iterate sandwiches stack; if preference exists decrement count, otherwise stop since remaining students cannot eat.

---

## 🔹 Extra Pattern Insight (Observation Optimization)

The original problem **simulates a queue**, but simulation is unnecessary.

Key insight:

> Order doesn't matter — only **counts of preferences** matter.

If a sandwich appears but **no student wants it**, the process stops forever.

---

## 🔹 Detailed Understanding

### Naive Simulation

Original problem suggests:

* Students rotate in queue
* Compare with sandwich stack
* Move to back if mismatch

This becomes **O(N²)** in worst case.

### Optimized Idea

Track:

```
count[0] = students wanting circular
count[1] = students wanting square
```

Then process sandwiches:

```
if sandwich type exists → serve
else → break
```

Remaining students = `count[0] + count[1]`.

### Complexity

* **Time:** O(N)
* **Space:** O(1)

---

## 🔹 Things To Remember

* Queue simulation is unnecessary.
* The **moment a sandwich type has zero demand → stop**.
* Order of students becomes irrelevant.

---

# 🧠 Pattern Summary of This Batch

| Problem         | Core Pattern                          |
| --------------- | ------------------------------------- |
| Insert into BST | Tree traversal guided by ordering     |
| Count Students  | Simulation → observation optimization |

Key takeaway:

> Many problems disguise simple counting or ordering logic inside simulations.

Always ask:

* **Do I really need to simulate?**
* **Can counts or invariants replace simulation?**

---
