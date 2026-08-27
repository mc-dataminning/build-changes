public enum xe {
   a,
   b;

   public xe a() {
      return this == b ? a : b;
   }
}
