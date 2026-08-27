public enum xg {
   a,
   b;

   public xg a() {
      return this == b ? a : b;
   }
}
