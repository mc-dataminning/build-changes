public enum uy {
   a,
   b;

   public uy a() {
      return this == b ? a : b;
   }
}
