public enum wv {
   a,
   b;

   public wv a() {
      return this == b ? a : b;
   }
}
