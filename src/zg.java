public enum zg {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zg(final String $$0) {
      this.c = $$0;
   }

   public zg a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
