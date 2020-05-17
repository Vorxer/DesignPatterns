public class Player {
    final String name;
    final int level;
    final String skin;
    final String item;

    public Player(Builder builder) {
        this.name = builder.name;
        this.level = builder.level;
        this.skin = builder.skin;
        this.item = builder.item;
    }

    public static class Builder{
        private String name;
        private int level;
        private String skin;
        private String item;

        public Player build(){
            return new Player(this);
        }

        public Builder(String name) {
            this.name = name;
        }

        public Builder level(int level){
            this.level = level;
            return this;
        }

        public Builder skin(String skin){
            this.skin = skin;
            return this;
        }

        public Builder item(String item){
            this.item = item;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", skin='" + skin + '\'' +
                ", item='" + item + '\'' +
                '}';
    }
}
