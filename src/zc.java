public enum zc {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zc(String $$0) {
      this.c = $$0;
   }

   public zc a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
