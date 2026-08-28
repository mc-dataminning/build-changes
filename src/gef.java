public record gef(alz a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
