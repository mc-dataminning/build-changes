public record gjm(alg a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
