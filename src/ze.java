public enum ze {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private ze(final String $$0) {
      this.c = $$0;
   }

   public ze a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
