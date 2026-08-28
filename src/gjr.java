public record gjr(alg a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
