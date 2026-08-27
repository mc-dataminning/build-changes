public enum wc {
   a,
   b;

   public wc a() {
      return this == b ? a : b;
   }
}
