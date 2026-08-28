public class gdw extends gdx {
   protected final gfc a;

   public gdw(gfc $$0) {
      super($$0);
      this.a = $$0.b("head");
   }

   public static gfk a() {
      gfk $$0 = new gfk();
      gfm $$1 = $$0.a();
      $$1.a("head", gfh.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F), gfe.a);
      return $$0;
   }

   public static gfi b() {
      gfk $$0 = a();
      gfm $$1 = $$0.a();
      $$1.b("head").a("hat", gfh.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new gfg(0.25F)), gfe.a);
      return gfi.a($$0, 64, 64);
   }

   public static gfi c() {
      gfk $$0 = a();
      return gfi.a($$0, 64, 32);
   }

   @Override
   public void a(float $$0, float $$1, float $$2) {
      this.a.f = $$1 * (float) (Math.PI / 180.0);
      this.a.e = $$2 * (float) (Math.PI / 180.0);
   }
}
