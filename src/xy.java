public enum xy {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private xy(String $$0) {
      this.c = $$0;
   }

   public xy a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
