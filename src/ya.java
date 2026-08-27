public enum ya {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private ya(String $$0) {
      this.c = $$0;
   }

   public ya a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
