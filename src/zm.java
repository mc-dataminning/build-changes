public record zm(ib c, String d, int e) implements zc {
   public static final xs<uu, zm> a = zc.a(zm::a, zm::new);
   public static final zc.b<zm> b = zc.a("debug/poi_added");

   private zm(uu $$0) {
      this($$0.e(), $$0.p(), $$0.readInt());
   }

   private void a(uu $$0) {
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.p(this.e);
   }

   @Override
   public zc.b<zm> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
