public enum yc {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private yc(String $$0) {
      this.c = $$0;
   }

   public yc a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
