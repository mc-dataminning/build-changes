public enum zs {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zs(final String $$0) {
      this.c = $$0;
   }

   public zs a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
