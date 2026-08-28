public enum zw {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zw(final String $$0) {
      this.c = $$0;
   }

   public zw a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
