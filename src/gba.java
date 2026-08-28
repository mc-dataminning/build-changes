public class gba extends gcv {
   private final gfc a;

   public gba(gfc $$0) {
      super($$0, gmh::d);
      this.a = $$0.b("flag");
   }

   public static gfi a(boolean $$0) {
      gfk $$1 = new gfk();
      gfm $$2 = $$1.a();
      $$2.a("flag", gfh.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gfe.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gfi.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * ayz.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
