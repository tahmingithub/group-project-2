
    abstract class Marks {
    /*
    We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
     */

        abstract double getPercentage();
    }

    class A extends Marks{
        private double subject1Marks;
        private double subject2Marks;
        private double subject3Marks;

        public A(double subject1Marks, double subject2Marks, double subject3Marks) {
            this.subject1Marks = subject1Marks;
            this.subject2Marks = subject2Marks;
            this.subject3Marks = subject3Marks;
        }
        @Override
        double getPercentage() {
            return (subject1Marks+subject2Marks+subject3Marks)/3.0;
        }
    }

    class B extends Marks{
        private double subject1Marks;
        private double subject2Marks;
        private double subject3Marks;
        private double subject4marks;

        public B(double subject1Marks, double subject2Marks, double subject3Marks, double subject4marks) {
            this.subject1Marks = subject1Marks;
            this.subject2Marks = subject2Marks;
            this.subject3Marks = subject3Marks;
            this.subject4marks = subject4marks;
        }

        @Override
        double getPercentage() {
            return (subject1Marks+subject2Marks+subject3Marks+subject4marks)/4.0;
        }


        public static void main(String[] args) {
            A studentA= new A(98,80,78);
            System.out.println("Student A average is "+studentA.getPercentage() +"%");

            B studentB= new B(98,80,78,89);
            System.out.println("Student B average is "+studentB.getPercentage() +"%");

        }

    }

