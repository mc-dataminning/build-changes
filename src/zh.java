public enum zh {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zh(final String $$0) {
      this.c = $$0;
   }

   public zh a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
