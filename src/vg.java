public enum vg {
   a,
   b;

   public vg a() {
      return this == b ? a : b;
   }
}
