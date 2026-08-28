public record gaz(alh a, String b) {
   @Override
   public String toString() {
      return this.a + "#" + this.b;
   }
}
