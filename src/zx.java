public enum zx {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zx(final String $$0) {
      this.c = $$0;
   }

   public zx a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
