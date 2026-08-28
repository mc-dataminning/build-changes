public enum zl {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zl(final String $$0) {
      this.c = $$0;
   }

   public zl a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
