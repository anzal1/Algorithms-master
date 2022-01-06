

# Algorithms & data structures project

Algorithms and data structures are fundamental to efficient code and good software design. Creating and designing excellent algorithms is required for being an exemplary programmer. This repository's goal is to demonstrate how to correctly implement common data structures and algorithms in the simplest and most elegant ways.



# Data Structures

- [:movie_camera:](https://www.youtube.com/watch?v=q4fnJZr8ztY) [Balanced Trees](src/main/java/com/anzal/algorithms/datastructures/balancedtree)
  - [AVL Tree (recursive)](src/main/java/com/anzal/algorithms/datastructures/balancedtree/AVLTreeRecursive.java)
  - [Red Black Tree (recursive)](src/main/java/com/anzal/algorithms/datastructures/balancedtree/RedBlackTree.java)
- [:movie_camera:](https://www.youtube.com/watch?v=JfSdGQdAzq8) [Binary Search Tree](src/main/java/com/anzal/algorithms/datastructures/binarysearchtree/BinarySearchTree.java)
- [Splay Tree](src/main/java/com/anzal/algorithms/datastructures/binarysearchtree/SplayTree.java)
- [:movie_camera:](https://www.youtube.com/watch?v=PEnFFiQe1pM) [Dynamic Array](src/main/java/com/anzal/algorithms/datastructures/dynamicarray)
  - [Dynamic array (integer only, fast)](src/main/java/com/anzal/algorithms/datastructures/dynamicarray/IntArray.java)
  - [Dynamic array (generic)](src/main/java/com/anzal/algorithms/datastructures/dynamicarray/DynamicArray.java)
- [:movie_camera:](https://www.youtube.com/watch?v=RgITNht_f4Q) [Fenwick Tree](src/main/java/com/anzal/algorithms/datastructures/fenwicktree)
  - [Fenwick Tree (range query, point updates)](src/main/java/com/anzal/algorithms/datastructures/fenwicktree/FenwickTreeRangeQueryPointUpdate.java)
  - [Fenwick Tree (range update, point query)](src/main/java/com/anzal/algorithms/datastructures/fenwicktree/FenwickTreeRangeUpdatePointQuery.java)
- [Fibonacci Heap](src/main/java/com/anzal/algorithms/datastructures/fibonacciheap)
- [:movie_camera:](https://www.youtube.com/watch?v=2E54GqF0H4s) [Hashtable](src/main/java/com/anzal/algorithms/datastructures/hashtable)
  - [Hashtable (double hashing)](src/main/java/com/anzal/algorithms/datastructures/hashtable/HashTableDoubleHashing.java)
  - [Hashtable (linear probing)](src/main/java/com/anzal/algorithms/datastructures/hashtable/HashTableLinearProbing.java)
  - [Hashtable (quadratic probing)](src/main/java/com/anzal/algorithms/datastructures/hashtable/HashTableQuadraticProbing.java)
  - [Hashtable (separate chaining)](src/main/java/com/anzal/algorithms/datastructures/hashtable/HashTableSeparateChaining.java)
- [:movie_camera:](https://www.youtube.com/watch?v=-Yn5DU0_-lw) [Linked List](src/main/java/com/anzal/algorithms/datastructures/linkedlist/DoublyLinkedList.java)
- [:movie_camera:](https://www.youtube.com/watch?v=wptevk0bshY) [Priority Queue](src/main/java/com/anzal/algorithms/datastructures/priorityqueue)
  - [Min Binary Heap](src/main/java/com/anzal/algorithms/datastructures/priorityqueue/BinaryHeap.java)
  - [Min Indexed Binary Heap (sorted key-value pairs, similar to hash-table)](src/main/java/com/anzal/algorithms/datastructures/priorityqueue/MinIndexedBinaryHeap.java)
  - [Min D-Heap](src/main/java/com/anzal/algorithms/datastructures/priorityqueue/MinDHeap.java)
  - [:movie_camera:](https://www.youtube.com/watch?v=DT8xZ0Uf8wo) [Min Indexed D-Heap (sorted key-value pairs, similar to hash-table)](src/main/java/com/anzal/algorithms/datastructures/priorityqueue/MinIndexedDHeap.java)
- [:movie_camera:](https://www.youtube.com/watch?v=KxzhEQ-zpDc) [Queue](src/main/java/com/anzal/algorithms/datastructures/queue)
  - [Queue (integer only, fixed size, fast)](src/main/java/com/anzal/algorithms/datastructures/queue/IntQueue.java)
  - [Queue (linked list, generic)](src/main/java/com/anzal/algorithms/datastructures/queue/Queue.java)
- [Segment Tree](src/main/java/com/anzal/algorithms/datastructures/segmenttree)
  - [Segment tree (array based, compact)](src/main/java/com/anzal/algorithms/datastructures/segmenttree/CompactSegmentTree.java)
  - [Segment tree (pointer implementation)](src/main/java/com/anzal/algorithms/datastructures/segmenttree/Node.java)
- [:movie_camera:](https://youtu.be/uUatD9AudXo) [Sparse Table](src/main/java/com/anzal/algorithms/datastructures/sparsetable/SparseTable.java)
- [:movie_camera:](https://www.youtube.com/watch?v=L3ud3rXpIxA) [Stack](src/main/java/com/anzal/algorithms/datastructures/stack)
  - [Stack (integer only, fixed size, fast)](src/main/java/com/anzal/algorithms/datastructures/stack/IntStack.java)
  - [Stack (linked list, generic)](src/main/java/com/anzal/algorithms/datastructures/stack/ListStack.java)
  - [Stack (array, generic)](src/main/java/com/anzal/algorithms/datastructures/stack/ArrayStack.java)
- [:movie_camera:](https://www.youtube.com/watch?v=zqKlL3ZpTqs) [Suffix Array](src/main/java/com/anzal/algorithms/datastructures/suffixarray)
  - [Suffix Array (O(n²logn) construction)](src/main/java/com/anzal/algorithms/datastructures/suffixarray/SuffixArraySlow.java)
  - [Suffix Array (O(nlog²(n)) construction)](src/main/java/com/anzal/algorithms/datastructures/suffixarray/SuffixArrayMed.java)
  - [Suffix Array (O(nlog(n)) construction)](src/main/java/com/anzal/algorithms/datastructures/suffixarray/SuffixArrayFast.java)
- [Trie](src/main/java/com/anzal/algorithms/datastructures/trie/Trie.java)
- [:movie_camera:](https://www.youtube.com/watch?v=ibjEGG7ylHk) [Union Find](src/main/java/com/anzal/algorithms/datastructures/unionfind/UnionFind.java)

# Dynamic Programming

## Dynamic Programming Classics

- [Coin change problem](src/main/java/com/anzal/algorithms/dp/CoinChange.java) **- O(nW)**
- [Edit distance (iterative)](src/main/java/com/anzal/algorithms/dp/EditDistanceIterative.java) **- O(nm)**
- [Edit distance (recursive)](src/main/java/com/anzal/algorithms/dp/EditDistanceRecursive.java) **- O(nm)**
- [:movie_camera:](https://www.youtube.com/watch?v=cJ21moQpofY) [Knapsack 0/1](src/main/java/com/anzal/algorithms/dp/Knapsack_01.java) **- O(nW)**
- [Knapsack unbounded (0/∞)](src/main/java/com/anzal/algorithms/dp/KnapsackUnbounded.java) **- O(nW)**
- [Maximum contiguous subarray](src/main/java/com/anzal/algorithms/dp/MaximumSubarray.java) **- O(n)**
- [Longest Common Subsequence (LCS)](src/main/java/com/anzal/algorithms/dp/LongestCommonSubsequence.java) **- O(nm)**
- [Longest Increasing Subsequence (LIS)](src/main/java/com/anzal/algorithms/dp/LongestIncreasingSubsequence.java) **- O(n<sup>2</sup>)**
- [Longest Palindrome Subsequence (LPS)](src/main/java/com/anzal/algorithms/dp/LongestPalindromeSubsequence.java) **- O(n<sup>2</sup>)**
- [:movie_camera:](https://www.youtube.com/watch?v=cY4HiiFHO1o) [Traveling Salesman Problem (dynamic programming, iterative)](src/main/java/com/anzal/algorithms/graphtheory/TspDynamicProgrammingIterative.java) **- O(n<sup>2</sup>2<sup>n</sup>)**
- [Traveling Salesman Problem (dynamic programming, recursive)](src/main/java/com/anzal/algorithms/graphtheory/TspDynamicProgrammingRecursive.java) **- O(n<sup>2</sup>2<sup>n</sup>)**
- [Minimum Weight Perfect Matching (iterative, complete graph)](src/main/java/com/anzal/algorithms/dp/MinimumWeightPerfectMatching.java) **- O(n<sup>2</sup>2<sup>n</sup>)**

## Dynamic Programming Problem Examples

### Adhoc

- [:movie_camera:](https://www.youtube.com/watch?v=_tur2nPkIKo) [Magic Cows](https://github.com/anzal/Algorithms/blob/master/src/main/java/com/anzal/algorithms/dp/examples/magicalcows/MagicalCows.java)
- [:movie_camera:](https://youtu.be/oQQO_n57SB0) [Narrow Art Gallery](https://github.com/anzal/Algorithms/blob/master/src/main/java/com/anzal/algorithms/dp/examples/narrowartgallery/NarrowArtGalleryRecursive.java)

### Tiling problems

- [:movie_camera:](https://youtu.be/yn2jnmlepY8) [Tiling Dominoes](https://github.com/anzal/Algorithms/blob/master/src/main/java/com/anzal/algorithms/dp/examples/tilingdominoes/TilingDominoes.java)
- [:movie_camera:](https://www.youtube.com/watch?v=CecjOo4Zo-g) [Tiling Dominoes and Trominoes](src/main/java/com/anzal/algorithms/dp/examples/domino-and-tromino-tiling)
- [:movie_camera:](https://youtu.be/pPgBZqY_Xh0) [Mountain Scenes](https://github.com/anzal/Algorithms/blob/master/src/main/java/com/anzal/algorithms/dp/examples/scenes/Scenes.java)

# Geometry

- [Angle between 2D vectors](src/main/java/com/anzal/algorithms/geometry/AngleBetweenVectors2D.java) **- O(1)**
- [Angle between 3D vectors](src/main/java/com/anzal/algorithms/geometry/AngleBetweenVectors3D.java) **- O(1)**
- [Circle-circle intersection point(s)](src/main/java/com/anzal/algorithms/geometry/CircleCircleIntersectionPoints.js) **- O(1)**
- [Circle-line intersection point(s)](src/main/java/com/anzal/algorithms/geometry/LineCircleIntersection.js) **- O(1)**
- [Circle-line segment intersection point(s)](src/main/java/com/anzal/algorithms/geometry/LineSegmentCircleIntersection.js) **- O(1)**
- [Circle-point tangent line(s)](src/main/java/com/anzal/algorithms/geometry/PointCircleTangent.java) **- O(1)**
- [Closest pair of points (line sweeping algorithm)](src/main/java/com/anzal/algorithms/geometry/ClosestPairOfPoints.java) **- O(nlog(n))**
- [Collinear points test (are three 2D points on the same line)](src/main/java/com/anzal/algorithms/geometry/CollinearPoints.java) **- O(1)**
- [Convex hull (Graham Scan algorithm)](src/main/java/com/anzal/algorithms/geometry/ConvexHullGrahamScan.java) **- O(nlog(n))**
- [Convex hull (Monotone chain algorithm)](src/main/java/com/anzal/algorithms/geometry/ConvexHullMonotoneChainsAlgorithm.java) **- O(nlog(n))**
- [Convex polygon area](src/main/java/com/anzal/algorithms/geometry/ConvexPolygonArea.java) **- O(n)**
- [Convex polygon cut](src/main/java/com/anzal/algorithms/geometry/ConvexPolygonCutWithLineSegment.java) **- O(n)**
- [Convex polygon contains points](src/main/java/com/anzal/algorithms/geometry/ConvexPolygonContainsPoint.java) **- O(log(n))**
- [Coplanar points test (are four 3D points on the same plane)](src/main/java/com/anzal/algorithms/geometry/CoplanarPoints.java) **- O(1)**
- [Line class (handy infinite line class)](src/main/java/com/anzal/algorithms/geometry/Line.java) **- O(1)**
- [Line-circle intersection point(s)](src/main/java/com/anzal/algorithms/geometry/LineCircleIntersection.js) **- O(1)**
- [Line segment-circle intersection point(s)](src/main/java/com/anzal/algorithms/geometry/LineSegmentCircleIntersection.js) **- O(1)**
- [Line segment to general form (ax + by = c)](src/main/java/com/anzal/algorithms/geometry/LineSegmentToGeneralForm.java) **- O(1)**
- [Line segment-line segment intersection](src/main/java/com/anzal/algorithms/geometry/LineSegmentLineSegmentIntersection.java) **- O(1)**
- [Longitude-Latitude geographic distance](src/main/java/com/anzal/algorithms/geometry/LongitudeLatitudeGeographicDistance.java) **- O(1)**
- [Point is inside triangle check](src/main/java/com/anzal/algorithms/geometry/PointInsideTriangle.java) **- O(1)**
- [Point rotation about point](src/main/java/com/anzal/algorithms/geometry/PointRotation.java) **- O(1)**
- [Triangle area algorithms](src/main/java/com/anzal/algorithms/geometry/TriangleArea.java) **- O(1)**
- [[UNTESTED] Circle-circle intersection area](src/main/java/com/anzal/algorithms/geometry/CircleCircleIntersectionArea.java) **- O(1)**
- [[UNTESTED] Circular segment area](src/main/java/com/anzal/algorithms/geometry/CircularSegmentArea.java) **- O(1)**

# Graph theory

### Tree algorithms

- [:movie_camera:](https://www.youtube.com/watch?v=2FFq2_je7Lg) [Rooting an undirected tree](src/main/java/com/anzal/algorithms/graphtheory/treealgorithms/RootingTree.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=OCKvEMF0Xac) [Identifying isomorphic trees](src/main/java/com/anzal/algorithms/graphtheory/treealgorithms/TreeIsomorphism.java) **- O(?)**
- [:movie_camera:](https://www.youtube.com/watch?v=nzF_9bjDzdc) [Tree center(s)](src/main/java/com/anzal/algorithms/graphtheory/treealgorithms/TreeCenter.java) **- O(V+E)**
- [Tree diameter](src/main/java/com/anzal/algorithms/graphtheory/treealgorithms/TreeDiameter.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=sD1IoalFomA) [Lowest Common Ancestor (LCA, Euler tour)](src/main/java/com/anzal/algorithms/graphtheory/treealgorithms/LowestCommonAncestorEulerTour.java) **- O(1) queries, O(nlogn) preprocessing**

### Network flow

- [Bipartite graph verification (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/BipartiteGraphCheckAdjacencyList.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=LdOnanfc5TM) [Max flow & Min cut (Ford-Fulkerson with DFS, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/FordFulkersonDfsSolverAdjacencyList.java) **- O(fE)**
- [Max flow & Min cut (Ford-Fulkerson with DFS, adjacency matrix)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/FordFulkersonDFSAdjacencyMatrix.java) **- O(fV<sup>2</sup>)**
- [:movie_camera:](https://www.youtube.com/watch?v=RppuJYwlcI8) [Max flow & Min cut (Edmonds-Karp, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/EdmondsKarpAdjacencyList.java) **- O(VE<sup>2</sup>)**
- [:movie_camera:](https://youtu.be/1ewLrXUz4kk) [Max flow & Min cut (Capacity scaling, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/CapacityScalingSolverAdjacencyList.java) **- O(E<sup>2</sup>log<sub>2</sub>(U))**
- [:movie_camera:](https://youtu.be/M6cm8UeeziI) [Max flow & Min cut (Dinic's, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/Dinics.java) **- O(EV<sup>2</sup>) or O(E√V) for bipartite graphs**
- [Maximum Cardinality Bipartite Matching (augmenting path algorithm, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/MaximumCardinalityBipartiteMatchingAugmentingPathAdjacencyList.java) **- O(VE)**
- [Min Cost Max Flow (Bellman-Ford, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/MinCostMaxFlowWithBellmanFord.java) **- O(E<sup>2</sup>V<sup>2</sup>)**
- [Min Cost Max Flow (Johnson's algorithm, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/networkflow/MinCostMaxFlowJohnsons.java) **- O(E<sup>2</sup>Vlog(V))**

### Main graph theory algorithms

- [Articulation points/cut vertices (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/ArticulationPointsAdjacencyList.java) **- O(V+E)**
- [Bellman-Ford (edge list, negative cycles, fast & optimized)](src/main/java/com/anzal/algorithms/graphtheory/BellmanFordEdgeList.java) **- O(VE)**
- [:movie_camera:](https://www.youtube.com/watch?v=lyw4FaxrwHg) [Bellman-Ford (adjacency list, negative cycles)](src/main/java/com/anzal/algorithms/graphtheory/BellmanFordAdjacencyList.java) **- O(VE)**
- [Bellman-Ford (adjacency matrix, negative cycles)](src/main/java/com/anzal/algorithms/graphtheory/BellmanFordAdjacencyMatrix.java) **- O(V<sup>3</sup>)**
- [:movie_camera:](https://www.youtube.com/watch?v=oDqjPvD54Ss) [Breadth first search (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/BreadthFirstSearchAdjacencyListIterative.java) **- O(V+E)**
- [Breadth first search (adjacency list, fast queue)](src/main/java/com/anzal/algorithms/graphtheory/BreadthFirstSearchAdjacencyListIterativeFastQueue.java) **- O(V+E)**
- [Bridges/cut edges (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/BridgesAdjacencyList.java) **- O(V+E)**
- [Find connected components (adjacency list, union find)](src/main/java/com/anzal/algorithms/graphtheory/ConnectedComponentsAdjacencyList.java) **- O(Elog(E))**
- [Find connected components (adjacency list, DFS)](src/main/java/com/anzal/algorithms/graphtheory/ConnectedComponentsDfsSolverAdjacencyList.java) **- O(V+E)**
- [Depth first search (adjacency list, iterative)](src/main/java/com/anzal/algorithms/graphtheory/DepthFirstSearchAdjacencyListIterative.java) **- O(V+E)**
- [Depth first search (adjacency list, iterative, fast stack)](src/main/java/com/anzal/algorithms/graphtheory/DepthFirstSearchAdjacencyListIterativeFastStack.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=7fujbpJ0LB4) [Depth first search (adjacency list, recursive)](src/main/java/com/anzal/algorithms/graphtheory/DepthFirstSearchAdjacencyListRecursive.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=pSqmAO-m7Lk) [Dijkstra's shortest path (adjacency list, lazy implementation)](src/main/java/com/anzal/algorithms/graphtheory/DijkstrasShortestPathAdjacencyList.java) **- O(Elog(V))**
- [:movie_camera:](https://www.youtube.com/watch?v=pSqmAO-m7Lk) [Dijkstra's shortest path (adjacency list, eager implementation + D-ary heap)](src/main/java/com/anzal/algorithms/graphtheory/DijkstrasShortestPathAdjacencyListWithDHeap.java) **- O(Elog<sub>E/V</sub>(V))**
- [:movie_camera:](https://www.youtube.com/watch?v=8MpoO2zA2l4) [Eulerian Path (directed edges)](src/main/java/com/anzal/algorithms/graphtheory/EulerianPathDirectedEdgesAdjacencyList.java) **- O(E+V)**
- [:movie_camera:](https://www.youtube.com/watch?v=4NQ3HnhyNfQ) [Floyd Warshall algorithm (adjacency matrix, negative cycle check)](src/main/java/com/anzal/algorithms/graphtheory/FloydWarshallSolver.java) **- O(V<sup>3</sup>)**
- [Graph diameter (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/GraphDiameter.java) **- O(VE)**
- [:movie_camera:](https://www.youtube.com/watch?v=cIBFEhD77b4) [Kahn's algorithm (topological sort, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/Kahns.java) **- O(E+V)**
- [Kruskal's min spanning tree algorithm (edge list, union find)](src/main/java/com/anzal/algorithms/graphtheory/KruskalsEdgeList.java) **- O(Elog(E))**
- [:movie_camera:](https://www.youtube.com/watch?v=JZBQLXgSGfs) [Kruskal's min spanning tree algorithm (edge list, union find, lazy sorting)](src/main/java/com/anzal/algorithms/graphtheory/KruskalsEdgeListPartialSortSolver.java) **- O(Elog(E))**
- [Kosaraju's strongly connected components algorithm (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/Kosaraju.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=jsmMtJpPnhU) [Prim's min spanning tree algorithm (lazy version, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/LazyPrimsAdjacencyList.java) **- O(Elog(E))**
- [Prim's min spanning tree algorithm (lazy version, adjacency matrix)](src/main/java/com/anzal/algorithms/graphtheory/LazyPrimsAdjacencyMatrix.java) **- O(V<sup>2</sup>)**
- [:movie_camera:](https://www.youtube.com/watch?v=xq3ABa-px_g) [Prim's min spanning tree algorithm (eager version, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/EagerPrimsAdjacencyList.java) **- O(Elog(V))**
- [Steiner tree (minimum spanning tree generalization)](src/main/java/com/anzal/algorithms/graphtheory/SteinerTree.java) **- O(V<sup>3</sup> + V<sup>2</sup> _ 2<sup>T</sup> + V _ 3<sup>T</sup>)**
- [:movie_camera:](https://www.youtube.com/watch?v=wUgWX0nc4NY) [Tarjan's strongly connected components algorithm (adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/TarjanSccSolverAdjacencyList.java) **- O(V+E)**
- [:movie_camera:](https://www.youtube.com/watch?v=eL-KzMXSXXI) [Topological sort (acyclic graph, adjacency list)](src/main/java/com/anzal/algorithms/graphtheory/TopologicalSortAdjacencyList.java) **- O(V+E)**
- [Topological sort (acyclic graph, adjacency matrix)](src/main/java/com/anzal/algorithms/graphtheory/TopologicalSortAdjacencyMatrix.java) **- O(V<sup>2</sup>)**
- [Traveling Salesman Problem (brute force)](src/main/java/com/anzal/algorithms/graphtheory/TspBruteForce.java) **- O(n!)**
- [:movie_camera:](https://www.youtube.com/watch?v=cY4HiiFHO1o) [Traveling Salesman Problem (dynamic programming, iterative)](src/main/java/com/anzal/algorithms/graphtheory/TspDynamicProgrammingIterative.java) **- O(n<sup>2</sup>2<sup>n</sup>)**
- [Traveling Salesman Problem (dynamic programming, recursive)](src/main/java/com/anzal/algorithms/graphtheory/TspDynamicProgrammingRecursive.java) **- O(n<sup>2</sup>2<sup>n</sup>)**

# Linear algebra

- [Freivald's algorithm (matrix multiplication verification)](src/main/java/com/anzal/algorithms/linearalgebra/FreivaldsAlgorithm.java) **- O(kn<sup>2</sup>)**
- [Gaussian elimination (solve system of linear equations)](src/main/java/com/anzal/algorithms/linearalgebra/GaussianElimination.java) **- O(cr<sup>2</sup>)**
- [Gaussian elimination (modular version, prime finite field)](src/main/java/com/anzal/algorithms/linearalgebra/ModularLinearAlgebra.java) **- O(cr<sup>2</sup>)**
- [Linear recurrence solver (finds nth term in a recurrence relation)](src/main/java/com/anzal/algorithms/linearalgebra/LinearRecurrenceSolver.java) **- O(m<sup>3</sup>log(n))**
- [Matrix determinant (Laplace/cofactor expansion)](src/main/java/com/anzal/algorithms/linearalgebra/MatrixDeterminantLaplaceExpansion.java) **- O((n+2)!)**
- [Matrix inverse](src/main/java/com/anzal/algorithms/linearalgebra/MatrixInverse.java) **- O(n<sup>3</sup>)**
- [Matrix multiplication](src/main/java/com/anzal/algorithms/linearalgebra/MatrixMultiplication.java) **- O(n<sup>3</sup>)**
- [Matrix power](src/main/java/com/anzal/algorithms/linearalgebra/MatrixPower.java) **- O(n<sup>3</sup>log(p))**
- [Square matrix rotation](src/main/java/com/anzal/algorithms/linearalgebra/RotateSquareMatrixInplace.java) **- O(n<sup>2</sup>)**

# Mathematics

- [[UNTESTED] Chinese remainder theorem](src/main/java/com/anzal/algorithms/math/ChineseRemainderTheorem.java)
- [Prime number sieve (sieve of Eratosthenes)](src/main/java/com/anzal/algorithms/math/SieveOfEratosthenes.java) **- O(nlog(log(n)))**
- [Prime number sieve (sieve of Eratosthenes, compressed)](src/main/java/com/anzal/algorithms/math/CompressedPrimeSieve.java) **- O(nlog(log(n)))**
- [Totient function (phi function, relatively prime number count)](src/main/java/com/anzal/algorithms/math/EulerTotientFunction.java) **- O(n<sup>1/4</sup>)**
- [Totient function using sieve (phi function, relatively prime number count)](src/main/java/com/anzal/algorithms/math/EulerTotientFunctionWithSieve.java) **- O(nlog(log(n)))**
- [Extended euclidean algorithm](src/main/java/com/anzal/algorithms/math/ExtendedEuclideanAlgorithm.java) **- ~O(log(a + b))**
- [Greatest Common Divisor (GCD)](src/main/java/com/anzal/algorithms/math/GCD.java) **- ~O(log(a + b))**
- [Fast Fourier transform (quick polynomial multiplication)](src/main/java/com/anzal/algorithms/math/FastFourierTransform.java) **- O(nlog(n))**
- [Fast Fourier transform (quick polynomial multiplication, complex numbers)](src/main/java/com/anzal/algorithms/math/FastFourierTransformComplexNumbers.java) **- O(nlog(n))**
- [Primality check](src/main/java/com/anzal/algorithms/math/IsPrime.java) **- O(√n)**
- [Primality check (Rabin-Miller)](src/main/java/com/anzal/algorithms/math/RabinMillerPrimalityTest.py) **- O(k)**
- [Least Common Multiple (LCM)](src/main/java/com/anzal/algorithms/math/LCM.java) **- ~O(log(a + b))**
- [Modular inverse](src/main/java/com/anzal/algorithms/math/ModularInverse.java) **- ~O(log(a + b))**
- [Prime factorization (pollard rho)](src/main/java/com/anzal/algorithms/math/PrimeFactorization.java) **- O(n<sup>1/4</sup>)**
- [Relatively prime check (coprimality check)](src/main/java/com/anzal/algorithms/math/RelativelyPrime.java) **- ~O(log(a + b))**

# Other

- [Bit manipulations](src/main/java/com/anzal/algorithms/other/BitManipulations.java) **- O(1)**
- [List permutations](src/main/java/com/anzal/algorithms/other/Permutations.java) **- O(n!)**
- [:movie_camera:](https://www.youtube.com/watch?v=RnlHPR0lyOE) [Power set (set of all subsets)](src/main/java/com/anzal/algorithms/other/PowerSet.java) **- O(2<sup>n</sup>)**
- [Set combinations](src/main/java/com/anzal/algorithms/other/Combinations.java) **- O(n choose r)**
- [Set combinations with repetition](src/main/java/com/anzal/algorithms/other/CombinationsWithRepetition.java) **- O((n+r-1) choose r)**
- [Sliding Window Minimum/Maximum](src/main/java/com/anzal/algorithms/other/SlidingWindowMaximum.java) **- O(1)**
- [Square Root Decomposition](src/main/java/com/anzal/algorithms/other/SquareRootDecomposition.java) **- O(1) point updates, O(√n) range queries**
- [Unique set combinations](src/main/java/com/anzal/algorithms/other/UniqueCombinations.java) **- O(n choose r)**
- [Lazy Range Adder](src/main/java/com/anzal/algorithms/other/LazyRangeAdder.java) **- O(1) range updates, O(n) to finalize all updates**

# Search algorithms

- [Binary search (real numbers)](src/main/java/com/anzal/algorithms/search/BinarySearch.java) **- O(log(n))**
- [Interpolation search (discrete discrete)](src/main/java/com/anzal/algorithms/search/InterpolationSearch.java) **- O(n) or O(log(log(n))) with uniform input**
- [Ternary search (real numbers)](src/main/java/com/anzal/algorithms/search/TernarySearch.java) **- O(log(n))**
- [Ternary search (discrete numbers)](src/main/java/com/anzal/algorithms/search/TernarySearchDiscrete.java) **- O(log(n))**

# Sorting algorithms

- [Bubble sort](src/main/java/com/anzal/algorithms/sorting/BubbleSort.java) **- O(n<sup>2</sup>)**
- [Bucket sort](src/main/java/com/anzal/algorithms/sorting/BucketSort.java) **- Θ(n + k)**
- [Counting sort](src/main/java/com/anzal/algorithms/sorting/CountingSort.java) **- O(n + k)**
- [Heapsort](src/main/java/com/anzal/algorithms/sorting/Heapsort.java) **- O(nlog(n))**
- [Insertion sort](src/main/java/com/anzal/algorithms/sorting/InsertionSort.java) **- O(n<sup>2</sup>)**
- [Mergesort](src/main/java/com/anzal/algorithms/sorting/MergeSort.java) **- O(nlog(n))**
- [Quicksort (in-place, Hoare partitioning)](src/main/java/com/anzal/algorithms/sorting/QuickSort.java) **- Θ(nlog(n))**
- [Quicksort3 (Dutch National Flag algorithm)](src/main/java/com/anzal/algorithms/sorting/QuickSort3.java) **- Θ(nlog(n))**
- [Selection sort](src/main/java/com/anzal/algorithms/sorting/SelectionSort.java) **- O(n<sup>2</sup>)**
- [Radix sort](src/main/java/com/anzal/algorithms/sorting/RadixSort.java) **- O(n\*w)**

# String algorithms

- [Booth's algorithm (finds lexicographically smallest string rotation)](src/main/java/com/anzal/algorithms/strings/BoothsAlgorithm.java) **- O(n)**
- [Knuth-Morris-Pratt algorithm (finds pattern matches in text)](src/main/java/com/anzal/algorithms/strings/KMP.java) **- O(n+m)**
- [Longest Common Prefix (LCP) array](src/main/java/com/anzal/algorithms/strings/LongestCommonPrefixArray.java) **- O(nlog(n)) bounded by SA construction, otherwise O(n)**
- [:movie_camera:](https://www.youtube.com/watch?v=Ic80xQFWevc) [Longest Common Substring (LCS)](src/main/java/com/anzal/algorithms/strings/LongestCommonSubstring.java) **- O(nlog(n)) bounded by SA construction, otherwise O(n)**
- [:movie_camera:](https://www.youtube.com/watch?v=OptoHwC3D-Y) [Longest Repeated Substring (LRS)](src/main/java/com/anzal/algorithms/strings/LongestRepeatedSubstring.java) **- O(nlog(n))**
- [Manacher's algorithm (finds all palindromes in text)](src/main/java/com/anzal/algorithms/strings/ManachersAlgorithm.java) **- O(n)**
- [Rabin-Karp algorithm (finds pattern match positions in text)](src/main/java/com/anzal/algorithms/strings/RabinKarp.java) **- O(n+m)**
- [Substring verification with suffix array](src/main/java/com/anzal/algorithms/strings/SubstringVerificationSuffixArray.java) **- O(nlog(n)) SA construction and O(mlog(n)) per query**

 