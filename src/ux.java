public enum ux {
   a,
   b;

   public ux a() {
      return this == b ? a : b;
   }
}
