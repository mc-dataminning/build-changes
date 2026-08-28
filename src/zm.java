public enum zm {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zm(final String $$0) {
      this.c = $$0;
   }

   public zm a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
