class CyclicRotation{
    public int[] solution(int[] A, int K) {
        for(int i=0; i<K; i++){
            int lenA = A.length;
            int lastElment = A[lenA-1];
            for(int j=lenA-1; j>0; j--){
                A[j] = A[j-1];
            }
            A[0] = lastElment;
        }
        return A;
    }
}