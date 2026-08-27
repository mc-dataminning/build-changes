public enum za {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private za(String $$0) {
      this.c = $$0;
   }

   public za a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
