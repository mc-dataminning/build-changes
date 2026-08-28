public enum zi {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zi(final String $$0) {
      this.c = $$0;
   }

   public zi a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
