public enum up {
   a,
   b;

   public up a() {
      return this == b ? a : b;
   }
}
