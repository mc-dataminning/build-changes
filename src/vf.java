public enum vf {
   a,
   b;

   public vf a() {
      return this == b ? a : b;
   }
}
