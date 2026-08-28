public enum yx {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private yx(final String $$0) {
      this.c = $$0;
   }

   public yx a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
