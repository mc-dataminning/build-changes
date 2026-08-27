public enum zf {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zf(String $$0) {
      this.c = $$0;
   }

   public zf a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
