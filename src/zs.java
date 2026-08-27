public record zs(ib c, int d, String e, int f) implements zo {
   public static final ye<vg, zs> a = zo.a(zs::a, zs::new);
   public static final zo.b<zs> b = zo.a("debug/game_test_add_marker");

   private zs(vg $$0) {
      this($$0.e(), $$0.readInt(), $$0.p(), $$0.readInt());
   }

   private void a(vg $$0) {
      $$0.a(this.c);
      $$0.p(this.d);
      $$0.a(this.e);
      $$0.p(this.f);
   }

   @Override
   public zo.b<zs> a() {
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
