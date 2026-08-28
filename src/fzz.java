public record fzz(alb a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
