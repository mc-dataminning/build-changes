public class gbc extends gcx {
   private final gfe a;

   public gbc(gfe $$0) {
      super($$0, gmj::d);
      this.a = $$0.b("flag");
   }

   public static gfk a(boolean $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      $$2.a("flag", gfj.c().a(0, 0).a(-10.0F, 0.0F, -2.0F, 20.0F, 40.0F, 1.0F), gfg.a(0.0F, $$0 ? -44.0F : -20.5F, $$0 ? 0.0F : 10.5F));
      return gfk.a($$1, 64, 64);
   }

   public void a(float $$0) {
      this.a.e = (-0.0125F + 0.01F * ayz.b((float) (Math.PI * 2) * $$0)) * (float) Math.PI;
   }
}
