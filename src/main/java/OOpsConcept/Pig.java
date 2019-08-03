package OOpsConcept;


    // Pig "implements" the Animal interface
     class Pig implements Animal {
        public void animalSound() {
            // The body of animalSound() is provided here
            System.out.println("The pig says: wee wee");
        }

        @Override
        public void run() {

        }

        public void sleep() {
            System.out.println("Zzz");
        }
    }


