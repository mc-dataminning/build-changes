public enum yq {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private yq(String $$0) {
      this.c = $$0;
   }

   public yq a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
