public record zg(ib c, int d, String e, int f) implements zc {
   public static final xs<uu, zg> a = zc.a(zg::a, zg::new);
   public static final zc.b<zg> b = zc.a("debug/game_test_add_marker");

   private zg(uu $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(uu $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public zc.b<zg> a() {
      return b;
   }

   public ib b() {
      return this.c;
   }

   public int c() {
      return this.d;
   }

   public String d() {
      return this.e;
   }

   public int e() {
      return this.f;
   }
}
