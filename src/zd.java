public enum zd {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zd(final String $$0) {
      this.c = $$0;
   }

   public zd a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
