public enum ve {
   a,
   b;

   public ve a() {
      return this == b ? a : b;
   }
}
