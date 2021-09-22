# Module 1 Assignment
## "**Little Animal Horror Zoo**"
### Classes:
1. [**Point**](src/Point.java)
2. [**Grid**](src/Grid.java)
3. [**Screen**](src/Screen.java)
4. [**Run**](src/Run.java)
---
### **Point**
A class that creates two points representing our two players. It also contains methods which make it possible to print and move them on our "Grid" class. Additionally, we also have a "toString" method, and a "distanceFromPoint" method that uses a formula in order to return the distance between the two points.

---
### **Grid**
The Grid class facilitates a visual representation of the two points on a 10 x 10 grid. In order to make this possible, arrays have been used to create the grid itself, whereas the points' creation and movement is facilitated by their respective methods. Lastly a "checkPriority" method has been included in order to create a work-around for conflicts between points that are located at the same coordinates. 

---
### **Screen**
The "Screen" abstract class is our attempt at making the Grid representation more visually appealing, even though that is hard to do in the console. Since it is the way by which the demo is being displayed, it also contains critical functionality such as printing the textual messages to the console. Purely aesthetic methods such as "sleep", which adds a delay between each iteration are also included here.

---
### **Run**
The "Run" class contains our "main" method, and makes use of all the other classes in order to make the program work. A simple "while" loop is used to run the program until the Rabbit is eaten by the Snake.

---
### Diagrams:


1. [**Use Case**](diagrams/LAHZ_Use_Case_Diagram.jpg)
2. [**Domain Model**](diagrams/LAHZ_Domain_Model.jpg)
3. [**Class Diagram**](diagrams/LAHZ_Class_Diagram.jpg)

---
made by **Bartosz Biryło** and **Octavian Roman**