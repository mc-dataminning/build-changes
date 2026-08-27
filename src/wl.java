public enum wl {
   a,
   b;

   public wl a() {
      return this == b ? a : b;
   }
}
