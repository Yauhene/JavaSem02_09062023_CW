public static void printC1C2(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append("c1c2");
        }
        System.out.println(stringBuilder);
    }

printC1C2(10);
