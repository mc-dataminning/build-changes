public enum yw {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private yw(final String $$0) {
      this.c = $$0;
   }

   public yw a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
