public enum zk {
   a("serverbound"),
   b("clientbound");

   private final String c;

   private zk(final String $$0) {
      this.c = $$0;
   }

   public zk a() {
      return this == b ? a : b;
   }

   public String b() {
      return this.c;
   }
}
