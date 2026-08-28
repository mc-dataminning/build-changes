public enum zq {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zq(final String $$0) {
      this.c = $$0;
   }

   public zq a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
