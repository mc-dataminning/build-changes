public class gjk extends gjl {
   protected final gkr a;

   public gjk(gkr $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gkz a() {
      gkz $$0 = new gkz();
      glb $$1 = $$0.a();
      $$1.a("head", gkw.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gkt.a);
      return $$0;
   }

   public static gkx b() {
      gkz $$0 = a();
      glb $$1 = $$0.a();
      $$1.b("head").a("hat", gkw.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gkv(0.25F)), gkt.a);
      return gkx.a($$0, 64, 64);
   }

   public static gkx c() {
      gkz $$0 = a();
      return gkx.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
