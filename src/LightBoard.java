class LightBoard {
    private boolean[][] lights;

    public LightBoard(int rows, int cols) {
        lights = new boolean[rows][cols];
    }

    public boolean[][] getLights() {
        return lights;
    }

    public void setLights(boolean[][] lights) {
        this.lights = lights;
    }

    public boolean evaluateLight(int row, int col) {
        return lights[row][col];
    }
}