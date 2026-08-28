public record gie(ale a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
