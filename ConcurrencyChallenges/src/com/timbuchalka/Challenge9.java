package com.timbuchalka;

public class Challenge9 {
    public static void main(String[] args) {
        Tutor tutor = new Tutor();
        Student student = new Student(tutor);
        tutor.setStudent(student);

        Thread tutorThread = new Thread(new Runnable() {
            @Override
            public void run() {
                tutor.studyTime();
            }
        });

        Thread studentThread = new Thread(new Runnable() {
            @Override
            public void run() {
                student.handInAssignment();
            }
        });

        tutorThread.start();
        studentThread.start();
    }
}

class newTutor {
    private Student student;

    public synchronized void setStudent(Student student) {
        this.student = student;
    }

    public void studyTime() {
        synchronized (this){
            System.out.println("Tutor has arrived");
            synchronized (student){
                try {
                    // wait for student to arrive
                    this.wait();
                } catch (InterruptedException e) {

                }
                student.startStudy();
                System.out.println("Tutor is studying with student");
            }
        }
    }

    public synchronized void getProgressReport() {
        // get progress report
        System.out.println("Tutor gave progress report");
    }
}

class newStudent {

    private Tutor tutor;

    newStudent(Tutor tutor) {
        this.tutor = tutor;
    }

    public synchronized void startStudy() {
        // study
        System.out.println("Student is studying");
    }

    public synchronized void handInAssignment() {
        synchronized (tutor){
            tutor.getProgressReport();
            synchronized (this){
                System.out.println("Student handed in assignment");
                tutor.notifyAll();
            }
        }
    }
}

