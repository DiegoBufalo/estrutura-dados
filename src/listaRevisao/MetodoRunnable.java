package listaRevisao;
class MetodoRunnable {
    private String nomeExercicio;
    private Runnable runnable;

    public MetodoRunnable(String nomeExercicio, Runnable runnable) {
        this.nomeExercicio = nomeExercicio;
        this.runnable = runnable;
    }

    public String getMethodName() {
        return nomeExercicio;
    }

    public Runnable getRunnable() {
        return runnable;
    }

    public void setMethodName(String methodName) {
        this.nomeExercicio = methodName;
    }
}