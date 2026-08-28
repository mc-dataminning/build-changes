public record gem(alz a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
