public enum zt {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zt(final String $$0) {
      this.c = $$0;
   }

   public zt a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
