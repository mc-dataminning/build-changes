public enum zr {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zr(final String $$0) {
      this.c = $$0;
   }

   public zr a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
