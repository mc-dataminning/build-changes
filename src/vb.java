public enum vb {
   a,
   b;

   public vb a() {
      return this == b ? a : b;
   }
}
