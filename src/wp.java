public enum wp {
   a,
   b;

   public wp a() {
      return this == b ? a : b;
   }
}
