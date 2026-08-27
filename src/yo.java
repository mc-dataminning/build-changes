public enum yo {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private yo(String $$0) {
      this.c = $$0;
   }

   public yo a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
