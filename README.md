# Rubiks-Cube-Solution
This project includes a set of classes specialised to solve a Rubik's cube, the project itself is still too abstract for actual implementation, and the more central thread dispatching modules have not been fully implemented .
Indeed a convoluted, redundant, abstract, and complex project.The .java source files were built initially before being embedded on an actual App-oriented maven project.
No UI mapping element, or controller class has been attributed to this project, and whilst it is a possible prototype to a much larger project, the implementation is not complete.
The modular composability of this software is in its initial phases, as the author is unsure of how to extend the central CubeOperator,ThreadDispatcher, and ThreadQueue classes, these handle multiple branches of the Binary tree that will encapsulate the path of Rubiks cube orientations that were encountered during the solve.
Thread synchonization has been crudely implemented by using the Collections.synchronized...(List<>,Set<>,Map<>,BinaryTree<>....<? extends Collections>) method to create abstract data types
The cube object itself is a LinkedList<CornerPiece> cornerpieces, with rotational arrays, or matrices to move the pieces of each face.
The modules are still open(are subjectivwe to change in the future), and most of the classes and methods are public.
The Modular understandability of this program is being rendered by the comments, as the rotational, and RNG methods are still very new and unusual.
The group.id of the project is com.moderneinstein.core.cube;
This will sereve as a starting point for more projects to come.
