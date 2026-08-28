public record ghb(ald a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
