public enum zp {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zp(final String $$0) {
      this.c = $$0;
   }

   public zp a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
